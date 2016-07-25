package tictactoe;

public class CS2ArrayListTester
{
    public static void main(String [] args)
    {
	//Testing constructor and toString
	CS2ArrayList <String> myList = new CS2ArrayList <String>(20);
        myList.add("Monday");
        myList.add("Saturday");
        myList.add(1, "Tuesday");
        System.out.println("Monday,Tuesday,Saturday ==? " + myList);

        //Testing getFirst and getLast
        System.out.println("Monday ==? " + myList.getFirst()); //Monday
        System.out.println("Saturday ==? " + myList.getLast()); //Saturday

        //Testing setFirst and setLast
        myList.setFirst("Sunday");
        myList.setLast("Friday");
        System.out.println("Sunday,Tuesday,Friday ==? " + myList);

        //Testing remove(E element)
        myList.remove("Sunday");
        System.out.println("Tuesday,Friday ==? " + myList);

        //Testing indexOf
        myList.add(0, "Monday");
        myList.add(2, "Wednesday");
        myList.add(3, "Thursday");
        System.out.println( "4 ==? " + myList.indexOf("Friday"));

        //Testing contains
        System.out.println("true ==? " + myList.contains("Thursday"));
        System.out.println("false ==? " + myList.contains("Sunday"));
    }
}