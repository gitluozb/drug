package com.jk.pojo;

public class Notice {

    private Integer id;
    private String noticeTitle;
    private Integer  displayState;
    private String sort;
    private String  creationTime;
    private String noticeContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public Integer getDisplayState() {
        return displayState;
    }

    public void setDisplayState(Integer displayState) {
        this.displayState = displayState;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "id=" + id +
                ", noticeTitle='" + noticeTitle + '\'' +
                ", displayState=" + displayState +
                ", sort='" + sort + '\'' +
                ", creationTime='" + creationTime + '\'' +
                ", noticeContent='" + noticeContent + '\'' +
                '}';
    }
}
