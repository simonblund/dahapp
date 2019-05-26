package com.simonblund.dahapp.models;

import java.io.File;

public class Document {

    private int id;
    private String title;
    private String description;
    private File file;
    private String path;

    public Document(int id, String title, String description, File file, String path) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.file = file;
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
