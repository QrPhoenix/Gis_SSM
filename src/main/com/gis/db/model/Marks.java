package com.gis.db.model;

public class Marks {
    private Integer id;

    private Integer detailsid;

    private String family;

    private String grouper;

    private String branch;

    private String languager;

    private String localism;

    private String province;

    private String city;

    private String longitude;

    private String latitude;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDetailsid() {
        return detailsid;
    }

    public void setDetailsid(Integer detailsid) {
        this.detailsid = detailsid;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family == null ? null : family.trim();
    }

    public String getGrouper() {
        return grouper;
    }

    public void setGrouper(String grouper) {
        this.grouper = grouper == null ? null : grouper.trim();
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    public String getLanguager() {
        return languager;
    }

    public void setLanguager(String languager) {
        this.languager = languager == null ? null : languager.trim();
    }

    public String getLocalism() {
        return localism;
    }

    public void setLocalism(String localism) {
        this.localism = localism == null ? null : localism.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }
}