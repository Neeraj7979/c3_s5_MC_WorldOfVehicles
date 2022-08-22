public abstract class Transmission {
    private String ModelNo;
    private  int noOfForwardGear;
    private double firstGearRatio;
    private double secondGearRatio;
    private double thirdGearRatio;
    private double fourthGearRatio;
    private double fifthGearRation;

    public Transmission(String modelNo, int noOfForwardGear, double firstGearRatio, double
            secondGearRatio, double thirdGearRatio, double fourthGearRatio) {
        ModelNo = modelNo;
        this.noOfForwardGear = noOfForwardGear;
        this.firstGearRatio = firstGearRatio;
        this.secondGearRatio = secondGearRatio;
        this.thirdGearRatio = thirdGearRatio;
        this.fourthGearRatio = fourthGearRatio;
    }

    public String getModelNo() {
        return ModelNo;
    }

    public void setModelNo(String modelNo) {
        ModelNo = modelNo;
    }

    public int getNoOfForwardGear() {
        return noOfForwardGear;
    }

    public void setNoOfForwardGear(int noOfForwardGear) {
        this.noOfForwardGear = noOfForwardGear;
    }

    public double getFirstGearRatio() {
        return firstGearRatio;
    }

    public void setFirstGearRatio(double firstGearRatio) {
        this.firstGearRatio = firstGearRatio;
    }

    public double getSecondGearRatio() {
        return secondGearRatio;
    }

    public void setSecondGearRatio(double secondGearRatio) {
        this.secondGearRatio = secondGearRatio;
    }

    public double getThirdGearRatio() {
        return thirdGearRatio;
    }

    public void setThirdGearRatio(double thirdGearRatio) {
        this.thirdGearRatio = thirdGearRatio;
    }

    public double getFourthGearRatio() {
        return fourthGearRatio;
    }

    public void setFourthGearRatio(double fourthGearRatio) {
        this.fourthGearRatio = fourthGearRatio;
    }
    public abstract String showSpecs();
}
