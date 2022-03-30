package com.company.abstraction;

public abstract class Shape {
    // burada abstract yazdik ve bu klas abstract oldu ,
    // ayrica metodu da abstract yapman lazim ama metodun icine birsey yazilmaz !!
    // bu yaptigimiz kindklasseleri bu metodun implemente etmesine zorlar
    public abstract double getArea();

    // burda tanimlanan metotlar private haric protected, default ve public olabilir,
    // implementiondan önce bu metodu yine de burada kullanabiliriz ki asagida kullandik renkler icin
    // kast dan sparen ediyoruz ve ayni özelliklere klaslarin ortak özellikleri varsa
    protected abstract String getColor();

    // protected abstract String type; bu olmaz abstrackt olarak olmaz yani



    @Override
    public String toString() {

        return this.getClass().getName() + "=> Farbe: " + this.getColor();
    }

}
