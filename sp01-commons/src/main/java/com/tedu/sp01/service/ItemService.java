package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	/**
	 * getItems通过订单id获取商品列表
	 * decreaseNumbers；在保存订单时保存减少的商品库存
	 * @param orderId
	 * @return
	 */
	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);
}
