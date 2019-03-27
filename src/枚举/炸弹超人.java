package Ã¶¾Ù;

import java.util.Scanner;

public class Õ¨µ¯³¬ÈË {
public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	while(cin.hasNext()) {
	int n = cin.nextInt();
    int m = cin.nextInt();
    int a = cin.nextInt();
    int b = cin.nextInt();
    String s[] = new String[n];
    for(int i=0;i<=n-1;i++) {
    	s[i]=cin.next();
    }
    int x,y;
    int sum;
    int max = 0;
    int i,j;
    for(i=a;i<=n-1;i++) {
    	for(j=b;j<=s[i].length()-1;j++) {
    		if(s[i].charAt(j)=='.') {
    			sum=0;
    			x=i;y=j;
    			while(s[x].charAt(y)!='#') {
    				if(s[x].charAt(y)=='G')
    					sum++;
    				x--;
    				if(x<0)
    					break;
    			}
    			x=i;y=j;
    			while(s[x].charAt(y)!='#') {
    				if(s[x].charAt(y)=='G')
    					sum++;
    				x++;
    				if(x>=n)
    					break;
    			}
    			x=i;y=j;
    			while(s[x].charAt(y)!='#') {
    				if(s[x].charAt(y)=='G')
    					sum++;
    				y--;
    				if(y<0)
    					break;
    			}
    			x=i;y=j;
    			while(s[x].charAt(y)!='#') {
    				if(s[x].charAt(y)=='G')
    					sum++;
    				y++;
    				if(y>=m)
    					break;
    			}
    			if(max<sum) {
        			max = sum;
        		}
    		}
    		else
    			continue;
    	}
    }
    System.out.println(max);
}
}
}
