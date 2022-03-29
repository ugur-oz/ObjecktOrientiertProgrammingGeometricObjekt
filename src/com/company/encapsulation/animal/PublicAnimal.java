package com.company.encapsulation.animal;

import java.util.UUID;

public class PublicAnimal {
    public String publicName;
    protected String protectedName;
    String defaultName;
    private String privateName;

    public PublicAnimal(){
    this("günther" + UUID.randomUUID());

        System.out.println("Hallo world");
    }
    //private construktor olmasinin sebebi ayni klasse de bos kontstruktor u degistirebilmek
    //construcktor public private protected ve default olablir ama mesela klaslar public ve default olabilir sadece

    private PublicAnimal(String name){
        this.privateName= name;
        this.protectedName= name;
        this.publicName= name;
        this.defaultName= name;
    }

    @Override
    public String toString() {
        String result = "";

        result += this.privateName;
        result += this.protectedName;
        result += this.publicName;
        result += this.defaultName;

        return result;
    }
    //biz burda variableleri 4 cesit yazabiliyoruz klas icinde , public, protected, public, default
    private void privateMethod(){
        System.out.println("private Method");
    }
    protected void protectedMethod(){
        System.out.println("protected Method");
    }
    public void publicMethod(){
        System.out.println("public Method");
    }
    void defaultMethod(){
        System.out.println("default Method");
    }

}
