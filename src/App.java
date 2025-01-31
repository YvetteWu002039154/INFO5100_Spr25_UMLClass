import Accounts.Account;
import Accounts.AccountType;
import Accounts.InvestmentAccount;
import Accounts.LoanAccount;
import Banks.BankSystem;
import Banks.Reward;
import Clients.AgeGroup;
import Clients.Client;

public class App {
    public static void main(String[] args) throws Exception {
        BankSystem bankSystem = new BankSystem("BMO-BankSys", "BMO");

        System.out.println("Welcome to " +bankSystem.getName()+ " Operated by "+ bankSystem.getBankName());
        System.out.println("---------------------------------------");

        AccountType accountType = new AccountType("Loan",1);

        AgeGroup ageGroup = new AgeGroup(20,10,"Minor");

        Client client01 = new Client("Yvette",15,ageGroup,"individuals",0);

        Reward reward = new Reward("StudentReward", 0, "A new reward for students!");

        client01.addReward(reward);
        
        //Account account01 = new Account("account01",accountType,1,client01);
        LoanAccount loadAccount01 = new LoanAccount("loadaccount01", accountType, 2, client01, 0);

        InvestmentAccount investmentAccount01 = new InvestmentAccount
                                                    (
                                                        "investmentaccount01", 
                                                        accountType, 
                                                        3, client01, 
                                                        "makeingmoney@@"
                                                    );
        bankSystem.addAccount(loadAccount01);
        bankSystem.addAccount(investmentAccount01);
        
        System.out.println("The following are the accounts in our bank: ");
        bankSystem.listAccounts();

        bankSystem.addClient(client01);

        System.out.println("The following are the client in our bank: ");
        bankSystem.listClients();
    }
}

