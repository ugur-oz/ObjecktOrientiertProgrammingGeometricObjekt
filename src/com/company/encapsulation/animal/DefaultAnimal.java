package com.company.encapsulation.animal;

public class DefaultAnimal {
    //sadece encpsulation animal dosyasinda olanlar bunu görebilir birds usw göremez, buna package local denir
    // für klassen gibt es public und package local(public i sileriz)


    @Override
    public String toString() {

        PublicAnimal publicAnimal = new PublicAnimal();
        String result = "";


        result += publicAnimal.publicName + "\r\n";
        result += publicAnimal.defaultName + "\r\n";
        /// !!!
        result += publicAnimal.protectedName + "\r\n";


        // burda normalde protected i görememek lazim cünkü kind klasse degil , protected i kindklasse den ve "ayni paket"
        // seviyesinde görebiliyoruz yani iki klas da defaultanimal ve publicAnimal ayni paketin altinda
        // ve ayni seviyede

        return result;
    }
    private void testMethod(){
        PublicAnimal publicAnimal = new PublicAnimal();

        publicAnimal.publicMethod();
        publicAnimal.defaultMethod();
        //!! alttaki kismi anlaman lazim
        publicAnimal.protectedMethod();
    }

}
