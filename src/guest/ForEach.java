package guest;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import static java.lang.System.out;
public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Justin", "Monica", "Irene");
		names.forEach(out::print);System.out.println();
		new HashSet(names).forEach(out::print);System.out.println();
		new ArrayDeque(names).forEach(out::print);System.out.println();
	}

	/*private static void  forEach(Iterable iterable) {
		 
		for(Object o :iterable)
		{
			System.out.print(o+" ");
		}
		
	}*/

}
