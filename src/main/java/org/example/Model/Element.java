package org.example.Model;

public class Element implements FileElement {

    private String path;
    private String name;
    private String date;
    private String size;

    public Element(String name, Long date, Long size, String path) {
        this.name = name;
        this.date = date.toString();
        this.size = size.toString();
        this.path = path;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public String getPath() {
        return path + "\\" + name;
    }
}