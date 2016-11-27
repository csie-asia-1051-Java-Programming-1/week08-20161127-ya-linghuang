package hw;
/*
 * Topic: 請寫以類別方式寫一個程式可顯示四位數字的 LED 燈一組，可根據輸入的四位數字顯示數字。比如說， 由鍵盤輸入 1234 ，則可在螢幕上顯示如圖
 * Date: 2016/11/21
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw04_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.println("請輸入四位數: ");
		int num = scn.nextInt();
		Show show = new Show();
		show.fin(num);
	}
}
class Show{
	public void fin(int x){
		String[] a ={"*****    ","*    ","*****    ","*****    ","*     *    ","*****    ","*           ","*****    ","*****    ","*****    "};
		String[] b ={"*     *    ","*    ","       *    ","       *    ","*     *    ","*           ","*           ","       *    ","*      *   ","*      *    "};
		String[] c  ={"*     *    ","*    ","*****    ","*****    ","*****    ","*****    ","*****    ","       *    ","*****    ","*****    "};
		String[] d  ={"*     *    ","*    ","*           ","       *    ","       *    ","       *    ","*      *    ","      *    ","*      *    ","       *    "};
		String[] e  ={"*****    ","*    ","*****    ","*****    ","       *    ","*****    ","*****    ","       *    ","*****    ","       *    "};
		int n=x%10;
		x=x/10;
		int m=x%10;
		x=x/10;
		int j=x%10;
		x=x/10;
		int i=x%10;
		System.out.println(a[i]+a[j]+a[m]+a[n]);
		System.out.println(b[i]+b[j]+b[m]+b[n]);
		System.out.println(c[i]+c[j]+c[m]+c[n]);
		System.out.println(d[i]+d[j]+d[m]+d[n]);
		System.out.println(e[i]+e[j]+e[m]+e[n]);
	}
}
