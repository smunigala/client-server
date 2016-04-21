package com.examples.my.service;

import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements SimpleService {

	@Override
	public String getMessage() {
		return "Hello World";
	}
}
