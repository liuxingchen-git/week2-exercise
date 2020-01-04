package com.liuxingchen.week2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuxingchen.week2.dao.GoodsMapper;
import com.liuxingchen.week2.domain.Goods;
import com.liuxingchen.week2.service.GoodsService;
import com.liuxingchen.week2.vo.GoodsVo;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsMapper mapper;

	@Override
	public PageInfo<Goods> selects(GoodsVo goodsVo, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Goods> list = mapper.selects(goodsVo);
		PageInfo<Goods> info = new PageInfo<Goods>(list);
		return info;
	}

	@Override
	public int insert(List<Goods> goods) {
		// TODO Auto-generated method stub
		return mapper.insert(goods);
	}

}
