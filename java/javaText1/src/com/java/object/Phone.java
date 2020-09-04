package com.java.object;

public class Phone {
	
	private int year;
	private double price;
	private String brand;
	
	//方法
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	

	
	//构造器
	public Phone(int year, double price, String brand) {
		super();
		this.year = year;
		this.price = price;
		this.brand = brand;
	}
	
	//
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		Phone p1 = new Phone(2019,3000,"华为");
		Phone p2 = new Phone(2019,3000,"华为");
		System.out.println(p1.equals(p2));
		
	}
	
	
	
	
}

