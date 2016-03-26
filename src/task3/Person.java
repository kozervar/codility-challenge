package task3;

/**
 * Created by kozervar on 26.03.16.
 */
public class Person {
    private Integer floor;
    private Integer weight;
    public Person(int weight, int floor) {
        this.setWeight(weight);
        this.setFloor(floor);
    }
    @Override
    public String toString() {
        return "[ weight = " + getWeight() + ", floor = " + getFloor() +" ]";
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
