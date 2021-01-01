import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int number = 0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] nBi = Integer.toBinaryString(n).split("0");
        for (String s : nBi)
            if (number < s.length())
                number = s.length();
        System.out.println(number);
        scanner.close();
    }
}
