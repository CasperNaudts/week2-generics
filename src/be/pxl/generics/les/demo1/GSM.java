package be.pxl.generics.les.demo1;

public class GSM {
    private String serialNo;

    public GSM() {
    }

    public GSM(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    @Override
    public String toString() {
        return serialNo;
    }
}
