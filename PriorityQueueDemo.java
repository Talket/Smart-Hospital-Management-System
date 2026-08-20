import java.util.*;

class Patient {
    String name;
    int age;
    String problem;
    String priority;

    public Patient(String name, int age, String problem, String priority) {
        this.name = name;
        this.age = age;
        this.problem = problem;
        this.priority = priority;
    }

    public String toString() {
        return name + " (Age: " + age + ") - Problem: " + problem + " [" + priority.toUpperCase() + "]";
    }
}

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Patient> highQ = new LinkedList<>();
        Queue<Patient> lowQ = new LinkedList<>();

        while (true) {
            System.out.print("Enter patient name (or type 'exit' to finish): ");
            String name = sc.nextLine();
            
            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter age: ");
            int age = Integer.parseInt(sc.nextLine());

            System.out.print("Enter problem facing: ");
            String problem = sc.nextLine();

            System.out.print("Enter priority (high/low): ");
            String priority = sc.nextLine().toLowerCase();

            Patient p = new Patient(name, age, problem, priority);

            if (priority.equals("high")) {
                highQ.add(p);
            } else {
                lowQ.add(p);
            }
            
            System.out.println("Patient added.\n");
        }

        Queue<Patient> finalQueue = new LinkedList<>();
        finalQueue.addAll(highQ);
        finalQueue.addAll(lowQ);

        System.out.println("\n--- Final Output Queue ---");
        while (!finalQueue.isEmpty()) {
            System.out.println(finalQueue.poll());
        }

        sc.close();
    }
}