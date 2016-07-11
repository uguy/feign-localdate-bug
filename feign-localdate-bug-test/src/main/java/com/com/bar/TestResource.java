package com.com.bar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * Created by fmarsaud on 11/07/16.
 */
@RestController
public class TestResource {

    @Autowired
    private TimeClient client;

    @RequestMapping(value = "/bug", method = RequestMethod.GET)
    public LocalDate getTomorrow() {
        return client.getTomorrow(LocalDate.now(), "none");
    }
}
