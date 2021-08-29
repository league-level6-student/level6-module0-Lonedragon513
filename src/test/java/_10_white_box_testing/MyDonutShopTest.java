package _10_white_box_testing;

import _09_intro_to_white_box_testing.models.DeliveryService;
import _09_intro_to_white_box_testing.models.Order;
import _10_white_box_testing.models.BakeryService;
import _10_white_box_testing.models.PaymentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import java.util.Collections;
import java.util.List;

class MyDonutShopTest {

    MyDonutShop DS;
    
    @Mock
    PaymentService ps;
    
    @Mock 
    DeliveryService ds;
    
    @Mock 
    BakeryService bs;
    
    @Mock
    Order o;
    
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        DS= new MyDonutShop(ps,ds,bs);
    }

    @Test
    void itShouldTakeDeliveryOrder() throws Exception {
        //given
        Order order = new Order("CUSTOMER_NAME",
                "CUSTOMER_PHONE_NUMBER",
                1,
                5.00,
                "CREDIT_CARD_NUMBER",
                true);
        //when(DS.addOrder(order)).thenReturn(true);
        when(bs.getDonutsRemaining()).thenReturn(5);
        when (ps.charge(order)).thenReturn(true);
        DS.openForTheDay();
        DS.takeOrder(order);

        //then
        verify(ds, times(1)).scheduleDelivery(order);
        
    }

    @Test
    void givenInsufficientDonutsRemaining_whenTakeOrder_thenThrowIllegalArgumentException() {
        //given

        //when

        //then
    }

    @Test
    void givenNotOpenForBusiness_whenTakeOrder_thenThrowIllegalStateException(){
        //given

        //when

        //then
    }

}