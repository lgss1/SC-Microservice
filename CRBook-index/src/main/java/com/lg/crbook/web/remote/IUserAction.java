package com.lg.crbook.web.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.lg.crbook.bean.CrUser;
import com.lg.crbook.bean.Result;

@FeignClient("cruser")
public interface IUserAction {

	/**
	 * Feigin 要求对象参数标注 @RequestBody 注解 
	 */
	@PostMapping("user/login")
	Result login(@RequestBody CrUser user);
}