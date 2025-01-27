package Banks;

public class Reward {
    private String name;
    private int consumedPoint;
    private String description;

    public Reward(String name, int consumedPoint, String description) {
        this.name = name;
        this.consumedPoint = consumedPoint;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription(){
        return description;
    }

    public int getConsumedPoint(){
        return consumedPoint;
    }

    public void setConsumedPoint(int point){
        this.consumedPoint = point;
    }

    public void setDescription(String des){
        this.description = des;
    }
}
