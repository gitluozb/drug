package com.jk.service;

import com.jk.mapper.MedicineSettlementMapper;
import com.jk.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MedicineSettlementServiceImpl implements MedicineSettlementService {

    @Autowired
    private MedicineSettlementMapper medicineSettlementMapper;

    @Override
    public List<SettlementBean> querySettlementList(SettlementBean settlementBean) {
        return medicineSettlementMapper.querySettlementList(settlementBean);
    }

    @Override
    public void updateSettlementPayStatus(@RequestParam("id") Integer id,@RequestParam("status") Integer status) {
        /**
         * 申请结算
         */
        medicineSettlementMapper.updateSettlementPayStatus(id,status);
        SettlementBean settlementInfo = medicineSettlementMapper.querySettlementInfoById(id);
        /**
         * 走审核模块
         */
        CheckBean checkBean = new CheckBean();
        checkBean.setObjectId(settlementInfo.getId());
        checkBean.setCheckStatus(settlementInfo.getSettlementPayStatus());
        checkBean.setCheckUserId(1);
        medicineSettlementMapper.saveCheck(checkBean);
        /**
         * 审核完成，根据审核ID 新增到申请历史单
         */
        final Integer checkId = checkBean.getId();
        CheckBean checkInfo = medicineSettlementMapper.findCheckInfoById(checkId);
        SettlementHistoryBean settlementHistoryBean = new SettlementHistoryBean();
        settlementHistoryBean.setMediId(checkInfo.getSettlementOrderId());
        settlementHistoryBean.setPayAmount(checkInfo.getSettlementAmountReceivable());
        settlementHistoryBean.setApplyStatus(checkInfo.getCheckStatus());
        settlementHistoryBean.setApplyTime(new Date());
        settlementHistoryBean.setApplyoverTime(checkInfo.getCheckDate());
        medicineSettlementMapper.saveSettlementHistory(settlementHistoryBean);
    }

    @Override
    public List<SettlementHistoryBean> querySettlementHistoryList() {
        return medicineSettlementMapper.querySettlementHistoryList();
    }

    @Override
    public void saveBankCard(BankCardBean bankCardBean) {
        medicineSettlementMapper.saveBankCard(bankCardBean);
    }

    @Override
    public Map<String, Object> orderAndSuccessCount(@RequestParam("selectCountStatus") Integer selectCountStatus) {
        HashMap<String, Object> map = new HashMap<>();
        List<OrderBean> selectOrderCount = medicineSettlementMapper.selectOrderCount(selectCountStatus);
        List<OrderBean> selectSuccessCount = medicineSettlementMapper.selectSuccessCount(selectCountStatus);
        map.put("orderCount",selectOrderCount);
        map.put("successCount",selectSuccessCount);
        return map;
    }
}
