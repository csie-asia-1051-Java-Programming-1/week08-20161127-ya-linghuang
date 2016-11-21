package ex;
/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex04_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner (System.in);
		System.out.println("請輸入進行動作，(a)加(b)減(c)乘(d)除(e)平方(f)立方(g)開根號: ");
		char z=scn.next().charAt(0);
		int x =0;
		int y =0;
		if(z=='e'||z=='f'||z=='g'){
			System.out.println("計算機(請輸入一數字): ");
			 x =scn.nextInt();
		}else{
			System.out.println("計算機(請輸入兩數字): ");
			 x =scn.nextInt();
			 y = scn.nextInt();
		}
		Count fin =new Count();
		System.out.print("= ");
		switch(z){
		case 'a':
			System.out.println(fin.addition(x,y));
			break;
		case 'b':
			System.out.println(fin.Subtraction(x,y));
			break;
		case 'c':
			System.out.println(fin.multiplication(x,y));
			break;
		case 'd':
			System.out.println(fin.division(x,y));
			break;
		case 'e':
			System.out.println(fin.square(x));
			break;
		case 'f':
			System.out.println(fin.cube(x));
			break;
		case 'g':
			System.out.println(fin.Squareroot(x));
			break;
		default:
			System.out.println("請輸入a~g!");
			break;
		}
	}

}
class Count{
	public int addition(int a,int b){
		return a+b;
	}
	public int Subtraction(int a,int b){
		return a-b;
	}
	public int multiplication(int a,int b){
		return a*b;
	}
	public int division(int a,int b){
		return a/b;
	}
	public int square(int a){
		return (int)Math.pow(a, 2);
	}
	public int cube(int a){
		return (int)Math.pow(a, 3);
	}
	public float Squareroot(int a){
		return (float)Math.sqrt(a);
	}
}