package com.jk.mapper;

import com.jk.pojo.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public interface MedicineSettlementMapper {
    List<SettlementBean> querySettlementList(@Param("settlementBean")SettlementBean settlementBean);

    void updateSettlementPayStatus(@Param("id") Integer id,@Param("status")Integer status);

    SettlementBean querySettlementInfoById(@Param("id")Integer id);

    void saveCheck(@RequestBody CheckBean checkBean);

    CheckBean findCheckInfoById(@Param("checkId") Integer checkId);

    void saveSettlementHistory(@RequestBody SettlementHistoryBean settlementHistoryBean);

    List<SettlementHistoryBean> querySettlementHistoryList();

    void saveBankCard(@RequestBody  BankCardBean bankCardBean);

    List<OrderBean> selectOrderCount(@Param("selectCountStatus") Integer selectCountStatus);

    List<OrderBean> selectSuccessCount(@Param("selectCountStatus")Integer selectCountStatus);
}
