package ex;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 105021060 陳俊仁
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        fun1(m,n);
	}
	public static void fun1(int m,int n){
       int sum=1;
	   for(int i=m;i>0;i--){
			sum=sum*i;
	   }
	   double sum1=1;
	   for(int j=n;j>0;j--){
		   sum1=sum1*j;
	   }
	   double sum2=1;
	   int x=m-n;
	   for(int z=x;z>0;z--){
		   sum2=sum2*z;
	   }
	   System.out.println(sum/sum1*sum2);
	}
	 
}
