package se.iths.twentytwo.objects;

import java.awt.*;
import java.util.Objects;

public class CarDemo {

    public static void main(String[] args) {

        int i = 10;

        System.out.println(i);

        Car myCar = new Car(1700, new Color(200,0,0),185);

        //Copying an object with copy constructor
        Car newCar = new Car(myCar);

        //Without a copy constructor we have to do like this
        //Will not work if we have private fields without getters
        Car newBadWayCar = new Car(myCar.getWeight(),
                myCar.getColor(),
                myCar.getMaxSpeed());


        System.out.println(myCar.maxSpeed());



        if( Objects.nonNull(myCar.getColor()) )
            //if( myCar.color != null)
            System.out.println(myCar.getColor().getRed());

        float f = 23.456f;
        System.out.format("Priset är: %.2f",f);
        System.out.printf("Priset är: %.2f",f);
        //System.out.println(String.format("Priset är: %.2f",f));
        System.out.println("Priset är: " + ((int)(f * 100 + 0.5))/100.0);
    }
}
