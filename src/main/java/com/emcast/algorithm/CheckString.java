package com.emcast.algorithm;

public class CheckString {
    public boolean checkString(String str) {
        if (str.length() % 2 != 0) return false;

        int firstLength = str.length() / 2;
        int totalLength = str.length();
        String firstStr = str.substring(0, firstLength);
        String secondStr = str.substring(firstLength, totalLength);
        char[] firstArr = firstStr.toCharArray();
        char[] secondArr = secondStr.toCharArray();
        for (int i = 0; i < firstArr.length; i++) {
            if (getCouple(firstArr[i]) != secondArr[i]) {
                return false;
            }
        }
        return true;
    }

    private char getCouple(char closeStr) {
        char answer = 0;
        switch (closeStr) {
            case '(' :
                answer = ')';
                break;
            case '[' :
                answer = ']';
                break;
            case '{' :
                answer = '}';
                break;
            case '<' :
                answer = '>';
                break;
        }
        return answer;
    }
}
