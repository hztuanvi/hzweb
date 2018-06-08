/**
 * 
 */
package org.hz.service;

import java.util.List;

import org.hz.dao.CategoryDao;
import org.hz.dto.CategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author OS
 *
 */
@Service
public class CategoryService implements BaseService<CategoryDto> {

	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public List<CategoryDto> getList() {
		// TODO Auto-generated method stub
		return categoryDao.getList();
	}

	@Override
	public CategoryDto getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(CategoryDto t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(CategoryDto t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
