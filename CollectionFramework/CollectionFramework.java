import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class CollectionFramework 
{
	public static void main(String[] args) 
	{
		//size =n
		//size=n+n/2+1
		List<String> studentName=new ArrayList<String>();
		studentName.add("Rakesh");
		studentName.add("Ram");
		studentName.add("Rajesh");
		studentName.add("Raman");
		System.out.println(studentName);
		studentName.add(0,"Shashank");
		System.out.println(studentName);
		List<String> list=new ArrayList<>();
		list.add("Shashank2");
		list.add("Rakesh2");
		studentName.addAll(list);
		System.out.println(studentName);


       // getting and removing 
		//System.out.println(studentName.get(0));
		//System.out.println(studentName.remove(0));
		//System.out.println(studentName);


		//set function
		//studentName.set(3,"Ramesh");
		//System.out.println(studentName);
		//System.out.println(studentName.contains("Shashank"));


		//iteration of the List Interface
		//for(int i=0;i<studentName.size();i++)
		//{
		//	System.out.println("The element is: "+studentName.get(i));
        //}




	    //iteration by for each loop
		//for(String element:studentName)
		//{
		//	System.out.println("The element is: "+element);
		//}




		//iteration by iterator
		//Iterator<String> it=studentName.iterator();
         //while(it.hasNext())
		//{
		//	System.out.println("Iterator: "+it.next());
		//}

        





	}
}
