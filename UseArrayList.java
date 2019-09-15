package datastructure;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */
        // Megha Adding sample data
        ArrayList<String> alist=new ArrayList<String>();
        alist.add("Steve");
        alist.add("Tim");
        alist.add("Lucy");
        alist.add("Pat");
        alist.add("Angela");
        alist.add("Tom");

        //displaying elements once array
        printArrayList(alist);
        //removing  data from ArrayList
        System.out.println("Removing Tim : " + alist.remove(1));
        printArrayList(alist);
    }


// method to Print the Array List with looping
    public static void printArrayList(ArrayList <String> name)
    {
        Iterator i = name.iterator();
        System.out.println("The ArrayList elements are:");
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }


}
