package com.unit.testing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unit.testing.entity.Item;
import com.unit.testing.service.impl.ItemServiceImpl;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private ItemServiceImpl itemService;
	
	@GetMapping("/get-items")
	public List<Item> getAllItems(){
		return itemService.getAllItems();
	}
}
