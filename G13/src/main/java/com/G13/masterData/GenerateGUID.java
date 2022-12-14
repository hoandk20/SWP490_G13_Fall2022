package com.G13.masterData;

import java.util.Random;
import java.util.UUID;

public class GenerateGUID {
    public String GetGUID(){
        UUID uuid = UUID.randomUUID();

        return uuid.toString();
    }
    public  String getRandomNumberString() {
        // It will generate 6 digit random Number.
        // from 0 to 999999
        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        // this will convert any number sequence into 6 character.
        return String.format("%06d", number);
    }
}
