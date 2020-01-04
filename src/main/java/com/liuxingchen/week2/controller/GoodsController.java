package com.liuxingchen.week2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.liuxingchen.week2.domain.Goods;
import com.liuxingchen.week2.service.GoodsService;
import com.liuxingchen.week2.vo.GoodsVo;

@Controller
public class GoodsController {

	@Autowired
	private GoodsService service;
	
	@RequestMapping("list")
	public String selects(GoodsVo goodsVo,Model model,@RequestParam(defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "10")Integer pageSize) {
		PageInfo<Goods> info = service.selects(goodsVo, pageNum, pageSize);
		model.addAttribute("info", info);
		return "list";
	}
	
}
