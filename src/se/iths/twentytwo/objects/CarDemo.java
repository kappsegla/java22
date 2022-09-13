package se.iths.twentytwo.objects;

import java.awt.*;
import java.util.Objects;

public class CarDemo {

    public static void main(String[] args) {

        int i = 10;

        System.out.println(i);

        Car myCar = new Car(1700, new Color(200,0,0),185);
//        myCar.weight = 1700;
//        myCar.maxSpeed = 185;
//        myCar.color = new Color(100,100,100);

        System.out.println(myCar.maxSpeed());



        if( Objects.nonNull(myCar.getColor()) )
            //if( myCar.color != null)
            System.out.println(myCar.getColor().getRed());


    }
}
