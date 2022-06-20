package com.example.test;

import org.json.JSONObject;

public class JsonTest {

    public static void main(String[] args) {
        String json = "{ 'A' : 'Hello Json!!',"
                + "'B' : '안녕하세요 제이슨',"
                + "'C' : 'Json Data',"
                + "'Boolean' : 'true',"
                + "'Number' : 2020"
                + "}";

        JSONObject jsonObj = new JSONObject(json);

        System.out.println("A : " + jsonObj.get("A"));
        System.out.println("B : " + jsonObj.get("B"));
        System.out.println("C : " + jsonObj.get("C"));
        System.out.println("Boolean : " + (jsonObj.getBoolean("Boolean") == false));
        System.out.println("Number : " + jsonObj.get("Number"));
    }
}
