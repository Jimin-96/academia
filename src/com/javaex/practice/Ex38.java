package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		
//		총급액을 입력하면 백원단위는 할인을 해주고 있습니다. 실제 지불금액을 출력하는 코드를 작성하세요
		
		Scanner sc = new Scanner(System.in);
		
		int a = 1000;
		
		System.out.print("전체 금액을 입력해주세요:");
		int b = sc.nextInt();
		System.out.println("실제 지불금액은 "+((b/a)*a)+"입니다.");
		
		sc.close();
		
		
	}
}