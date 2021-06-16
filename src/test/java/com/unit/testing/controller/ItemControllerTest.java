package com.unit.testing.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.unit.testing.entity.Item;
import com.unit.testing.service.impl.ItemServiceImpl;

@WebMvcTest(ItemController.class)
@ExtendWith(SpringExtension.class)
class ItemControllerTest {

	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private ItemServiceImpl itemService;
	
	/*request and result*/
	private RequestBuilder request;
	private MvcResult result;
	
	@Test
	void getAllItemsTest() throws Exception {
		
		when(itemService.getAllItems()).thenReturn(Arrays.asList(new Item(1, "hat", 30.50, 10), new Item(2, "ball", 50.90, 10)));
		
		request = MockMvcRequestBuilders.get("/item/get-items")
				.accept(MediaType.APPLICATION_JSON);
		result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("[{\"id\":1,\"name\":\"hat\",\"price\":30.50,\"stock\":10},{\"id\":2,\"name\":\"ball\",\"price\":50.90,\"stock\":10}]"))
				.andReturn();
	}

}
