package com;

import com.springboot.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Springboot单元测试
 * 可以在测试期间很方便的类似编码一样自动注入容器的类目
 */
@RunWith(SpringRunner.class)        //说明跑单元测试的驱动器是Spring，而不是Junit
@SpringBootTest        //说明这是SpringBoot的单元测试
public class BlogApplicationTest {

    @Autowired
    Person person;


    @Test
    public void contextLoads() {
        System.out.println(person);
    }
}