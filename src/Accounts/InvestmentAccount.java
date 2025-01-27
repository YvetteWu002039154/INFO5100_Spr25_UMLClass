package Accounts;

import Clients.Client;

public class InvestmentAccount {
    private String nickname;

    public InvestmentAccount(String name, AccountType accountType, int aID, Client client, String nickname) {
        super();
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
