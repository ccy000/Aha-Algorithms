package 万能的搜索;
import java.util.Scanner;

public class 宝岛探险dfs染色 {
    static int next[][] = {{0,1},{1,0},{0,-1},{-1,0}};
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
	dfs(startx,starty,a,book,n,m,-1);
	System.out.println(sum);
	sum=1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=m;j++) {
			System.out.print(String.format("%3d", a[i][j]));
		}
		System.out.println();
	}
	}
}
public static int dfs(int x,int y,int a[][],int book[][],int n,int m ,int color) {
	int tx,ty;
	a[x][y]=color;
		for(int i=0;i<=3;i++) {
			tx = x + next[i][0];
			ty = y + next[i][1];
			if(tx<1||tx>n||ty<1||ty>m)
				continue;
			if(book[tx][ty]==0 && a[tx][ty]>0) {
				sum++;
				book[tx][ty]=1;
				dfs(tx,ty,a,book,m,n,color);
			}
		}
		return sum;
	}
}
