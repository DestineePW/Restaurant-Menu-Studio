package Restaruant;

public class Restaurant {

    public static void main(String[] args) {

        MenuItem Item1 = new MenuItem("Chicken Fried Steak","green chile gravy & yukon mashers",20,"Main Course");
        MenuItem Item2 = new MenuItem("Green Chile Macaroni","roasted chicken & bacon gratin",18,"Main Course");
        MenuItem Item3 = new MenuItem("Cathead Biscuits","honey butter & house preserves",10,"Appetizer");
        MenuItem Item4 = new MenuItem("Elote Queso","queso fresco & tortilla chips",12,"Appetizer");
        MenuItem Item5 = new MenuItem("Peanut Butter Mousse Pie","oreo cookie crust",10,"Dessert");
        MenuItem Item6 = new MenuItem("Bread Pudding","vanilla bean ice cream & whiskey caramel",11,"Dessert");

        Menu moonshineMenu = new Menu();

        moonshineMenu.addItem(Item1);
        moonshineMenu.addItem(Item2);
        moonshineMenu.addItem(Item3);
        moonshineMenu.addItem(Item4);
        moonshineMenu.addItem(Item5);
        moonshineMenu.addItem(Item6);


        System.out.println(moonshineMenu.getMoonshineMenuItems());



    }



}
