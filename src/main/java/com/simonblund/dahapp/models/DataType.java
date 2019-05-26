package com.simonblund.dahapp.models;

public class DataType {
    private int id;
    private String type;
    private String comment;
    private boolean extra_sensitive;
    private boolean sensitive;

    public DataType(int id, String type, String comment, boolean extra_sensitive, boolean sensitive) {
        this.id = id;
        this.type = type;
        this.comment = comment;
        this.extra_sensitive = extra_sensitive;
        this.sensitive = sensitive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isExtra_sensitive() {
        return extra_sensitive;
    }

    public void setExtra_sensitive(boolean extra_sensitive) {
        this.extra_sensitive = extra_sensitive;
    }

    public boolean isSensitive() {
        return sensitive;
    }

    public void setSensitive(boolean sensitive) {
        this.sensitive = sensitive;
    }
}

