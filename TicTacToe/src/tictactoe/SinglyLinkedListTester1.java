
import java.util.*;

public  class  SinglyLinkedListTester1
{
    public static void main(String [] args)
    {
		
		SinglyLinkedList <String> myList = new SinglyLinkedList <String>();
		myList.addFirst("Monday");
		myList.addLast("Saturday");
		myList.add(1, "Tuesday");

        System.out.println("Monday = ? " + myList.getFirst()); //Monday
       	System.out.println("Saturday = ?" + myList.getLast()); //Saturday

        myList.setFirst("Sunday");
        myList.setLast("Friday");

        System.out.println("Sunday = ? " + myList.getFirst()); //Sunday
        System.out.println("Friday = ? " + myList.getLast()); //Friday

		System.out.println("Sunday Tuesday Friday = ? " + myList);
       	myList.set(1,"Wednesday");
       	System.out.println("Sunday Wednesday Friday = ? " + myList);
		
		System.out.println("Friday = ? " + myList.get(2));
		
		System.out.println("1 = ? " + myList.indexOf("Wednesday"));
		
    }
}