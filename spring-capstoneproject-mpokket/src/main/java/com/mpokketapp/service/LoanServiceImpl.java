package com.mpokketapp.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mpokketapp.model.Loan;
import com.mpokketapp.model.LoanType;
import com.mpokketapp.model.UserType;
import com.mpokketapp.repository.ILoanRepository;

@Service

public class LoanServiceImpl implements ILoanService{

	@Autowired
	ILoanRepository loanRepository;
	
	@Override
	public void updateLoan(Loan loan) {
		loanRepository.save(loan);
		
		
	}

	@Override
	public void deleteLoan(int loanId) {
		loanRepository.deleteById(loanId);
		
	}
	
	@Override
	public List<Loan> getAll() {
		
		return loanRepository.findAll();
	}
	
	@Override
	public Loan  getByLoanId(int loanId) {
		return loanRepository.findById(loanId).get();
	}

	@Override
	public List<Loan> getLoanByUserName(String userName) {
	
		return loanRepository.getLoanByUserName(userName);
	}

	@Override
	public List<Loan> getLoanByAdharNo(long adharNo) {
		return loanRepository.getLoanByAdharNo(adharNo);
	}

	@Override
	public List<Loan> getLoanByDob(LocalDate dob) {
		return loanRepository.getLoanByDob(dob);
	}

	@Override
	public List<Loan> getLoanByMobileNo(int mobileNo) {
		
		return loanRepository.getLoanByMobileNo(mobileNo);
	}

	@Override
	public List<Loan> getLoanByUserType(UserType userType) {
		return loanRepository.getLoanByUserType(userType);
	}

	@Override
	public List<Loan> getLoanByEmi(double emi) {
		
		return loanRepository.getLoanByEmi(emi);
	}

	@Override
	public List<Loan> getLoanByPrincipleAmount(double principalAmount) {
		
		return loanRepository.getLoanByPrincipleAmount(principalAmount);
	}

	


}

