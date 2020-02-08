package com.epam.mavendemo;
import java.util.ArrayList;

public class gifts {
	public ArrayList<Sweets>Sweetsset;
	public ArrayList<Chocolates>Chocolatesset;
	public double weight;
	public gifts(double[] sweetsweight1, double[] chocolatesweight1, String[] chocolatestype1) {
		// TODO Auto-generated constructor stub
	}
	public void gift(double[] Sweetsweight,double[] Chocolatesweight,String[] Chocolatestype) {
		Sweetsset = new ArrayList<Sweets>();
		Chocolatesset = new ArrayList<Chocolates>();
		for(int i=0;i<Sweetsweight.length;i++) {
			Sweets pack = new Sweets(Sweetsweight[i]);
			Sweetsset.add(pack);
			weight+=pack.getweight();
		}
		for(int i=0;i<Chocolatesweight.length;i++) {
			Chocolates pack = new Chocolates(Chocolatesweight[i],Chocolatestype[i]);
			Chocolatesset.add(pack);
			weight+=pack.getweight();
		}
	}
	public int getNumSweets() {
		return Sweetsset.size();
	}
	public int getNumChocolates() {
		return Chocolatesset.size();
	}
	public double getweight() {
		return weight;
	}
	public void showSweetsweight() {
		for(Sweets sweet : Sweetsset) {
			System.out.println(sweet.getweight()+"");
		}
	}
	public void showChocolatesweight() {
		for(Chocolates candy : Chocolatesset) {
			System.out.println(candy.getweight()+"");
		}
	}
	public void showChocolatestype() {
		for(Chocolates chocolate : Chocolatesset) {
			System.out.println(chocolate.gettype()+"");
		}
	}
	
}
