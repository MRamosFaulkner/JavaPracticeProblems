import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //codingbat Warmup-1
        System.out.println(sleepIn(true, false));
        System.out.println(monkeyTrouble(true, true));
        System.out.println(diff21(23));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(makes10(10,9));
        System.out.println(sumDouble(5,5));
        System.out.println(stringTimes("Hi",2));
        System.out.println(helloName("Bob"));
    }

    /**
     *The parameter weekday is true if it is a weekday, and the parameter vacation
     *is true if we are on vacation. We sleep in if it is not a weekday or we're on
     *vacation. Return true if we sleep in.
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {

        //if it is not a weekday or vacation
        if (!weekday || vacation) {
            return true;
        }
        return false;

    }

    /**
     * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if
     * each is smiling. We are in trouble if they are both smiling or if neither of
     * them is smiling. Return true if we are in trouble.
     */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        //represents if the monkeys are smiling or not
        if (!aSmile && !bSmile || aSmile && bSmile ) {
            return true;
        } else if (!aSmile && !bSmile) {
            return false;

        }

        return false;
    }

    /**Given an int n, return the absolute difference between n and 21, except return
     * double the absolute difference if n is over 21.
     *
     */

    public static int diff21(int n) {
        //if n is less than or equal to 21
        if (n <= 21) {
            //
            return  21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    /**
     * We have a loud talking parrot. The "hour" parameter is the current hour time in
     * the range 0..23. We are in trouble if the parrot is talking and the hour is before
     * 7 or after 20. Return true if we are in trouble.
     */
    public static boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }

    /**
     * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
     */
    public static boolean makes10(int a, int b) {

        //if the numbers are the same or the sum is the same as 10
        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        }
        return false;
    }

    /**
     * Given two int values, return their sum. Unless the two values are the same,
     * then return double their sum.
     */
    public static int sumDouble(int a, int b) {
        // the sum of the numbers
        int sum = a + b;

        //if the numbers are the same it will multiply by 2
        if (a == b) {
            sum = sum * 2;
        }
        return sum;
    }

    /**
     *Given a string and a non-negative int n, return a larger string that is n copies
     *of the original string.
     */
    public static String stringTimes(String str, int n) {
        //what the result will output
        String result = "";
        //loop iterates and once complete it concatenates the result with a string and adds the int
        for (int i = 0; i < n; i++) {
            result = result + str;
        }
        return result;
    }

    /**
     *Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     */

    public static String helloName(String name) {

        //returns name and adds hello to it
        return "Hello " + name + "!";
    }

    public static String makeAbba(String a, String b) {

        //returns the strings in the order added
        return a + b + b + a;
    }
}








