<%--
  Created by IntelliJ IDEA.
  User: 齐析屿
  Date: 2018/10/6
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.net.InetAddress" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--<%--%>
    <%--String path = request.getContextPath();--%>
    <%--String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()--%>
            <%--+ path + "/";--%>
<%--%>--%>
<%
    //获取本机(服务器当前)IP并保存到pageContext中
    InetAddress addr = InetAddress.getLocalHost();
    String ip=addr.getHostAddress().toString();//获得本机IP
    pageContext.setAttribute("ip",ip);
%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
    <!--在head内添加viewport设置，以达到最佳的绘制性能；-->
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no">

    <title>gismap</title>
    <link rel="stylesheet" href="https://cache.amap.com/lbs/static/main1119.css"/>
    <!--下面这个和main119.css有冲突-->
    <!--<link rel="stylesheet" href="https://a.amap.com/jsapi_demos/static/demo-center/css/demo-center.css" />-->

    <script src="https://webapi.amap.com/maps?v=1.4.10&key=8fb00f2a20e1056ecb1c4e25aa7ce981&plugin=AMap.MarkerClusterer"></script>
    <!--在页面添加 JS API 的入口脚本标签，并将其中「您申请的key值」替换为您刚刚申请的 key；-->
    <script type="text/javascript" src="https://cache.amap.com/lbs/static/addToolbar.js"></script>
    <script type="text/javascript" src="https://webapi.amap.com/demos/js/liteToolbar.js"></script>
    <%--使用ajax需要导入的js--%>
    <script src="http://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>
    <style type="text/css">
        html,
        body,
        #container {
            width: 100%;
            height: 100%;
            /*left: 220px;*/
            /*top: 200px;*/
        }
        .info {
            border: solid 1px silver;
        }
        div.info-top {
            position: relative;
            background: none repeat scroll 0 0 #F9F9F9;
            border-bottom: 1px solid #CCC;
            border-radius: 5px 5px 0 0;
        }
        div.info-top div {
            display: inline-block;
            color: #333333;
            font-size: 14px;
            font-weight: bold;
            line-height: 31px;
            padding: 0 10px;
        }
        div.info-top img {
            position: absolute;
            top: 10px;
            right: 10px;
            transition-duration: 0.25s;
        }
        div.info-top img:hover {
            box-shadow: 0px 0px 5px #000;
        }
        div.info-middle {
            font-size: 12px;
            padding: 6px;
            line-height: 20px;
        }
        div.info-bottom {
            height: 0px;
            width: 100%;
            clear: both;
            text-align: center;
        }
        div.info-bottom img {
            position: relative;
            z-index: 104;
        }
        span {
            margin-left: 5px;
            font-size: 11px;
        }
        .info-middle img {
            float: left;
            margin-right: 6px;
        }
    </style>

</head>
<body>
<!--添加div标签作为地图容器，同时为该div指定id属性-->
<div id="container"></div>
<div class="button-group">
    <input type="button" class="button" id="traffic" value="显示/隐藏实时路况"/>
    <input type="button" class="button" id="satellite" value="显示/隐藏卫星地图"/>
    <input type="button" class="button" id="query" value="查询"/>
    <form method="get" action="/outLogin">
        <button type="submit" class="button" id="quit">退出登录</button>
    </form>
</div>

