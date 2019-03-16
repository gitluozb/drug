package com.jk.service;

import com.jk.pojo.BankCardBean;
import com.jk.pojo.OrderBean;
import com.jk.pojo.SettlementBean;
import com.jk.pojo.SettlementHistoryBean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public interface MedicineSettlementService {
    List<SettlementBean> querySettlementList(SettlementBean settlementBean );

    void updateSettlementPayStatus(@RequestParam("id") Integer id,@RequestParam("status") Integer status);

    List<SettlementHistoryBean> querySettlementHistoryList();

    void saveBankCard(@RequestBody BankCardBean bankCardBean);

    Map<String, Object> orderAndSuccessCount(@RequestParam("selectCountStatus")Integer selectCountStatus);
}
