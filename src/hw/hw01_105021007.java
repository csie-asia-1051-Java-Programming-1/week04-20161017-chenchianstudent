package hw;
import java.util.Scanner;
//使用者輸入 n 產生 n 個 費氏數列 (例 n = 5 ) 1, 1, 2, 3, 5



public class hw01_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int v2=1;
		int v3=0;
		int v1=0;
		int v5=1;
		
		System.out.print(v5+"\t"+v5);
		for(int i=0;i<n;i++){
			v3=v2+v1;
			v1=v2;
			v2=v3;
			v3=v1+v2;
			
			System.out.print("\t"+v3);
			
			}
		
	}

}
