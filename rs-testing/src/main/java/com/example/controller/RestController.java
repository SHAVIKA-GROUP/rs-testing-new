package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/rService")
public class RestController {

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public ResponseEntity<String> syncData() throws Exception {
		String returnsyncOrders = "Hellow i am get method...";
		return new ResponseEntity<String>(returnsyncOrders, HttpStatus.OK);
	}

}
