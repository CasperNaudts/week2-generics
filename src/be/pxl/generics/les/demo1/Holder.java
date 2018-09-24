package be.pxl.generics.les.demo1;

public class Holder {
    private Object canBeanything;

    public Holder() {
    }

    public Holder(Object canBeanything) {
        this.canBeanything = canBeanything;
    }

    public Object getCanBeanything() {
        return canBeanything;
    }

    public void setCanBeanything(Object canBeanything) {
        this.canBeanything = canBeanything;
    }
}
