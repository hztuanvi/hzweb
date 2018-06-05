package org.hz.dao;

import java.util.List;

import org.hz.dto.ProductDto;
import org.hz.util.FakeData;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao implements BaseDao<ProductDto> {
	
	@Override
	public List<ProductDto> getList() {
		// TODO Auto-generated method stub
		return FakeData.getListFakeProduct();
	}

	@Override
	public ProductDto getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(ProductDto t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(ProductDto t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
