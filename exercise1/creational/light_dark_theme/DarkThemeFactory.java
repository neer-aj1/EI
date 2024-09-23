package exercise1.creational.light_dark_theme;

public class DarkThemeFactory implements UIThemeFactory{
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Menu createMenu() {
        return new DarkMenu();
    }
}
