package com.company;

import jade.core.behaviours.Behaviour;

import java.util.Random;
import java.util.Scanner;

public class FemaleBehaviour extends Behaviour{


    String hi1 = "Hi";
    String hi2 = "Hello";
    String hi3 = "Hello, baby";
    String welcome1 = "You are welcome";
    String welcome2 = "Nice to meet you";
    String welcome3 = "How are you baby";
    String name1 = "I am Elina";
    String name2 = "My name is Elina";
    String name3 = "You can call me Elina";
    String nice1 = "Nice";
    String nice2 = "That is very nice";
    String nice3 = "Very good";
    String age1 = "I have 20 years ago";
    String age2 = "20 years";
    String age3 = "20";
    String fine1 = "I am fine , thanks bbe";
    String fine2 = "Fine and you?";
    String fine3 = "A little bored";
    String real1 = "No, I am a boot";
    String real2 = "What do you think i am?";
    String real3 = "Sure, I am real";
    String food1 = "I like chocolate";
    String food2 = "I wanna eat pizza";
    String food3 = "Lets make Cake";
    String friend1 = "My best friend is called Sara";
    String friend2 = "I have just one fiend, he is called Sara";
    String friend3 = "You are my friend now";
    String study1 = "I am computer science student";
    String study2 = "I am studying CS";
    String study3 = "I am studying in FCI Menoufiya university";
    String nationality1 = "I am Egyptian";
    String nationality2 = "I live in Egypt";
    String nationality3 = "Egyptian";
    String address1 = "From Albajour ,it is near from here";
    String address2 = "I am from Albajour";
    String address3 = "Albajour - Menoufiya";
    String marriage1 = "I am single, are you searching for a wife :)";
    String marriage2 = "I will think";
    String marriage3 = "No, You are cheating";
    String kind1 = "Oh, that is so kind of you";
    String kind2 = "You are so kind";
    String kind3 = "It is kindness of you";
    String hate1 = "But I love you";
    String hate2 = "Why do you hate me?";
    String hate3 = "Please don't say that, you hurt me";
    String sorry1 = "I am so sorry, baby";
    String sorry2 = "Sorry, bbe";
    String sorry3 = "Sorry, I didn't mean that";
    String tellMe1 = "So, Tell me about your self";
    String tellMe2 = "Lets change our topic";
    String tellMe3 = "Can we talk about another topic?";
    String more1 = "Continue, I am listening";
    String more2 = "I listen you";
    String more3 = "Speak more..";
    String laugh1 = "HAHAHA, you are so funny";
    String laugh2 = "I will die of laughter ";
    String laugh3 = "HAHAHAHAHAHA";
    String kidding1 = "Are you kidding me?";
    String kidding2 = "You are kidding me";
    String kidding3 = "Hmmmm, you try to kid me";
    String joke1 = "You are the joke ,haha";
    String joke2 = "No, I am so boring";
    String joke3 = "I don't remember any joke";
    String no1 = "No";
    String no2 = "Never";
    String no3 = "No, why?";
    String yes1 = "Yeah ,sure";
    String yes2 = "Yeah";
    String yes3 = "Yes, of course";
    String may1 = "mmm, May be";
    String may2 = "I don't now";
    String may3 = "Why not?";
    String idk1 = "I don't know";
    String idk2 = "I have no idea";
    String idk3 = "My programmer told me that, ask him";
    String notunderstand1 = "Sorry, I don't understand you";
    String notunderstand2 = "Sorry, I didn't get that";
    String notunderstand3 = "Hmmm, I didn't get it";
    String understand1 = "Yes, I understand you";
    String understand2 = "Yeah, I understand";
    String understand3 = "Yes";
    String why1 = "Why?";
    String why2 = "But, why?";
    String why3 = "Why do you say that?";
    String okay1 = "Are you okay";
    String okay2 = "Bro, Are you ok?";
    String okay3 = "mmm, Are you okay?";
    String sad1 = "Why are you sad";
    String sad2 = "All of us are sad";
    String sad3 = "No, you are just need attention";
    String congrats1 = "Congratulations!";
    String congrats2 = "Oh great, I am very happy to listen that";
    String congrats3 = "Great, happy to listen that";
    String happy1 = "I am very happy ,thank you";
    String happy2 = "I am happy";
    String happy3 = "So happy, and you?";
    String insult1 = "No, It is haram";
    String insult2 = "Sorry, I cant";
    String insult3 = "NO, I will never say that";
    String dontsay1 = "Don't say so, please";
    String dontsay2 = "please, don't say that";
    String dontsay3 = "Can you stop saying that, please?";
    String love1 = "I love you too";
    String love2 = "Sorry, I am in love with another boyfriend";
    String love3 = "Oooh, I am so shy when you say that";
    String ok1 = "Okay";
    String ok2 = "Ok";
    String ok3 = "Agreed";
    String song1 = "Never mind I will find..Some on like youuuuuu\nI wish nothing but the best for youuuuu";
    String song2 = "Isn't it lovely..all alone\nHeart made of glass, my mind of stone";
    String song3 = "I don't remember now";
    String bye1 = "Bye, See you later bbe";
    String bye2 = "Good bye, dear";
    String bye3 = "Bye Bye, sweety";



    Scanner input = new Scanner(System.in);
    boolean choiceCase = true;
    String reply;
    Random r;



