package com.ebrahim.hossain.operators;

/*
 * Author: Md.Ebrahim Hossain
 * SQA Engineer - Achieve Test Prep
 */

public class TernaryOperator {

	public static void main(String[] args) {
		
		int val1 = 10, val2 = 20;
        int result = (val2 > val1) ? (val2 * val1) : val1;
        System.out.println("Ternary Operator Output: "+result);

	}

}
