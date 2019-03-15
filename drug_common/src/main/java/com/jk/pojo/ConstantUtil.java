package com.jk.pojo;

public class ConstantUtil {

    /**
     * 信息审核状态码 未审核状态 ：0
     */
    public static final Integer CHECK_STATUS_UNCHECKED = 0;

    /**
     * 信息审核状态码 已审核通过状态 ：1
     */
    public static final Integer CHECK_STATUS_CHECKED_APPROVED = 1;

    /**
     * 信息审核状态码 审核未通过状态 ：2
     */
    public static final Integer CHECK_STATUS_CHECKED_FAILED = 2;

    /**
     * 信息审核状态码 信息撤回 ：3
     */
    public static final Integer CHECK_STATUS_MASSAGE_WITHDRAW = 3;


    /**
     * 审核人唯一标识
     */
    public static final Integer CHECK_PERSON_CODE = 1;
}
