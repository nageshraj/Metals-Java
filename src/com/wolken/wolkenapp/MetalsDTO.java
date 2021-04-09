package com.wolken.wolkenapp;

public class MetalsDTO {
	private int metalAtomicNumber;
	private String metalName;
	private double price;
	private String color;

	public MetalsDTO() {
		System.out.println(this.getClass().getSimpleName() + " Object Created");
	}

	public int getMetalAtomicNumber() {
		return metalAtomicNumber;
	}

	public void setMetalAtomicNumber(int metalAtomicNumber) {
		this.metalAtomicNumber = metalAtomicNumber;
	}

	public String getMetalName() {
		return metalName;
	}

	public void setMetalName(String metalName) {
		this.metalName = metalName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		// return super.toString(); calls toString of super class
		return "Metal name: " + metalName + "| Metal Atomic Number: " + metalAtomicNumber + "\nMetal Color: " + color
				+ "| Metal Price: " + price;
	}

	
	  @Override public int hashCode() { return metalAtomicNumber; }
	 

	@Override
	public boolean equals(Object obj) {
		// DownCasting
	MetalsDTO dto = (MetalsDTO) obj;
		if (obj == null)
			return false;
		else {
			if (obj instanceof MetalsDTO) {
				if (this.hashCode() == obj.hashCode())
					if (this.price == dto.price)
						return true;
			}

		}
		return false;
	}

}
