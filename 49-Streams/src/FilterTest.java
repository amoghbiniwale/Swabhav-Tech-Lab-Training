import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(10, 25, 45, 20, 30, 40);
		System.out.println(numberList);
	
		List<Integer> divisiableByTen= new ArrayList<Integer>();
		for (Integer x : numberList) {
			if (x % 10 == 0) {
				divisiableByTen.add(x);
			}
		}
		System.out.println("divisiable by 10: "+divisiableByTen);
		numberList.stream().filter(n->n%10==0).forEach(System.out::println);
		
		List<Integer>collect=numberList.stream().filter(n->n%10==0).collect(Collectors.toList());
		System.out.println("using collector: "+collect);
		
		List<String> friends = Arrays.asList("tushar","Ajay","ravi","Vishnu");
		
		List<String> collect2 =friends.parallelStream().filter(n->n.length()>=5).collect(Collectors.toList());
		System.out.println(collect2);
		
	}

}
