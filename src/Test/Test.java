package Test;

import java.awt.List;
import java.util.Arrays;

public class Test {
				
	public static void main(String[] args) {
		String str1="";
		System.out.println(str1);
		String[] str2= {"a","b","c"};
		List list=new List();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(Arrays.toString(str2)+"\n"+list);
//		for(String s: str2) {
//			System.out.println(s);
//		}
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i) instanceof String);
//		}

	}
	
}

