package arrayex7;
import java.io.*;
import java.util.*;

public class ArrayEx7 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int tc = Integer.parseInt(br.readLine()); 
		
		for(int i=0; i<tc; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine()," ");  // �л� �� �� ���� �Է�
			
			int n = Integer.parseInt(st.nextToken());	//�л� �� 
			int[] arr = new int[n];
			double sum = 0; // ���� ���� �� ���� 
			
			// ���� �Էºκ� 
			for(int j=0; j<n; j++)
			{
				int val = Integer.parseInt(st.nextToken()); // ���� ����
				arr[j] = val;
				sum += val;  // ���� ���� �� 
			}
			
			double mean = (sum / n) ; // ���
			double count = 0; // ��� �Ѵ� �л� �� ����
			
			// ��� �Ѵ� �л� ���� ã�� 
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