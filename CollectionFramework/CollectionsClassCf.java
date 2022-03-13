import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
public class CollectionsClassCf 
{
	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<>();
		list.add(34);
		list.add(23);
		list.add(56);
		list.add(23);
		list.add(89);
		System.out.println("min element: "+Collections.min(list));
		System.out.println("max element: "+Collections.max(list));
		System.out.println("frequecy of element: "+Collections.frequency(list,23));
		System.out.println("Sorting in ascending order: ");
		Collections.sort(list);
		System.out.println(list);
         
		System.out.println("Sorting in descending order: ");
		Collections.sort(list,Comparator.reverseOrder());
		System.out.println(list);



	}
}
