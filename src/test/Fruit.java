package test;

class Fruit {
	
	int price;
	int weight;
	Fruit(){}
	Fruit(int price, int weight){
		this.price = price;
		this.weight = weight;
	}
}

class Apple extends Fruit{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Apple";
	}

	Apple(){}

	Apple(int price, int weight) {
		super(price, weight);
		// TODO Auto-generated constructor stub
	}
	
}

class Banana extends Fruit{
	Banana(){}

	Banana(int price, int weight) {
		super(price, weight);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Banana";
	}

}

