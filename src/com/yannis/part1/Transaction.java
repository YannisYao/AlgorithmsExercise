package com.yannis.part1;

public class Transaction {
	private String name;
	private Date date;
	private double price;

	public Transaction(String transaction) {
		String[] fieldroots = transaction.split("\\s+");//ÇÐ¸î¿Õ¸ñÖÆ±í·û
		name = fieldroots[0];
		date = new Date(fieldroots[1]);
		price = Double.parseDouble(fieldroots[2]);
	}

	@Override
	public String toString() {
		return "Transaction [name=" + name + ", date=" + date + ", price=" + price + "]";
	}
	
	
}
