/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Library;
import view.Menu;

/**
 *
 * @author MSII
 */
public class Manager extends Menu<String> {

    private Library library;

    public Manager() {
        super("Main Menu", new String[]{"Find person info", "Copy text to new file", "Exit"});
        library = new Library();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                library.findPersonInfo();
                break;
            case 2:
                library.coppyNewFile();
                break;
            case 3:
                System.out.println("Exiting the program.");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }

    }
}
