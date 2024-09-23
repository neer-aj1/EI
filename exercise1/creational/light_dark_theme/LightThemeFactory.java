package exercise1.creational.light_dark_theme;

public class LightThemeFactory implements UIThemeFactory{
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Menu createMenu() {
        return new LightMenu();
    }
}
