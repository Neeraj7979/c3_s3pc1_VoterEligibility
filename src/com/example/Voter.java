package com.example;

public class Voter {
    private String name;
    private  int age;
    static final int VOTER_ELIGIBLE_AGE = 18;

    public Voter(){
        String name;
        int age;

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
    public void getAgeCriteria(final int VOTER_ELIGIBLE_AGE){
       if (getAge()>=VOTER_ELIGIBLE_AGE){
           System.out.println(name+" Is Eligible to Vote");
       } else if (getAge()>0&& getAge()<VOTER_ELIGIBLE_AGE) {
           System.out.println(name+" Is not Eligible to vote");
       }
       else {
           System.out.println("Age Can't Be negative or Zero");
       }
    }


    }