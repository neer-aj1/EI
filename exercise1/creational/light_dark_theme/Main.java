package exercise1.creational.light_dark_theme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UIThemeFactory themeFactory;
        System.out.println("Select theme (1 for Light, 2 for Dark): ");
        int themeChoice = sc.nextInt();
        if(themeChoice == 1){
            themeFactory = new LightThemeFactory();
        }
        else if (themeChoice == 2) {
            themeFactory = new DarkThemeFactory();
        }
        else{
            System.out.println("Invalid Choice");
            themeFactory = new LightThemeFactory();
        }

        Button button = themeFactory.createButton();
        Menu menu = themeFactory.createMenu();

        System.out.println("Rendering UI......");
        button.render();
        menu.display();

        sc.close();
    }
}
