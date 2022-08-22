public class AutomaticDCT extends Transmission {
    private double fifthGearRatio;
    private double sixthGearRatio;
    private double seventhGearRatio;
    private double eightGearRatio;

    public AutomaticDCT(String modelNo, int noOfForwardGear, double firstGearRatio,
                        double secondGearRatio, double thirdGearRatio, double fourthGearRatio, double fifthGearRatio, double sixthGearRatio, double seventhGearRatio, double eightGearRatio) {
        super(modelNo, noOfForwardGear, firstGearRatio, secondGearRatio, thirdGearRatio, fourthGearRatio);
        this.fifthGearRatio = fifthGearRatio;
        this.sixthGearRatio = sixthGearRatio;
        this.seventhGearRatio = seventhGearRatio;
        this.eightGearRatio = eightGearRatio;
    }

    public double getFifthGearRatio() {
        return fifthGearRatio;
    }

    public void setFifthGearRatio(double fifthGearRatio) {
        this.fifthGearRatio = fifthGearRatio;
    }

    public double getSixthGearRatio() {
        return sixthGearRatio;
    }

    public void setSixthGearRatio(double sixthGearRatio) {
        this.sixthGearRatio = sixthGearRatio;
    }

    public double getSeventhGearRatio() {
        return seventhGearRatio;
    }

    public void setSeventhGearRatio(double seventhGearRatio) {
        this.seventhGearRatio = seventhGearRatio;
    }

    public double getEightGearRatio() {
        return eightGearRatio;
    }

    public void setEightGearRatio(double eightGearRatio) {
        this.eightGearRatio = eightGearRatio;
    }
    @Override
    public String showSpecs(){
        return "Transmission Type:\t Manual\n"+
                "Transmission Model Number\t"+getModelNo()+"\t"+
                "Key Specifications:\n"+
                "1. Forward Gear\t"+getNoOfForwardGear()+"\n"+
                "2. 1st Gear Ratio\t"+getFifthGearRatio()+"\n"+
                "3. 2nd Gear Ratio\t"+getSecondGearRatio()+"\n"+
                "4. 3rd Gear Ratio\t"+getThirdGearRatio()+"\n"+
                "5. 4th Gear Ratio\t"+getFourthGearRatio()+"\n"+
                "6. 5th Gear Ratio\t"+getFifthGearRatio()+"\n"+
                "7. 6th Gear Ratio\t"+getSixthGearRatio()+"\n"+
                "6. 7th Gear Ratio\t"+getSeventhGearRatio()+"\n"+
                "6. 8th Gear Ratio\t"+getEightGearRatio()+"\n";

    }
}
