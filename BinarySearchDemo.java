import java.util.*;

class PatientRecord implements Comparable<PatientRecord> {
    int patientId;
    String patientName;
    int age;
    String problem;

    public PatientRecord(String name, int age, String problem, int id) {
        this.patientName = name;
        this.age = age;
        this.problem = problem;
        this.patientId = id;
    }

    public int compareTo(PatientRecord other) {
        return this.patientId - other.patientId;
    }
}

public class BinarySearchDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<PatientRecord> db = new ArrayList<>();

        System.out.println("--- Add Patients ---");

        while (true) {
            System.out.print("Enter Patient Name (or END to stop): ");
            String name = in.nextLine();

            if (name.equalsIgnoreCase("END")) {
                break;
            }

            System.out.print("Enter Age: ");
            int age = Integer.parseInt(in.nextLine());

            System.out.print("Enter Problem Facing: ");
            String problem = in.nextLine();

            System.out.print("Enter Patient ID: ");
            int id = Integer.parseInt(in.nextLine());

            db.add(new PatientRecord(name, age, problem, id));
        }

        Collections.sort(db);

        System.out.print("\nEnter Patient ID to search: ");
        int target = Integer.parseInt(in.nextLine());

        int l = 0;
        int r = db.size() - 1;
        boolean found = false;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (db.get(m).patientId == target) {
                PatientRecord p = db.get(m);
                System.out.println("\nPatient Found");
                System.out.println("Name: " + p.patientName);
                System.out.println("Age: " + p.age);
                System.out.println("Problem Facing: " + p.problem);
                found = true;
                break;
            }

            if (db.get(m).patientId < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        if (!found) {
            System.out.println("Patient Record Not Found.");
        }

        in.close();
    }
}