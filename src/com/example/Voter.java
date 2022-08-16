package com.example;

public class Voter {
    private String name;
    private  int age;
    private static final int VOTER_ELIGIBLE_AGE = 18;

    public Voter(){

         name="";
         age=0;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getAgeCriteria(){
       if (getAge()>=VOTER_ELIGIBLE_AGE){
           System.out.println(name+" Is eligible to Vote");
           return name;
       } else if (getAge()<VOTER_ELIGIBLE_AGE && getAge()>0) {
           System.out.println(name+ " Is Not eligible to vote");
           return name;

       }
       else {
           System.out.println("Age can't be Zero or Negative");
           return "null";
       }
    }


    }