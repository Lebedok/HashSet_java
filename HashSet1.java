package SET.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSet1 {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        HashSet set = new HashSet(); // we are creating new HashSet with Object
        HashSet<String> setOfString = new HashSet<>(); // with String
        Set set2 = new HashSet(); // with Object, but using Set interface (super class)

        HashSet set3 = new HashSet(list); // converting the ArrayList to HashSet


        setOfString.add("Pear");
        setOfString.add("Strawberry");
        setOfString.add("Banana");

        System.out.println(setOfString);
        // Sets (specifically HashSet, there are exception) don't hold the order

        // checking if the Set have duplicates
        setOfString.add("Banana");
        System.out.println(setOfString);


        // setOFString.clear();  -  clears the Set
        if (setOfString.contains("Raspberry"))
            System.out.println("The set contains Raspberry");
        else
            System.out.println("The set doesn't contains Raspberry");

        // remove method -  Banana
        setOfString.remove("Banana");
        System.out.println("Banana is removed" + setOfString);

        // Size() method
        System.out.println("The size of the set - " + setOfString.size());




    }
}
