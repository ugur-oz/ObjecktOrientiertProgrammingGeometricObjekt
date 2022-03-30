package com.company.encapsulation.plants;

import java.util.UUID;

public class Tree {

    private  final String name;
    private final double height;

    public Tree(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public Tree(double height){
        this.height = height;
        this.name = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "Tree{" + "name='" + name + '\'' + ", height=" + height + '}';
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    //eger yazdigin bir kodda degisiklik yapilmasini istemiyorsan yani
    // mesela bir agacin adi ve boyu olsan dersen ilk setleri silersin sonra da final dersin
    // immutabe   , degistirilemez data yapisi
}
