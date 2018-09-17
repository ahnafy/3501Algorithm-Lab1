import java.util.Arrays;

public class Main {

    public static void makeNumbers(int col, Integer[] givenArr, Integer[] resultArr) {

        if (col == resultArr.length) {
            System.out.println(Arrays.toString(resultArr));
            return;
        }

        for (int i = 0; i < givenArr.length; i++) {
            Integer num = i + 1;
            if (!Arrays.asList(resultArr).contains(num)) {
                resultArr[col] = givenArr[i];
                Integer[] cloneResult = resultArr.clone();
                makeNumbers(col + 1, givenArr, cloneResult);
            }
        }
    }

    public static void main(String[] args) {

        long time = System.currentTimeMillis();
        int n = 8;

        Integer[] givenArr = new Integer[n];
        Integer[] finalArr = new Integer[n];

        for (int i = 0; i < givenArr.length; i++) {
            givenArr[i] = i + 1;
        }

        makeNumbers(0, givenArr, finalArr);

        long endTime = System.currentTimeMillis();
        System.out.print("Time is: " + (endTime - time));
    }
}

/*
* ANSWERS
* The efficiency of the algorithm in the number of printed lines is f(n) = O(n!)
* The number of lines when n=3 is 6, which is 3!, and the number of lines when n=4 is 24,
* which is 4!, so we concluded that the number of lines is always n!.
*
* Based on the timing results, the function for time in milliseconds is n!/(2^n).
*
* So n=15 would take 39907054.6 milliseconds, which is about 11 hours.
* n=20 would take 2.3201962 x 10^12 milliseconds, which is about 73.6 years
*
*
*/
