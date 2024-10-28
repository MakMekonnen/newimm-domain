package edu.gmu.cs321;

public class Employee {
    private int eid;
    private String name;

    public Employee(int eid, String name) {
        this.eid = eid;
        this.name = name;
    }

    public int getEid() {
        return eid;
    }
    public String getName() {
        return name;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void submit() {}
}
