package org.example.Model;

import java.util.Date;

public class Directory implements FileElement {

    private String path;
    private String name;
    private Date date;

    public Directory(String name, Date date, String path) {
        this.name = name;
        this.date = date;
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
        return 0d;
    }

    @Override
    public String getPath() {
        return path;
    }
}
