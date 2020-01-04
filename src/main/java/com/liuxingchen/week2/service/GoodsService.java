package com.liuxingchen.week2.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.liuxingchen.week2.domain.Goods;
import com.liuxingchen.week2.vo.GoodsVo;

public interface GoodsService {

	/**
	 * 
	 * @Title: selects
	 * @Description: 多条件模糊查询
	 * @return
	 * @return: List<Goods>
	 */
	PageInfo<Goods> selects(GoodsVo goodsVo,Integer pageNum,Integer pageSize);

	/**
	 * 
	 * @Title: insert
	 * @Description: 批量添加
	 * @param goods
	 * @return
	 * @return: int
	 */
	int insert(List<Goods> goods);

}
