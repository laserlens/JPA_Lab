package common.helpers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian.Flak on 5/19/2017.
 */
public class MathHelper extends CommonHelper{

    public final double E = 2.71;
    public final double PI = 3.14;
    public static int x = 5;

    public int square(int val){
        return val * val;
    }

    public static int add(int... n) {
        int total = 0;//start with 0 so first number remains unchanged.
        for (int i : n)
            total += i;
       return total;
    } //adds numbers in order entered

    public static int subtract(int... n){
        List<Integer> numbers = new ArrayList();

        //for loop to turn all positive numbers negative and negative numbers positive starting at index 1
        for(int i = 0; i < n.length; i++) {
            if (i == 0) { numbers.add(n[i]); } else { numbers.add(n[i] * -1); }
        }

        //add the new list together
        int total = 0;
        for (int number : numbers)
            total += number;
        return total;
    } //subtracts numbers in order entered

    public static int multiply(int... n) {
        int total = 1;//start with 1 so first number remains unchanged.
        for(int i : n)
            total = total * i;
        return total;
    } //multiplies numbers in order entered
}
