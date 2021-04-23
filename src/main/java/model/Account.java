package model;

import java.util.List;
import java.util.UUID;

public class Account {

    private UUID id;
    private long number;
    private double balance;
    private String lastName;
    private String firstName;
    private List<Operation> operations;

    public long getNumber() {
	return number;
    }

    public void setNumber(long number) {
	this.number = number;
    }

    public double getBalance() {
	return balance;
    }

    public void setBalance(double balance) {
	this.balance = balance;
    }

    public String getNom() {
	return lastName;
    }

    public void setNom(String lastName) {
	this.lastName = lastName;
    }

    public String getPrenom() {
	return firstName;
    }

    public void setPrenom(String firstName) {
	this.firstName = firstName;
    }

    public List<Operation> getOperations() {
	return operations;
    }

    public void setOperations(List<Operation> operations) {
	this.operations = operations;
    }

    public Account(long number, double balance, String lastName, String firstName, List<Operation> operations) {

	this.number = number;
	this.balance = balance;
	this.lastName = lastName;
	this.firstName = firstName;
	this.operations = operations;
    }

    @Override
    public String toString() {
	return "Account{" + "id=" + id + ", number=" + number + ", balance=" + balance + ", lastName='" + lastName
		+ '\'' + ", firstName='" + firstName + '\'' + ", operations=" + operations + '}';
    }
}
