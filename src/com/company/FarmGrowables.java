package com.company;

public abstract class FarmGrowables
{

    public String Name;
    public Integer Age;
    public Integer GrowTime;
    public Double Cost;
    public Double PriceperGather;
    public Double MaintainPrice;
    public FarmAnimal[] ShopAnimals;
    public FarmPlants[] ShopPlantsWinter;
    public FarmPlants[] ShopPlantsSpring;
    public FarmPlants[] ShopPlantsSummer;
    public FarmPlants[] ShopPlantsAutumn;

    protected FarmGrowables(String Name, Integer Age, Integer GrowTime, Double Cost, Double PriceperGather, Double MaintainPrice)
    {
this.Name = Name;
this.Age = 0;
this.GrowTime = GrowTime;
this.Cost = Cost;
this.PriceperGather = PriceperGather;
this.MaintainPrice = MaintainPrice;
    }



}
