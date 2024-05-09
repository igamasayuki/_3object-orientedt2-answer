package com.example.answer.ex_medalfactory;

/**
 * 製品(メダル)を表すクラス.
 * 
 * @author igamasayuki
 */
public class Medal {
	/** 製品名(金メダルなど) */
	private String name;

	/** 製品価格 */
	private int price;

	public Medal() {
	}

	public Medal(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Medal [name=" + name + ", price=" + price + "]";
	}

}
