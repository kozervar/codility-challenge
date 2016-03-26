package task3;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by kozervar on 26.03.16.
 */
public class Elevator {
    private Integer capacity;
    private Integer maxWeight;

    private Queue<Person> persons;

    private ElevatorMechanism elevatorMechanism;

    public Elevator(ElevatorMechanism mechanism, int X, int Y){
        capacity = X;
        maxWeight = Y;

        persons = new LinkedList<>();

        elevatorMechanism = mechanism;
    }

    public boolean weightOK(Person person){
        int sum = getPersons().stream().mapToInt(Person::getWeight).sum();
        return (person.getWeight() + sum) <= maxWeight;
    }
    public boolean capacityOK(Person person){
        return getPersons().size() < capacity;
    }

    public void addPerson(Person person) {
        System.out.println("New person in the elevator! " + person.toString());
        getPersons().add(person);
    }

    public boolean isEmpty() {
        return this.getPersons().size() == 0;
    }

    public Queue<Person> getPersons() {
        return persons;
    }
}
