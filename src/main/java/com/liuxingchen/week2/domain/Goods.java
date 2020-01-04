package com.liuxingchen.week2.domain;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * 
 * @ClassName: Goods 
 * @Description: 实体类
 * @author: HP
 * @date: 2020年1月3日 下午4:09:03
 */
public class Goods implements Serializable{
	
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private BigDecimal price;
	private Integer sales;
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods(Integer id, String name, BigDecimal price, Integer sales) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.sales = sales;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getSales() {
		return sales;
	}
	public void setSales(Integer sales) {
		this.sales = sales;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + ", sales=" + sales + "]";
	}
}
