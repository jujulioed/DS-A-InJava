package com.jujulioed;

public class Main {
    public static void main(String[] args) {
        // Create a guest class to add, remove and get all the guests

        MyGuests guestsList = new MyGuests(5);

        guestsList.addGuest("João");
        guestsList.addGuest("Leo");
        guestsList.removeGuest("João");

        System.out.println(guestsList.getAllGuests());
        System.out.println(guestsList.guestsListSize());
    }
}