package Ã¶¾Ù;

import java.util.Scanner;

public class p2030 {
public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	int n = cin.nextInt();
	int m = cin.nextInt();
	String[] s = new String[n];
	int sum;
	int x,y;
	int i,j;
	for(i=0;i<n;i++) {
		s[i]=cin.next();
	}
	for(i=0;i<=n-1;i++)
	{
		for(j=0;j<=m-1;j--) {
			sum=0;
			if(s[i].charAt(j)!='#') {
			     x = i; y=j;
			     while(s[x].charAt(y)=='.') {
			    	 if(s[x].charAt(y)=='#')
			    		 sum++;
			    	 x--;
			     }
			     x = i; y=j;
			     while(s[x].charAt(y)=='.') {
			    	 if(s[x].charAt(y)=='#')
			    		 sum++;
			    	 x++;
			     }
			     x = i; y=j;
			     while(s[x].charAt(y)=='.') {
			    	 if(s[x].charAt(y)=='#')
			    		 sum++;
			    	 y--;
			     }
			     x = i; y=j;
			     while(s[x].charAt(y)=='.') {
			    	 if(s[x].charAt(y)=='#')
			    		 sum++;
			    	 y++;
			     }
			     
			}
		}
	}
}
}
