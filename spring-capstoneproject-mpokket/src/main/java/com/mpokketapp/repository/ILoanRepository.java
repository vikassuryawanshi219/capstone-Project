package com.mpokketapp.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mpokketapp.model.Loan;
import com.mpokketapp.model.LoanType;
import com.mpokketapp.model.User;
import com.mpokketapp.model.UserType;

@Repository
public interface ILoanRepository extends JpaRepository<Loan, Integer> {
//custom	
	@Query("FROM Loan l INNER JOIN l.user u WHERE u.userName=?1")
	List <Loan> getLoanByUserName(String userName);
	
	@Query("FROM Loan l INNER JOIN l.user u WHERE u.adharNo=?1")
	List <Loan> getLoanByAdharNo(long adharNo);
	
	@Query("FROM Loan l INNER JOIN l.user u WHERE u.dob=?1")
	List <Loan> getLoanByDob(LocalDate dob);
	
	@Query("FROM Loan l INNER JOIN l.user u WHERE u.mobileNo=?1")
	List <Loan> getLoanByMobileNo(int mobileNo);
	
	@Query("FROM Loan l INNER JOIN l.user u WHERE u.userType=?1")
	List <Loan> getLoanByUserType(UserType userType);
	
	@Query("FROM Loan l INNER JOIN l.user u WHERE u.emi=?1")
	List <Loan> getLoanByEmi(double emi);
	
	@Query("FROM Loan l INNER JOIN l.user u WHERE u.principalAmount=?1")
	List <Loan> getLoanByPrincipleAmount(double principalAmount);
	
//derived 
	
	
	
}