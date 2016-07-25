package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameImpl {

	public static void main(String[] args)
	{
		String city = null;
		List<String> cities = new ArrayList<String>();
		
		GeoGame game = new GeoGame();
		
		InputStream in = GameImpl.class.getResourceAsStream("cities.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		try
		{
			while ((city = br.readLine()) != null)
			{
				String arr[] = city.split(" ");
				int count;
				String a = "";
				
				for(count = arr.length -1 ;count > 0;count--)
				{
					if(arr[count].matches("\\d+"))
						break;
				}
				count++;
				for(int i = count;i<arr.length;i++)
					a = a+" "+arr[i].toLowerCase();
				
				cities.add(a);
			}
			//System.out.println(cities);
			game.setCities(cities);
			
		} 
		catch (IOException e)
		{
		  e.printStackTrace();
		}
		
		System.out.println("\n\t\t\t Geography Game \n");
		
		Scanner sc = new Scanner(System.in);
	
		String player1 = null;
		String player2 = null;
		
		System.out.println("Please input the first player's Name:");
		player1 = sc.nextLine().trim();
		System.out.println("Please input the Second player's Name:");
		player2 = sc.nextLine().trim();
		
		Random r = new Random();

		int first = r.nextInt();
		int choice;
		
		if(first%2 == 0)
		{
			choice = 1;
			System.out.println(player1+" won the toss plays first");
		}
		else
		{
			choice = 2;
			System.out.println(player2+" won the toss plays first");
		}
		
		while(true)
		{
			if(choice == 1)
			{
				System.out.println("\n"+player1+" enter the cityName:");
				String fCity = sc.nextLine().trim().toLowerCase(); 
				
				boolean cond = game.check(1,fCity);
				
				if(cond)
					game.addCityInFirstCities(fCity);
				else
				{
					System.out.println("\n Game Over");
					System.out.println("\n"+player2 + " won the match");
					break;
				}
				
				System.out.println("\n"+player2+" enter the cityName:");
				String sCity = sc.nextLine().trim().toLowerCase(); 
				
				cond = game.check(2,sCity);
				
				if(cond)
					game.addCityInSecondCities(sCity);
				else
				{
					System.out.println("\nGame Over");
					System.out.println("\n"+player1 + " won the match");
					break;
				}
				
			}
			else
			{
				System.out.println("\n"+player2+" enter the cityName:");
				String sCity = sc.nextLine().trim().toLowerCase(); 
				
				boolean cond = game.check(2,sCity);
				
				if(cond)
					game.addCityInSecondCities(sCity);
				else
				{
					System.out.println("\nGame Over");
					System.out.println("\n"+player1 + " won the match");
					break;
				}
				
				System.out.println("\n"+player1+" enter the cityName:");
				String fCity = sc.nextLine().trim().toLowerCase(); 
				
				cond = game.check(1,fCity);
				
				if(cond)
					game.addCityInFirstCities(fCity);
				else
				{
					System.out.println("\nGame Over");
					System.out.println("\n"+player2 + " won the match");
					break;
				}
			}
		}
	}
}
