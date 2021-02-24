/**
 * Created by elham on 2/24/2021.
 */
import java.util.Arrays;
import java.util.ArrayList;
import  java.util.List;

public class Rev {
    public static void main(String[] args) {
        List colors = new ArrayList(Arrays.asList(1,2,3,4,5));
        System.out.println("Before reversing : "+colors);
        int j = colors.size()-1;
        for (int i = 0 ; i <j ; i++) {
            colors.add(i, colors.remove(j));
        }
        System.out.println("After reversing : "+ colors);


    }

}
