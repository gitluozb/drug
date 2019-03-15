package com.jk.pojo;

public class DrugType {
    /**
     * 类型Id
     */
    private Integer id;

    /**
     * 类型名称
     */
    private String name;
    /**
     * 类型父级ID
     */
    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
