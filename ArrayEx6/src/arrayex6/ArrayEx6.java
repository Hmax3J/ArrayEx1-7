package arrayex6;
import java.util.*;
import java.io.*;

public class ArrayEx6 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		StringBuilder sb = new StringBuilder();
		
		int tc = Integer.parseInt(br.readLine());
		String arr[] = new String[tc];
		
		for(int i = 0; i<tc; i++)
		{
			arr[i] = br.readLine();
		}
		
		for (int i = 0; i < tc; i++) {
			
			int cnt = 0;	// 연속횟수
			int sum = 0;	// 누적 합산 
			
			for (int j = 0; j < arr[i].length(); j++) {
				
				if (arr[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			
			sb.append(sum).append('\n');
		}
		
		System.out.println(sb);

	}

}