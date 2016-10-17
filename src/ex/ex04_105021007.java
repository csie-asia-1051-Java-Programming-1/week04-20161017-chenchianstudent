package ex;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 105021007 陳麒安
 */

public class ex04_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入一正整數");
		int n=scn.nextInt();
		System.out.print("請輸入一字元符號");
		char n1=scn.next().charAt(0);
		for(int i=1;i<=n;i++){
			for(int j=n;j>=i;j--){
				System.out.print(n1);}
			System.out.println();}
	}

}
