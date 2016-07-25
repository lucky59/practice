package com.practice;

import java.util.ArrayList;
import java.util.List;

public class GeoGame {

	private List<String> firstCities;
	private List<String> secCities;
	private List<String> cities;
	
	public GeoGame()
	{
		firstCities = new ArrayList<String>();
		secCities  = new ArrayList<String>();
		cities = new ArrayList<String>(); 
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	
	public void addCityInFirstCities(String city)
	{
		firstCities.add(city);
	}
	
	public void addCityInSecondCities(String city)
	{
		secCities.add(city);
	}
	
	public boolean check(int player,String city)
	{
		if(player == 1)
		{
			if(cities.contains(city))
			{
				if(secCities.size() == 0)
					return true;
				else
				{
					if(secCities.contains(city) || firstCities.contains(city))
					 return false;
					
					String rCity = secCities.get(secCities.size() - 1);
					char last = rCity.charAt(rCity.length() - 1);
					char first = city.charAt(0);
					
					if(last == first)
					 return true;
					else
					 return false;
				}
			}
			else
			{
				System.out.println("City is not in the List provided");
				return false;
			}
		}
		else
		{
			if(cities.contains(city))
			{
				if(firstCities.size() == 0)
					return true;
				else
				{
					if(firstCities.contains(city) || secCities.contains(city))
						 return false;
					
					String rCity = firstCities.get(firstCities.size() - 1);
					char last = rCity.charAt(rCity.length() - 1);
					char first = city.charAt(0);
					
					if(last == first)
					 return true;
					else
					 return false;
				}
			}
			else
			{
				System.out.println("City is not in the List provided");
				return false;
			}
			
		}
	}
}
