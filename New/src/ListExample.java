import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		//Integer List
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
		list.remove(1);
		
		System.out.println(list);
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(20);
		list1.add(30);
		
		System.out.println(list1.get(0));
		
		list1.clear();
		
		list1.add(30);
		
		System.out.println(list1);
		list.removeAll(list1);
		System.out.println(list);
	}
}
