package edu.gmu.cs321;

public class Form {
    private String form_id;
    private String aid;
    private String name;
    private String dob;
    private String status;

    public Form(String form_id, String aid, String name, String dob, String status) {
        this.form_id = form_id;
        this.aid = aid;
        this.name = name;
        this.dob = dob;
        this.status = status;
    }

    public String getForm_id() {
        return form_id;
    }

    public void setForm_id(String form_id) {
        this.form_id = form_id;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void submit_form() {}
    public void validate_form() {}
    public void show_form() {}
    public String get_status() {return "";}
}
