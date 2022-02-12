package com.company;

public class FarmAnimal extends FarmGrowables
{

public String[] anDiet;


    public FarmAnimal(String Name, Integer Age, Integer GrowTime, Double Cost, Double PriceperGather, Double MaintainPrice, String[] anDiet)
    {
        super(Name, Age, GrowTime, Cost, PriceperGather,MaintainPrice);
        this.anDiet=anDiet;

    }
}
