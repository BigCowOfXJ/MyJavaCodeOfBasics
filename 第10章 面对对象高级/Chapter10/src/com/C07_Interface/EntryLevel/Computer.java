package com.C07_Interface.EntryLevel;

public class Computer {

    public void work(USB innerEquipment){

        innerEquipment.start();
        innerEquipment.end();
    }

    public void work(USB[] inEqus){


        for (int i = 0; i < inEqus.length; i++) {
            inEqus[i].start();
            inEqus[i].end();

            if(inEqus[i] instanceof Phone){
                Phone p = (Phone)(inEqus[i]);
                ((Phone)inEqus[i]).call();
            }
        }
    }
}
