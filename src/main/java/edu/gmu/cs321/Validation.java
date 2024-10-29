package edu.gmu.cs321;

public class Validation {
    private bool only_digits(String str){
        for (int i=0; i < str.length(); i++){
            c = str.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }
    public boolean validate_data_entry(Form form) {
        //Checking if any fields are null
        String name = form.get_name(), dob = form.getdob(); //used for further testing
        if(form.get_form_id() == null){
            return false;
        }
        if(form.get_aid() == null){
            return false;
        }
        if(name == null){
            return false;
        }
        if(dob == null){
            return false;
        }
        if(form.get_status() == null){
            return false;
        }
        if(form.get_state() == null){
            return false;
        }
        //Checking if the name field has any characters NOT in the alphabet
        for(int i=0; i < name.length(); i++){
            char c = name.charAt(i)
            if(c >='A' && c <= 'Z'){
                continue;
            }else if (c >= 'a' && c <= 'z'){
                continue;
            }else{
                return false;
            }
        }
        //Checking if DOB is in correct format
        if(dob.length() != 10){
            return false;
        }
        if(dob.replace("/","").length() != 8){
            return false;
        }
        String month, day, year;
        month = name.substring(0, 2);
        day = name.substring(3, 5);
        year = name.substring(7);
        if(!only_digits(month)){
            return false;
        }
        if(!only_digits(day)){
            return false;
        }
        if(!only_digits(year)){
            return false;
        }
        return true;
    }
    public boolean validate_reviewer(Form form) {
        return false;
    }
    public boolean validate_approver(Form form) {
        return false;
    }
}
