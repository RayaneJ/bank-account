package Exceptions;

public class NegativeInitialBalanceException extends RuntimeException {

    @Override
    public String toString() {
        return ("Error CheckingAccount: negative initial balance");
    }
}
