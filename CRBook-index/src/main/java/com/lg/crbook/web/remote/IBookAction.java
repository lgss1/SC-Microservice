package com.lg.crbook.web.remote;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.lg.crbook.bean.CrBook;
import com.lg.crbook.bean.CrShow;

@FeignClient("crbook")
public interface IBookAction {

	@GetMapping("book/getNewBook")
	List<CrBook> getNewBook();
	
	@GetMapping("book/getRecom1")
	List<CrShow> getRecom1();
}
