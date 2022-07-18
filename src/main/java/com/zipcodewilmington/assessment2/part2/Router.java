package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Router {

    Map<String, String> routerMap = new LinkedHashMap<>();

    public void add(String path, String controller) {
        routerMap.put(path, controller);
    }

    public Integer size() {
        return routerMap.size();
    }

    public String getController(String path) {
        return routerMap.get(path);
    }

    public void update(String path, String studentController) {
        routerMap.put(path, studentController);
    }

    public void remove(String path) {
        routerMap.remove(path);
    }

    public String toString() {
        String temp = "";
        for (Map.Entry<String, String> entry : routerMap.entrySet()) {
            temp = temp + entry.getKey() + entry.getValue() + "\n";
        }

//        for (int i = 0; i< routerMap.size(); i++) {
//            temp = temp + routerMap.
//        }
        return temp;
    }
}
