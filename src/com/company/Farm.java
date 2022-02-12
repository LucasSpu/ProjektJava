package com.company;

public class Farm
{
    public String faname;
    public Double faprice;
    public Integer fabuildings;
    public Integer fasize;



   public Farm(String faname, Double faprice, Integer fabuildings, Integer fasize)
   {
       this.faname = faname;
       this.faprice = faprice;
       this.fabuildings = fabuildings;
       this.fasize = fasize;
   }

Farm farm1 = new Farm("sneedville",500.00,1,3);
   Farm farm2 = new Farm("chuckville",700.00,2,5);
   Farm farm3 = new Farm("Brek",1000.00,4,7);


}
