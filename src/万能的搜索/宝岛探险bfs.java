package ÍòÄÜµÄËÑË÷;
import java.util.Scanner;
public class ±¦µºÌ½ÏÕbfs {
	static class note{
		int x;
		int y;
	}
	public static int[][]book = new int[101][101];
	public static int[][]a = new int[101][101];
	public static int n,m,startx,starty,sum=1,head,tail,tx,ty;
    public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	note que[] = new note[2501];
	for(int i=0;i<2501;i++) {
		que[i]=new note();
	}
	int next[][] = {{0,1},{1,0},{0,-1},{-1,0}};
	while(cin.hasNext()) {
	n = cin.nextInt();
	m = cin.nextInt();
	startx = cin.nextInt();
	starty = cin.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=m;j++) {
			a[i][j]=cin.nextInt();
		}
	}
    head = 1;
    tail = 1;
    que[tail].x = startx;
    que[tail].y = starty;
    tail++;
    book[startx][starty]=1;
	while(head<tail) {
		for(int i=0;i<=3;i++) {
			tx = que[head].x + next[i][0];
			ty = que[head].y + next[i][1];
			if(tx<1||tx>n||ty<1||ty>m)
				continue;
			if(book[tx][ty]==0 && a[tx][ty]>0) {
				sum++;
				book[tx][ty]=1;
				que[tail].x = tx;
				que[tail].y = ty;
				tail++;
			}
		}
	head++;
	}
	System.out.println(sum);
	}
    }
}