package hw;
import java.util.Scanner;
//���ϥΪ̿�J1, 2, 3, �P4�ﶵ�A
//��J n ����ܹϧ� (ex: n = 5)
//��J n ����ܹϧ�
//��J n (�����O�_��)����ܹϧ�
//�����{��

public class hw04_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn=new Scanner(System.in);
    System.out.print("�п�J 1 2 3 4 �䤤�@�ﶵ");
    int s=scn.nextInt();
    if(s==1){
    	System.out.print("�п�Jn");
    	int n1=scn.nextInt();
    	for(int i=1;i<=n1;i++){
			for(int j=n1;j>=i;j--){
			System.out.print("@");}
			System.out.println();}
    	for(int i1=1;i1<n1;i1++){
			for(int j1=0;j1<i1+1;j1++){
				System.out.print('@');}
			System.out.println();}}
    	else{
    	if(s==2){
    		System.out.print("�п�Jn");
    		int n2=scn.nextInt();
    		for(int i=0;i<n2;i++){
    			for(int j=0;j<i+1;j++){
    				System.out.print('%');}
    			System.out.println();}
    		for(int i2=0;i2<=n2;i2++){
    			for(int j2=n2;j2>=i2;j2--){
    				System.out.print("%");}
    			System.out.println();}}
    	else{
    		if(s==3){
    	System.out.print("�п�Jn");
    	int H=scn.nextInt();
    	int W=H;
    	for(int i=0; i<(H+1) / 2; i++) {
    	     for(int j=0; j<W/2-i; j++) {
    	      System.out.print(" ");
    	     }
    	     for(int k=1; k<(i+1)*2; k++) {
    	      System.out.print('*');
    	     }
    	     System.out.println();
    	    }
    	    for(int i=1; i<=H/2; i++) {
    	     for(int j=1; j<=i; j++) {
    	      System.out.print(" ");
    	     }
    	     for(int k=1; k<=W-2*i; k++) {
    	      System.out.print('*');
    	     }
    	     System.out.println();
    	    }
    	}
    	else{
    	if(s==4){
    	System.out.print("���¨ϥ�");}	
    		
    	}
    			
    	}
}	
	}
	}   	
    
	

