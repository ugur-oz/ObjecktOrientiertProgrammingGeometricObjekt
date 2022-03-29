package com.company.encapsulation.animal.fish;

import com.company.encapsulation.animal.PublicAnimal;

public class PublicShark extends PublicAnimal {

    @Override
    public String toString() {
        String result = "";

        result += this.publicName +"\r\n";
        result += this.protectedName +"\r\n";

        // protected i kindklasseler görebilir !!
        // burda default name yi göremeyiz sadece animal packagesi icind egörülebilir
        return result;
    }
}
