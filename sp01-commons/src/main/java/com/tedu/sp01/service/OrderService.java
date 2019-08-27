package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

public interface OrderService {
	/**
	 * gerOrder：获取订单数据
	 * addOrder：保存订单
	 */
	Order getOrder(String orderId);
	void addOrder(Order order);
}
