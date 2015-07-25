package com.iterlife.designpattern.builder;


/**
 * @Description:com.iterlife.designpattern.builder.ConcreteAProduct.java
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-25 ����10:56:34
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class ConcreteAProduct extends Builder {
	Product	product	= new Product();

	/*
	 * (non-Javadoc)
	 * @see com.iterlife.designpattern.builder.Builder#setPart()
	 */
	@Override
	public void setPart() {
		this.product.setProductName("ConcreteA");
	}

	public Product buildProduct() {
		return this.product;
	}
}
