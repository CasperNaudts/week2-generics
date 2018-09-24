package be.pxl.generics.les.demo1;

public class Pint {
    private double alcoholPercentage;

    public Pint(){

    }

    public Pint(double alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(double alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    @Override
    public String toString() {
        return "" + alcoholPercentage;
    }
}
