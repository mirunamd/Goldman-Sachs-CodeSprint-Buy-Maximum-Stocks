import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Stream;

public class Solution {
	private static HashMap<Integer, Integer> coll = new HashMap<>();

    static long buyMaximumProducts(int n, long k, int[] a) {
       	long count = 0;
		int i;

		for(i = 0; i < n; i++)
			coll.put(i + 1, a[i]);

		while(!coll.isEmpty()){
			
			int nr = searchMin(); // retrieves the day of the minimum price
			
			int p = coll.get(nr); // retrieves the price for the corresponding day			

			coll.remove(nr); // removes the entry corresponding to that day	
			
			while(k - nr * p < 0 && nr > 0)
				nr --;

			if(nr != 0){
				count += nr;
				k -= nr * p;
			}
		}
		return count;
    }
	
	static int searchMin(){
		int min = Integer.MAX_VALUE;	
		int day_min = 1;	

		for(Map.Entry<Integer, Integer> entry: coll.entrySet()){
			Integer day = entry.getKey();
			Integer price = entry.getValue();
		
			if(min >= price){
				min = price;
				day_min = day;
			}
		}
		return day_min;
	}
	
	static void print(HashMap<Integer, Integer> hm){
		for(Map.Entry<Integer, Integer> entry: hm.entrySet())
			System.out.println(entry.getKey() + " " + entry.getValue());
		System.out.println("*******");
	}

    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
		String[] num_strings = in.readLine().split("\\s");

        int[] arr = Stream.of(num_strings).mapToInt(Integer::parseInt).toArray();

       	long k = Long.parseLong(in.readLine());
		
       	long result = buyMaximumProducts(n, k, arr);
        System.out.println(result);
        in.close();
    }
}

