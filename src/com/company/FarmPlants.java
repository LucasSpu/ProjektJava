package com.company;

public class FarmPlants extends FarmGrowables
{
    public Integer plseason;

    public FarmPlants(String Name, Integer Age, Integer GrowTime, Double Cost, Double PriceperGather, Double MaintainPrice, Integer plseason)
    {
        super(Name, Age, GrowTime, Cost, PriceperGather, MaintainPrice);
        this.plseason = plseason;
    }



}
