package exercise1.structural.fileSystem;

public class Main {
    public static void main(String[] args) {
        FileComponents file1 = new File("file1.txt");
        FileComponents file2 = new File("file2.txt");

        Directory directory = new Directory("Documents");
        directory.add(file1);
        directory.add(file2);

        FileComponents file3 = new File("file3.txt");
        Directory nestedDirectory = new Directory("More Documents");
        nestedDirectory.add(file3);

        directory.add(nestedDirectory);

        directory.display();
    }
}
