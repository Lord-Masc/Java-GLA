
import java.util.HashMap;

import java.util.*;

public class Practice_set {

    public static void main(String[] args) {
        //Write a Java program to find length of a string
        String name = "Harry";
        System.out.println(name.length());

        //2.Write a Java program to copy one string to another string.
        String name1 = "Harry";
        String name2 = name1;
        System.out.println(name2);

        //3.Write a Java program to concatenate two strings.
        String firstName = "Harry";
        String lastName = " Potter";
        System.out.println(firstName.concat(lastName));

        //6.Write a Java program to convert lowercase string to uppercase.
        String name3 = "harry";
        System.out.println(name3.toLowerCase());
        System.out.println(name3.toUpperCase());

        //7.Write a Java program to toggle case of each character of a string.
        String str = "Yash";
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 65 && ch <= 90) {
                s = s + (char) (ch + 32);
            } else if (ch >= 97 && ch <= 122) {
                s = s + (char) (ch - 32);
            } else {
                continue;
            }
        }
        System.out.println(s);

        //8.Write a Java program to find total number of alphabets, digits or special character in a string.
        String name10 = "Harry@123";
        int alphabets = 0, digits = 0, specialChar = 0;
        for (int i = 0; i < name10.length(); i++) {
            char ch = name10.charAt(i);
            if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
                alphabets++;
            } else if (ch >= 48 && ch <= 57) {
                digits++;
            } else {
                specialChar++;
            }
        }
        System.out.println("Alphabets: " + alphabets);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChar);

        // 9.Write a Java program to count total number of vowels and consonants in a string.
        String name11 = "Harry";
        name11 = name11.toLowerCase();

        int vowel = 0, consonants = 0;
        for (int i = 0; i < name11.length(); i++) {
            char ch = name11.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonants);

        //10.Write a Java program to count total number of words in a string.
        String name4 = "Code With harry";
        String name5[] = name4.split(" ");
        System.out.println("Words of String " + name5.length);

        //11. Write a Java program to find reverse of a string
        String name6 = "Harry";
        StringBuilder sb = new StringBuilder(name6);
        System.out.println("Reverse String " + sb.reverse().toString());

        //12.Write a Java program to check whether a string is palindrome or not.
        String name7 = "madam";
        StringBuilder sb1 = new StringBuilder(name7);

        if (name7.equals(sb1.reverse().toString())) {
            System.out.println("String is Palindrom");
        } else {
            System.out.println("String is not Palindrom");
        }

        //13.Write a Java program to reverse order of words in a given string.
        String name8 = "Welcome to Java";
        String words[] = name8.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println("");

        //14.14.Write a Java program to find first occurrence of a character in a given string.
        String name9 = "This is my sample codey";
        System.out.println(name9.indexOf('m'));

        // 15.Write a Java program to find last occurrence of a character in a given string.
        System.out.println(name9.lastIndexOf("y"));

        //16.Write a Java program to search all occurrences of a character in given string.
        String name12 = "This is my sample code";
        int size = 0;
        char ch = 's';
        for (int i = 0; i < name12.length(); i++) {
            if (name12.charAt(i) == ch) {
                System.out.println("Character " + ch + " found at index: " + i);
                size++;
            }
        }

        //17.Write a Java program to count occurrences of a character in given string.
        System.out.println("Total Occurrences of character " + ch + " is: " + size);

        //18.Write a Java program to find highest frequency character in a string.
        String name13 = "aabafsdfsfsagsdgsdf";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < name13.length(); i++) {
            char ch3 = name13.charAt(i);
            if (map.containsKey(ch3)) {
                map.put(ch3, map.get(ch3) + 1);
            } else {
                map.put(ch3, 1);
            }
        }

        for (Character ch4 : map.keySet()) {
            System.out.println(ch4 + " = " + map.get(ch4));
            if (map.get(ch4) == 1) {
                System.out.println(ch4);
            }

        }

    }
}
