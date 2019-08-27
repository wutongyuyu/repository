package com.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	private String id; //订单id，用户id，时间戳，随机值
	private User user;
	private List<Item> items;//订单包含的商品列表
}
