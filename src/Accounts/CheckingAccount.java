package Accounts;

import Clients.Client;

public class CheckingAccount extends Account{
    private String nickname;

    public CheckingAccount(String name, AccountType accountType, int aID, Client client, String nickname) {
        super(name, accountType, aID, client);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
