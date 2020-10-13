package morgueData;

public class Data { //this is a program that gets data for the deceases in a morgue 
           private String name;
           private int date;
           private String bloodType;
           private String gender;
           private boolean caseStatus;
           
           
           public Data() {
        	   name = "JohnDoe";
        	   bloodType = "Not Applicable";
        	   gender = "Not Applicable";
        	   caseStatus = false;
        	   date = 0;
           }
           
           public String setName(String x) {
        	  return name = x;
           }
           
           public int setDate(int y) {
        	   return date = y;
           }
           
           public String setBloodType(String z) {
        	   return bloodType = z;
           }
           
           public String setGender(String a) {
        	  return gender= a;
           }
           
           public boolean setStatus(boolean b) {
        	  return caseStatus = b;
           }
           
           public void sumUp() {
        	   System.out.println("Name is: "+ name+" Date of death:"+ date+ " BloodType: "+ bloodType+" Gender:" + gender+ " CurrentCase:"+caseStatus );
           }
           
}
