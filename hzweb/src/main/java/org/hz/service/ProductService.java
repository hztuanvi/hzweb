/**
 * 
 */
package org.hz.service;

import java.util.List;

import org.hz.dao.ProductDao;
import org.hz.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author OS
 *
 */
@Service
public class ProductService implements BaseService<ProductDto> {

	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<ProductDto> getList() {
		// TODO Auto-generated method stub
		return productDao.getList();
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
