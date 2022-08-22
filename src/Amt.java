public class Amt extends Transmission {
    private double fifthGearRatio;

    public Amt(String modelNo, int noOfForwardGear, double firstGearRatio, double secondGearRatio,
               double thirdGearRatio, double fourthGearRatio, double fifthGearRatio) {
        super(modelNo, noOfForwardGear, firstGearRatio, secondGearRatio, thirdGearRatio, fourthGearRatio);
        this.fifthGearRatio = fifthGearRatio;
    }

    public double getFifthGearRatio() {
        return fifthGearRatio;
    }

    public void setFifthGearRatio(double fifthGearRatio) {
        this.fifthGearRatio = fifthGearRatio;
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
                "7. 6th Gear Ratio\t"+getFifthGearRatio()+"\n";

    }
}

