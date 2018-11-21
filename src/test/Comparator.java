package test;

public class Comparator {
	Comparator<Fruit>priceComparator = new Comparator<Fruit>() {
		@Override
		public int compare(Fruit fruit1,Fruit fruit2) {
			return fruit1.price-fruit2.price;
		}
	};
	Basket<Apple>apple = new Basket<>(
			new Apple(20,100),new Apple(25,150));
	apples.sort(priceComparator);
	Basket<Banana>banana = new Basket<>(
			new banana(20,100),new banana(25,150));
	bananas.sort(priceComparator);
}
