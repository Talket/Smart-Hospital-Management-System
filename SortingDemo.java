import java.util.*;

class Doctor implements Comparable<Doctor> {
    String name;
    int experience;

    Doctor(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public int compareTo(Doctor d) {
        return d.experience - this.experience; // Higher experience first
    }
}

public class SortingDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of doctors: ");
        int n = sc.nextInt();
        sc.nextLine();

        Doctor[] doctors = new Doctor[n];

        for(int i = 0; i < n; i++) {

            System.out.print("Enter doctor name: ");
            String name = sc.nextLine();

            System.out.print("Enter experience level (1-10): ");
            int experience = sc.nextInt();
            sc.nextLine();

            doctors[i] = new Doctor(name, experience);
        }

        Arrays.sort(doctors);

        System.out.println("\nBest Doctor Available:");
        System.out.println("Name: " + doctors[0].name);
        System.out.println("Experience: " + doctors[0].experience);

        sc.close();
    }
}