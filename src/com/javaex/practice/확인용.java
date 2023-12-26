package com.javaex.practice;

import java.util.Scanner;

public class 확인용 {

	public static void main(String[] args) {
		
		final double p=3.14;
		
		Scanner sc=new Scanner(System.in);
		
		//반지름
		System.out.print("반지름: ");
		
		//입력
		double r=sc.nextDouble();
		
		//결과
		System.out.println("구의 부피는: "+((double)(4/3)*p*(r*r*r))+" 입니다.");
		
		sc.close();

	}

}
//System.out.println();