package se.keroprog.algorithmclass.factorial;

/**
 * Recursive method for returning Factorials, assignment for my Algorithms and Data Structures Class.
 * Created by Kristoffer on 2016-11-03.
 */
public class Factorial {


    /*
            Method getFact has time complexity O(log(n)) for n number of factorial calls
            The Memory allocation is O(n) for n number of method calls on the heap
     */

    public static long getFact(long x){

        // the recursive method's stop condition
        if (x == 1){
            System.out.println("x is 1, end of recursion, exiting getFact(" + x +"), current value: " + x);
            return x;
        }

        System.out.println("calling getFact(" + (x-1) + ")");

        //temporary number just for clarification printout, remove for optimal performance
        long tempX = x;

        //The method calling itself recursively with x-1 and multiplying the return value with x
        x *= getFact(x-1);

        // clarification printout, remove for optimal performance
        System.out.println("exiting method getFact(" + (tempX) + "), " +
                "multiplying by: " + tempX + ", current value: " + x);

        return x;
    }
}
