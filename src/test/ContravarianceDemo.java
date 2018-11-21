package test;

import java.util.*;
public class ContravarianceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Comparator<Fruit>byPrice = (fruit,fruit2)->fruit1.price-fruit2.price;
		
		Comparator<Fruit>byPrice = new Comparator<Fruit>() {
			
		}
		Basket<Apple>apples = new Baket<>(
				new Apple(25,150),new Apple(20,100));
		apples.sort(byPrice);
		printlnEach(apples);
	}

}