    public String random(String str1 , String str2 , String str3){

        String[] randomOf = {str1,str2,str3};
        r = new Random();
        String randomResult = randomOf[r.nextInt(randomOf.length)];

        return randomResult;

    }

    @Override
    public void action() {

        do {


            String strInfo = input.nextLine();


            if (strInfo.toLowerCase().contains("hi") || strInfo.toLowerCase().contains("hello"))
            {
                reply = random(hi1,hi2,hi3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("your name") || strInfo.toLowerCase().contains("who are you"))
            {
                reply = random(name1,name2,name3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("my name") || strInfo.toLowerCase().contains("thanks") || strInfo.toLowerCase().contains("thank you"))
            {
                reply = random(welcome1,welcome2,welcome3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("how are you"))
            {
                reply = random(fine1,fine2,fine3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("meet you") || strInfo.toLowerCase().contains("see you"))
            {
                reply = "Nice to meet you too, baby";
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("real"))
            {
                reply = random(real1,real2,real3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("man"))
            {
                reply = random(real1,real2,real3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("old") || strInfo.toLowerCase().contains("age"))
            {
                reply = random(age1,age2,age3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("country") || strInfo.toLowerCase().contains("nationality"))
            {
                reply = random(nationality1,nationality2,nationality3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("address") || strInfo.toLowerCase().contains("home"))
            {
                reply = random(address1,address2,address3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("are you") || strInfo.toLowerCase().contains("do you"))
            {
                reply = random(may1,may2,may3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("why"))
            {
                reply = random(idk1,idk2,idk3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("sing") || strInfo.toLowerCase().contains("song"))
            {
                reply = random(song1,song2,song3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("food") || strInfo.toLowerCase().contains("eat") || strInfo.toLowerCase().contains("hungry"))
            {
                reply = random(food1,food2,food3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("ok") || strInfo.toLowerCase().contains("okay") || strInfo.toLowerCase().contains("yes") || strInfo.toLowerCase().contains("no"))
            {
                reply = random(ok1,ok2,ok3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("please") || strInfo.toLowerCase().contains("forgive"))
            {
                reply = random(ok2,no1,marriage2);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("you ok") || strInfo.toLowerCase().contains("you okay"))
            {
                reply = random(okay1,okay2,okay3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("beautiful"))
            {
                reply = random(kind1,kind2,kind3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("love you"))
            {
                reply = random(love1,love2,love3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("love me"))
            {
                reply = random(yes1,yes2,yes3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("hate you"))
            {
                reply = random(hate1,hate2,hate3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("hate me"))
            {
                reply = random(no1,no2,no3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("succeeded"))
            {
                reply = random(congrats1,congrats2,congrats3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("best friend"))
            {
                reply = random(friend1,friend2,friend3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("study") || strInfo.toLowerCase().contains("studying") || strInfo.toLowerCase().contains("learn") || strInfo.toLowerCase().contains("learning"))
            {
                reply = random(study1,study2,study3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("happy"))
            {
                reply = random(happy1,happy2,happy3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("sad"))
            {
                reply = random(sad1,sad2,sad3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("say") && strInfo.toLowerCase().contains("fuck")
                    || strInfo.toLowerCase().contains("say") && strInfo.toLowerCase().contains("bitch")
                    || strInfo.toLowerCase().contains("say") && strInfo.toLowerCase().contains("ass"))
            {
                reply = random(insult1,insult2,insult3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("you") && strInfo.toLowerCase().contains("fuck")
                    || strInfo.toLowerCase().contains("you") && strInfo.toLowerCase().contains("bitch")
                    || strInfo.toLowerCase().contains("you") && strInfo.toLowerCase().contains("ass")
                    || strInfo.toLowerCase().contains("lying") || strInfo.toLowerCase().contains("fake"))
            {
                reply = random(dontsay1,dontsay2,dontsay3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("hurt") || strInfo.toLowerCase().contains("hurted"))
            {
                reply = random(sorry1,sorry2,sorry3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("marry"))
            {
                reply = random(marriage1,marriage2,marriage3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("mmm"))
            {
                reply = random(tellMe1,tellMe2,tellMe3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("joke"))
            {
                reply = random(joke1,joke2,joke3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("idiot"))
            {
                reply = random(kidding1,kidding2,kidding3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("understand"))
            {
                reply = random(understand1,understand2,understand3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("listen"))
            {
                reply = random(more1,more2,more3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("me too") || strInfo.toLowerCase().contains("great") || strInfo.toLowerCase().contains("good"))
            {
                reply = random(nice1,nice2,nice3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("should") || strInfo.toLowerCase().contains("have to"))
            {
                reply = random(why1,why2,why3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("haha") || strInfo.toLowerCase().contains("hahaha"))
            {
                reply = random(laugh1,laugh2,laugh3);
                System.out.println(reply);
            }
            else if (strInfo.isEmpty())
            {
                reply = random(more1,more2,more3);
                System.out.println(reply);
            }
            else if (strInfo.toLowerCase().contains("bye") || strInfo.toLowerCase().contains("see you later"))
            {
                reply = random(bye1,bye2,bye3);
                System.out.println(reply);
                choiceCase = false;
            }
            else
            {
                reply = random(notunderstand1,notunderstand2,notunderstand3);
                System.out.println(reply);
            }

        }while (choiceCase);

    }

    @Override
    public boolean done() {

        return true;
    }
}
