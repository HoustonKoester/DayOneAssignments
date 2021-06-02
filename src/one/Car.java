package one;

public class Car {
	public String name;
	public double price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Car(String name, double price){
		this.name = name;
		this.price = price;
		}
	
	public static Car highestPriceCar(Car c, Car d){
		if(c.getPrice() > d.getPrice()) {
			return c;
		}else {
			return d;
		}
		
	}
	}
