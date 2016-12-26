package ex;
/*
 * Topic: 輸入一整數 N 及 N 個整數，請依照十進位中各位數字和由小到大排序輸出。如果各位數字和相等則比較數值由小到大排列。
 例如: 9122 的各位數字和為 9+1+2+2=14、3128 的各位數字和為 3+1+2+8=14 而 5112 的各位數字和為 5+1+1+2=9。
 所以輸入 9122 3128 5112 需輸出 5112 3128 9122 ，這是因為 5112(9) < 3128(14) < 9122(14)，其中又因為 3128 與 9122 兩者的各位數字和都是 14，所以將 數值小的 3128 放前面。則經由計算可得其識別碼為 165 ，乃是 11 之倍數，故此為一合法之 ISBN 碼。輸入一串 ISBN 碼，以空格隔開。
 * Date: 2016/12/26
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
public class ex01 {

	public static void main(String []args){
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int data[][]=new int[n][2];
		int ram=0;
//		String a=scn.nextLine();
		for(int i=0;i<n;i++){
			int a=scn.nextInt();
			data[i][0]=a;
			int sum=0;
			while(a>0){
				sum=sum+a%10;
				a=a/10;
			}
			data[i][1]=sum;
		}
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(data[i][0]<data[j][0]){
					ram=data[i][0];
					data[i][0]=data[j][0];
					data[j][0]=ram;
					ram=data[i][1];
					data[i][1]=data[j][1];
					data[j][1]=ram;
				}
			}
		}
		int a=0;
		int b=0;
		for(int i=0;i<n-1;i++){
			if(data[i][0]==data[i+1][0]){
				while(i){
					
				}
			}
		}
	}

}
