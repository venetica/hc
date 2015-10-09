package org.mybatis.service.impl;

import java.util.List;

import org.mybatis.domain.Person;
import org.mybatis.persistence.PersonDao;
import org.mybatis.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements IPersonService{

	@Autowired
	private PersonDao dao;
	
	public int insert(Person entity) {
		return dao.insert(entity);
	}

	public int delete(String id) {
		return dao.delete(id);
	}

	public int update(Person entity) {
		return dao.update(entity);
	}

	public Person get(String id) {
		return dao.get(id);
	}

	public List<Person> selectList() {
		return dao.selectList();
	}

}
