package exercise1.structural.fileSystem;

import java.util.ArrayList;
import java.util.List;

class Directory implements FileComponents{
    private String name;
    private List<FileComponents> contents = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileComponents component) {
        contents.add(component);
    }

    public void remove(FileComponents component) {
        contents.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Directory: " + name);
        for (FileComponents component : contents) {
            component.display();
        }
    }
}