<!-- 加载地图JSAPI脚本 -->
<script type="text/javascript">

    var map = new AMap.Map('container', {
        resizeEnable: true, //是否监控地图容器尺寸变化
        zoom:10, //初始化地图层级
        center: [116.397428, 39.90923] //初始化地图中心点
    });

    //获取所有地点的数据:
    var markers = [],cluster,infoWin;

    $(function () {

        //监听查询按钮点击事件
        $('#query').on('click',handleClickQueryBtn);

    });
    //点击查询按钮处理函数
    function handleClickQueryBtn() {
        //取出值
        var optionSelected1 = $("#country").find("option:selected");
        var valueSelected1  = optionSelected1.val();
        var textSelected1   = optionSelected1.text();

        var optionSelected2 = $("#state").find("option:selected");
        var valueSelected2  = optionSelected2.val();
        var textSelected2  = optionSelected2.text();

        var optionSelected3 = $("#city").find("option:selected");
        var valueSelected3  = optionSelected3.val();
        var textSelected3  = optionSelected3.text();

        var optionSelected4 = $("#region").find("option:selected");
        var valueSelected4  = optionSelected4.val();
        var textSelected4  = optionSelected4.text();
        var array = [];
        array.push(valueSelected1);
        array.push(valueSelected2);
        array.push(valueSelected3);
        array.push(valueSelected4);
        $.ajax({
            type : 'POST',
            url: 'getmarks.action',
            contentType : 'application/json;charset=UTF-8',
            data : JSON.stringify(array),
            success : function(data) {
                console.info(data);
                renderMarkers(data);
            }
        });
        var params = {};
        var $el = $('#condition > [data-key]');
        for(var index = 0; index < $el.length;index++){
            var el = $el[index];
            var key = $(el).data('key');
            var val = $(el).val();
            if( !!val ){
                params[key] = val;
            }
        }
    }
    //在地图上画坐标点
    function renderMarkers(markerList) {
        markers = [];
        for(var i=0;i<markerList.length;i+=1){
            var marker = new AMap.Marker({
                position: [parseFloat(markerList[i]['longitude']),parseFloat(markerList[i]['latitude'])],
                content: '<div style="background-color: hsla(180, 100%, 50%, 0.7); height: 24px; width: 24px; border: 1px solid hsl(180, 100%, 40%); border-radius: 12px; box-shadow: hsl(180, 100%, 50%) 0px 0px 1px;"></div>',
                offset: new AMap.Pixel(-15,-15),
                extData:markerList[i]
            });
            markers.push(marker);
            marker.on('click',function (ev) {
                var marker = ev.target;
                renderInfoWin(marker.getPosition(),marker.getExtData());
            });
        }
        if( !!cluster ){
            cluster.clearMarkers();
            cluster.addMarkers(markers);
        } else {
            cluster = new AMap.MarkerClusterer(map, markers,{gridSize:80});
        }

    }

    //信息框
    function renderInfoWin(pt,data) {
        if( !infoWin ){
            infoWin = new AMap.InfoWindow({
                autoMove: true
            });
        }
        if( !!infoWin ){
            infoWin.close( );
        }
        var endId= 1;
        endId=data.detailsId;
        if(data.detailsid==1)
        {
            endId=data.detailsid;
        }

        var info = [];
        var hre = '<a href="http://${ip}:8080/details/'+endId+'"'+'>查看详情</a>';
        info.push('语系：'+data.family);
        info.push('语族：'+data.grouper);
        info.push('语支：'+data.branch);
        info.push('语种：'+data.languager);
        info.push('方言：'+data.localism);
        info.push('省/自治区：'+data.province);
        info.push('市/县：'+data.city);
        info.push(hre);
        info.push(data.detailsid);

        infoWin.setContent(info.join('<br/>'));
        infoWin.setPosition(pt);
        infoWin.open(map,pt);
    }


//    var map = new AMap.Map('container', {
//        resizeEnable: true, //是否监控地图容器尺寸变化
//        zoom:10, //初始化地图层级
//        center: [116.397428, 39.90923] //初始化地图中心点
//    });

    //实时路况图层
    var trafficLayer = new AMap.TileLayer.Traffic({
        zIndex: 10
    });
    trafficLayer.setMap(map);

    var trafficisVisible = true;
    AMap.event.addDomListener(document.getElementById('traffic'), 'click', function() {
        if (trafficisVisible) {
            trafficLayer.hide();
            trafficisVisible = false;
        } else {
            trafficLayer.show();
            trafficisVisible = true;
        }
    }, false);

    //卫星地图图层
    var satelliteLayer = new AMap.TileLayer.Satellite({
        zIndex: 10
    });

    //    satelliteLayer.hide();

    var satelliteisVisible = false;
    AMap.event.addDomListener(document.getElementById('satellite'), 'click', function() {
        if (satelliteisVisible) {
            satelliteLayer.hide();
            satelliteisVisible = false;
        } else {
            satelliteLayer.setMap(map);
            satelliteLayer.show();
            satelliteisVisible = true;
        }
    }, false);

