package edu.gmu.cs321;

public class Validation {
    private boolean only_letters(String str){
        for(int i=0; i < str.length(); i++){
            char c = str.charAt(i);
            if (c >='A' && c <= 'Z'){
                continue;
            } else if (c >= 'a' && c <= 'z'){
                continue;
            } else{
                return false;
            }
        }
        return true;
    }
    private boolean only_digits(String str){
        for (int i=0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }
    public boolean validate_form(Form form) {
        //Checking if any fields are null
        String name = form.get_name();
        String dob = form.get_dob(); //used for further testing

        if (form.get_form_id() == null){
            return false;
        }
        if (form.get_aid() == null){
            return false;
        }
        if (name == null){
            return false;
        }
        if (dob == null){
            return false;
        }
        if (form.get_status() == null){
            return false;
        }
        if (form.get_state() == null){
            return false;
        }
        if (!only_letters(name)){
            return false;
        }
        //Checking if DOB is in correct format
        if (dob.length() != 10){
            return false;
        }
        String no_dividers = dob.replace("/", "");
        if (no_dividers.length() != 8){
            return false;
        }
        if (!only_digits(no_dividers)) {
            return false;
        }

        if (!only_letters(no_dividers.substring(0, 2))) {
            return false;
        }
        if (!only_digits(no_dividers.substring(3, 5))) {
            return false;
        }
        if (!only_letters(name)) {
            return false;
        }

        //checking fields of a date
        int month = Integer.parseInt(no_dividers.substring(0, 2), 10);
        int day = Integer.parseInt(no_dividers.substring(2, 4), 10);

        if (month < 1 || month > 12){
            return false;
        }
        return day >= 1 && day <= 31;   //probably need to check the month in order to get the max days
    }
}
