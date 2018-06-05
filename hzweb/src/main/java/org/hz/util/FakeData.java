package org.hz.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.hz.dto.ProductDto;


public class FakeData {

	/**
	 * Get list fake product
	 * @return
	 */
	public static List<ProductDto> getListFakeProduct() {
		List<ProductDto> productList = new ArrayList<>();
		ProductDto product = null;
		for (int i = 1; i < 10; i++) {
			product = new ProductDto();
			product.setId(i);
			product.setName("Product " + i);
			product.setCategoryId(1);
			product.setPrice(new Random().nextFloat());
			product.setDescription("Description " + i);
			productList.add(product);
		}
		
		return productList;
		
		
	}
}
