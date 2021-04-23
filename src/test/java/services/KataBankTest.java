package services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Account;
import model.Operation;
import org.junit.Before;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

class KataBankTest {
    private List<Operation> operations = new ArrayList<Operation>();
    private Account ac = new Account(2, 10000, "DIF", "Rayene", operations);;
    private Operation op1 = new Operation("deposit", 20, LocalDate.now(), 10000);;
    private Operation op2 = new Operation("withdrawal", 300, LocalDate.now(), 10000);;
    private AccountService accountService = new AccountServiceImpl();

    @Test
    public void shouldDeposit() {

	accountService.deposit(ac, op1);
	ac.toString();
	double balanceResult = ac.getBalance();
	assertEquals(10020, balanceResult, 0.0);
    }

    @Test
    public void shouldWithdrawal() {
	accountService.withdrawal(ac, op2);
	double balanceResult = ac.getBalance();
	assertEquals(9700, balanceResult, 0.0);

    }

}
