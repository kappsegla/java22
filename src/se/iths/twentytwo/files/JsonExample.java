package se.iths.twentytwo.files;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class JsonExample {

    public static void main(String[] args) {
        Gson gson = new Gson();
        List<Cake> cakeList = List.of(new Cake(1,"Morotskaka",20),new Cake(2,"Silviakaka",30));
        String json = gson.toJson(cakeList);

        System.out.println(json);
        //Save json string to textfile



        //Read json string from file
        List<Cake> jsonToObject = gson.fromJson(json, new TypeToken<ArrayList<Cake>>() { }.getType());

        jsonToObject.forEach(System.out::println);

    }
}
