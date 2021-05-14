package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        BaseDisc georgeMichael = new CD("Faith!", "George Michael", "Pop", 500, "mp3", "cd");

        BaseDisc spaceJam = new DVD("Space Jam", "Joe Pytka", 500, "video", "dvd");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        georgeMichael.spinDisc();
        spaceJam.spinDisc();
        System.out.println(georgeMichael.readData());
        System.out.println(spaceJam.readData());
    }
}
