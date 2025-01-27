package Clients;

import java.util.ArrayList;
import java.util.List;

import Banks.Reward;

public class Client {
    private String name;
    private int age;
    private AgeGroup ageGroup;
    private String intend;
    private int point;
    private List<Reward> rewards = new ArrayList<>();

    public Client(){
        this.name = "undefined";
    }
    
    public Client(String name, int age, AgeGroup ageGroup, String intend, int point) {
        this.name = name;
        this.age = age;
        this.ageGroup = ageGroup;
        this.intend = intend;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getIntend(){
        return intend;
    }

    public void setIntend(String intend){
        this.intend = intend;
    }

    public void addPoint(int addedpoint){
        this.point = point + addedpoint;
    }

    public int getPoint(){
        return point;
    }

    public void updatePoint(Reward reward, Boolean isAdd){
        int rewardPoint = reward.getConsumedPoint();
        
        if(isAdd){
            this.point = point - rewardPoint;
        }else{
            this.point = point + rewardPoint;
        }
    }

    public void addReward(Reward reward) {
        rewards.add(reward);
        updatePoint(reward,true);
    }

    public void removeReward(Reward reward) {
        rewards.remove(reward);
        updatePoint(reward, false);
    }

    public void listRewards() {
        for (Reward reward : rewards) {
            System.out.println(reward.getName());
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", ageGroup=" + ageGroup.getName() +
                ", intend=" + intend +
                ", point=" + point +
                '}';
    }
}
