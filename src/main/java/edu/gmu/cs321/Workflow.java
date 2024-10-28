package edu.gmu.cs321;

import java.util.Objects;

public class Workflow {
    private String workflow_id;
    private Form[] form_list;
    private String eid;
    int tail = 0;

    public Workflow(String workflow_id, int form_length) {
        this.workflow_id = workflow_id;
        form_list = new Form[form_length];
    }

    public void add_form(Form form) {
        if (tail < form_list.length) {
            form_list[tail++] = form;
        }
    }

    public Form search_form(String form_id) {
        for (Form form : form_list) {
            if (form.get_form_id().equals(form_id)) {
                return form;
            }
        }
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


}
