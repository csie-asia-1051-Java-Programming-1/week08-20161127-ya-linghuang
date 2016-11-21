package ex;
/*
 * Topic:  寫一程式計算兩個矩陣的乘法，例如 A 是 n1 x m1 的矩陣， B 是 n2 x m2 的矩 陣，C=AB 為 n1 x m2 矩陣
	第一列輸入 n1, m1, n2 及 m2 等 4 個整數，n1, m1 是第一個陣列的列(row)與行 (column)，而 n2, m2 則是第二個陣列的列(row)與行(column)，其中 m1 = n2。接著輸 入兩個陣列的內容。
 * Date: 2016/11/21
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex03_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入A為幾乘幾的矩陣及B為幾乘幾的矩陣: ");
		int An=scn.nextInt();
		int Am=scn.nextInt();
		int Bn=scn.nextInt();
		int Bm=scn.nextInt();
		int A[][]=new int[An][Am];
		int B[][]=new int[Bn][Bm];
		System.out.println("請輸入A矩陣: ");
		for(int i=0 ; i<An ; i++){
			for(int j=0 ; j<Am ; j++){
				A[i][j]=scn.nextInt();
			}
			System.out.println();
		}
		System.out.println("請輸入B矩陣: ");
		for(int i=0 ; i<Bn ; i++){
			for(int j=0 ; j<Bm ; j++){
				B[i][j]=scn.nextInt();
			}
			System.out.println();
		}
		int C[][]=new int[An][Bm];
		for(int i=0 ; i<An ; i++){
			for(int j=0 ; j<Bm ; j++){
				for(int m=0 ; m<Am ; m++){
					C[i][j]=C[i][j]+A[i][m]*B[m][j];
				}
				System.out.print(C[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
