package com.lg.crbook.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lg.crbook.bean.CrUser;
import com.lg.crbook.bean.CrUserExample;
import com.lg.crbook.bean.Result;
import com.lg.crbook.dao.CrUserMapper;

@RestController
@RequestMapping("user")
public class UserAction {

	@Resource
	private CrUserMapper uMapper;

	@PostMapping("login")
	public Result login(@RequestBody CrUser user) {
		CrUserExample cue = new CrUserExample();
		cue.createCriteria().andAccountEqualTo(user.getAccount()).andPwdEqualTo(user.getPwd());
		List<CrUser> list = uMapper.selectByExample(cue);
		if (list.isEmpty()) {
			return new Result(0, "用户名或密码错误！");
		} else {
			return new Result(1, "登录成功！");
		}
	}
}