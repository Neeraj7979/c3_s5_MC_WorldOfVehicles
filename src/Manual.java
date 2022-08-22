public class Manual extends Transmission {
    private double fifthGearRatio;
    private double sixthGearRatio;

    public Manual(String modelNo, int noOfForwardGear, double firstGearRatio, double secondGearRatio, double thirdGearRatio,
                  double fourthGearRatio, double fifthGearRatio, double sixthGearRatio) {
        super(modelNo, noOfForwardGear, firstGearRatio, secondGearRatio, thirdGearRatio, fourthGearRatio);
        this.fifthGearRatio = fifthGearRatio;
        this.sixthGearRatio = sixthGearRatio;
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
    @Override
    public String showSpecs(){
       return "Transmission Type:\t Manual\n"+
               "Transmission Model Number\t"+getModelNo()+"\t\n"+
               "Key Specifications:\n"+
               "1. Forward Gear\t\t"+getNoOfForwardGear()+"\n"+
               "2. 1st Gear Ratio\t"+getFirstGearRatio()+"\n"+
               "3. 2nd Gear Ratio\t"+getSecondGearRatio()+"\n"+
               "4. 3rd Gear Ratio\t"+getThirdGearRatio()+"\n"+
               "5. 4th Gear Ratio\t"+getFourthGearRatio()+"\n"+
               "6. 5th Gear Ratio\t"+getFifthGearRatio()+"\n"+
               "6. 6th Gear Ratio\t"+getSixthGearRatio()+"\n"+
               "-----------------------------------------------";

    }


}
