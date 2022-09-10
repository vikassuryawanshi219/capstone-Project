package com.mpokketapp.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;



@Entity
public class User {
	private String userName;
	@Id
	@GeneratedValue(generator = "user_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "user_id", sequenceName = "user_id")
	private Integer userId;
	private long adharNo;
	private LocalDate dob;
	@Enumerated(EnumType.STRING)
	private UserType userType;
	private String mobileNo;
	
	private Double principalAmount;
	private Double emi;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name ="user_id")
	private Set<Loan> loanList;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userName, long adharNo, LocalDate dob, UserType userType, String mobileNo,
			Double principalAmount, Double emi, Set<Loan> loanList) {
		super();
		this.userName = userName;
		this.adharNo = adharNo;
		this.dob = dob;
		this.userType = userType;
		this.mobileNo = mobileNo;
		this.principalAmount = principalAmount;
		this.emi = emi;
		this.loanList = loanList;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Double getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(Double principalAmount) {
		this.principalAmount = principalAmount;
	}

	public Double getEmi() {
		return emi;
	}

	public void setEmi(Double emi) {
		this.emi = emi;
	}

	public Set<Loan> getLoanList() {
		return loanList;
	}

	public void setLoanList(Set<Loan> loanList) {
		this.loanList = loanList;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", adharNo=" + adharNo + ", dob=" + dob + ", userType=" + userType
				+ ", mobileNo=" + mobileNo + ", principalAmount=" + principalAmount + ", emi=" + emi + ", loanList="
				+ loanList + "]";
	}
	
	







	



	

}
