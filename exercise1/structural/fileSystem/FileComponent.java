package exercise1.structural.fileSystem;

class File implements FileComponents{
    private String fileName;
    public File(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("File: "+ fileName);
    }
}
