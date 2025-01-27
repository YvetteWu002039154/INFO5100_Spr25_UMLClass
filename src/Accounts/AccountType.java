package Accounts;

public class AccountType {
    private String name;
    private int typeID;

    public AccountType(){
        this.name = "undefined";
    }
    
    public AccountType(String name, int typeID) {
        this.name = name;
        this.typeID = typeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
