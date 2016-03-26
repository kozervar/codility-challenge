package task3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by kozervar on 26.03.16.
 */
public class Task3 {

    public int execute(int[] A, int[] B, int NUMBER_OF_FLOORS, int ELEV_CAPACITY, int MAX_WEIGHT) {
        List<Person> person = new ArrayList<>(A.length);
        for(int i = 0; i < A.length; i++) {
            person.add(new Person(A[i], B[i]));
        }

        ElevatorMechanism elevatorMechanism = new ElevatorMechanism(NUMBER_OF_FLOORS, ELEV_CAPACITY, MAX_WEIGHT);
        Queue<Person> persons = IntStream.range(0, A.length).mapToObj(i -> new Person(A[i], B[i])).collect(Collectors.toCollection(LinkedList::new));
        elevatorMechanism.addPersons(persons);

        return elevatorMechanism.execute();
    }
}
