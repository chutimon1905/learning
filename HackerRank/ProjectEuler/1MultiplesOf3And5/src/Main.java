import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextInt();
            // number of multiples of each number in [1, n]
            long count_div_3 = (n-1) / 3;
            long count_div_5 = (n-1) / 5;
            long count_div_15 = (n-1) / 15;
            // sum of multiples of each number in [1, n]
            long mul_3 = 3 * count_div_3 * (count_div_3 + 1) / 2;
            long mul_5 = 5 * count_div_5 * (count_div_5 + 1) / 2;
            long mul_15 = 15 * count_div_15 * (count_div_15 + 1) / 2;

            long sum = mul_3 + mul_5 - mul_15;
            System.out.println(sum);
        }
    }
}
