package com.project.ecommerceapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.ecommerceapi.controller.ProductsController;
import com.project.ecommerceapi.entity.ProductsEntity;
import com.project.ecommerceapi.service.ProductsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.mockito.Mockito.*;

@WebMvcTest(ProductsController.class)
public class ECommerceApiApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ProductsService productsService;

	@Test
	public void testGetAllProducts() throws Exception {
		// Create a list of sample ProductsEntity objects
		List<ProductsEntity> productsList = new ArrayList<>();
		productsList.add(new ProductsEntity(UUID.fromString("e1b85166-ac14-49d8-96fb-0783dfaac9ad"), "test", 50, "testdescription", 2));
		productsList.add(new ProductsEntity(UUID.fromString("47896b26-b0c9-4877-90da-38749b9efebf"), "test", 50, "testdescription", 2));
		productsList.add(new ProductsEntity(UUID.fromString("47896b26-b0c9-4877-90da-38749b9efebf"), "test", 50, "testdescription", 2));
		productsList.add(new ProductsEntity(UUID.fromString("47896b26-b0c9-4877-90da-38749b9efebf"), "test", 50, "testdescription", 2));


		// Mock the behavior of the service
		PageRequest pageRequest = PageRequest.of(0, 10);
		Page<ProductsEntity> productsPage = new PageImpl<>(productsList, pageRequest, productsList.size());
		when(productsService.findProductsPageAndSort(pageRequest)).thenReturn(productsPage);

		// Perform the request and validate the response
		mockMvc.perform(get("/api/v1/products"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.content.length()").value(productsList.size())) // Validate the number of items in the list
				.andExpect(jsonPath("$.content[0].id").value("e1b85166-ac14-49d8-96fb-0783dfaac9ad")) // Validate the first item's id
				.andExpect(jsonPath("$.content[0].productName").value("test")) // Validate the first item's name
				.andExpect(jsonPath("$.content[0].price").value(50)) // Validate the first item's price
				.andExpect(jsonPath("$.content[0].description").value("testdescription")); // Validate the first item's description


		// Verify that the service method was called with the correct arguments
		verify(productsService, times(1)).findProductsPageAndSort(pageRequest);
	}

	@Test
	public void testSaveProduct() throws Exception {
		// Create a simulated product entity
		ProductsEntity productToSave = new ProductsEntity();
		productToSave.setProductName("controller");
		productToSave.setPrice(77);
		productToSave.setDescription("testing controller");
		productToSave.setQuantityInStock(8);

		// Mock the behavior of the service to return the saved product entity
		when(ProductsService.saveProducts(productToSave)).thenReturn(productToSave);

		// Perform the request and validate the response
		mockMvc.perform(post("/api/products")
						.contentType("application/json")
						.content(new ObjectMapper().writeValueAsString(productToSave)))
				.andExpect(status().isOk())
				.andExpect(status().isOk());
	}

	// Add more test methods for other controller methods

}

