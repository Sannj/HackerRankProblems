package hackerrank;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by sanjanabadam on 10/26/16.
 */
public class SockMerchant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        HashMap hm  = new HashMap();
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
            if(hm.containsKey(c[c_i])){
                int val = (int) hm.get(c[c_i]);
                val++;
                hm.put(c[c_i], val);
            }
            else{
                hm.put(c[c_i],1);
            }
        }
        int count = 0;
        Iterator it = hm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry) it.next();
            int val = (int)pair.getValue();
                count += val/2;

        }
        System.out.println(count);
    }
}
