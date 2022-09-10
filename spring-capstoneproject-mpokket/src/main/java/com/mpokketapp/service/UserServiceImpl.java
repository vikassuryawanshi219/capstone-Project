package com.mpokketapp.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpokketapp.model.Loan;
import com.mpokketapp.model.LoanType;
import com.mpokketapp.model.User;
import com.mpokketapp.model.UserType;
import com.mpokketapp.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	IUserRepository userRepository;
	
	@Override
	public User addUser(User user) {
		
		return userRepository.save(user);
	}
	
	@Override
	public void updateByUser(User  user) {
		
		 userRepository.save(user);
	}

	@Override
	public void deleteUser(int userId) {
		 userRepository.deleteById(userId);
		
	}
	@Override
	public User getUserById(int userId) {
		
	return userRepository.findById(userId).get();
	}

	@Override
	public List<User> getAll() {
		
		return userRepository.findAll();
	}

	@Override
	public List<User> getUserByLoanType(LoanType loanType) {
		
		return userRepository.getUserByLoanType(loanType);
	}

	@Override
	public List<User> getUserByLoanId(Integer loanId) {
		
		return userRepository.getUserByLoanId(loanId);
	}

	@Override
	public List<User> getUserByLoanName(String loanName) {
		
		return userRepository.getUserByLoanName(loanName);
	}

	@Override
	public List<User> getUserByBank(String bank) {
		
		return userRepository.getUserByBank(bank);
	}

	


	

	


	

	

	

}
