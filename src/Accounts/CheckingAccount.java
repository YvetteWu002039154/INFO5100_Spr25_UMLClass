package Accounts;

import Clients.Client;

public class CheckingAccount {
    private String nickname;

    public CheckingAccount(String name, AccountType accountType, int aID, Client client, String nickname) {
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
