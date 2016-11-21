package ex;
/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex01_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入十進制數字: "); //做整數部分即可
		int a = scn.nextInt();
		TtT(a);
	}
	public static  void TtT(int x){
		int y = 0;										//存答案
		int z = 1;										//每一圈向前進一位
		while(x>0){
			y=y+(x%2*z);
			x=x/2;
			z=z*10;
		}
		System.out.println(y);
	} 
}
