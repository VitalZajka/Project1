package com.interviewquestionsR;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfCharacters {
    public static void main(String[] args) {
        String message = "I aaaaaaam gettinn used to intellijjj";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0; i<message.length(); i++){
            if(!map.containsKey(message.charAt(i))){
                map.put(message.charAt(i),1);
            }else {
                map.put(message.charAt(i),map.get(message.charAt(i))+1);
            }
        }
        for (Map.Entry each : map.entrySet()) {
            System.out.println(" message contains "+each.getKey()+" = "+each.getValue()+" times");
        }
    }
}
