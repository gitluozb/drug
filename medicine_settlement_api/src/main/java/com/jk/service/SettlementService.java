package com.jk.service;

import com.jk.pojo.BankCardBean;
import com.jk.pojo.OrderBean;
import com.jk.pojo.SettlementBean;
import com.jk.pojo.SettlementHistoryBean;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

public interface SettlementService {

    /**
     * 查询申请结算信息
     * @param name
     * @return
     */
    @GetMapping("querySettlementList")
    @ResponseBody
    List<SettlementBean> querySettlementList(@RequestParam("name") String name);

    /**
     * 申请结算发出请求
     * @param id
     * @param status
     * @return
     */
    @PostMapping("updateSettlementPayStatus")
    @ResponseBody
    void updateSettlementPayStatus(@RequestParam("id")Integer id, @RequestParam("status")Integer status);

    /**
     * 查询结算历史信息
     * @return
     */
    @GetMapping("querySettlementHistoryList")
    @ResponseBody
    List<SettlementHistoryBean> querySettlementHistoryList();

    /**
     * 绑卡设置
     * @param bankCardBean
     */
    @PostMapping("bankCardBean")
    @ResponseBody
    void saveBankCard(@RequestBody BankCardBean bankCardBean);


    /**
     * 统计下单与成交得订单
     * @param selectCountStatus
     * @return
     */
    @GetMapping("orderAndSuccessCount")
    @ResponseBody
    Map<String, Object> orderAndSuccessCount(@RequestParam("selectCountStatus") Integer selectCountStatus);
}
