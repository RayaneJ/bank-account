package services;

import Exceptions.IllegalAmountException;
import Exceptions.NegativeAmountException;
import model.Account;
import model.Operation;

public interface AccountService {

    public void deposit(Account ac, Operation op) throws NegativeAmountException;

    public void withdrawal(Account ac, Operation op) throws IllegalAmountException;

    public void showHistory(Account ac);

}
