package com.mpokketapp.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.mpokketapp.model.LoanType;
import com.mpokketapp.model.User;
import com.mpokketapp.model.UserType;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
	
//custom
	
	@Query("FROM User u INNER JOIN u.loanList lu WHERE lu.loanType=?1")
	List<User>getUserByLoanType(LoanType loanType);
	@Query("FROM User u INNER JOIN u.loanList lu WHERE lu.loanId=?1")
	List<User>getUserByLoanId(Integer loanId);
	@Query("FROM User u INNER JOIN u.loanList lu WHERE lu.loanName=?1")
	List<User>getUserByLoanName(String loanName);
	@Query("FROM User u INNER JOIN u.loanList lu WHERE lu.bank=?1")
	List<User>getUserByBank(String bank);
	
//derive	
	
	
}
