//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,String> phoneBook = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, Integer.toString(phone));
        }
        while(in.hasNext()){
            String s = in.next();
            if (phoneBook.containsKey(s))
                System.out.printf("%s=%s\n",s,phoneBook.get(s));
            else
                System.out.println("Not found");
        }
        in.close();
    }
}
