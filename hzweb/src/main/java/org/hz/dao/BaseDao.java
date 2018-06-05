package org.hz.dao;

import java.util.List;

/**
 * Base dao
 * @author OS
 *
 * @param <T>
 */
public interface BaseDao<T> {

	List<T> getList();
	T getById(int id);
	boolean insert(T t);
	boolean update(T t);
	boolean delete(int id);
	
}
