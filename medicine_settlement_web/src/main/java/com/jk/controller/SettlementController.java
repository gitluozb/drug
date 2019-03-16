package com.jk.controller;

import com.jk.config.HttpClientUtil;
import com.jk.config.Md5Util;
import com.jk.pojo.BankCardBean;
import com.jk.pojo.SettlementBean;
import com.jk.pojo.SettlementHistoryBean;
import com.jk.service.SettlementWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("settlement")
public class SettlementController {

    @Autowired
    private SettlementWebService settlementWebService;

    @Resource
    private RedisTemplate<String,String> redisTemplate;

    /**
     * 查询申请结算信息
     * @param name
     * @return
     */
    @GetMapping("querySettlementList")
    @ResponseBody
    public List<SettlementBean> querySettlementList(@RequestParam("name") String name){
        return settlementWebService.querySettlementList(name);
    }

    /**
     * 申请结算发出请求
     * @param id
     * @param status
     * @return
     */
    @PostMapping("updateSettlementPayStatus")
    @ResponseBody
    public Boolean updateSettlementPayStatus(@RequestParam("id")Integer id,@RequestParam("status") Integer status){
        try {
            settlementWebService.updateSettlementPayStatus(id,status);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 查询结算历史信息
     * @return
     */
    @GetMapping("querySettlementHistoryList")
    @ResponseBody
    public List<SettlementHistoryBean> querySettlementHistoryList(){
        return settlementWebService.querySettlementHistoryList();
    }

    /**
     * 或许验证码
     * @return
     */
    @PostMapping("getcode")
    @ResponseBody
    public String getcode(String phoneNumeber){
        HashMap<String, Object> params = new HashMap<>();
        Integer param = (int) Math.ceil(Math.random()*899999+100000);
        params.put("param", param);
        params.put("accountSid", "604903cc99d043e48faaf37747879c5e");
        params.put("templateid", "1289204763");
        params.put("to", phoneNumeber);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String date = sdf.format(new Date());
        params.put("timestamp", date);
        String sigs = Md5Util.getMd532("604903cc99d043e48faaf37747879c5e"+"00b10e3451484353808e11ad4180c962"+date);
        params.put("sig", sigs);
        HttpClientUtil.post("https://api.miaodiyun.com/20150822/industrySMS/sendSMS", params);
        String cacheKey = "code";
        redisTemplate.opsForValue().set(cacheKey,param.toString());
        redisTemplate.expire(cacheKey, 5, TimeUnit.MINUTES);
        return "获取验证码成功";
    }
    /**
     * 绑卡设置
     * @param bankCardBean
     * @return
     */
    @PostMapping("saveBankCard")
    @ResponseBody
    public Boolean saveBankCard(@RequestBody BankCardBean bankCardBean){
        String cacheKey = "code";
        String code =  redisTemplate.opsForValue().get(cacheKey);
        if (!code.equals(bankCardBean.getMisage())){
            return  false;
        }else{
            try {
                settlementWebService.saveBankCard(bankCardBean);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return  false;
            }
        }
    }

    /**
     * 统计下单与成交得订单
     * @param selectCountStatus
     * @return
     */
    @GetMapping ("orderAndSuccessCount")
    @ResponseBody
    public Map<String,Object> orderAndSuccessCount(@RequestParam("selectCountStatus") Integer selectCountStatus){
        return settlementWebService.orderAndSuccessCount(selectCountStatus);
    }
}
