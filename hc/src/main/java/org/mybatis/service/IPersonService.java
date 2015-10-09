package org.mybatis.service;

import java.util.List;

import org.mybatis.domain.Person;

public interface IPersonService {
	
	public int insert(Person entity);

	public int delete(String id);

	public int update(Person entity);

	public Person get(String id);

	public List<Person> selectList();
}
