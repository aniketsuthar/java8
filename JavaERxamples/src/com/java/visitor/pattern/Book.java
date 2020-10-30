package com.java.visitor.pattern;

public class Book implements Visitable {

	private double price;
	private String name;
	private double weight;

	public double getPrice() {
		return price;
	}

	public Book(double price, String name, double weight) {
		super();
		this.price = price;
		this.name = name;
		this.weight = weight;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
}