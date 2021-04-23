package services;

import Exceptions.AccountNotFoundException;
import Exceptions.IllegalAmountException;
import Exceptions.NegativeAmountException;
import model.Account;
import model.Operation;

import java.time.LocalDate;

public class AccountServiceImpl implements AccountService {

    public final static LocalDate today = LocalDate.now();

    public static LocalDate getToday() {
	return today;
    }

    @Override
    public void deposit(Account ac, Operation op) throws NegativeAmountException {

	if (op.getAmount() > 0) {

	    double newbalance = ac.getBalance() + op.getAmount();
	    ac.setBalance(newbalance);
	    ac.getOperations().add(new Operation(op.getType(), op.getAmount(), op.getDate(), ac.getBalance()));
	} else {
	    throw new NegativeAmountException("Negative amount");
	}
    }

    @Override
    public void withdrawal(Account ac, Operation op) throws IllegalAmountException {

	if (ac != null) {
	    if (ac.getBalance() >= op.getAmount()) {
		double newbalance = ac.getBalance() - op.getAmount();
		ac.setBalance(newbalance);
		ac.getOperations().add(new Operation(op.getType(), op.getAmount(), op.getDate(), ac.getBalance()));
	    } else {
		throw new IllegalAmountException("Insufficient balance");

	    }
	} else {
	    throw new AccountNotFoundException("no account found");
	}
    }

    @Override
    public void showHistory(Account ac) {

	ac.getOperations().stream().forEach(op -> op.toString());
    }

}
