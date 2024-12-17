package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute

        private String name;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int distance;
        private static boolean inRest = false;
        private static int time = 0;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            distance = 0;
        }

        public String getName(){
            return name;
        }

        public int getDistanceTraveled(){ // this method is required
            return distance;
        }
        

        public void simulateSecond(){ //this method is required but not tested
            time++;
            if (!inRest) {
                distance += speed;
            }
            if (time % runDuration + restDuration == 0) {
                inRest = false;
            } else if (time % runDuration + restDuration >= runDuration) {
                inRest = true;
            }
            
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        return "";
    }

    
    public static void main(String[] args) { // for testing purposed

    }

 
}



