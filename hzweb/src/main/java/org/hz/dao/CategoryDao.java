package org.hz.dao;

import java.util.List;

import org.hz.dto.CategoryDto;
import org.hz.util.FakeData;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDao implements BaseDao<CategoryDto> {
	
	@Override
	public List<CategoryDto> getList() {
		// TODO Auto-generated method stub
		return null;
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
