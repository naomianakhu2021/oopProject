public class Person {
    String name;
    int age;
    String maritalStatus;
    //create a constructor
    public Person(){
//default constructor
    }
    public Person(String name,int age,String maritalStatus){
        this.name=name;
        this.age=age;
        this.maritalStatus=maritalStatus;
    }
}
class Ceo extends Person {
    //create hire method for ceo
    public String hireStaff(int yearsOfExperience) {
        if (yearsOfExperience > 3) {
            return "hired";

        } else {
            return " not hired";
        }
    }

    //create fire method
    public String fireStaff(int daysPresent,float salary) {
        if (daysPresent < 15) {
            return "You're Fired!";
        }
        else if (daysPresent >= 15 && daysPresent < 30) {
            return "more efforts!";
        }
            else {
                return "good job we love you";
            }
        }

    public String increasePay(int daysPresent, float salary){
        if(daysPresent >= 30)
        return ("Good job Your salary has been increased to $ "+ salary*2);
        else{
            return("sorry your request has been declined");
        }
    }
}


class Staff extends Person{
    //Declare fields for Staff
    String department;
    int staffId;
    int daysPresent;
    float salary;
    //create constructor
    public Staff(){
//default constructor
    }
    public  Staff(String department,int staffId,int daysPresent,float salary){
        this.department=department;
        this.daysPresent=daysPresent;
        this.staffId=staffId;
        this.salary=salary;
    }

// create an attendance method for staff
    public String markAttendance(){
        if(this.daysPresent>30){
            return "Employee present!";
        }
        else{
            return "Not present!";
        }
    }
}

// create Accountant classes
class Accountant extends Staff{
    //create pay staff method
    public String payStaff(int daysPresent){
        if(daysPresent>30){
            return "pay staff";
        }
        else{
            return "Don't pay staff";
        }
    }
}

//create an applicant class
 class Applicant{
    static int applicantCount;
    String name;
    int age;
    private int yearsOfExperience;

    public Applicant() {
        applicantCount++;
    }
    public void setName(String name){
        this.name= name;
    }
public  String getName(){
        return this.name;
}
    public void  setYears(int yearsOfExperience){
        this.yearsOfExperience= yearsOfExperience;
    }
    //getting years of experience
    public int getYears(){

        return this.yearsOfExperience;
    }


}