package bookShelfProject;

import java.util.List;

public class Menu {
    private String name;
    private List<String> menuItems;
    public Menu(String name, List<String> menuItems) {
        this.name = name;
        this.menuItems = menuItems;
    }public void addMenuItem(String menu) {}
    public void displayMenu() {
        for (int i = 0; i < this.menuItems.size(); i++) {
            System.out.println((i + 1) + "-) " + this.menuItems.get(i));
        }
        System.out.println("0-) Quit");
    }
}