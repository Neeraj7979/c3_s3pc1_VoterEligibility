package com.election;

import com.example.Voter;

public class VoterImpl {
    public static void main(String[] args) {
        Voter v1=new Voter();
        v1.setName("John");
        v1.setAge(10);
        System.out.print("age = " + v1.getAge()+" and ");
        System.out.println("name = " + v1.getName());
        v1.getAgeCriteria();

    }



}
