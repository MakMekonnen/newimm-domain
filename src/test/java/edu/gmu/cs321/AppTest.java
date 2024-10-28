package edu.gmu.cs321;

import static edu.gmu.cs321.State.*;
import static edu.gmu.cs321.Status.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    Employee data_entry = new DataEntry("1", "bob");
    Employee reviewer = new Reviewer("2", "steve");
    Employee approver = new Approver("3", "cuk");

    Form form1 = new Form("5", "11", "gob", "10/28/1999", LAWFUL);
    Form form2 = new Form("6", "24", "berry", "03/26/2002", ASYLUM);
    Form form3 = new Form("7", "15", "sarah", "05/14/2006", CITIZEN);

    Workflow wf = new Workflow("1", 5);

    @Test
    public void check_id() {
        assertEquals("1", data_entry.get_eid());
        assertEquals("2", reviewer.get_eid());
        assertEquals("3", approver.get_eid());
    }

    @Test
    public void check_name() {
        assertEquals("1", data_entry.get_name());
        assertEquals("2", reviewer.get_name());
        assertEquals("3", approver.get_name());
    }

//    @Test
//    public void check_state_enum() {
//        assertEquals(DATA_ENTRY_STATE, form1.get_state());
//        assertEquals(REVIEWER_STATE, form2.get_state());
//        assertEquals(APPROVER_STATE, form3.get_state());
//    }

    @Test
    public void check_status_enum() {
        assertEquals(LAWFUL, form1.get_status());
        assertEquals(ASYLUM, form2.get_status());
        assertEquals(CITIZEN, form3.get_status());
    }

    @Test
    public void check_add_form() {
        wf.add_form(form1);
        wf.add_form(form2);
        assertEquals(wf.get_form_list()[0].get_form_id(), form1.get_form_id());
        assertEquals(wf.get_form_list()[1].get_form_id(), form2.get_form_id());
    }

    @Test
    public void check_search_form() {
        wf.add_form(form1);
        wf.add_form(form2);
        assertEquals("5", wf.search_form("5").get_form_id());
        assertEquals("6", wf.search_form("6").get_form_id());
    }

    @Test
    public void change_state() {

    }

    @Test
    public void check_validation_data_entry() {

    }

    @Test
    public void check_validation_reviewer() {

    }

    @Test
    public void check_validation_approver() {

    }
}
