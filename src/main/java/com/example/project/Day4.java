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
        private int time = 0;

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
            if (time <= runDuration) {
                distance += speed;
            } else if (time > runDuration + restDuration) {
                time = 0;
            }
            
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        int farthest = 0;
        String farMan = "";
        for (int i = time; i > 0; i--) {
            for (int j = 0; j < reindeers.length; j++) {
                reindeers[j].simulateSecond();
                if (farthest < reindeers[j].getDistanceTraveled()) {
                    farthest = reindeers[j].getDistanceTraveled();
                    farMan = reindeers[j].getName();
                }
            }
        }
        return farMan;
    }

    
    public static void main(String[] args) { // for testing purposed

    }

 
}



