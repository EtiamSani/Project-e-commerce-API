package com.project.ecommerceapi.controller;

import com.project.ecommerceapi.entity.ProductsEntity;
import com.project.ecommerceapi.repository.ProductsRepository;
import com.project.ecommerceapi.service.ProductsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.web.servlet.MockMvc;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.ecommerceapi.controller.ProductsController;
import com.project.ecommerceapi.entity.ProductsEntity;
import com.project.ecommerceapi.repository.ProductsRepository;
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
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@WebMvcTest(ProductsController.class)
class ProductsControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private MockMvc mvc;
    ProductsRepository productsRepository;

    @MockBean
    private ProductsService productsService;

    @Test
    void findProductsPage() throws Exception {
//         Create a list of sample ProductsEntity objects
		List<ProductsEntity> productsList = new ArrayList<>();
		productsList.add(new ProductsEntity(UUID.fromString("47896b26-b0c9-4877-90da-38749b9efebf"),"Chemise en coton",30,"Chemise en coton pour hommes",50,"Vêtements","Ma Marque","Blanc","Coton","Hommes",0,true,true,false,"tshirt","http://example.com/images/chemise-coton-1.jpg",true));



		// Mock the behavior of the service
		PageRequest pageRequest = PageRequest.of(0, 10);
		Page<ProductsEntity> productsPage = new PageImpl<>(productsList, pageRequest, productsList.size());
		when(productsService.findProductsWithSizesPageAndSort(pageRequest)).thenReturn(productsPage);

		// Perform the request and validate the response
		mockMvc.perform(get("/api/v1/products"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.content.length()").value(productsList.size())) // Validate the number of items in the list
				.andExpect(jsonPath("$.content[0].id").value("47896b26-b0c9-4877-90da-38749b9efebf")) // Validate the first item's id
				.andExpect(jsonPath("$.content[0].productName").value("Chemise en coton")) // Validate the first item's name
				.andExpect(jsonPath("$.content[0].price").value(30)) // Validate the first item's price
				.andExpect(jsonPath("$.content[0].description").value("Chemise en coton pour hommes")); // Validate the first item's description


		// Verify that the service method was called with the correct arguments
		verify(productsService, times(1)).findProductsWithSizesPageAndSort(pageRequest);
    }

    @Test
    void findProductById() {
    }

    @Test
    void saveProducts() throws Exception {
        		// Create the product entity
		ProductsEntity productToSave = new ProductsEntity("Chemise en coton",30,"Chemise en coton pour hommes",50,"Vêtements","Ma Marque","Blanc","Coton","Hommes",0,true,true,false,"tshirt","http://example.com/images/chemise-coton-1.jpg",true);

		// Convert the product entity to JSON using ObjectMapper
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonProduct = objectMapper.writeValueAsString(productToSave);

		// Perform the request and validate the response
		mockMvc.perform(post("/api/v1/products")
						.contentType(MediaType.APPLICATION_JSON)
						.content(jsonProduct))
				.andExpect(status().isCreated());
    }
}