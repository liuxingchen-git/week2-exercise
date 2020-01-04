package com.liuxingchen.week2.dao;

import java.util.List;

import com.liuxingchen.week2.domain.Goods;
import com.liuxingchen.week2.vo.GoodsVo;

public interface GoodsMapper {
	
	/**
	 * 
	 * @Title: selects 
	 * @Description: 多条件模糊查询
	 * @return
	 * @return: List<Goods>
	 */
	List<Goods> selects(GoodsVo goodsVo);

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
