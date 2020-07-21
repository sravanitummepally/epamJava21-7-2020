package java8;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Filter_Strings {
	public static List<String> search(List<String> list) {
		return list
				.stream()
				.filter(s -> s.startsWith("a") && s.length()==3)
				.collect(Collectors.toList());
	}
	
	public static void main(String args[]) {
		
		List<String> str = new ArrayList<String>();
		 str.add("abc"); 
	        str.add("aaa"); 
	        str.add("bbb");
	        str.add("abcd");
	        List<String> s1 = search(str); 
	        System.out.println(s1);
		 
            
		
	}
}






