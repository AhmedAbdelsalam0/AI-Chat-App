package com.company;

import jade.core.Agent;

public class FemaleAgent extends Agent {

    FemaleBehaviour fb = new FemaleBehaviour();

    @Override
    protected void setup() {
        System.out.println("Start!!!");
        addBehaviour(fb);
    }

    @Override
    protected void takeDown() {
        System.out.println("End!!!");
    }

}
