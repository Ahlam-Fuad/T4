import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by elham on 2/24/2021.
 */
public class Merge {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
        list1.add("Hi");
        list1.add("You");
        list1.add("There");
        System.out.println("ArrayList 1 : "+list1);

        ArrayList<Object> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println("ArrayList 2 : "+list2);

        list1.addAll(list2);
        System.out.println("Joind Array Lists : "+list1);
    }
}
