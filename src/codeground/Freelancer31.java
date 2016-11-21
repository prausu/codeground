package codeground;

import java.util.Scanner;
import java.io.FileInputStream;

/* 사용하는 클래스명이 Solution 이어야 하며, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해 볼 수 있습니다. */

public class Freelancer31 {
//class Solution {
	public static void main(String args[]) throws Exception	{
		/* 아래 메소드 호출은 앞으로 표준입력(키보드) 대신 sample_input.txt 파일로 부터 읽어오겠다는 의미의 코드입니다.
		   만약 본인의 PC 에서 테스트 할 때는, 입력값을 sample_input.txt에 저장한 후 이 코드를 첫 부분에 사용하면,
		   표준입력 대신 sample_input.txt 파일로 부터 입력값을 읽어 올 수 있습니다.
		   또한, 본인 PC에서 아래 메소드를 사용하지 않고 표준입력을 사용하여 테스트하셔도 무방합니다.
		   단, Codeground 시스템에서 "제출하기" 할 때에는 반드시 이 메소드를 지우거나 주석(//) 처리 하셔야 합니다. */
		Scanner sc = new Scanner(new FileInputStream("sample_input31.txt"));
        
		//Scanner sc = new Scanner(System.in);

		int T;
		int test_case;

		T = sc.nextInt();        
		for(test_case = 1; test_case <= T; test_case++) {
			int N=sc.nextInt();
			int i;
			
			int[] P=new int[N];
			for(i=0;i<N;i++){
				P[i]=sc.nextInt();
			}
			int[] Q=new int[N];
			for(i=0;i<N;i++){
				Q[i]=sc.nextInt();
			}
			
			int[] dp=new int[N];
			dp[0]=Math.max(P[0], Q[0]);
			dp[1]=Math.max(dp[0]+P[1], Q[1]);
			for(i=2;i<N;i++){
			dp[i]=Math.max(dp[i-1]+P[i], dp[i-2]+Q[i]);
			}
			
			System.out.println("Case #" + test_case);	
			System.out.println(dp[N-1]);				
		}
	}
}