package in.co.madhur.composite;

public class MenuTestDrive {
    public static void main(String args[]) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus  = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // add menu items here

        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie", "Apple Pie with a flakey crust, topped with vannila icecream", true, 1.59));

        // add more omenu items here

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
