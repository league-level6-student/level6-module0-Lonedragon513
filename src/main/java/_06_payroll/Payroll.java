package _06_payroll;

/*
Complete the units tests in src/test/java/_06_payroll/PayrollTest.java to ensure that the methods are working properly.
 */
public class Payroll {

    public static double calculatePaycheck(double hourlyWage, int numHours){
        return hourlyWage * numHours;
    }

    public static double calculateMileageReimbursement(int milesTraveled){
        double centsPerMile = .575;
        return milesTraveled * centsPerMile;
    }

    public static String createOfferLetter(String employeeName, double hourlyWage){
        return "Hello " + employeeName + ", We are pleased to offer you an hourly wage of " + hourlyWage;
    }

}
