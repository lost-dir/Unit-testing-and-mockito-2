package com.unit.testing.service.impl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.unit.testing.entity.Item;
import com.unit.testing.repository.ItemRepository;
@ExtendWith(MockitoExtension.class)
class ItemServiceImplTest {
	
	@InjectMocks
	private ItemServiceImpl itemService;
	@Mock
	private ItemRepository itemRepo;

	@Test
	void getAllItemsTest() {
		when(itemService.getAllItems()).thenReturn(Arrays.asList(new Item(1, "hat", 30.50, 10), new Item(2, "hat", 30.50, 10)));
		List<Item> items = itemService.getAllItems();
		assertEquals(1, items.get(0).getId());
		assertEquals(2, items.get(1).getId());
	}

}
