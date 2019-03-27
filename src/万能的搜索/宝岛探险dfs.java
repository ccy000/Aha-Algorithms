package ÍòÄÜµÄËÑË÷;

import java.util.Scanner;

public class ±¦µºÌ½ÏÕdfs {
	public static int next[][] = {{0,1},{1,0},{0,-1},{-1,0}};
	static int sum=1;
public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	while(cin.hasNext()) {
		int[][]book = new int[101][101];
		int[][]a = new int[101][101];
		int n,m,startx,starty;
	n = cin.nextInt();
	m = cin.nextInt();
	startx = cin.nextInt();
	starty = cin.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=m;j++) {
			a[i][j]=cin.nextInt();
		}
	}
	book[startx][starty]=1;
	dfs(startx,starty,a,book,n,m);
	System.out.println(sum);
	sum=1;
	
	}
}
public static int dfs(int x,int y,int a[][],int book[][],int n,int m ) {
	
	int tx,ty;
		for(int i=0;i<=3;i++) {
			tx = x + next[i][0];
			ty = y + next[i][1];
			if(tx<1||tx>n||ty<1||ty>m)
				continue;
			if(book[tx][ty]==0 && a[tx][ty]>0) {
				sum++;
				book[tx][ty]=1;
				dfs(tx,ty,a,book,m,n);
			}
		}
		return sum;
	}
}
