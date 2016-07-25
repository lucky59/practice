package tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	static char board[][] = {{'_','_','_'},{'_','_','_'},{'_','_','_'}};
	
	public static void main(String[] args)
	{
		String player1 = null;
		String player2 = null;
		int boxNum = 0;
		int choice = 0;
		
		System.out.println("****************** TicTacToe Game *******************");
		System.out.println("** This is a two-player game. Whoever plays frist ***");
		System.out.println("** always uses 'X' and the other  player 'O'.     ***");
		System.out.println("** Your goal is to be the first player to get     ***");
		System.out.println("** 3 X's or O's in a row (horizontally,           ***");
		System.out.println("** diagonally, or vertically).                    ***");
		System.out.println("*****************************************************");
		
		printBoard();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the first player's Name:");
		player1 = sc.nextLine();
		System.out.println("Please input the Second player's Name:");
		player2 = sc.nextLine();
		
		Random r = new Random();

		int first = r.nextInt();
		
		if(first%2 == 0)
		{
			choice = 1;
			System.out.println(player1+" plays first and uses 'X' and "+
								player2+" uses 'O'");
		}
		else
		{
			choice = 2;
			System.out.println(player2+" plays first and uses 'X' and "+
					player1+" uses 'O'");
		}
		
		int count = 0;
		
		while(true)
		{
			if(choice == 1)
			{
				System.out.println(player1+" to play[X]");
				System.out.println("Enter the box number: ");
				boxNum = sc.nextInt();
				input(boxNum,'x');
				printBoard();
				check();
				count++;
				
				if(count >= 9)
					break;
				
				System.out.println(player2+" to play[O]:");
				System.out.println("Enter the box number: ");
				boxNum = sc.nextInt();
				input(boxNum,'O');
				printBoard();
				check();
				count++;
				
			}
			else
			{
				System.out.println(player2+" to play[X]:");
				System.out.println("Enter the box number: ");
				boxNum = sc.nextInt();
				input(boxNum,'O');
				printBoard();
				check();
				count++;
				
				if(count >= 9)
					break;
				
				System.out.println(player1+" to play[O]:");
				System.out.println("Enter the box number: ");
				boxNum = sc.nextInt();
				input(boxNum,'X');
				printBoard();
				check();
				count++;
			}
		}
		System.out.println("Game Over");
	}
	
	public static void printBoard()
	{
		for(int row=0;row<3;row++)
		{
			for(int col=0;col<3;col++)
				System.out.print(board[row][col]+"|");
			System.out.println();
		}
	}
	
	public static void check()
	{
		//Logic will be implemented in next assignment
	}
	
	public static void input(int boxNum,char val)
	{
		int row = (boxNum-1)/3;
		int col = (boxNum-1)%3;
		
		board[row][col] = val;
	}
}


/*
 * 0 1 2
 * 3 4 5
 * 6 7 8
 * 
 */