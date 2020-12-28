import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String S = sc.next();
            char[] myCharArray = S.toCharArray();
            String strodd;
            String streven;
            streven = strodd = "";
            for(int j = 0; j < S.length(); j++){
                // Print each sequential character on the same line
                if (j%2 == 0)
                    streven += myCharArray[j];
                else
                    strodd += myCharArray[j];
            }
            System.out.printf("%s %s\n",streven,strodd);

        }
    }
}
