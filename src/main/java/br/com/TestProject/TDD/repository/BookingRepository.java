package br.com.TestProject.TDD.repository;

import br.com.TestProject.TDD.model.BookingModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<BookingModel, String> {

    Optional<BookingModel> findByReservName(String name);
}
