package com.mpokketapp.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	double emi, interestAmount, newPrincipleFormula;

	private void calEmiHome (double principalAmount , int tenure) {
		System.out.println("For HomeLoan the rate of Interest is 8%");
		interestAmount = (principalAmount / 8);
		emi = (principalAmount + interestAmount) / tenure;

	}

	public void calEmiPersonal(double principalAmount, int tenure) {
		System.out.println("For PersonalLoan the rate of Interest is 12.5%");
		interestAmount = (principalAmount / 12.5);
		emi = (principalAmount + interestAmount) / tenure;

	}

	public double calEmiBorrow(double principalAmount, int tenure) {
		System.out.println("For BorrowLoan the rate of Interest is 10%");
		interestAmount = (principalAmount / 10);
		emi = (principalAmount + interestAmount) / tenure;
		return emi;
	}

	public double calEmiEducation(double principalAmount, int tenure) {
		System.out.println("For EducationLoan the rate of Interest is 9.8%");
		interestAmount = (principalAmount / 9.8);
		emi = (principalAmount + interestAmount) / tenure;

		double newPrincipleAmount = principalAmount + (emi + tenure);

		double newInterstAmount = (newPrincipleAmount / 10);
		double newEmi = (newPrincipleAmount + interestAmount) / 2;

		return newEmi;

	}

	public double calEmiEntrepreneur(double principalAmount, int tenure) {
		System.out.println("For Entrepreneur/Bussiness Loan the rate of Interest is 15%");
		interestAmount = (principalAmount / 15);
		emi = (principalAmount + interestAmount) / tenure;
		return emi;
	}

}
