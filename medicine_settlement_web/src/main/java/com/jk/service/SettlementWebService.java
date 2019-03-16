package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("service-settlement")
public interface SettlementWebService extends SettlementService {
}
