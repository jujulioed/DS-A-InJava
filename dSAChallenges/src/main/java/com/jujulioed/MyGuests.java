package com.jujulioed;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyGuests {
    private int numberOfGuests;
    private ArrayList<String> myGuests = new ArrayList<String>(numberOfGuests);


    public MyGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public void AddGuest(String guestName) {
        if (myGuests.size() != numberOfGuests) {
            myGuests.add(guestName);
        } else {
            throw new RuntimeException();
        }
    }

    public void removeGuest(String guestName) {
        for (var guest : myGuests) {
            if (guest == guestName) {
                myGuests.remove(guestName);
                return;
            }
        }

        System.out.println("Guest doesn't exist or you typed wrong");
    }

    public ArrayList<String> getAllGuests() {
        return myGuests;
    }

    public int guestsListSize() {
        return numberOfGuests;
    }
}
