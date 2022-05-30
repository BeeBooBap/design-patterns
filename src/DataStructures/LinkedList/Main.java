package DataStructures.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Create Linked List
        List<String> myList = new List<String>();

        // Add Elements
        myList.add("abc");
        myList.add("mno");
        myList.add("pqr");
        myList.add("xyz");

        // Iterate through the list using For Each Loop
        for (String string : myList)
            System.out.println(string);
    }
}
