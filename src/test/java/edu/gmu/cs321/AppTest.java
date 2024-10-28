package edu.gmu.cs321;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    Employee data_entry = new DataEntry(1, "bob");
    Employee reviewer = new Reviewer(2, "steve");
    Employee approver = new Approver(3, "cuk");


    @Test
    public void check_id() {
        assertEquals(1, data_entry.getEid());
        assertEquals(2, reviewer.getEid());
        assertEquals(3, approver.getEid());
    }


}
