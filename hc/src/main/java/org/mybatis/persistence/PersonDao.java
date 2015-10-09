package org.mybatis.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.mybatis.annotation.MyBatisRepository;
import org.mybatis.domain.Person;
@MyBatisRepository
public interface PersonDao {
	@Insert("insert into person(id,age,name, first_name) values(#{id},#{age},#{name}, #{first_name})")
	public int insert(Person entity);

	@Delete("delete from person where id=#{id}")
	public int delete(String id);

	@Update("update person set name=#{name},age=#{age},first_name=#{first_name} where id=#{id}")
	public int update(Person entity);

	@Select("select * from person where id=#{id}")
	public Person get(String id);

	@Select("select id,age,name, first_name as firstname from person")
	public List<Person> selectList();
}