package com.jk.pojo;

public class Express {

    private Integer id;
    private String  templateName;
    private String   createTime;
    private String  freeShipping;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(String freeShipping) {
        this.freeShipping = freeShipping;
    }

    @Override
    public String toString() {
        return "Express{" +
                "id=" + id +
                ", templateName='" + templateName + '\'' +
                ", createTime='" + createTime + '\'' +
                ", freeShipping='" + freeShipping + '\'' +
                '}';
    }
}
