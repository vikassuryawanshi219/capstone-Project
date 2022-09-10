package com.mpokketapp.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.mpokketapp.model.Loan;
import com.mpokketapp.model.LoanType;
import com.mpokketapp.model.User;
import com.mpokketapp.model.UserType;

public interface IUserService {
	User addUser(User user);

	void updateByUser(User user);

	void deleteUser(int userId);

	User getUserById(int userId);
	
//custom
	
	List<User> getAll();
	List<User> getUserByLoanType(LoanType loanType);
	List<User> getUserByLoanId(Integer loanId);
	List<User> getUserByLoanName(String loanName);
	List<User> getUserByBank(String bank);
	
//derived	
}
