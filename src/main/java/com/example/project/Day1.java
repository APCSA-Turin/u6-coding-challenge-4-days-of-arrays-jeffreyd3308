package com.example.project;
import java.util.Random;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name){
        Random rand = new Random();
        String firstName = elf_names[rand.nextInt(5)];
        if (name.equals(null) || name.equals("")) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        return firstName + " " + name;  
    }
}