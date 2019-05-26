package com.simonblund.dahapp.models;

public class Unit {
    private int id;
    private String name;
    private String street_address;
    private String city_address;
    private String postcode_address;
    private String email;
    private String phone_number;
    private User DPO;
    private User unitLeader;

    public Unit(int id, String name, String street_address, String city_address, String postcode_address, String email, String phone_number, User DPO, User unitLeader) {
        this.id = id;
        this.name = name;
        this.street_address = street_address;
        this.city_address = city_address;
        this.postcode_address = postcode_address;
        this.email = email;
        this.phone_number = phone_number;
        this.DPO = DPO;
        this.unitLeader = unitLeader;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public String getCity_address() {
        return city_address;
    }

    public void setCity_address(String city_address) {
        this.city_address = city_address;
    }

    public String getPostcode_address() {
        return postcode_address;
    }

    public void setPostcode_address(String postcode_address) {
        this.postcode_address = postcode_address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public User getDPO() {
        return DPO;
    }

    public void setDPO(User DPO) {
        this.DPO = DPO;
    }

    public User getUnitLeader() {
        return unitLeader;
    }

    public void setUnitLeader(User unitLeader) {
        this.unitLeader = unitLeader;
    }
}
