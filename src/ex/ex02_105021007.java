package ex;
import java.util.Scanner;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 105021007 陳麒安
 */

public class ex02_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		while(true){
		System.out.print("請輸入一正整數");
		int n=scn.nextInt();
		System.out.print("請再輸入一正整數");
		int m=scn.nextInt();
		int a=n*m;
		System.out.print(a);
		System.out.println("   是否要繼續(y/n):");
		char b=scn.next().charAt(0);
		if(b=='n' ||b=='N'){System.out.print("謝謝使用");break;}
		}	
		}
		
		
		
		}
		
		
	


