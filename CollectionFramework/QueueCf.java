import java.util.Queue;
import java.util.LinkedList;
class QueueCf 
{
	//also cover LinkedList
	public static void main(String[] args) 
	{
		Queue<Integer> queue=new LinkedList<>();
        queue.offer(10);
		queue.offer(12);
	    queue.offer(13);
		//it is dangerous in java to add() the 
		//value in the queue it throw Exception
		queue.add(14);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());




	}
}
