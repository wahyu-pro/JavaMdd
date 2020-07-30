package com.challengemdd;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class NumberFour {
    public static void main (String args []){
        JSONParser jsonP = new JSONParser();
        try(FileReader reader = new FileReader("src/com/challengemdd/file.json")) {
            Object obj = jsonP.parse(reader);
            JSONArray emplist = (JSONArray) obj;
//            System.out.println(emplist.get(0));
//            emplist.stream().filter()
//            emplist.forEach(emp -> parseObj((JSONObject) emp));
//            emplist.stream().filter(emp -> emp == emplist.get(0)).forEach(parseObj(emplist););
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void parseObj(JSONObject emp){
        String price = (String) emp.get("price");
        String name = (String) emp.get("name");
        String id = (String) emp.get("id");
        System.out.println("Name " + name);
        System.out.println("Price " + price);
        System.out.println("id " + id);
    }
}
