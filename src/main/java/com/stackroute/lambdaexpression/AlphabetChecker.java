package com.stackroute.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class AlphabetChecker {
    //write logic to find whether given string contains only alphabets or not
    public String checkAlphabets(List<String> inputList) {
        CheckAlpha answer;
        answer = (input) -> {
            for (String word:input
            ) {
                if(!word.trim().matches("[a-zA-Z]+"))
                    return "Given list contains non alphabet strings";
            }
            return  "Given list contains only alphabet strings";
        };

        if (inputList.isEmpty())
            return "Give proper input not empty list";

        else
            return answer.checkValidity(inputList);
    }
}
