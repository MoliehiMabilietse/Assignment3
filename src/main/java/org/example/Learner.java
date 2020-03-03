package org.example;

public class Learner extends Teacher implements Principal {

    public Learner(String name,String surname,String subject){

        super(name,surname,subject);
    }
    public void location(){
        System.out.println("Worcester");
    }
}
