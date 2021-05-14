package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc {
    private String artist;
    private String genre;

    public CD(String title, String artist, String genre, int capacityUsed, String contents, String discType) {
        super(title, capacityUsed, contents, discType);
        this.artist = artist;
        this.genre = genre;
    }


    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public String readData() {
        return String.format("*****\nTitle: %s\nArtist: %s\nGenre: %s\nCapacity: %d MB\nContents: %s\nDisc Type: %s\n",
                this.getTitle(), this.artist, this.genre, this.getCapacityUsed(), this.getContents(), this.getDiscType());
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
