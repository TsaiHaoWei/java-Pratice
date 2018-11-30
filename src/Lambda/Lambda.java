package Lambda;

import java.util.Arrays;

public class Lambda {
	public static void main (String[] args) 
	{
		String[] names = {"Justin", "caterpillar", "Bush"};
		Arrays.sort(names, StringOrder::byLength);
		for(String name:names) System.out.printf("%s ",name);
			System.out.println();
		
		Arrays.sort(names, StringOrder::byLexicography);
		//Arrays.sort 做排列 採用泡沫排序 迴圈內建方法
		StringOrder.Stringprint(names);
		
		Arrays.sort(names, StringOrder::byLexicographylgnaoreCase);
		StringOrder.Stringprint(names);
	}
}
//trim(); 是從資料庫取值時 IF____ 比較長度時空白一樣會被計算
//所以trim 就是刪除空格的方法