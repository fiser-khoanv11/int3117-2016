package main;

import java.util.Scanner;

public class TinhDiem {
	
	public static String PhanLoai(int grade) {
		if (grade >= 80) return "A";
		else if (grade >= 60 && grade <= 79) return "B";
		else if (grade >= 50 && grade <= 59) return "C";
		else if (grade >= 40 && grade <= 49) return "D";
		else return "F";
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap diem tu 0 den 100: ");
		int grade = 0;
		do {
			grade = input.nextInt();
			if(grade >= 0 && grade <= 100) break;
			System.out.println("Diem khong hop le, nhap lai: ");
		} while(true);
		System.out.println(PhanLoai(grade));
	}

}
