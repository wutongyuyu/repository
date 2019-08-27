package com.tedu.sp02.item.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tedu.sp01.pojo.Item;
import com.tedu.sp01.service.ItemService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ItemServiceImpl implements ItemService {

	@Override
	public List<Item> getItems(String orderId) {
		ArrayList<Item> list=new ArrayList<>();
		list.add(new Item(1,"shanpin",1));
		list.add(new Item(2,"shanpin",2));
		list.add(new Item(3,"shanpin",3));
		list.add(new Item(4,"shanpin",4));
		list.add(new Item(5,"shanpin",5));
		return list;
	}

	@Override
	public void decreaseNumbers(List<Item> list) {
		if(log.isInfoEnabled()){
			for (Item item : list) {
				log.info("减少库存"+item);
			}
		}
		
	}
	
	

}
