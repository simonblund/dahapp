package com.simonblund.dahapp.models;

public class DataAccessor {
    private int id;
    private String title;
    private Unit unit;
    private String comment;

    public DataAccessor(int id, String title, Unit unit, String comment) {
        this.id = id;
        this.title = title;
        this.unit = unit;
        this.comment = comment;
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

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
