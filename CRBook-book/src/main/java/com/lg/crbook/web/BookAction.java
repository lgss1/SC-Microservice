package com.lg.crbook.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.lg.crbook.dao.CrBookMapper;
import com.lg.crbook.dao.CrShowMapper;
import com.lg.crbook.bean.CrBook;
import com.lg.crbook.bean.CrBookExample;
import com.lg.crbook.bean.CrShow;
import com.lg.crbook.bean.CrShowExample;

@RestController
@RequestMapping("book")
public class BookAction {

	@Resource
	private CrBookMapper cbm;
	@Resource
	private CrShowMapper csm;
	// 最新上架
	@GetMapping("getNewBook")
	public List<CrBook> getNewBook(){
		CrBookExample cbe=new CrBookExample();
		cbe.setOrderByClause("id desc");
		PageHelper.startPage(1,12);
		return cbm.selectByExample(cbe);
	}
	
	// 查首页的第一个编辑推荐
		@GetMapping("getRecom1")
		public List<CrShow> getRecom1(){
			// 构建图书的查询条件以及排序
			CrShowExample cse = new CrShowExample();
			cse.createCriteria().andPageEqualTo("index").andBoardEqualTo("编辑推荐");
			// 分页查询出前12本书
			PageHelper.startPage(1, 12);
			return csm.selectByExample(cse);
		}
}
