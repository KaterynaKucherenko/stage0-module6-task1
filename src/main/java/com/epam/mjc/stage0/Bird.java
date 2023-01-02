package com.epam.mjc.stage0;

public class Bird extends Animal {

 public Bird (String color, int numberOfPaws, boolean hasFur){
            super ( color, numberOfPaws, hasFur);}
            
        public String getDescription(){
	    String paw = " paw ";
	    String hasFurPrint = "no ";
	    if (super.numberOfPaws>1){
	        paw = " paws ";}
	    if (super.hasFur == true){
	        hasFurPrint= "a ";}
	       
	        
	   return "This animal is mostly " + super.color + ". It has " + super.numberOfPaws +  paw +"and " + hasFurPrint +  "fur. Moreover, it has 2 wings and can fly.";
        
    }}

