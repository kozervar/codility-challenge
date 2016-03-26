import task1.Task1;
import task2.Task2;
import task3.Task3;

public class Main {


    public static void main(String[] args) {
        int[] t1_A = {1, 3, 2, 1, 2, 1, 5, 3, 3, 4, 2};
        Task1 task1 = new Task1();
        System.out.println("Task: 1, result: " + task1.execute(t1_A));

        Task2 task2 = new Task2();
        System.out.println("Task: 2, result: " + task2.execute(123, 67890));

        int[] t3_A = {60, 80, 40};
        int[] t3_B = {2, 3, 5};
        int M = 5, X = 2, Y = 200;

//        int[] t3_A  = {40,40,100,80,20};
//        int[] t3_B  = { 3, 3,  2, 2, 3};
//        int M = 3, X = 5, Y = 200;

        Task3 task3 = new Task3();
        System.out.println("Task: 3, result: " + task3.execute(t3_A, t3_B, M, X, Y));

    }
}
