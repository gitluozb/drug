package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("toSettlementPage")
    public String toSettlementPage(){
        return "settlement.html";
    }

    @RequestMapping("toSettlementHistoryPage")
    public String  toSettlementHistoryPage(){
        return "settlementhistory.html";
    }

    @RequestMapping("toBankCardSet")
    public String toBankCardSet(){
        return "cardsetting.html";
    }

    @RequestMapping("toStatistics")
    public String toStatistics(){
        return "statistics.html";
    }
}
