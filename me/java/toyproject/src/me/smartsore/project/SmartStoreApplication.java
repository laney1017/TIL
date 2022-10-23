package me.smartsore.project;

import me.smartsore.project.menu.Menu;

public class SmartStoreApplication {
    public void run() {
        Menu mainMenu = new Menu();
        Menu.printMenu();
    }
}
