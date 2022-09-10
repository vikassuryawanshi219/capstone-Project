package com.mpokketapp.model;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Loan {

	@Enumerated(EnumType.STRING)
	private LoanType loanType;
	@Id
	@GeneratedValue(generator = "loan_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "loan_id", sequenceName = "loan_id")
	private Integer loanId;
    private String loanName;
    private String bank;
    @ManyToOne
	@JoinColumn(name="User_id")
	private User user;
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Loan(LoanType loanType, String loanName, String bank) {
		super();
		this.loanType = loanType;
		this.loanName = loanName;
		this.bank = bank;
	}
	public LoanType getLoanType() {
		return loanType;
	}
	public void setLoanType(LoanType loanType) {
		this.loanType = loanType;
	}
	public Integer getLoanId() {
		return loanId;
	}
	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}
	public String getLoanName() {
		return loanName;
	}
	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Loan [loanType=" + loanType + ", loanName=" + loanName + ", bank=" + bank + "]";
	}
    	
}
