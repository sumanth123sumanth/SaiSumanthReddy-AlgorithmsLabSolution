package com.greatlearning.denominations.model;

public class DenominationCounter {
	/**
	 * This method stores the denominations count required to pay an amount 
	 * and returns the remaining amount to be paid after paying using available denominations
	 * @param denominations
	 * @param amountToPay
	 * @param denominationsCount
	 * @return
	 */
	public int getDenominationCount(int[] denominations,int amountToPay,int[] denominationsCount)
	{
		for (int i = 0; i < denominationsCount.length; i++) {
			if (denominations[i] > 0 && denominations[i] <= amountToPay) //Skipping if there is a zero denomination
			{
				denominationsCount[i] = amountToPay / denominations[i]; //Getting denomination count for each denomination 
				amountToPay -= denominations[i] * denominationsCount[i];//Reducing amount to pay by subtracting --> (denomination value*denomination count)
			}
		}
		// returning remaining amount after checking all denominations to know if exact amount can be paid or not
		return amountToPay;
	}

}
