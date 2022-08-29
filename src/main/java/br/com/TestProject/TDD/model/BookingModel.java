package br.com.TestProject.TDD.model;

import java.time.LocalDate;

public class BookingModel {

    private String Id;
    private String reserveName;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private int numberGuests;

    public BookingModel() {
    }

    public BookingModel(String id, String reserveName, LocalDate checkIn, LocalDate checkOut, int numberGuests) {
        Id = id;
        this.reserveName = reserveName;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numberGuests = numberGuests;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getReserveName() {
        return reserveName;
    }

    public void setReserveName(String reserveName) {
        this.reserveName = reserveName;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public int getNumberGuests() {
        return numberGuests;
    }

    public void setNumberGuests(int numberGuests) {
        this.numberGuests = numberGuests;
    }
}
