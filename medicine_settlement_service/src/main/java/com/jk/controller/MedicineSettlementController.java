package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.pojo.BankCardBean;
import com.jk.pojo.OrderBean;
import com.jk.pojo.SettlementBean;
import com.jk.pojo.SettlementHistoryBean;
import com.jk.service.MedicineSettlementService;
import com.jk.service.SettlementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class MedicineSettlementController implements SettlementService {

    @Autowired
    private MedicineSettlementService medicineSettlementService;

    @Override
    public List<SettlementBean> querySettlementList(@RequestParam("name") String name) {
        SettlementBean settlementBean = JSON.parseObject(name, SettlementBean.class);
        return medicineSettlementService.querySettlementList(settlementBean);
    }

    @Override
    public void updateSettlementPayStatus(@RequestParam("id")Integer id,@RequestParam("status") Integer status) {
        medicineSettlementService.updateSettlementPayStatus(id,status);
    }

    @Override
    public List<SettlementHistoryBean> querySettlementHistoryList() {
        return medicineSettlementService.querySettlementHistoryList();
    }

    @Override
    public void saveBankCard(@RequestBody BankCardBean bankCardBean) {
        medicineSettlementService.saveBankCard(bankCardBean);
    }

    @Override
    public Map<String, Object> orderAndSuccessCount(@RequestParam("selectCountStatus")Integer selectCountStatus) {
        return medicineSettlementService.orderAndSuccessCount(selectCountStatus);
    }


}
