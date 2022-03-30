package com.company.abstraction;

public interface WithDiagonal {

    double getDiagonalLength();


    default int getDiagonalLenghtRoundet() {
        return (int) Math.round(getDiagonalLength());
    }

    // burda hersey public olur interface de, yani public yazmasan da kendisi public olur
    // sadece public olabilir, baska birsey olamaz,
    // public abstrac metodlar tanimlar
    // herhangi bir clas yalniz 1 class extend edebilir, ama birden interface i implement edebilir !!
    // abstract klassen kendine özel metodlari olabilir private tanimlayailirsin
    // interface de ne yaparsan herkese aciktir ama abstract klasse de saklayabilirsin
    // hem interface hem abstract klasse alttaki klasi o metoda sahip olmaya zorlar
    // abstract klasse de kendi variablen olabilir ama interface de olmaz
}
