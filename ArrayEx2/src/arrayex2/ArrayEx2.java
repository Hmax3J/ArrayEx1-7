package arrayex2;
import java.util.*;
import java.io.*;

public class ArrayEx2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//	int[] arr = new int[9];
 
		int max = 0;
		int index = 0;
		
		
		for(int i = 0 ; i < 9 ; i++) 
		{
		//	arr[i] = Integer.parseInt(br.readLine());  배열 없이 사용
			int a = Integer.parseInt(br.readLine());
			if(max<a) 
			{
				max = a;
				index = i+1;
			}
		}
 
		System.out.println(max);
		System.out.println(index);
	}

}