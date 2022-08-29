package br.com.TestProject.TDD;


import br.com.TestProject.TDD.model.BookingModel;
import br.com.TestProject.TDD.repository.BookingRepository;
import br.com.TestProject.TDD.service.BookingService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Optional;


public class BookingServiceTest {

    @TestConfiguration
    static class BookingServiceTestConfiguration{

        @Bean
        public BookingService bookingService(){
            return new BookingService();
        }
    }
    @Autowired
    BookingService bookingService;

    @MockBean
    BookingRepository bookingRepository;

    @Test
    public void bookingTestServiceDaysCalculator(){
        String name = "Michele";
        int days = bookingService.daysCalculatorWithDatabase(name);

        Assertions.assertEquals(days, 15);
    }

    @Before("")
    public void setUp(){
        LocalDate checkIn = LocalDate.parse("2020-11-10");
        LocalDate checkOut = LocalDate.parse("2020-11-20");
        BookingModel bookingModel = new BookingModel("1", "Michele", checkIn, checkOut, 2);

        Mockito.when(bookingRepository.findByReservName(bookingModel.getReserveName()))
                .thenReturn(Optional.of(bookingModel));
    }

}
