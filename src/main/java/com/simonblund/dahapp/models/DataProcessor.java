package com.simonblund.dahapp.models;

import java.util.ArrayList;

public class DataProcessor {

    private int id;
    private String name;
    private String org_nr;
    private String street_address;
    private String city_address;
    private String postcode_address;
    private String country_address;
    private String email;
    private String telephone;
    private ArrayList<Document> documents;

    public DataProcessor(int id, String name, String org_nr, String street_address, String city_address, String postcode_address, String country_address, String email, String telephone, ArrayList<Document> documents) {
        this.id = id;
        this.name = name;
        this.org_nr = org_nr;
        this.street_address = street_address;
        this.city_address = city_address;
        this.postcode_address = postcode_address;
        this.country_address = country_address;
        this.email = email;
        this.telephone = telephone;
        this.documents = documents;
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

    public String getOrg_nr() {
        return org_nr;
    }

    public void setOrg_nr(String org_nr) {
        this.org_nr = org_nr;
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

    public String getCountry_address() {
        return country_address;
    }

    public void setCountry_address(String country_address) {
        this.country_address = country_address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Document> documents) {
        this.documents = documents;
    }
}
