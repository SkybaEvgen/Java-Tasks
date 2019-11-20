/*
    n E [1, 1000000000]
    Find the min non negative int, that contains the same quantity of digits.
     */
    /*
    For example
    1 -> 0
    9 -> 0
    10 -> 10
    99 -> 10
     */
public class Min_Int {

    public int getTenDegre(int n){

        String nString = Integer.toString(n);

        int length = nString.length();

        if(length == 1) return 0;

        return (int) Math.pow(10, length - 1);

    }
}
