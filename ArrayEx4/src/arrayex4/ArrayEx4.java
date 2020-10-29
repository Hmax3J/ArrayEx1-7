package arrayex4;
import java.util.*;
import java.io.*;

public class ArrayEx4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] arr = new boolean[42];
		int up = 0;
		
		for(int i = 0; i<10; i++)
		{
			int n = Integer.parseInt(br.readLine()) % 42;
			if(!arr[n])
			{
				up++;
				arr[n] = true;
			}
						
		}
		System.out.println(up);

	}

}