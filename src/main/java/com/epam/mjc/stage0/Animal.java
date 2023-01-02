package com.epam.mjc.stage0;


public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal (String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;}

    public String getColor(){
        return this.color;}
    public int getNumberOfPaws(){
        return this.numberOfPaws;}

    public  String getDescription(){
        String paw = " paw ";
        String hasFurPrint = "no ";
        if (numberOfPaws>1){
            paw = " paws ";}
        if (hasFur == true){
            hasFurPrint= "a ";}
        return "This animal is mostly " + color + ". It has " + numberOfPaws +  paw +"and " + hasFurPrint +  "fur.";}}




















