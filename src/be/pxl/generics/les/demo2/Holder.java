package be.pxl.generics.les.demo2;

public class Holder <T> {

    private T canBeAnything;
    //private U secondVariable;

    public Holder() {
    }

    public Holder(T canBeAnything/*, U secondVariable*/) {
        this.canBeAnything = canBeAnything;
        //this.secondVariable = secondVariable;
    }

    public T getCanBeAnything() {
        return canBeAnything;
    }

    public void setCanBeAnything(T canBeAnything) {
        this.canBeAnything = canBeAnything;
    }

    /*public U getSecondVariable() {
        return secondVariable;
    }

    public void setSecondVariable(U secondVariable) {
        this.secondVariable = secondVariable;
    }*/
}
