package edu.gmu.cs321;

public class Workflow {
    private String workflow_id;
    private Form[] form_list;
    private String current_status;
    private String data_entry_id;
    private String reviewer_id;
    private String approver_id;

    public Workflow(String workflow_id, Form[] form_list, String state, String current_status) {
        this.workflow_id = workflow_id;
        this.form_list = form_list;
        this.current_status = current_status;
    }

    public Form search_form(String form_id) {
        return null;
    }

    public String get_workflow_id() {
        return workflow_id;
    }

    public void set_workflow_id(String workflow_id) {
        this.workflow_id = workflow_id;
    }

    public Form[] get_form_list() {
        return form_list;
    }

    public void set_form_list(Form[] form_list) {
        this.form_list = form_list;
    }


    public String get_current_status() {
        return current_status;
    }

    public void set_current_status(String current_status) {
        this.current_status = current_status;
    }

    public String get_data_entry_id() {
        return data_entry_id;
    }

    public void set_data_entry_id(String data_entry_id) {
        this.data_entry_id = data_entry_id;
    }

    public String get_reviewer_id() {
        return reviewer_id;
    }

    public void set_reviewer_id(String reviewer_id) {
        this.reviewer_id = reviewer_id;
    }

    public String get_approver_id() {
        return approver_id;
    }

    public void set_approver_id(String approver_id) {
        this.approver_id = approver_id;
    }
}
