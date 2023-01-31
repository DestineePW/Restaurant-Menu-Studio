package Restaruant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    static ArrayList<MenuItem> moonshineMenuItems = new ArrayList();

    private Date lastUpdated;

    //Getter
    public ArrayList<MenuItem> getMoonshineMenuItems() {
        return moonshineMenuItems;
    }

    @Override
    public String toString() {
        System.out.println("MOONSHINE GRILL MENU\n" +
        "\nAPPETIZERS\n");

        for (MenuItem item : moonshineMenuItems) {
            if (item.getCategory().equals("appetizer")){
                System.out.println(item);
            }
        }
        return "String";
    }

    void addItem(MenuItem item) {
        moonshineMenuItems.add(item);
        lastUpdated = new Date();
    }

    void removeItems(MenuItem item) {
        moonshineMenuItems.remove(item);
        lastUpdated = new Date();
    }
}
