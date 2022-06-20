//package com.games.gobigorgohome2;
//
//
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//
//import java.io.*;
//
//public class TestJsonResources {
////    public static void main(String[] args) {
////        printTestDataJSON();
////}
//    public static void printTestDataJSON() {
//        //Gson gson = new Gson();
//        String s = "Json/gym_rooms.json";
//        InputStream inputTestJSON = getFileFromResourceAsStream(s);
//        JSONParser jsonParser = new JSONParser();
//        JSONObject jsonObject = null;
//        try {
//            Reader jsonReader = new InputStreamReader(inputTestJSON, "UTF-8");
//            jsonObject = (JSONObject) jsonParser.parse(jsonReader);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//    }
//
//
////        try (Reader reader = new Reader(new InputStreamReader(inputTestJSON, "UTF-8"))){
////            System.out.println(reader);
////            //Map<String, Map<String, Object>> map = gson.fromJson(reader, Map.class);
////            System.out.println(map.keySet().size());
////            System.out.println(map.keySet().toArray()[0]);
////            System.out.println(map.keySet().toArray());
////        } catch (IOException ioe){
////            System.out.println("unable to read file " + s);
////        }
////    }
//
//    public static InputStream getFileFromResourceAsStream(String fileName) {
//        ClassLoader classLoader = TestJsonResources.class.getClassLoader();
//        InputStream inputStream = classLoader.getResourceAsStream(fileName);
//        if (inputStream == null) {
//            throw new IllegalArgumentException("file not found! " + fileName);
//        } else {
//            return inputStream;
//        }
//    }
//}