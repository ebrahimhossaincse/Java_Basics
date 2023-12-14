package com.ebrahim.hossain.controlflowstatement;

/*
 * Author: Md.Ebrahim Hossain
 * SQA Engineer - Achieve Test Prep
 */

public class WhileLoop {

	public static void main(String[] args) {
		int token = 100;

        while(token < 110)
        {
            System.out.println("Token " +token+ " Not Yet Expired!");
            token++;
        }
	}

}
