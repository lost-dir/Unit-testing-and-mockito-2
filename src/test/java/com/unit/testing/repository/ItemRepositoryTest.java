package com.unit.testing.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.unit.testing.entity.Item;

@DataJpaTest
@ExtendWith(SpringExtension.class)
class ItemRepositoryTest {
	
	@Autowired
	private ItemRepository itemRepository;

	@Test
	void findAllItemsTest() {
		List<Item> items = itemRepository.findAll();
		assertEquals(9, items.size());
//		for(Item item : items) {
//			System.out.println(item);
//		}
	}

}
