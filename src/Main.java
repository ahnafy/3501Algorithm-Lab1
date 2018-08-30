import java.util.Arrays;

public class Main {

    // copied from https://stackoverflow.com/questions/891031/is-there-a-method-that-calculates-a-factorial-in-java
    public static long factorial(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }

    public static void main(String[] args) {

        long time = System.currentTimeMillis();
        int n = 3;


        long number = factorial(n-1);

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < number; j++) {
                System.out.print(i);


                System.out.print(i + 1);

                System.out.println();


/*                for (int l = 1; l <= n; l++) {
                    if(i != l)
                        System.out.print(l + " ");
                }
                System.out.println();*/

            }

        }


        long endTime = System.currentTimeMillis();
        System.out.print("Time is: " + (endTime - time));
    }
}
