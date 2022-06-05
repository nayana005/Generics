package com.bl.generics;

import java.util.Scanner;

public class MaximumInteger {
	public static void max_int() {
		Integer num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		num1 = sc.nextInt();
		System.out.println("Enter Second Number:");
		num2 = sc.nextInt();
		System.out.println("Enter Third Number:");
		num3 = sc.nextInt();
		Integer max = num1;
		if (num2.compareTo(max) > 0)
			max = num2;
		if (num3.compareTo(max) > 0)
			max = num3;

		System.out.println("Maximum number:" + max);
	}
}
