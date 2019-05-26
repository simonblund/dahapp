package com.simonblund.dahapp.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class DataProcessingRecord {
    private int id;
    private String UUID;
    private String name;

    private String system;
    private String reason;
    private ArrayList<DataSubjectType> data_subject_types;
    private boolean data_subject_under_age;
    private String especially_confidential_data;
    private ArrayList<DataAccessor> data_accessors;
    private String time_rule_deletion;
    private String time_rule_archivation;
    private String legal_justification;
    private String data_gathering;
    private String security_precautions;
    private String physical_location;
    private String virtual_location;
    private String comments_internal;
    private String safety_information_public;
    private String safety_information_internal;
    private LocalDate created_date;
    private User created_user;
    private LocalDate confirmed_date;
    private User confirmed_user;
    private ArrayList<Document> documents;

    private String hashCode;

    public DataProcessingRecord(int id, String UUID, String name, String system, String reason, ArrayList<DataSubjectType> data_subject_types, boolean data_subject_under_age, String especially_confidential_data, ArrayList<DataAccessor> data_accessors, String time_rule_deletion, String time_rule_archivation, String legal_justification, String data_gathering, String security_precautions, String physical_location, String virtual_location, String comments_internal, String safety_information_public, String safety_information_internal, LocalDate created_date, User created_user, LocalDate confirmed_date, User confirmed_user, ArrayList<Document> documents, String hashCode) {
        this.id = id;
        this.UUID = UUID;
        this.name = name;
        this.system = system;
        this.reason = reason;
        this.data_subject_types = data_subject_types;
        this.data_subject_under_age = data_subject_under_age;
        this.especially_confidential_data = especially_confidential_data;
        this.data_accessors = data_accessors;
        this.time_rule_deletion = time_rule_deletion;
        this.time_rule_archivation = time_rule_archivation;
        this.legal_justification = legal_justification;
        this.data_gathering = data_gathering;
        this.security_precautions = security_precautions;
        this.physical_location = physical_location;
        this.virtual_location = virtual_location;
        this.comments_internal = comments_internal;
        this.safety_information_public = safety_information_public;
        this.safety_information_internal = safety_information_internal;
        this.created_date = created_date;
        this.created_user = created_user;
        this.confirmed_date = confirmed_date;
        this.confirmed_user = confirmed_user;
        this.documents = documents;
        this.hashCode = hashCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ArrayList<DataSubjectType> getData_subject_types() {
        return data_subject_types;
    }

    public void setData_subject_types(ArrayList<DataSubjectType> data_subject_types) {
        this.data_subject_types = data_subject_types;
    }

    public boolean isData_subject_under_age() {
        return data_subject_under_age;
    }

    public void setData_subject_under_age(boolean data_subject_under_age) {
        this.data_subject_under_age = data_subject_under_age;
    }

    public String getEspecially_confidential_data() {
        return especially_confidential_data;
    }

    public void setEspecially_confidential_data(String especially_confidential_data) {
        this.especially_confidential_data = especially_confidential_data;
    }

    public ArrayList<DataAccessor> getData_accessors() {
        return data_accessors;
    }

    public void setData_accessors(ArrayList<DataAccessor> data_accessors) {
        this.data_accessors = data_accessors;
    }

    public String getTime_rule_deletion() {
        return time_rule_deletion;
    }

    public void setTime_rule_deletion(String time_rule_deletion) {
        this.time_rule_deletion = time_rule_deletion;
    }

    public String getTime_rule_archivation() {
        return time_rule_archivation;
    }

    public void setTime_rule_archivation(String time_rule_archivation) {
        this.time_rule_archivation = time_rule_archivation;
    }

    public String getLegal_justification() {
        return legal_justification;
    }

    public void setLegal_justification(String legal_justification) {
        this.legal_justification = legal_justification;
    }

    public String getData_gathering() {
        return data_gathering;
    }

    public void setData_gathering(String data_gathering) {
        this.data_gathering = data_gathering;
    }

    public String getSecurity_precautions() {
        return security_precautions;
    }

    public void setSecurity_precautions(String security_precautions) {
        this.security_precautions = security_precautions;
    }

    public String getPhysical_location() {
        return physical_location;
    }

    public void setPhysical_location(String physical_location) {
        this.physical_location = physical_location;
    }

    public String getVirtual_location() {
        return virtual_location;
    }

    public void setVirtual_location(String virtual_location) {
        this.virtual_location = virtual_location;
    }

    public String getComments_internal() {
        return comments_internal;
    }

    public void setComments_internal(String comments_internal) {
        this.comments_internal = comments_internal;
    }

    public String getSafety_information_public() {
        return safety_information_public;
    }

    public void setSafety_information_public(String safety_information_public) {
        this.safety_information_public = safety_information_public;
    }

    public String getSafety_information_internal() {
        return safety_information_internal;
    }

    public void setSafety_information_internal(String safety_information_internal) {
        this.safety_information_internal = safety_information_internal;
    }

    public LocalDate getCreated_date() {
        return created_date;
    }

    public void setCreated_date(LocalDate created_date) {
        this.created_date = created_date;
    }

    public User getCreated_user() {
        return created_user;
    }

    public void setCreated_user(User created_user) {
        this.created_user = created_user;
    }

    public LocalDate getConfirmed_date() {
        return confirmed_date;
    }

    public void setConfirmed_date(LocalDate confirmed_date) {
        this.confirmed_date = confirmed_date;
    }

    public User getConfirmed_user() {
        return confirmed_user;
    }

    public void setConfirmed_user(User confirmed_user) {
        this.confirmed_user = confirmed_user;
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Document> documents) {
        this.documents = documents;
    }

    public String getHashCode() {
        return hashCode;
    }

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }
}