//    //地图初始化时，在地图上添加一个marker标记,鼠标点击marker可弹出自定义的信息窗体
//    addMarker();
//    //添加marker标记
//    function addMarker() {
//        map.clearMap();
//        var marker = new AMap.Marker({
//            map: map,
//            position: [116.481181, 39.989792]
//        });
//        //鼠标点击marker弹出自定义的信息窗体
//        AMap.event.addListener(marker, 'click', function() {
//            infoWindow.open(map, marker.getPosition());
//        });
//    }
//
//    //实例化信息窗体
//    var title = '方恒假日酒店<span style="font-size:11px;color:#F00;">价格:318</span>',
//        content = [];
//    content.push("<img src='http://tpc.googlesyndication.com/simgad/5843493769827749134'>地址：北京市朝阳区阜通东大街6号院3号楼东北8.3公里");
//    content.push("电话：010-64733333");
//    content.push("<a href='https://ditu.amap.com/detail/B000A8URXB?citycode=110105'>详细信息</a>");
//    var infoWindow = new AMap.InfoWindow({
//        isCustom: true,  //使用自定义窗体
//        content: createInfoWindow(title, content.join("<br/>")),
//        offset: new AMap.Pixel(16, -45)
//    });
//
//    //构建自定义信息窗体
//    function createInfoWindow(title, content) {
//        var info = document.createElement("div");
//        info.className = "info";
//
//        //可以通过下面的方式修改自定义窗体的宽高
//        //info.style.width = "400px";
//        // 定义顶部标题
//        var top = document.createElement("div");
//        var titleD = document.createElement("div");
//        var closeX = document.createElement("img");
//        top.className = "info-top";
//        titleD.innerHTML = title;
//        closeX.src = "https://webapi.amap.com/images/close2.gif";
//        closeX.onclick = closeInfoWindow;
//
//        top.appendChild(titleD);
//        top.appendChild(closeX);
//        info.appendChild(top);
//
//        // 定义中部内容
//        var middle = document.createElement("div");
//        middle.className = "info-middle";
//        middle.style.backgroundColor = 'white';
//        middle.innerHTML = content;
//        info.appendChild(middle);
//
//        // 定义底部内容
//        var bottom = document.createElement("div");
//        bottom.className = "info-bottom";
//        bottom.style.position = 'relative';
//        bottom.style.top = '0px';
//        bottom.style.margin = '0 auto';
//        var sharp = document.createElement("img");
//        sharp.src = "https://webapi.amap.com/images/sharp.png";
//        bottom.appendChild(sharp);
//        info.appendChild(bottom);
//        return info;
//    }
//
//    //关闭信息窗体
//    function closeInfoWindow() {
//        map.clearInfoWindow();
//    }

    var lnglat = new AMap.LngLat(116.397, 39.918);
    //创建右键菜单
    var contextMenu = new AMap.ContextMenu();

    //右键放大
    contextMenu.addItem("放大一级", function () {
        map.zoomIn();
    }, 0);

    //右键缩小
    contextMenu.addItem("缩小一级", function () {
        map.zoomOut();
    }, 1);

    //右键显示全国范围
    contextMenu.addItem("缩放至全国范围", function (e) {
        map.setZoomAndCenter(4, [108.946609, 34.262324]);
    }, 2);

        //右键添加Marker标记
        contextMenu.addItem("添加标记", function (e) {
            var marker = new AMap.Marker({
                map: map,
                position: contextMenuPositon //基点位置
            });
        }, 3);

    //地图绑定鼠标右击事件——弹出右键菜单
    map.on('rightclick', function (e) {
        contextMenu.open(map, e.lnglat);
        contextMenuPositon = e.lnglat;
    });

    contextMenu.open(map,lnglat);
</script>

</body>
</html>
</html>
