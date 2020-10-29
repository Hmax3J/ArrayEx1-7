package arrayex3;
import java.util.*;
import java.io.*;

public class ArrayEx3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		int[] arr = new int[10];
		
		int z = a*b*c;
		
		while(z != 0)
		{
			arr[z%10]++;
			z /= 10;
		}
		
		for(int result : arr)
		{
			System.out.println(result);
		}


	}

}