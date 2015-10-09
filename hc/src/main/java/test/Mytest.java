package test;

import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.domain.Person;
import org.mybatis.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class Mytest {

    @Autowired
    private IPersonService service;

    @Test
    public void testSet() {
    	
    	System.out.println(service==null);
    	
    	Person p=new Person();
    	p=service.get("1");
//    	p.setId("1");
    	p.setAge(40);
//    	p.setName("四");
//    	p.setFirstName("王");
//    	p.setId(UUID.randomUUID().toString());
//    	service.update(p);
    	
    	List<Person> list=service.selectList();
    	
    	System.out.println(list.size());
    	
    	System.out.println("================================");
    	
    }
    
}
