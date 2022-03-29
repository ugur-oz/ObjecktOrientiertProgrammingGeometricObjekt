package com.company.encapsulation.animal.fish;

import com.company.encapsulation.animal.PublicAnimal;

public class PublicShark extends PublicAnimal {

    public PublicShark(){

        super();

    }

    @Override
    public String toString() {
        String result = "";

        result += this.publicName + "\r\n";
        result += this.protectedName + "\r\n";

        // protected i kindklasseler görebilir !!
        // burda default name yi göremeyiz sadece animal packagesi icind egörülebilir

        this.publicMethod();
        this.protectedMethod();

        return result;
    }
}
