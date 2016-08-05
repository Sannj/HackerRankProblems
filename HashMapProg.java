package hackerrank;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by sanjanabadam on 5/26/16.
 */
public class HashMapProg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap hm = new HashMap();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            hm.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            Object result = hm.get(s);
            if(result == null){
                System.out.println("Not found");
            }
            else
                System.out.println(s+"="+result);
        }
        in.close();
    }
}

