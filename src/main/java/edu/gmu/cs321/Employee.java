package edu.gmu.cs321;

public class Employee {
    private String eid;
    private String name;

    public Employee(String eid, String name) {
        this.eid = eid;
        this.name = name;
    }

    public String get_eid() {
        return eid;
    }
    public String get_name() {
        return name;
    }
    public void set_eid(String eid) {
        this.eid = eid;
    }
    public void set_name(String name) {
        this.name = name;
    }

    public void submit() {}
}
