package arrayex7;
import java.io.*;
import java.util.*;

public class ArrayEx7 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int tc = Integer.parseInt(br.readLine()); 
		
		for(int i=0; i<tc; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine()," ");  // 학생 수 및 성적 입력
			
			int n = Integer.parseInt(st.nextToken());	//학생 수 
			int[] arr = new int[n];
			double sum = 0; // 성적 누적 합 변수 
			
			// 성적 입력부분 
			for(int j=0; j<n; j++)
			{
				int val = Integer.parseInt(st.nextToken()); // 성적 저장
				arr[j] = val;
				sum += val;  // 성적 누적 합 
			}
			
			double mean = (sum / n) ; // 평균
			double count = 0; // 평균 넘는 학생 수 변수
			
			// 평균 넘는 학생 비율 찾기 
			for(int j = 0 ; j < n ; j++) 
			{
				if(arr[j] > mean) 
				{
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",(count/n)*100);

		}
		
	}
}