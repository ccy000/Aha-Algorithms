package 万能的搜索;

import java.util.Scanner;

public class 解救小哈dfs {
	public static int[][]book = new int[100][100];
	public static int[][]a = new int[100][100];
	public static int n,m,startx,starty,endx,endy,min=99999999;
public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	while(cin.hasNext()) {
	 n = cin.nextInt();
	 m = cin.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=m;j++) {
			a[i][j]=cin.nextInt();
		}
	}
	 startx = cin.nextInt();
	 starty = cin.nextInt();
	 endx = cin.nextInt();
	 endy = cin.nextInt();
	book[startx][starty]=1;
	dfs(startx,starty,0);
	if(min==99999999)
		System.out.println("No Way!");
	else
		System.out.println(min);
	min = 99999999;
}
}
public static void dfs(int x,int y,int step) {
	int[][] next ={{0,1},{1,0},{0,-1},{-1,0}};
	int tx,ty,k;
	if(x==endx&&y==endy) {
		if(step<min) {
			min = step;	
			return;
		}
	}
		for(int i=0;i<=3;i++) {
			tx = x+next[i][0];
			ty = y+next[i][1];
		if(tx<1||tx>n||ty<1||ty>m) {
			continue;
		}
		if(a[tx][ty]==0&&book[tx][ty]==0) {
			book[tx][ty]=1;
			dfs(tx,ty,step+1);
			book[tx][ty]=0;
		}
		}
		return;
}
}
