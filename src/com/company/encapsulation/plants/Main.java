package com.company.encapsulation.plants;

public class Main {
    public static void main(String[] args) {

        Tree cherry = new Tree("Cherry", 6.3);

        // cherry.setHeight(6.3);
        // cherry.setName("Cherry");

        //  cherry.setName(null);
        // cherry.setHeight(-1);

        System.out.println(cherry);

        // eger bir konstructor varsa defalt gider ama hic yoksa temelde bos bir construckor olur
    }
}
