package model;

import java.time.LocalDate;
import java.util.Date;

public class Operation {

    private String type;
    private double amount;
    private LocalDate date;
    private double balance;

    public Operation(String type, double amount, LocalDate date, double balance) {
	this.type = type;
	this.amount = amount;
	this.date = date;
	this.balance = balance;
    }

    public double getBalance() {
	return balance;
    }

    public void setBalance(double balance) {
	this.balance = balance;
    }

    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }

    public double getAmount() {
	return amount;
    }

    public void setAmount(double amount) {
	this.amount = amount;
    }

    public LocalDate getDate() {
	return date;
    }

    public void setDate(LocalDate date) {
	this.date = date;
    }

    @Override
    public String toString() {
	return "Operation{" + "type='" + type + '\'' + ", amount=" + amount + ", date=" + date + ", balance=" + balance
		+ '}';
    }
}
