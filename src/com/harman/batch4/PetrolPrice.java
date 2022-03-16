package com.harman.batch4;


abstract class PetrolPrice
{
    abstract void changePrice();
}
class Gov extends PetrolPrice{

    @Override
    void changePrice() {
        System.out.println("Increased by 2%");
    }
    public static void main(String[] args)
    {
        PetrolPrice price= new Gov();
        price.changePrice();
    }
}