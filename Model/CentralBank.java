package Model;

import java.util.Scanner;

public class CentralBank extends Info {
    int nCTV;

    public CentralBank() {

    }

    public CentralBank(String iD, String name, String dayOfEstablish, String address, int nSenior, int nJunior,
            double estimates, double actual, int nCTV) {
        super(iD, name, dayOfEstablish, address, nSenior, nJunior, estimates, actual);
        this.nCTV = nCTV;
    }

    public void calActual() {
        super.actual = super.estimates + this.nCTV * 1000;
    }

    public void setInfo(Scanner sc) {
        super.setInfo(sc);
        System.out.println("Number of CTV: ");
        this.nCTV = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "nCTV=" + nCTV;
    }

}
