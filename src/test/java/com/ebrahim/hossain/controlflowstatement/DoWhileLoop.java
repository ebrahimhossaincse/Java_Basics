package com.ebrahim.hossain.controlflowstatement;

/*
 * Author: Md.Ebrahim Hossain
 * SQA Engineer - Achieve Test Prep
 */

public class DoWhileLoop {

	public static void main(String[] args) {
		int age = 10;
		do {
			System.out.println("Not Allowed! You Are Too Young For The Roller Coaster!");
			age++;
		} while (age < 15);
		
	}
}
