package com.example.test;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonTest2 {

    public static void main(String[] args) {

        String json2 = "{ 'Object' : { 'Child1' : 'Object 안에 Object'},"
                + "'Array1' : ["
                + "{'ArrayChild1' : 'Object 안에 Array 안에 Object1'},"
                + "{'ArrayChild2' : 'Object 안에 Array 안에 Object2'},"
                + "{'ArrayChild3' : 'Object 안에 Array 안에 Object3'},"
                + "],"
                + "'Array2' : ["
                + "'Object 안에 Array 1행', "
                + "'Object 안에 Array 2행', "
                + "'Object 안에 Array 3행'"
                + "]}";

        JSONObject json2Obj = new JSONObject(json2);
        JSONObject Object = (JSONObject) json2Obj.get("Object");
        JSONArray Array1 = (JSONArray) json2Obj.get("Array1");
        JSONArray Array2 = (JSONArray) json2Obj.get("Array2");

        System.out.println(Object);
        System.out.println(Array1);
        System.out.println(Array2);

        System.out.println("Object to String : " + json2Obj.get("Object").toString());
        System.out.println("Child1 : " + Object.get("Child1"));
        System.out.println("Array1 : " + Array1.get(0));
        System.out.println("Array2 : " + Array2.get(1));

        JSONObject Object2 = (JSONObject) Array1.get(1);
        System.out.println(Object2.get("ArrayChild2").toString());
        System.out.println(((JSONObject) Array1.get(1)).get("ArrayChild2").toString());


    }
}