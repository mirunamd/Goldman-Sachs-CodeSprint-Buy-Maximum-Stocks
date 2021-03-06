import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	private static long[] coll = new long[101]; // coll[i] holds the price for day i

    static long buyMaximumProducts(int n, long k, int[] a) {
       	long count = 0;
		int max = 1;
		int min = a[0];

		for(int i = 0; i < n; i++){
			coll[a[i]] += (i + 1);

			if(a[i] > max)
				max = a[i];
			if(a[i] < min)
				min = a[i];
		}

		for(int p = min; p <= max; p++){ // minimum price 
			
			long nr = coll[p]; // day of the minimum price 

			if(k - nr < 0)
				break;

			if(nr != 0){
			
				while(k - nr * p < 0 && nr > 0)
					nr --;
				count += nr;
				k -= nr * p;
			}
		}
		return count;
    }
	
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        int[] arr = new int[n];
        int i = 0;
        for(String s : in.readLine().split("\\s")){
            arr[i ++] = Integer.parseInt(s);
        }

       	long k = Long.parseLong(in.readLine());
		
       	long result = buyMaximumProducts(n, k, arr);
        System.out.println(result);
        in.close();
    }
}

