package _06_payroll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PayrollTest {

    Payroll payroll = new Payroll();

    @Test
    void itShouldCalculatePaycheck() {
        //given
    	double a = 1.1;
    	int b = 4;
    	double expected = 4.4;
    	
        //when
    	double actual = Payroll.calculatePaycheck(a, b);
        //then
    	assertEquals(expected, actual);

    }

    @Test
    void itShouldCalculateMileageReimbursement() {
        //given
int a = 8;
double e = 4.6;
        //when

double actual = Payroll.calculateMileageReimbursement(a);

        //then
assertEquals(e, actual);

    }

    @Test
    void itShouldCreateOfferLetter() {
        //given
String a ="a";
double b = 1.1;
String e = "Hello a, We are pleased to offer you an hourly wage of 1.1";
        //when
String actual = Payroll.createOfferLetter(a,b);

        //then
assertEquals(e, actual);

    }

}