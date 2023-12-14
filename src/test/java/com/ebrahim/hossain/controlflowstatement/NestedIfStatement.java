package com.ebrahim.hossain.controlflowstatement;

/*
 * Author: Md.Ebrahim Hossain
 * SQA Engineer - Achieve Test Prep
 */

public class NestedIfStatement {

	public static void main(String[] args) {

		int age = 70;

		if (age < 40) {
			System.out.println("You are young");
		} else {
			if (age > 75) {
				System.out.println("you are REALLY old!");
			} else {
				System.out.println("Don't worry you aren't that old");
			}
		}

	}

}
