package arrayex5;
import java.util.*;
import java.io.*;


public class ArrayEx5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		double[] arr = new double[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i<n; i++)
		{
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		double sum = 0;
		
		for(int j =0; j<n; j++)
		{
			sum += ( (arr[j] / arr[arr.length-1]) * 100);
		}
		
		System.out.println(sum/n);

	}

}