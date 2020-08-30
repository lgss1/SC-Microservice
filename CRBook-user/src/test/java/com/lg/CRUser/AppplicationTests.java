package com.lg.CRUser;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.lg.CRUser.dao.UserMapper;
import com.lg.crbook.bean.User;
import com.lg.crbook.bean.UserExample;



@SpringBootTest
public class AppplicationTests {

	@Resource
	UserMapper ump;
	
	@Test
	void contextLoads() {
		UserExample ue=new UserExample();
		ue.createCriteria().andAccountEqualTo("admin").andPwdEqualTo("111");
		List<User> list=ump.selectByExample(ue);
		Assert.assertEquals(1, list.size());
	}
}
