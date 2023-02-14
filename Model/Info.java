package Model;

import java.util.Scanner;

public class Info {
    String ID, name, dayOfEstablish, address;
    int nSenior, nJunior;
    double estimates, actual;

    public Info() {
    }

    public Info(String ID, String name, String dayOfEstablish, String address, int nSenior, int nJunior,
            double estimates, double actual) {
        this.ID = ID;
        this.name = name;
        this.dayOfEstablish = dayOfEstablish;
        this.address = address;
        this.nSenior = nSenior;
        this.nJunior = nJunior;
        this.estimates = estimates;
        this.actual = actual;
    }

    public void calEstimates(int coefSalary) {
        this.estimates = this.nSenior * 5000 * coefSalary + this.nJunior * 2000 * coefSalary;
    }

    public void setInfo(Scanner sc) {
        System.out.println("ID: ");
        this.ID = sc.nextLine();

        System.out.println("Name: ");
        this.name = sc.nextLine();

        System.out.println("Day Of Establish: ");
        this.dayOfEstablish = sc.nextLine();

        System.out.println("Address: ");
        this.address = sc.nextLine();

        System.out.println("Number of Junior: ");
        this.nJunior = sc.nextInt();
        sc.nextLine();

        System.out.println("Number of Sunior: ");
        this.nSenior = sc.nextInt();
        sc.nextLine();

        System.out.println("Cost Estimates: ");
        this.estimates = sc.nextDouble();
        sc.nextLine();

        System.out.println("Cost Actual: ");
        this.actual = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return "ID=" + ID + ", name=" + name + ", dayOfEstablish=" + dayOfEstablish + ", address=" + address
                + ", nSenior=" + nSenior + ", nJunior=" + nJunior + ", estimates=" + estimates + ", actual=" + actual;
    }
}
