package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/rService")
public class RestController {

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public ResponseEntity<String> syncData() throws Exception {
		String returnsyncOrders = "Hellow i am get method...";
		return new ResponseEntity<String>(returnsyncOrders, HttpStatus.OK);
	}

	@RequestMapping(value = "/post", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> postsyncData(@RequestParam String name, @RequestParam int age) throws Exception {
		String returnValue = " \"name\" : \""+name+"\",  \"age\" : "+age+" ";
		return new ResponseEntity<String>(returnValue, HttpStatus.OK);
	}
}
