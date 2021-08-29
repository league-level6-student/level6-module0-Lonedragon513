package _08_mocking.models;

import _07_intro_to_mocking.models.Car;
import _07_intro_to_mocking.models.GasTank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import _06_payroll.Payroll;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class DeliveryDriverTest {
	
    DeliveryDriver dd;

    
    @Mock
    CellPhone cp;
    
    @Mock 
    Car c;
    
	String na = "aa";
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    	dd = new DeliveryDriver(na,c,cp);
    }

    @Test
    void itShouldWasteTime() {
        //given
		boolean e = true;
		// when
		when(cp.browseCatMemes()).thenReturn(true);
		boolean a = dd.wasteTime();
		// then
		assertEquals(e, a);
    }

    @Test
    void itShouldRefuel() {
        //given
    	boolean e  =  true;
    	int oct = 8;
        //when
    	when(c.fillTank(oct)).thenReturn(true);
    	boolean a = dd.refuel(oct);
        //then
		assertEquals(e, a);

    }

    @Test
    void itShouldContactCustomer() {
        //given
    	boolean e = true;

    	String w = "11111";

        //when
    	when (cp.call(w)).thenReturn(true);
		boolean a = dd.contactCustomer(w);
        //then
		assertEquals(e, a);

    }

}