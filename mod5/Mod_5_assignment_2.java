package com.ss.mod5;

import java.util.Arrays;
import java.util.List;

interface PerformOperation1 {

	public String isOdd(int i);

}

interface PerformOperation2 {
	public String isPrime(int i);
}

interface PerformOperation3 {
	public String isPalindrome(int i);
}

interface PerformOperation4 {
	public boolean canSum(int beg, int[] vals, int value);
}

public class Mod_5_assignment_2 {

	static boolean canSum(int beg, int[] vals, int value) {
		if (beg >= vals.length) {
			return value == 0;
		}

		int i = beg;
		int sum = 0;

		while (i < vals.length && vals[beg] == vals[i]) {
			sum += vals[i];
			i++;
		}

		if (canSum(i, vals, value - sum)) {
			return true;
		}

		if (canSum(i, vals, value)) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) {

		int i = 3;
		int j = 4;
		int n = 33;
		int m = 5;
		int k = 46;
		int l = 6;
		int g = 13;

		int num = 898;
		int num2 = 3553;
		int num3 = 35;
		
		int vals1[] = new int[] {2, 4, 8};
		int vals2[] = new int[] {1, 2, 4, 8, 1};
		int vals3[] = new int[] {2, 4, 4, 8};
		boolean isPos = false;
		

		// Part 1
		PerformOperation1 po1 = (s) -> {
			if (s % 2 == 0) {
				return "EVEN";
			} else {
				return "ODD";
			}
		};

		System.out.println(po1.isOdd(i));
		System.out.println(po1.isOdd(j));

		PerformOperation2 po2 = (s) -> {
			if (s < 1) {
				return "NOT A VALID INPUT";
			}

			if (s <= 3) {
				return "PRIME";
			}

			for (int test = 2; test <= s / 2; test++) {

				if (s % test == 0) {
					return "COMPOSITE";
				}

			}

			return "PRIME";

		};

		System.out.println(po2.isPrime(n));
		System.out.println(po2.isPrime(m));
		System.out.println(po2.isPrime(k));
		System.out.println(po2.isPrime(l));
		System.out.println(po2.isPrime(g));

		PerformOperation3 po3 = (s) -> {
			int re = 0;
			int reversed = 0;
			int ori = s;

			while (s != 0) {
				re = s % 10;
				reversed = reversed * 10 + re;
				s /= 10;
			}

			if (ori == reversed) {
				return "PALINDROME";
			} else {
				return "NOT A PALINDROME";
			}

		};

		System.out.println(po3.isPalindrome(num));
		System.out.println(po3.isPalindrome(num2));
		System.out.println(po3.isPalindrome(num3));

		// Part 2
		List<Integer> intList1 = Arrays.asList(16, 8, 886, 8, 1);
		intList1.stream().forEach(s -> {
			System.out.print(s % 10 + " ");
		});
		System.out.println();

// ==================================================================================================		

		// Part 3
		List<Integer> intList3 = Arrays.asList();
		List<Integer> intList2 = Arrays.asList(1, 2, 3);
		intList2.stream().forEach(s -> {
			if (s == null) {
				System.out.println("List is empty");
			} else {
				System.out.print(s * 2 + " ");
			}

		});
		System.out.println();
		intList3.stream().forEach(s -> {
			System.out.println(s);
			if (s == null) {
				System.out.println("List is empty");
			} else {
				System.out.print(s * 2 + " ");
			}
		});

// ==================================================================================================		

		// Part 4
		List<String> strList = Arrays.asList("xxax", "xbxbx", "xxcx");
		strList.stream().forEach(s -> {
			String rep = s;
			rep = rep.replace("x", "");
			System.out.print(rep + " ");
		});
		System.out.println();
		

// ==================================================================================================
		
		// Part 5
		isPos = canSum(0, vals1, 10);
		System.out.println(isPos);
		
		isPos = canSum(0, vals2, 14);
		System.out.println(isPos);
		
		isPos = canSum(0, vals3, 14);
		System.out.println(isPos);
		
		

	}

// ==================================================================================================		

	// Part 6
	public static class SampleSingleton {

		private static SampleSingleton instance;

		private SampleSingleton() {
		};

		public static SampleSingleton getInstance() {

			if (instance == null) {
				synchronized (SampleSingleton.class) {
					if (instance == null) {
						instance = new SampleSingleton();
					}
				}
			}

			return instance;

		}

	}

}
