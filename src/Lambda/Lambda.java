package Lambda;

import java.util.Arrays;
import java.util.Comparator;

import java.util.*;


public class Lambda {
	public static void main (String[] args) 
	{	
		/*Comparator<String> lengthComparator = StringOrder::byLength;
		String[] names = {"Justin", "caterpillar", "Bush"};
	//	Arrays.sort(names, StringOrder::byLength);
		
		
		for(String name:names) System.out.printf("%s ",name);
			System.out.println();
		
		Arrays.sort(names, StringOrder::byLexicography);
		//Arrays.sort ���ƦC �ĥΪw�j�Ƨ� �j�餺�ؤ�k
		StringOrder.Stringprint(names);
		
		Arrays.sort(names, StringOrder::byLexicographylgnaoreCase);
		StringOrder.Stringprint(names);
		*/
		List<String> names = Arrays.asList("Justin", "Monica", "Irene");
		names.forEach(name -> System.out.println(name));
		new HashSet(names).forEach(name -> System.out.println(name));
		new ArrayDeque(names).forEach(name -> System.out.println(name));
		
	}
}
//trim(); �O�q��Ʈw���Ȯ� IF____ ������׮ɪťդ@�˷|�Q�p��
//�ҥHtrim �N�O�R���Ů檺��k