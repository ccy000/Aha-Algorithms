package Ã¶¾Ù;

import java.util.Scanner;

public class »ð²ñ¹÷µÈÊ½ {
public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	int n = cin.nextInt();
	int count=0;
	int c;
	for(int i=0;i<=1111;i++) {
		for(int j=0;j<=1111;j++) {
			c=i+j;
			if((HuoChai(i)+HuoChai(j)+HuoChai(c)+4)==n) {
			     count++; 
			}
			else
				continue;
		}
	}
	System.out.println(count);
}
public static int HuoChai(int n) {
	int[] a = new int[] {6,2,5,5,4,5,6,3,7,6};
	int sum=0;
	int t = n;
	while(t/10!=0) {
		sum += a[t%10];
		t/=10;
	}
	sum += a[t];
	return sum;
}
}
