/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author thandongwenya
 */
import java.util.*;
import java.lang.*;
public class JavaApplication6 {
private static String name;

    public JavaApplication6(String name){
        this.name=name;
    }
public static int randomWithRange(int min, int max){
        int range = Math.abs(max - min) + 1;     
        return (int)(Math.random() * range) + (min <= max ? min : max);
    }


    
    public static void main(String[] args) {
       System.out.println("Hello I'm Ella! and you are?");
        Scanner in = new Scanner(System.in);
        String namer = in.nextLine();


    String trim = namer.trim();
        if (namer.length()>15){ System.out.println("Your name is kinda long isn't it!"); }


        System.out.println("and your last name is?");
        Scanner in2 = new Scanner(System.in);
        String namer2 = in2.nextLine();

    String trim1 = namer2.trim();
        System.out.println("are you a boy or a girl?");
        Scanner in3 = new Scanner(System.in);
        String gender = in3.nextLine();
        char gen = 'f';
        if (gender.equalsIgnoreCase("boy") || gender.equalsIgnoreCase("man") || gender.equalsIgnoreCase("guy") || gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("male")  ){
            gen = 'm';
            System.out.println("oooo...Macho Macho!, Look at you!");
            System.out.println("ELLA BLOWS YOU A KISS!");
            System.out.println("lol!! I'm a girl.... I guess you can tell.");
            }else if (gender.equalsIgnoreCase("girl") || gender.equalsIgnoreCase("woman") || gender.equalsIgnoreCase("lady") || gender.equalsIgnoreCase("f") || gender.equalsIgnoreCase("female") ){
                gen = 'f';
                System.out.println("OH YEAH!!! GIRL POWER!!!");
            }else {
                System.out.println("Your answer is not quite clear...");
                System.out.println("I'll decide what you are");
                try{
                    Thread.sleep(3000);
                }catch (InterruptedException ex){
                    Thread.currentThread().interrupt();
                }
                System.out.println("You are a Human BeanStalk! ha ha ha ha!");
            }



        Person ppl = new Person(namer,namer2, gen);

        System.out.println("How old or young are you?");
        int ager = in3.nextInt();
        ppl.setAge(ager);


        if (ppl.known()) {
            System.out.println("HI "+namer+"! Good to see you again!");
        }else{
                System.out.println("I don't think we have met before");
                ppl.savePerson("ella.txt");
            }
            }
    }
    

