package com.company;
import com.company.Farm;
import com.company.FarmPlants;


public class Player {
  public String Name;
  public Farm OwnedFarm;
  public Double cash;
  public Integer week = 1;
  public Integer season = 1;
  public Integer year = 2020;
  public FarmAnimal[] WareHouse;
  public FarmPlants[] Fields;

  Player()
  {
    this.cash = 1000.00;
    this.WareHouse = new FarmAnimal[OwnedFarm.fabuildings];
    this.Fields = new FarmPlants[OwnedFarm.fasize];
  }
public void BuyFarm(Farm farm)
{
  if(farm.faprice < cash)
  {
    this.OwnedFarm = farm;
  System.out.println("You bought "+farm.faname);
  }
  else if(farm.faprice > cash)
  {
    System.out.println("You cannot buy this farm");
  }
}








  // for seasons 1 = winter, 2 = spring, 3 = summer, 4 = autumn
  public void NextSeason() {
    if (week < 14) {
      season = 1;
      System.out.println("Winter");
    } else if (week < 27 && 13 < week) {
      season = 2;
      System.out.println("Spring");
    } else if (26 < week && week < 40) {
      season = 3;
      System.out.println("Summer");
    } else if (39 < week && week < 53) {
      season = 4;
      System.out.println("Autumn");
    }
  }

  public void NextYear() {
    if (week == 54) {
      year += 1;
      week = 1;
      System.out.println("Current year is" + year);
      System.out.println("Congratulation on reaching new Year");
    } else
      System.out.println("Current year is" + year);
  }

  public void NextWeek() {
    week += 1;
  }

  public void StartNewWeek() {
    NextSeason();
    NextWeek();
    NextYear();

   for (FarmAnimal farmAnimal : WareHouse)
   {
      farmAnimal.Age += 1;
      cash -= farmAnimal.MaintainPrice;
   }
   for (FarmPlants farmPlants : Fields)
   {
     farmPlants.Age += 1;
     cash -= farmPlants.MaintainPrice;
   }
  }
}