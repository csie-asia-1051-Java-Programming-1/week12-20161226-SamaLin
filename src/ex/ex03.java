package ex;
/*
 * Topic: OX 遊戲是大家小時候的童年記憶，甚至在長大後，無聊時還是會玩一下呢 ! 但當你一個人時，是否也能讓電腦跟你玩呢 ?
 * Date: 2016/12/26
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int data[] = new int[9];
		for (int i = 0; i < 9; i++) {
			data[i] = scn.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			if (data[i] == 0) {
				sum = sum + 1;
			}
		}
		if (sum != 4 && sum != 5) {
			System.out.println("False");
		} else if (data[0] == data[1] && data[1] == data[2]) {
			System.out.println("True");
		} else if (data[3] == data[4] && data[4] == data[5]) {
			System.out.println("True");
		} else if (data[6] == data[7] && data[7] == data[8]) {
			System.out.println("True");
		} else if (data[0] == data[3] && data[3] == data[6]) {
			System.out.println("True");
		} else if (data[1] == data[4] && data[4] == data[7]) {
			System.out.println("True");
		} else if (data[2] == data[5] && data[5] == data[8]) {
			System.out.println("True");
		} else if (data[0] == data[4] && data[4] == data[8]) {
			System.out.println("True");
		} else if (data[2] == data[4] && data[4] == data[6]) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
