package Banks;

import java.util.ArrayList;
import java.util.List;

import Accounts.Account;
import Clients.Client;

public class BankSystem {
    private String name;
    private String bankName;
    private List<Account> accounts = new ArrayList<>();
    private List<Client> clients = new ArrayList<>();

    public BankSystem(String name, String bankName) {
        this.name = name;
        this.bankName = bankName;
    }

    public String getName() {
        return name;
    }

    public String getBankName() {
        return bankName;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }
    public void addClient(Client client) {
        clients.add(client);
    }

    public void removeClient(Client client) {
        clients.remove(client);
    }

    public void listAccounts() {
        for (Account account : accounts) {
            System.out.println(account.toString());
        }
    }

    public void listClients() {
        for (Client client : clients) {
            System.out.println(client.toString());
            System.out.println("Rewards:");
            client.listRewards();
        }
    }
}
