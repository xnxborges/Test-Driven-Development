package br.com.TestProject.TDD.service;

import br.com.TestProject.TDD.model.BookingModel;
import br.com.TestProject.TDD.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    public int daysCalculatorWithDatabase(String name) {
        Optional<BookingModel> bookingModelOptional = bookingRepository.findByReservName(name);


        return Period.between(bookingModelOptional.get()
                .getCheckIn(), bookingModelOptional.get().getCheckOut()).getDays();
    }
}
