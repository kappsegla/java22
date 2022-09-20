package se.iths.twentytwo.animals;

import se.iths.twentytwo.solid.lsp.ShapeDemo;

import java.awt.*;

public class Cat extends Mammal implements Pet {

    @Override
    public void talk() {
        System.out.println("Meow, meow!");
    }

    @Override
    public boolean isCute() {
        return true;
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name= " + getName() +
                "}";
    }
    


//    @Override
//    public boolean equals(Object obj) {
//        if( this == obj)
//            return true;
//
//        if( obj instanceof Cat cat)
//            return this.getName().equals(cat.getName());
//
//        return false;
//    }
}
