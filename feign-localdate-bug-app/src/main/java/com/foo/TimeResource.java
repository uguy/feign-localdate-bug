package com.foo;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class TimeResource {

	@RequestMapping(value = "/tomorrow", method = RequestMethod.GET)
	public LocalDate getTomorrow(
			@RequestParam(value = "d", required = true) @DateTimeFormat(iso = ISO.DATE) LocalDate date,
			@RequestParam(value = "r", required = true) String reason) {

		return date.plusDays(1);
	}
}
