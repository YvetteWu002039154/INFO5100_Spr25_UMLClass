package Clients;

public class AgeGroup {
    private int ageLowerLimit;
    private int ageUpperLimit;
    private String name;

    public AgeGroup(int ageLowerLimit, int ageUpperLimit, String name) {
        this.ageLowerLimit = ageLowerLimit;
        this.ageUpperLimit = ageUpperLimit;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAgeUpperLimit(int maxAge){
        this.ageUpperLimit = maxAge;
    }

    public void setAgeLowerLimit(int minAge){
        this.ageLowerLimit = minAge;
    }

    public String getAgeGroupNameByAge(int age){
        if( age >= ageLowerLimit 
                && age < ageUpperLimit){
                    return name;
        }

        return "undefined";
    }
}
