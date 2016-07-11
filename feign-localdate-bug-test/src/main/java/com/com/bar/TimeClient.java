package com.com.bar;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;


@FeignClient("feign-localdate-bug")
public interface TimeClient {

    @RequestMapping(value = "/tomorrow", method = RequestMethod.GET)
    public LocalDate getTomorrow(
            @RequestParam(value = "d", required = true) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
            @RequestParam(value = "r", required = true) String reason);
}
