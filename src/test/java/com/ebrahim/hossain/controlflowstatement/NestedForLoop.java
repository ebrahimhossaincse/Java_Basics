package com.ebrahim.hossain.controlflowstatement;

/*
 * Author: Md.Ebrahim Hossain
 * SQA Engineer - Achieve Test Prep
 */

public class NestedForLoop {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println("*");
			}
			System.out.println("\n");
		}
	}

}
