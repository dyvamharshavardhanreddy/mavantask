package com.epam.mavendemo;

import java.util.ArrayList;
public class App 
{
    public static void main( String[] args )
    {
       ArrayList<gifts> giftbox=new ArrayList<gifts>();    
       double[] Sweetsweight1= {200.0,100.0};
       double[] Chocolatesweight1= {200.0,100.0};
       String[] Chocolatestype1 = {"candies","snickers"};
       giftbox.add(new gifts(Sweetsweight1,Chocolatesweight1,Chocolatestype1));
       double[] Sweetsweight2= {300.0,100.0,100.0};
       double[] Chocolatesweight2= {200.0,100.0,300.0};
       String[] Chocolatestype2 = {"dairymilk","5star","munch"};
       giftbox.add(new gifts(Sweetsweight2,Chocolatesweight2,Chocolatestype2));
       for(gifts box : giftbox) {
    	   if(box.getweight()>1000.0)
    	   {
    		   System.out.println("the box with"+box.getNumSweets()+"Sweets and "+
    				   box.getNumChocolates()+"chocolates is overweight");
    		   System.out.println("the Sweets weights are");
    		   box.showSweetsweight();
    		   System.out.println("the chocolate weights are");
    		   box.showChocolatesweight();
    		   System.out.println("the  chocolate types are");
    		   box.showChocolatestype();
    		   System.out.println();
    	   }
       }
    }
}
