package com.lg.crbook;

import java.util.List;

import javax.annotation.Resource;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.lg.crbook.dao.CrUserMapper;
import com.lg.crbook.bean.CrUser;
import com.lg.crbook.bean.CrUserExample;

@SpringBootTest
public class AppplicationTests {

	@Resource
	CrUserMapper ump;
	
	@Test
	void contextLoads() {
		CrUserExample ue=new CrUserExample();
		ue.createCriteria().andAccountEqualTo("admin").andPwdEqualTo("111");
		List<CrUser> list=ump.selectByExample(ue);
		Assert.assertEquals(1, list.size());
	}
	/**
	 * java.lang.IllegalStateException: Unable to find a @SpringBootConfiguration, you need to use @ContextConfiguration or @SpringBootTest(classes=...) with your test
	Suppressed: java.lang.IllegalStateException: Unable to find a @SpringBootConfiguration, you need to use @ContextConfiguration or @SpringBootTest(classes=...) with your test
java.lang.IllegalStateException: Failed to load ApplicationContext
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'enableRedisKeyspaceNotificationsInitializer' defined in class path resource [org/springframework/boot/autoconfigure/session/RedisSessionConfiguration$SpringBootRedisHttpSessionConfiguration.class]: Invocation of init method failed; nested exception is org.springframework.data.redis.RedisConnectionFailureException: Unable to connect to Redis; nested exception is io.lettuce.core.RedisConnectionException: Unable to connect to localhost:6379
Caused by: org.springframework.data.redis.RedisConnectionFailureException: Unable to connect to Redis; nested exception is io.lettuce.core.RedisConnectionException: Unable to connect to localhost:6379
Caused by: io.lettuce.core.RedisConnectionException: Unable to connect to localhost:6379
Caused by: io.netty.channel.AbstractChannel$AnnotatedConnectException: Connection refused: no further information: localhost/127.0.0.1:6379
Caused by: java.net.ConnectException: Connection refused: no further information
	 */
}
