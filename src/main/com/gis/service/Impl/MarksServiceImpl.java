package com.gis.service.Impl;


import com.gis.db.dao.MarksMapper;
import com.gis.db.model.Marks;
import com.gis.db.model.MarksExample;
import com.gis.service.MarksService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by 齐析屿 on 2017/9/27.
 */
@SuppressWarnings("ALL")
@Service("getMarksService")
public class MarksServiceImpl implements MarksService {
    @Resource
    private MarksMapper marksDao;

    public List<Marks> getMarks() {
        MarksExample marks = new MarksExample();
        List<Marks> List = marksDao.selectByExample(marks);
        return  List;
    }
}
