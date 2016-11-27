package hw;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換 (必須使用遞迴)
 * Date: 2016/11/21
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw02_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.println("請問為幾進制(2~10)轉成幾進制(2~10): ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println("請輸入數字: ");
		int num =scn.nextInt();
		int count1=1;
		int count2=1;
		int fin1=0;
		int fin2=0;
		System.out.println("答案為: "+change(a,b,num,count1,count2,fin1,fin2));
	}
	public static int change(int x,int y,int Num,int Count1,int Count2,int Fin1,int Fin2){
		if(Num>0){																																					//轉成十進制
			Fin1=Fin1+(Num%10*Count1);
			Num=Num/10;
			Count1=Count1*x;
			return change(x,y,Num,Count1,Count2,Fin1,Fin2);
		}else if(Num<=0&&Fin1>0){																													//轉成結果進制
			Fin2=Fin2+(Fin1%y*Count2);
			Fin1=Fin1/y;
			Count2=Count2*10;
			return change(x,y,Num,Count1,Count2,Fin1,Fin2);
		}else{
			return Fin2;
		}
	}

}
