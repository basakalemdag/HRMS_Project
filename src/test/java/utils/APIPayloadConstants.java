package utils;

import org.json.JSONObject;

public class APIPayloadConstants {
    public static String createEmployeePayload(){
        String createEmployeePayload =
                "{\n" +
                        "  \"emp_firstname\": \"M.Talha\",\n" +
                        "  \"emp_lastname\": \"Bhatti\",\n" +
                        "  \"emp_middle_name\": \"Riaz\",\n" +
                        "  \"emp_gender\": \"M\",\n" +
                        "  \"emp_birthday\": \"1996-04-21\",\n" +
                        "  \"emp_status\": \"Contract\",\n" +
                        "  \"emp_job_title\": \"QA Engineer\"\n" +
                        "}";
        return createEmployeePayload;
    }

    public static String createEmployeeJsonBody(){
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", "M.Talha");
        obj.put("emp_lastname", "Bhatti");
        obj.put("emp_middle_name", "Riaz");
        obj.put("emp_gender", "M");
        obj.put("emp_birthday", "1996-04-21");
        obj.put("emp_status", "Contract");
        obj.put("emp_job_title","QA Engineer");
        return obj.toString();
    }

    public static String adminPayload(){
        String adminPayload =
                "{\n" +
                        "  \"email\": \"mtrb@test.com\",\n" +
                        "  \"password\": \"Test@123\"\n" +
                        "}";
        return adminPayload;
    }

    public static String createEmployeePayloadDynamic(String firstname, String lastname, String middlename, String gender,
                                                      String dob, String empStatus, String jobTitle){
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", firstname);
        obj.put("emp_lastname", lastname);
        obj.put("emp_middle_name", middlename);
        obj.put("emp_gender", gender);
        obj.put("emp_birthday", dob);
        obj.put("emp_status", empStatus);
        obj.put("emp_job_title",jobTitle);
        return obj.toString();
    }

    public static String updateEmployeePayloadDynamic(String employee_id, String firstname, String lastname, String middlename, String gender,
                                                      String dob, String empStatus, String jobTitle){
        JSONObject obj = new JSONObject();
        obj.put("employee_id", employee_id);
        obj.put("emp_firstname", firstname);
        obj.put("emp_lastname", lastname);
        obj.put("emp_middle_name", middlename);
        obj.put("emp_gender", gender);
        obj.put("emp_birthday", dob);
        obj.put("emp_status", empStatus);
        obj.put("emp_job_title",jobTitle);
        return obj.toString();
    }

    public static String partialUpdateEmployeePayloadDynamic(String employee_id, String firstname, String lastname, String middlename, String gender,
                                                      String dob){
        JSONObject obj = new JSONObject();
        obj.put("employee_id", employee_id);
        obj.put("emp_firstname", firstname);
        obj.put("emp_lastname", lastname);
        obj.put("emp_middle_name", middlename);
        obj.put("emp_gender", gender);
        obj.put("emp_birthday", dob);

        return obj.toString();
    }

}
