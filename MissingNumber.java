package hackerrank;



import java.util.*;

/**
 * Created by sanjanabadam on 10/26/16.
 * https://www.hackerrank.com/challenges/missing-numbers?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=22-day-campaign
 */
public class MissingNumber {
    public static void main(String[] args) {
        int l1, l2;
        Scanner scan = new Scanner(System.in);
        l1 = scan.nextInt();
        int x1[] = new int[l1];
        for(int i = 0; i < l1; i++){
            x1[i] = scan.nextInt();
        }
        l2 = scan.nextInt();
        int x2[] = new int[l2];
        for(int i = 0; i < l2; i++){
            x2[i] = scan.nextInt();
        }
        HashMap<Integer,Integer> hm1 = new HashMap();
        HashMap<Integer,Integer> hm2 = new HashMap();
        for(int i = 0; i < l1; i++){
            if(hm1.containsKey(x1[i])){
                int val =  hm1.get(x1[i]);
                val++;
                hm1.put(x1[i],val);
            }
            else{
                hm1.put(x1[i],1);
            }
        }
        for(int i = 0; i < l2; i++){
            if(hm2.containsKey(x2[i])){
                int val =  hm2.get(x2[i]);
                val++;
                hm2.put(x2[i],val);
            }
            else{
                hm2.put(x2[i],1);
            }
        }

        SortedSet result = new TreeSet();
        Iterator e = hm1.entrySet().iterator();
        while(e.hasNext()){
            Map.Entry pair = (Map.Entry)e.next();
            int key1 = (int)pair.getKey();
            int val1 = (int)pair.getValue();
            if(hm2.containsKey(key1)){
                int val2 = hm2.get(key1);
                if(val1 != val2){
                    result.add(key1);
                }
            }
        }

        Iterator it = result.iterator();

        while (it.hasNext()) {
            Object element = it.next();
            System.out.print(element.toString()+" ");
        }


    }
}
