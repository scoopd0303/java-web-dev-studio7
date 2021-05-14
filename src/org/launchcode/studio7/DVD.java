package org.launchcode.studio7;

public class DVD extends BaseDisc {
    private String director;

    public DVD(String name, String director, int capacityUsed, String contents, String discType) {
        super(name, capacityUsed, contents, discType);
        this.director = director;
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public String readData() {
        return String.format("*****\nName: %s\nDirector: %s\nCapacity: %d MB\nContents: %s\nDisc Type: %s\n",
                this.getTitle(), this.director, this.getCapacityUsed(), this.getContents(), this.getDiscType());
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
