package com.unit.testing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unit.testing.entity.Item;
import com.unit.testing.repository.ItemRepository;
import com.unit.testing.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
	
	@Autowired
	private ItemRepository itemRepo;

	@Override
	public List<Item> getAllItems() {
		List<Item> items = itemRepo.findAll();
 		return items;
	}
	
}
