package com.bl.generics;

import java.util.Scanner;

public class Comparison {
	public static void maximumInteger() {
		Integer num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Integer Number:");
		num1 = sc.nextInt();
		System.out.println("Enter Second Integer Number:");
		num2 = sc.nextInt();
		System.out.println("Enter Third Integer Number:");
		num3 = sc.nextInt();
		Integer max = num1;
		if (num2.compareTo(max) > 0)
			max = num2;
		if (num3.compareTo(max) > 0)
			max = num3;

		System.out.println("Maximum Integer Number Is:" + max);
	}
	public static void maximumFloat() {
		Float num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Float Number:");
		num1 = sc.nextFloat();
		System.out.println("Enter Second Float Number:");
		num2 = sc.nextFloat();
		System.out.println("Enter Third Float Number:");
		num3 = sc.nextFloat();
		Float max = num1;
		if (num2.compareTo(max) > 0)
			max = num2;
		if (num3.compareTo(max) > 0)
			max = num3;

		System.out.println("Maximum Float Number:" + max);
	}
	public static void maximumString()
	{
		String str1, str2, str3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String Number:");
		str1 = sc.next();
		System.out.println("Enter Second String Number:");
		str2 = sc.next();
		System.out.println("Enter Third String Number:");
		str3 = sc.next();
		String max = str1;
		if (str2.compareTo(max) > 0)
			max = str2;
		if (str3.compareTo(max) > 0)
			max = str3;

		System.out.println("Maximum String Number:" + max);
	}
}