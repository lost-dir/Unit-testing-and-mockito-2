package com.unit.testing.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {
	/*attributes*/
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "price", nullable = false)
	private double price;
	@Column(name = "stock", nullable = false)
	private int stock;
	/*constructors*/
	public Item() {
	}
	public Item(int id, String name, double price, int stock) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	/*getters only*/
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getStock() {
		return stock;
	}
	/*to string method*/
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}
}
