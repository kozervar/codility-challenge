package task3;

import java.util.Queue;

/**
 * Created by kozervar on 26.03.16.
 */
public class ElevatorMechanism {
    Long stops = 0l;
    public Integer floors;
    Elevator elevator;
    private Queue<Person> persons;

    public ElevatorMechanism(int M, int X, int Y){
        floors = M;
        elevator = new Elevator(this, X,Y);
        System.out.println("\nStarting elevator mechanism...");
    }

    public void addPersons(Queue<Person> persons) {
        this.persons = persons;
    }

    public int execute() {
        System.out.println("Floor 0!");
        while (!this.persons.isEmpty()) {
            Person person = persons.element();
            if(elevator.weightOK(person) && elevator.capacityOK(person)) {
                elevator.addPerson(persons.remove());
            } else {
                runMechanism();
            }
        }
        if(!elevator.isEmpty()) {
            this.runMechanism();
        }
        System.out.println("\nStopping elevator mechanism...\n\n");
        return stops.intValue();
    }

    public void runMechanism (){
        System.out.println("Going to the floors...");
        long numberOfFloors = elevator.getPersons().stream().mapToInt(Person::getFloor).distinct().count();
        numberOfFloors++;
        stops = stops + numberOfFloors;
        elevator.getPersons().clear();
        System.out.println("Ding! Floor 0! Stops made: " + numberOfFloors);
    }
}
