import java.sql.SQLOutput;

public class Company {
    public static void main(String [] args){
        Applicant applicant1 = new Applicant();
        Applicant applicant2 = new Applicant ();
        System.out.println(Applicant.applicantCount);

        //Declaring Ceo to hire applicant
        //create an instance of Staff class
        Staff staff1= new Staff("Human resources",1105,30,10000);
        Staff staff2= new Staff("product management", 1234,15,5000);
        staff1.name="Tunde";
        System.out.println(staff1.markAttendance());
        //create an instance of Ceo class

        //create an instance of Accountant
        Accountant accountant= new Accountant();
        System.out.println(accountant.payStaff(staff1.daysPresent));
        applicant1.setName("sally");
        System.out.println(applicant1.getName());
        applicant1.setYears(2);
        applicant2.setYears(9);
       System.out.println(applicant1.getYears());
        Ceo ceo1= new Ceo();
        System.out.println(ceo1.fireStaff(staff1.daysPresent, staff1.salary));

        System.out.println(ceo1.hireStaff (applicant1.getYears()));
        System.out.println(ceo1.hireStaff(applicant2.getYears()));
        System.out.println(ceo1.increasePay(staff1.daysPresent,staff1.salary));
        System.out.println(ceo1.increasePay(staff2.daysPresent,staff2.salary));;

    }
}

