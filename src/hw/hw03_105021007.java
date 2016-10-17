package hw;
import java.util.Scanner;
//程式個程式讓使用者連續輸入整數 (正數、負數及零)，直到使用者輸入 999 時停止，然後顯示正數有多少個，0 有幾個，負數總共有幾個，使用者可以重覆執行直到使用者輸入n


public class hw03_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int x=0;
int y=0;
int z=0;
while(true){
	System.out.print("請輸入整數");
	int n1=scn.nextInt();
	if(n1==999){
		System.out.print("謝謝使用");break;}
	else{
		if(n1>0){x++;}
	else{if(n1==0){y++;}
	else{if(n1<0){z++;}}
	
}	
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);

		System.out.println("是否還要繼續(y/n)");
		char d=scn.next().charAt(0);
		if(d=='n'||d=='N'){System.out.print("謝謝使用");break;}
}
}
}

}
