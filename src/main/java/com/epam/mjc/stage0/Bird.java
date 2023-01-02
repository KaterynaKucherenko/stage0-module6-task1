package com.epam.mjc.stage0;

public class Bird extends Animal {

    public Bird (String color, int numberOfPaws, boolean hasFur){
        super ( color, numberOfPaws, hasFur);}

    public String getDescription(){
        String birdColor = getColor();
        int birdNumberOfPaws = getNumberOfPaws();
        String paw = " paw ";
        String hasFurPrint = "no ";
       if (birdNumberOfPaws>1){
          paw = " paws ";}

        return "This animal is mostly " + birdColor + ". It has " +birdNumberOfPaws +  paw + "and no fur. Moreover, it has 2 wings and can fly.";

    }}
