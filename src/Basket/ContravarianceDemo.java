package Basket;

import java.util.*;
public class ContravarianceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Comparator<Fruit>byPrice = (fruit,fruit2)->fruit1.price-fruit2.price;
		
		Comparator<Fruit>byPrice = new Comparator<Fruit>() {
			public int compare(Fruit fruit1,Fruit fruit2) {
			return fruit1.price - fruit2.price;
			}
		};
		
		Basket<Apple>apples = new Basket<>(
				new Apple(25,150),new Apple(20,100));
		apples.sort(byPrice);
		printlnForEach(apples);
		
		Basket<Banana>bananas = new Basket<>(
				new Banana(50,300),new Banana(30,200));
		apples.sort(byPrice);
		printlnForEach(bananas);
	}

	private static void printlnForEach(Basket<? extends Fruit> basket) {
		// TODO Auto-generated method stub
		for(Fruit fruit:basket.things) {
			System.out.printf("%s(%d %d)",fruit.getClass().getName(),fruit.price,fruit.weight);
			
		}System.out.println();
	}
	
}
