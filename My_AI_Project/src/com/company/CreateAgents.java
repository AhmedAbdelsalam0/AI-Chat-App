package com.company;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;

import java.util.Scanner;

public class CreateAgents {

    CreateAgents(){


        Runtime rt = Runtime.instance();
        Profile p = new ProfileImpl("localhost",2000,"ChatPlatform");
        ContainerController cc = rt.createMainContainer(p);

        try{

            AgentController rma = cc.createNewAgent("rma" , "jade.tools.rma.rma" , null);
            rma.start();

            System.out.println("choose to speak with ...\n" +
                    "1 -> Male Person\n" +
                    "2 -> Female Person");

            Scanner input = new Scanner(System.in);

            do {

                String choice = input.nextLine();

                if (choice.equals("1")){
                    AgentController maleAgent = cc.createNewAgent("maleAgent" , "com.company.MaleAgent" , null);
                    maleAgent.start();
                    return;
                }
                else if (choice.equals("2")){
                    AgentController femaleAgent = cc.createNewAgent("femaleAgent" , "com.company.FemaleAgent" , null);
                    femaleAgent.start();
                    return;
                }
                else {
                    System.out.println("Invalid Input..Choose 1 or 2");
                }

            }while (true);


        }
            catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }


}
