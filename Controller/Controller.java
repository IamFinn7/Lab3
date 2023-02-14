package Controller;

import java.util.Scanner;

import Model.*;

public class Controller {
    public static Scanner sc = new Scanner(System.in);

    public static CentralBank createCentralUsers() {
        CentralBank user = new CentralBank();
        user.setInfo(sc);
        return user;
    }

    public NorthBank createNorthUsers() {
        NorthBank user = new NorthBank();
        user.setInfo(sc);
        return user;
    }
}
