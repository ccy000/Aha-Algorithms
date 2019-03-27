package 万能的搜索;

import java.util.Scanner;

public class K进制数 {
public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	int n = cin.nextInt();
	int m = cin.nextInt();
	int[] a = new int[n+1];
	a[1]=m-1;
	a[2]=m*(m-1);
	for(int i=3;i<=n;i++) {
		a[i]=(a[i-1]+a[i-2])*(m-1);
	}
	System.out.println(a[n]);
}
}