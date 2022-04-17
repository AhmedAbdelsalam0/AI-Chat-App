package com.company;

import jade.core.Agent;

public class MaleAgent extends Agent {



    MaleBehaviour mb = new MaleBehaviour();

    @Override
    protected void setup() {
        System.out.println("Start!!!");
        addBehaviour(mb);
    }

    @Override
    protected void takeDown() {

        System.out.println("End!!!");
    }
}
