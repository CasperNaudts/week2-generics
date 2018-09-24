package be.pxl.generics.les.demo1;

import be.pxl.generics.les.demo2.GSM;
import be.pxl.generics.les.demo2.Holder;
import be.pxl.generics.les.demo2.Pint;

/**
 * Demo1 is van de middeleeuwen.
 */

public class Demo1 {
    public static void main(String[] args){
        Holder holder = new Holder();
        holder.setCanBeAnything(new GSM("ghfgkhjrjti34u85u59245j"));
        System.out.println(holder.getCanBeAnything());

        //Set something else
        holder.setCanBeAnything(new Pint(6.3));
        System.out.println(holder.getCanBeAnything());

        //Get GSM instance
        if (holder.getCanBeAnything() instanceof Pint) {
            Pint pint = (Pint) holder.getCanBeAnything();
            System.out.println(pint);
        } else if (holder.getCanBeAnything() instanceof GSM){
            GSM gsm = (GSM) holder.getCanBeAnything();
            System.out.println(gsm);
        }
    }
}
