package com.company.encapsulation.animal;

public class PublicAnimal {

    private String privateName;
    protected String protectedName;
    public String publicName;
    String defaultName;

    @Override
    public String toString() {
        String result = "";

        result += this.privateName;
        result += this.protectedName;
        result += this.publicName;
        result += this.defaultName;


        return  result;
    }

    //biz burda variableleri 4 cesit yazabiliyoruz klas icinde , public, protected, public, default


}
