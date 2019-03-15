package com.jk.pojo;

public class Image {

    private Integer id;
    private String focusMapPreview;
    private String picture;
    private String sort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFocusMapPreview() {
        return focusMapPreview;
    }

    public void setFocusMapPreview(String focusMapPreview) {
        this.focusMapPreview = focusMapPreview;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", focusMapPreview='" + focusMapPreview + '\'' +
                ", picture='" + picture + '\'' +
                ", sort='" + sort + '\'' +
                '}';
    }
}
