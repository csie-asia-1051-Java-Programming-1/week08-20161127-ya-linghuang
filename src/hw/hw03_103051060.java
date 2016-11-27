package hw;
/*
 * Topic: 請寫一個遞迴程式，輸入一個 int 型態的資料，並回傳該資料在二進制下有多少個位元是 1，例如: 輸入 13 得到結果為 3
 * Date: 2016/11/21
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw03_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入整數: ");
		int a =scn.nextInt();
		int b =0;							//存答案
		int c =1;							//處理位數
		int d =0;							//存1
		System.out.println("二進制中有 "+TtT(a,b,c,d)+" 個1");
	}
	public static int TtT(int x,int y,int z,int count){
		if(x<=0){
			return count;
		}else{
			y=y+(x%2*z);
			if(x%2==1){
				count+=1;
			}else{
				count+=0;
			}
			x=x/2;
			z=z*10;
			return TtT(x, y, z,count);
		}
	}

}
