package edu.gmu.cs321;

public class Workflow {
    private String workflow_id;
    private Form[] form_list;
    private String state;
    private String current_status;
    private String data_entry_id;
    private String reviewer_id;
    private String approver_id;

    public Workflow(String workflow_id, Form[] form_list, String state, String current_status) {
        this.workflow_id = workflow_id;
        this.form_list = form_list;
        this.state = state;
        this.current_status = current_status;
    }

    public Form search_form(String form_id) {
        return null;
    }

    public void change_state(String state) {
        this.state = state;
    }

    public String getWorkflow_id() {
        return workflow_id;
    }

    public void setWorkflow_id(String workflow_id) {
        this.workflow_id = workflow_id;
    }

    public Form[] getForm_list() {
        return form_list;
    }

    public void setForm_list(Form[] form_list) {
        this.form_list = form_list;
    }

    public String getState() {
        return state;
    }

    public String getCurrent_status() {
        return current_status;
    }

    public void setCurrent_status(String current_status) {
        this.current_status = current_status;
    }

    public String getData_entry_id() {
        return data_entry_id;
    }

    public void setData_entry_id(String data_entry_id) {
        this.data_entry_id = data_entry_id;
    }

    public String getReviewer_id() {
        return reviewer_id;
    }

    public void setReviewer_id(String reviewer_id) {
        this.reviewer_id = reviewer_id;
    }

    public String getApprover_id() {
        return approver_id;
    }

    public void setApprover_id(String approver_id) {
        this.approver_id = approver_id;
    }
}
