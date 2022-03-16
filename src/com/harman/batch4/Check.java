package com.harman.batch4;

public class Check {
    public static void main(String[] args){
        try{
            int x=10, y=0, z;
            z=x/y;
            System.out.println("z");

            }
        catch(Exception e){
            System.out.println(e);
        }

        try{
            String name= "Hello";
            System.out.println(name.length());
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divisible by zero");
        }
        catch (NullPointerException e)
        {
            System.out.println("Null pointer exception");
        }


    }
}
