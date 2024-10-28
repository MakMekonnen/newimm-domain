package edu.gmu.cs321;

import static edu.gmu.cs321.State.*;

public class Form {
    private String form_id;
    private String aid;
    private State state;
    private String name;
    private String dob;
    private Status status;

    public Form(String form_id, String aid, String name, String dob, Status status) {
        this.form_id = form_id;
        this.aid = aid;
        this.name = name;
        this.dob = dob;
        this.status = status;
        this.state = DATA_ENTRY_STATE;
    }

    public void submit_form() {}
    public void validate_form() {}
    public void show_form() {}

    public String get_form_id() {
        return form_id;
    }

    public void set_form_id(String form_id) {
        this.form_id = form_id;
    }

    public String get_aid() {
        return aid;
    }

    public void set_aid(String aid) {
        this.aid = aid;
    }

    public State get_state() {
        return state;
    }

    public void set_state(State aid) {
        this.state = state;
    }

    public String get_name() {
        return name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public String get_dob() {
        return dob;
    }

    public void set_dob(String dob) {
        this.dob = dob;
    }

    public Status get_status() {
        return status;
    }

    public void set_status(Status status) {
        this.status = status;
    }
}
