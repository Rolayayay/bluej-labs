
import java.util.ArrayList;

public class pl2 {
    public static void main(String[] args) {

        // Create an ArrayList to hold integers
        ArrayList<Integer> list = new ArrayList<>();

        // Add initial numbers
        list.add(7);
        list.add(14);
        list.add(23);

        // Insert 19 between 14 and 23 (index 2)
        list.add(2, 19);

        // Print the third element (index 2)
        System.out.println(list.get(2));

        // Remove the integer 14 (remove by value)
        list.remove(Integer.valueOf(14));

        // Change the value 7 to 10, if found
        int index = list.indexOf(7);
        if (index != -1) {
            list.set(index, 10);
        }

        // Print final size of the list
        System.out.println("Size is: " + list.size());

        // Print entire list
        System.out.println(list);

        // ANSWERS
        //1. d
        //2. c
        //3. d
        //4. a
        //5. c
        
    }
 }