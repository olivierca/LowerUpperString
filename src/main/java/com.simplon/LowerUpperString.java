package com.simplon;


public class LowerUpperString {

    private String result="";
    public String toAlternativeString(String chaine)
    {
        for (int i = 0; i < chaine.length(); i++) {
            if(chaine.codePointAt(i) < 97)  result += chaine.toLowerCase().charAt(i);
            else    result += chaine.toUpperCase().charAt(i);
        }

        return result;
    }
}
