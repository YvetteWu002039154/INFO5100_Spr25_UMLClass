package Accounts;

import Clients.Client;

public class Account {
    private String name;
    private AccountType accountType;
    private int aID;
    private Client client;

    public Account(String name, AccountType accountType, int aID, Client client) {
        this.name = name;
        this.accountType = accountType;
        this.aID = aID;
        this.client = client;
    }

    public String getName() {
        return name;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void addAccountType(){
        AccountType accountType = new AccountType();
        this.accountType = accountType;
    }

    public void removeAccountType(){
        this.accountType = null;
    }

    public void addClient(){
        Client client = new Client();
        this.client = client;
    }

    public void removeClient(){
        this.client = null;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountType=" + accountType.getName() +
                ", aID=" + aID +
                ", client=" + client.getName() +
                '}';
    }
}
