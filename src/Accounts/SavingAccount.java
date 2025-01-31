package Accounts;

import Clients.Client;

public class SavingAccount extends Account{
    private float interestRate;
    private String nickname;

    public SavingAccount(String name, AccountType accountType, int aID, Client client, float interestRate, String nickname) {
        super(name, accountType, aID, client);
        this.interestRate = interestRate;
        this.nickname = nickname;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
