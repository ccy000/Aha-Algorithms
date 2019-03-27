package 万能的搜索;

import java.util.Scanner;

public class 深度优先搜索 {
	public static int[] a = new int[10];
	public static int[] b = new int[10];
	public static int n;
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		 n = cin.nextInt();
		dfs(1);
	}
	
	
	public static void dfs(int step) {
		if(step==n+1) {
		for(int i=1;i<=n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
		for(int i=1;i<=n;i++) {
			if(b[i]==0) {
				a[step]=i;
				b[i]=1;
				dfs(step+1);
				b[i]=0;
			}
		}
	}
	
}

