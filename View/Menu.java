package View;

import java.util.ArrayList;
import java.util.List;

import Model.*;
import Controller.*;

public class Menu {
    public static List<CentralBank> centralList = new ArrayList<CentralBank>();
    public static List<NorthBank> northList = new ArrayList<NorthBank>();

    public static void main(String[] args) {
        centralList.add(Controller.createCentralUsers());
        System.out.println(centralList.get(0).toString());
    }
}
