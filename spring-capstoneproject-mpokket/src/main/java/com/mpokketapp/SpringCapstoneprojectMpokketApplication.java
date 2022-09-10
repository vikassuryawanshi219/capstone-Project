package com.mpokketapp;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mpokketapp.calculator.Calculator;
import com.mpokketapp.model.Loan;
import com.mpokketapp.model.LoanType;
import com.mpokketapp.model.User;
import com.mpokketapp.model.UserType;
import com.mpokketapp.service.ILoanService;
import com.mpokketapp.service.IUserService;

@SpringBootApplication
public class SpringCapstoneprojectMpokketApplication implements CommandLineRunner {

	@Autowired
	ILoanService loanService;

	@Autowired
	IUserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SpringCapstoneprojectMpokketApplication.class, args);
	}

	@Autowired
	Calculator calculator;

	@Override
	public void run(String... args) throws Exception {

		double emi = 0;
		Double principalAmount = (double) 12000;
		Integer duration = 2;
		emi = calculator.calEmiEntrepreneur(principalAmount, duration);

		double emi1 = 0;
	Double principalAmount1 = (double) 50000;
		Integer duration1 = 4;
		emi1 = calculator.calEmiBorrow(principalAmount1, duration1);


		

//		
//		Loan loan1= new Loan(LoanType.BUSINESSLOAN, "business loan", "sbi");
//		Loan loan2= new Loan(LoanType.HOMELOAN,"home loan","icici bank");
//		Set <Loan> loanList=new HashSet<>(Arrays.asList(loan1,loan2));
//		
//		User user= new User("vikas", 12345678,LocalDate.of(2016, 9, 23), UserType.ENTREPRENEUR, "1234567890"
//				,principalAmount,emi,loanList);
//		
//		Loan loan3= new Loan(LoanType.STUDENTLOAN, "student loan", "sbi");
//		
//		Set <Loan> loanList1=new HashSet<>(Arrays.asList(loan3));
//		User user1= new User("ram", 126789,LocalDate.of(2012, 10, 23), UserType.STUDENT, "1234767"
//				,principalAmount1,emi1,loanList1);
//		
//		userService.addUser(user1);
//		userService.addUser(user);
	
		//user Side
		System.out.println("By Bank");
		userService.getUserByBank("sbi").forEach(System.out::println);
		
		System.out.println("loan Name");
		userService.getUserByLoanName("student loan").forEach(System.out::println);
		
		System.out.println("Loan Id");
		userService.getUserByLoanId(2).forEach(System.out::println);
		
		System.out.println("loan Type");
		userService.getUserByLoanType(LoanType.BUSINESSLOAN).forEach(System.out::println);
		
		
		//loan Side
		System.out.println("by DOB");
		loanService.getLoanByDob(LocalDate.of(2012, 10, 23))
		.stream()
		.forEach((u)->System.out.println(u.getLoanType()));
		 System.out.println();
		
		 System.out.println("by DOB");
		 
	}
//	
}
