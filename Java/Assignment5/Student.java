package Assignment5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
	private String name;
	private int rollNo;
	private double marks[] = new double[5];
	private double average;
	private char grade;

	Student(String name, int rollNo, double marks[]) {
		this.name = name;
		this.rollNo = rollNo;
		
		for (int i = 0; i <5; i++) {
			if (marks[i] <= 0 || marks[i] > 100) {
				throw new IllegalArgumentException("Wrong Output");
			}
		}
		System.arraycopy(marks, 0, this.marks, 0,5);
		
	}

	void calculateAverage() {
		double total = 0;
		for (int i = 0; i < 5; i++) {
			
				total += marks[i];
			
		}
		average = (total / 5.0);
	}

	void calculateGrade() {
		if (average >= 90) {
			grade = 'A';
		} else if (average < 90 && average >= 80) {
			grade = 'B';
		} else if (average < 80 && average >= 70) {
			grade = 'C';
		} else if (average < 70 && average >= 60) {
			grade = 'D';
		}else {
			grade='F';
		}
	}
	void displayStudentInfo() {
		 System.out.println("Student Name is : "+name +"\nRoll Number : "+rollNo);
		 for(double x: marks) {
			 System.out.print(x+" ");
		 }
		 System.out.println("\nAverage Marks are : "+average+"\nGrade is : "+grade);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter Student Name: ");
			String name=sc.nextLine();
			System.out.println("Enter Student Roll Number: ");
			int roll=sc.nextInt();
			
			System.out.println("Enter Student marks: ");
			double marks[]=new double[5];
			for (int i = 0; i <5; i++) {
				marks[i]=sc.nextDouble();			
				}
			Student s= new Student(name, roll, marks);
			s.calculateAverage();
			s.calculateGrade();
			s.displayStudentInfo();
			
		} catch (InputMismatchException  e) {
			System.out.println("Input Mismatch");
		}catch ( IllegalArgumentException e) {
			System.out.println("Input Mismatch");
	    }
		
	}

}
