package 万能的搜索;

import java.util.Scanner;

public class 再解炸弹人 {
	static int n,m;
	static String[]s = new String[20];
	static int startx,starty,max=0,mx,my;
	static int[][]book = new int[20][20];
	static int[][]next = {{0,1},{1,0},{0,-1},{-1,0}};
	public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	n = cin.nextInt();
	m = cin.nextInt();
	startx = cin.nextInt();
	starty = cin.nextInt();
	for(int i=0;i<=n-1;i++) {
		s[i]=cin.nextLine();
	}
	book[startx][starty]=1;
	mx = startx;
	my = starty;
	max = getsum(startx,starty);
	dfs(startx,starty);
	System.out.println(mx+" "+my+" "+max);
	}
	public static void dfs(int x,int y) {
		int sum,tx,ty;
		sum = getsum(x,y);
		if(sum>max) {
			max = sum;
			mx = x;
			my = y;
		}
		for(int i=0;i<=3;i++) {
			tx = x + next[i][0];
			ty = y + next[i][1];
			if(tx<0||tx>n-1||ty<0||ty>m-1)
				continue;
			if(s[tx].charAt(ty)=='.' && book[tx][ty]==0) {
				book[tx][ty]=1;
				dfs(tx,ty);
			}
		}
		//return;
	}
	public static int getsum(int x,int y) {
		int sum=0;
		int i,j;
		i=x;j=y;
		while(s[i].charAt(j)!='#') {
			if(s[i].charAt(j)=='G') {
				sum++;
				i--;
				if(i<0)
					break;
			}
		}
		i=x;j=y;
		while(s[i].charAt(j)!='#') {
			if(s[i].charAt(j)=='G') {
				sum++;
				i++;
				if(i>n-1)
					break;
			}
		}
		i=x;j=y;
		while(s[i].charAt(j)!='#') {
			if(s[i].charAt(j)=='G') {
				sum++;
				j--;
				if(j<0)
					break;
			}
		}
		i=x;j=y;
		while(s[i].charAt(j)!='#') {
			if(s[i].charAt(j)=='G') {
				sum++;
				j++;
				if(j>m-1)
					break;
			}
		}
		return sum;
	}
}
