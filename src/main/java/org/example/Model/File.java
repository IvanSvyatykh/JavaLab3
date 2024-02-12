package org.example.Model;

import java.util.Date;

public class File implements FileElement {

    private String path;
    private String name;
    private Date date;
    private Double size;

    public File(String name, Date date, Double size, String path) {
        this.name = name;
        this.date = date;
        this.size = size;
        this.path = path;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public Double getSize() {
        return size;
    }

    @Override
    public String getPath() {
        return path;
    }
}
