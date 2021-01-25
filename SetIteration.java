package SET.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetIteration {
    public static void main(String[] args) {

        HashSet<String> animalsSet = new HashSet<String>();
        animalsSet.add("Elephant");
        animalsSet.add("Dog");
        animalsSet.add("Lion");
        animalsSet.add("Hippo");

        for (String animal : animalsSet) {
            System.out.println(animal);
        }

        System.out.println("+++++++++++");

        // convert Set to ArrayList
        ArrayList<String> animalsList = new ArrayList<String>(animalsSet);
        System.out.println(animalsList);


        //iterate/loop through/go over values in SET using ITERATOR
        Iterator<String> animals2 = animalsSet.iterator();  // transform

        while (animals2.hasNext()){     // check if SET has next value - return boolean
            String animal = animals2.next();  // retrieve next value from SET

            if (animal.equalsIgnoreCase("Cat")){
                System.out.println("Animals2 collection has Cat inside of it");
                System.out.println("Cat was found");

            }else {
                System.out.println("Cat was not found");
            }
            break;

        }



    }

}
