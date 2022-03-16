package com.harman.batch4;

abstract public class College {
    abstract void setAcademicFee();
}
class BEComputer extends College
{

    @Override
    void setAcademicFee() {
        int fees=8000;
        System.out.println("My acdemic fees is"+" "+ fees);
    }
}
class MEComputer extends College
{

    @Override
    void setAcademicFee() {
        int fees1=10000;
        System.out.println("My ME academic fees is"+" "+ fees1);
    }
}
class CollgeOffice
{
    public static void main(String[] args)
    {
        College c= new BEComputer();
        College c1= new MEComputer();
        c.setAcademicFee();
        c1.setAcademicFee();
    }
}
