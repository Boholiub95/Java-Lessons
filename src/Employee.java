import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Employee {
    private  String name;
    private String jobTitle;

    public  void setName(String nameIn){
        name = nameIn;
    }
    public String getName() {
        return  name;
    }
    public  void  setJobTitle(String jobTitleIn) {
        jobTitle = jobTitleIn;
    }
    public String getJobTitle() {
        return  jobTitle;
    }
    public void cutCheck (double amountPaid) {
        System.out.printf("Pay for this employee %s",name);
        System.out.printf("(%s) ***$", jobTitle);
        System.out.printf("%,.2f\n", amountPaid);
    }
}

class  DoPayroll {
    public static void main(String[] args) { throw IOException {
        Scanner diskScanner = new Scanner(new File("EmployeeInfo.txr"));
        for ( int empNum = 1; empNum <= 3; empNum++) {
            payOneEmployee(diskScanner);}

    }
    }
        static void payOneEmployee(Scanner aScanner) {
        Employee anEmployee = new Employee();
        anEmployee.setName(aScanner.nextLine());
        anEmployee.setJobTitle(aScanner.nextLine());
        anEmployee.cutCheck(aScanner.nextDouble());
        aScanner.nextLine();

        }
    }


