package Accounts;

import Clients.Client;

public class LoanAccount extends Account{
    private float interestRate;

    public LoanAccount(String name, AccountType accountType, int aID, Client client, float interestRate) {
        super(name, accountType, aID, client);
        this.interestRate = interestRate;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
}
