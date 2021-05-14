package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc {
    private String title;
    private int capacityUsed;
    private String contents;
    private String discType;

    public BaseDisc(String title, int capacityUsed, String contents, String discType){
        this.title = title;
        this.capacityUsed = capacityUsed;
        this.contents = contents;
        this.discType = discType;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getCapacityUsed() { return capacityUsed; }
    public void setCapacityUsed(int capacityUsed) { this.capacityUsed = capacityUsed; }

    public String getContents() { return contents; }
    public void setContents(String contents) { this.contents = contents; }

    public String getDiscType() { return discType; }
    public void setDiscType(String discType) { this.discType = discType; }

}
