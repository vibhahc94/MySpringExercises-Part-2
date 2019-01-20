package com.vibha.springs.springcoreadvanced.injecting.interfaces.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBOImpl implements OrderBO {
	@Autowired
	private OrderDAO dao;

	@Override
	public void placeOrder() {
		System.out.println("Inside OrderBo placeOrder()");
		dao.createOrder();

	}

}
