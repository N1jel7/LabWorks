package by.bsu.labwork.assortment;

public class Computer {

    private String motherBoard;
    private String videocard;
    private String processor;
    private int ram;
    private int powerSupply;
    private int diskVolume;
    private boolean working;

    public Computer(String motherBoard, String videocard, String processor, int ram, int powerSupply, int diskVolume, boolean working) {
        this.motherBoard = motherBoard;
        this.videocard = videocard;
        this.processor = processor;
        this.ram = ram;
        this.powerSupply = powerSupply;
        this.diskVolume = diskVolume;
        this.working = working;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public String getVideocard() {
        return videocard;
    }

    public void setVideocard(String videocard) {
        this.videocard = videocard;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(int powerSupply) {
        this.powerSupply = powerSupply;
    }

    public int getDiskVolume() {
        return diskVolume;
    }

    public void setDiskVolume(int diskVolume) {
        this.diskVolume = diskVolume;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "motherBoard='" + motherBoard + '\'' +
                ", videocard='" + videocard + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", powerSupply=" + powerSupply +
                ", diskVolume=" + diskVolume +
                ", working=" + working +
                '}';
    }
}
