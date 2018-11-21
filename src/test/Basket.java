package test;
import java.util.Comparator;
public class Basket <T>{
	public T[] things;
	public Basket(T...things) {
		this.things=things;
	}
	public void sort(Comparator<? super T>comparator) {
	}
}


