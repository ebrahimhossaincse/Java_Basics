package com.ebrahim.hossain.controlflowstatement;

/*
 * Author: Md.Ebrahim Hossain
 * SQA Engineer - Achieve Test Prep
 */

public class ForEachLoop {

	public static void main(String[] args) {

		String[] ps4Exclusives = { "Uncharted", "God Of War", "Spiderman", "Death Stranding" };

		for (String finalList : ps4Exclusives) {
			System.out.println(finalList);
		}

	}

}
