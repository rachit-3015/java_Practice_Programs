// print number of words,vowels and frequency of each character in string

import java.util.*;
import java.util.stream.*;

public class PrintWordVowelFrequency{
    public static void main(String [] args){

        String str = "Learn With Rachit Patel";
        

        //counting words
        long wordCount = str.chars().filter(e->e==' ').count();
        System.out.println(wordCount+1);

        // another way of counting words
        int wordCountOne=0;
        String strArr[] = str.split(" ");
        for(String s : strArr){
            wordCountOne++;
        }
        System.out.println(wordCountOne);

        // couting vowel
        long vowelCount = str.chars().filter(e->e=='a'||e=='e'||e=='i'||e=='o'||e=='u'||e=='A'||e=='E'||e=='I'||e=='O'||e=='U').count();
        System.out.println(vowelCount);

        // another way to count the vowel
        int vowelCountOne=0;
        for(int i = 0 ; i < str.length() ; i++){
            char c = str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                vowelCountOne++;
            }
        }
        System.out.println(vowelCountOne);

        // counting the frequency
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < str.length() ; i++){
            Integer c = map.get(str.charAt(i));
            if(c==null){
                map.put(str.charAt(i),1);
            }else{
                map.put(str.charAt(i),c=c+1);
            }
        }
        map.entrySet().stream().forEach(e->System.out.print(e.getKey()+" "+e.getValue()+"  "));

        // converting all to uppercase
        String allSmall = str.chars().filter(Character :: isLowerCase).mapToObj(ch->String.valueOf((char)ch)).collect(Collectors.joining());
        System.out.println(allSmall);

        String allCapital = str.chars().filter(Character :: isUpperCase).mapToObj(ch->String.valueOf((char)ch)).collect(Collectors.joining());
        System.out.println(allCapital);


    }
}