package com.bridzelabz.day7;

public class GamblingGame {
	public static void main(String[] args) {
		int cash = 100 ;
		int stake  = Integer.parseInt(args[0]);    
        int goal   = Integer.parseInt(args[1]);    
        int numOfTrial = Integer.parseInt(args[2]); 
		int bet = 0;
		int wins = 0;       

		          for (int i = 1; i < numOfTrial; i++) {

		            
		            cash = stake;
		            while (cash > 0 && cash < goal) {
		                bet++;
		                if (Math.random() < 0.5) 
		                	cash++;     
		                else                     
		                	cash--;   
		            }
		            if (cash == goal) wins++;                
		        }

		        
		        System.out.println(wins + " wins of " + numOfTrial);
		        System.out.println("Percent of games won = " + 100.0 * wins / numOfTrial);
		        System.out.println("Avg # bets           = " + 1.0 * bet / numOfTrial);
		    }

	

	
	}
	


