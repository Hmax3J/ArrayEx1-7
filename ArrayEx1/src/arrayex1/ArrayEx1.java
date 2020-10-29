package arrayex1;
import java.util.*;
import java.io.*;

public class ArrayEx1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<n; i++)
		{
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
		System.out.println(array[0] + " " + array[n-1]);
		
	}

}