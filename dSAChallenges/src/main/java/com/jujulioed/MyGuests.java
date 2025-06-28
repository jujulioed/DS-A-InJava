package com.jujulioed;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MyGuests {
    private int numberOfGuests;
    private ArrayList<String> myGuests = new ArrayList<String>(numberOfGuests);


    public MyGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public void addGuest(String guestName) {
        if (myGuests.size() != numberOfGuests) {
            myGuests.add(guestName);
            return;
        }

        System.out.println("Could not add more guests since you reached the size limit");
    }

    public void removeGuest(String guestName) {
        if (!myGuests.remove(guestName)) {
            System.out.println("Guest doesn't exist or you typed wrong");
        }
    }

    public ArrayList<String> getAllGuests() {
        ArrayList<String> sortedList = new ArrayList<>(myGuests);
        sortedList.sort(String::compareToIgnoreCase);
        return sortedList;
    }

    public int guestsListSize() {
        return numberOfGuests;
    }
}
