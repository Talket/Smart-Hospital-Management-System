import java.util.*;

class Patient {
    String name;
    int age;
    String problem;

    Patient(String name, int age, String problem) {
        this.name = name;
        this.age = age;
        this.problem = problem;
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Patient> queue = new LinkedList<>();

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nPatient " + i);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Problem: ");
            String problem = sc.nextLine();

            queue.add(new Patient(name, age, problem));
        }

        System.out.println("\n--- Patients in Queue ---");
        while (!queue.isEmpty()) {
            Patient p = queue.remove();

            System.out.println("Name    : " + p.name);
            System.out.println("Age     : " + p.age);
            System.out.println("Problem : " + p.problem);
            System.out.println("------------------------");
        }

        sc.close();
    }
}