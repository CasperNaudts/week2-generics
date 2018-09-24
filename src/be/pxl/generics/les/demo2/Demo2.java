package be.pxl.generics.les.demo2;

/**
 *
 */

public class Demo2 {
    public static void main(String[] args) {
        Holder <GSM> holder = new Holder <>();
        GSM gsm = new GSM();
        gsm.setSerialNo("gdhskj2k354k3543645");
        holder.setCanBeAnything(gsm);
        System.out.println(gsm);

        GSM getGSM = holder.getCanBeAnything();
        System.out.println(getGSM);

        Holder<Pint> holderPint = new Holder<>();
        holderPint.setCanBeAnything(new Pint(6.4));
        System.out.println(holderPint.getCanBeAnything());
    }
}
