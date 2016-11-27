package hw;
/*
 * Topic: 請寫一個 遞迴函式)進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw01_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.println("請輸入十進制數字: ");
		int a =scn.nextInt();
		int b =0;							//存答案
		int c =1;							//處理位數
		System.out.println("二進制為: "+TtT(a,b,c));
	}
	public static int TtT(int x,int y,int z){
		if(x<=0){
			return y;
		}else{
			y=y+(x%2*z);
			x=x/2;
			z=z*10;
			return TtT(x, y, z);
		}
	}
}
