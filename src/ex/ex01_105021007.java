package ex;
import java.util.Scanner;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021007 陳麒安
 */

public class ex01_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		

int a=0;
int b;
int c=0;	
while(true){
	System.out.print("請輸入正整數");
	int n=scn.nextInt();
if(n!=-1){	
a+=n;
c++;
b=a/c;
System.out.print("總合"+a);
System.out.print("平均數"+b);
System.out.print("   是否要繼續(y/n):");
char d=scn.next().charAt(0);
if(d=='n' ||d=='N'){System.out.print("謝謝使用");break;}
}
	}

	}
}