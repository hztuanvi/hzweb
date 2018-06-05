package org.hz.service;

import java.util.List;

public interface BaseService<T> {
	List<T> getList();
	T getById(int id);
	boolean insert(T t);
	boolean update(T t);
	boolean delete(int id);
}
