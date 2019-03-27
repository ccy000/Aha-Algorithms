package 万能的搜索;
import java.util.Scanner;
public class 解救小哈bfs {
	public static class note{
		int x;
		int y;
		//int f;
		int step;
	};
public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	int a[][]= new int[51][51];
	int book[][] = new int[51][51];
	note que[] = new note[2501];
	for(int i=0;i<2501;i++) {
		que[i]=new note();
	}
	int next[][] = {{0,1},{1,0},{0,-1},{-1,0}};
	int head=1,tail=1;
	
	int n = cin.nextInt();
	int m = cin.nextInt();
	
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=m;j++) {
			a[i][j]=cin.nextInt();
		}
	}
	int startx = cin.nextInt();
	int starty = cin.nextInt();
	int endx = cin.nextInt();
	int endy = cin.nextInt();
	  
	que[tail].x = startx;
	que[tail].y = starty;
	//que[tail].f = 0;
	que[tail].step = 0;
	tail++;
	book[startx][starty]=1;
	int flag = 0;
	int tx,ty;
	int[] c1 = new int[1000];
	int[] c2 = new int[1000];
	int t=0;
	c1[0]=startx;
	c2[0]=starty;
	t++;
	while(head<tail) {
		for(int i=0;i<=3;i++) {
			tx = que[head].x + next[i][0];
			ty = que[head].y + next[i][1];
			if(tx<1||tx>n||ty<1||ty>m)
				continue;
			if(a[tx][ty]==0&&book[tx][ty]==0) {
				book[tx][ty]=1;
				que[tail].x = tx;
				que[tail].y = ty;
				//que[tail].f= head;
				que[tail].step=que[head].step+1;
				tail++;
				c1[t]=tx;
				c2[t]=ty;
				t++;
			}
			if(tx==endx&&ty==endy) {
				flag = 1;
				break;
			}
		}
		if(flag==1)
		   break;
		else
		   head++;
	}
	System.out.println(que[tail-1].step);
	for(int i=0;i<t;i++) {
		System.out.println("("+c1[i]+","+c2[i]+")");
	}
}
}
