package com.mpokketapp.service;

import java.time.LocalDate;
import java.util.List;

import com.mpokketapp.model.Loan;
import com.mpokketapp.model.LoanType;
import com.mpokketapp.model.User;
import com.mpokketapp.model.UserType;


public interface ILoanService {
	
	void updateLoan(Loan loan);
	void deleteLoan(int loanId);
	Loan getByLoanId(int loanId);
	List<Loan> getAll();
	
//custom query
	
	List <Loan> getLoanByUserName(String userName);
	List <Loan> getLoanByAdharNo(long adharNo);
	List <Loan> getLoanByDob(LocalDate dob);
	List <Loan> getLoanByMobileNo(int mobileNo);
	List <Loan> getLoanByUserType(UserType userType);
	List <Loan> getLoanByEmi(double emi);
	List <Loan> getLoanByPrincipleAmount(double principalAmount);
	
//derived 
	
	
	
}
