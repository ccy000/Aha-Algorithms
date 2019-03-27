package ÍòÄÜµÄËÑË÷;

public class laingshuxiangjia {
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
public static void main(String[] args) {
	dfs(1);
}
public static void dfs(int step) {
	if(step==10) {
		if(a[1]*100+a[2]*10+a[3]+a[4]*100+a[5]*10+a[6]==a[7]*100+a[8]*10+a[9])
			{
			System.out.println(a[1]+" "+a[2]+" "+a[3]+" "+a[4]+" "+a[5]+" "+a[6]+" "+a[7]+" "+a[8]+" "+a[9]);
			}
	}
	for(int i=1;i<=9;i++) {
			if(b[i]==0) {
				a[i]=step;
				b[i]=0;
				dfs(step+1);
				b[i]=0;
		}
	}
}
}
