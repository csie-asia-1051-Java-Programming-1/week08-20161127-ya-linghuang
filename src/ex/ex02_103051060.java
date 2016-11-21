package ex;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex02_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請問要幾進制轉成幾進制(2~10 to 2~10):  ");
		int a =scn.nextInt();
		int b =scn.nextInt();
		System.out.println("請輸入數字: ");
		int c =scn.nextInt();
		System.out.println("結果為: "+Change(a,b,c));
	}
	public static int  Change(int x,int y, int num){
		int count = 1;			//每一圈多一次方				//轉成10進制
		int fin = 0;
		while(num>0){
			fin=fin+(num%10*count);
			num=num/10;
			count=count*x;
		}
		int wea=1;				//每一圈向前一位				//	轉成結果進制
		int Fin =0;																
		while(fin>0){
			Fin=Fin+(fin%y*wea);
			fin=fin/y;
			wea=wea*10;
		}
		return Fin;
	}
}
