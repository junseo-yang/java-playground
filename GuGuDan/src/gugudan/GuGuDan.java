package gugudan;

import java.util.Iterator;
import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		// 사용자 단 입력
		
		boolean iterate = true;
		
		while (iterate) {
			System.out.print("출력을 원하는 단을 입력해주세요:");
			Scanner scanner = new Scanner(System.in);
			int dan = scanner.nextInt();
			
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + i*dan);
			}
			
			System.out.println("======================");
		}
		
		
		// 구구단 출력
	}

}