package kr.or.ksmart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Javabasic04_input {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("input something here");
		// String str = bufferedReader.readLine();
		Scanner scanner = new Scanner(System.in);
		String str2 = scanner.nextLine();

		System.out.println(str2);
	}
}
