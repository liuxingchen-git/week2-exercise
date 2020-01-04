package com.liuxingchen.week2.service.impl;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liuxingchen.util.NumberUtil;
import com.liuxingchen.util.StreamUtil;
import com.liuxingchen.util.StringUtil;
import com.liuxingchen.week2.domain.Goods;
import com.liuxingchen.week2.service.GoodsService;

//启动spring容器
@ContextConfiguration(locations = "classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class GoodsServiceImplTest {

	@Resource
	private GoodsService service;

	@Test
	public void testSelects() {
		fail("Not yet implemented");
	}

	@Test // 导入数据
	public void testInsert() {

		List<Goods> goodsList = new ArrayList<Goods>();

		// 调用工具类,读取数据
		List<String> list = StreamUtil.readLine(this.getClass().getResourceAsStream("/data.txt"));
		int i = 0;
		for (String str : list) {
			Goods goods = new Goods();
			String[] split = str.split("\\==");
			if (NumberUtil.isNumber(split[0])) {
				goods.setId(Integer.parseInt(split[0]));
			}
			if (StringUtil.hasText(split[1])) {
				goods.setName(split[1]);
			}
			// 处理价格
			// 判断是否为空
			if (StringUtil.hasText(split[2])) {
				String price = split[2].substring(1);// 去掉￥
				// 判断是否是数字
				if (NumberUtil.isNumber(price)) {
					BigDecimal decimal = new BigDecimal(price);
					goods.setPrice(decimal);
				}
			}
			// 处理百分比
			if (split.length > 3 && StringUtil.hasText(split[3])) {
				String sales = split[3].substring(0, split[3].length() - 1);
				goods.setSales(Integer.parseInt(sales));
			} else {
				goods.setSales(0);
			}
			goodsList.add(goods);
		}
		service.insert(goodsList);
	}

}
