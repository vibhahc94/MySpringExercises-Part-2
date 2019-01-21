package com.vibha.springs.springcoreadvanced.injecting.interfaces.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBOImpl implements OrderBO {
	@Autowired
	@Qualifier("dao2")
	private OrderDAO dao;

	@Override
	public void placeOrder() {
		System.out.println("Inside OrderBo placeOrder()");
		dao.createOrder();

	}

}
