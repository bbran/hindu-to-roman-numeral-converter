package com.libertymutual.goforcode.romanNumerals.services;

public class HinduToRomanNumeralConverter {
	private static int[] denominations = new int[] {5000, 1000, 500, 100, 50, 10, 5, 1};
	private static String[] numerals = new String[] {"?", "M", "D", "C", "L", "X", "V", "I"};

	public String convert(int input)	{
		int remainingInput = input;
		int[] numOfDenomination = new int[8];
		String result="";
		for (int i = 0; i < denominations.length; i += 1)	{
			numOfDenomination[i] = remainingInput / denominations[i];
			remainingInput = remainingInput % denominations[i];
		}

		//go through the list of denominations two at a time to handle the 'half' denomination (5, 50, etc) and the 'whole' (1, 10, etc) at the same time
		for (int i = 0; i < denominations.length; i += 2)	{
			//handle numbers like 8 where there's a 5 denomination, but less than four 1 denominations
			if (numOfDenomination[i] == 1 && numOfDenomination[i + 1] != 4 )	{
				result = result + numerals[i];
				for (int j = 0; j < numOfDenomination[i + 1]; j += 1)	{
					result = result + numerals[i + 1];
				}
			}
			//handle numbers like 9 where there's a 5 denomination and four 1 denominations (subtractive notation using the next 'whole' denomination up)
			else if (numOfDenomination[i] == 1 && numOfDenomination[i + 1] == 4) {
				result = result + numerals[i + 1] + numerals[i - 1];
			} 
			//handle numbers like 4 where there's no 'half' denomination (i.e. 5), but there's four 1 denominations (subtractive using the 'half' denomination)
			else if (numOfDenomination[i] == 0 && numOfDenomination[i + 1] == 4) {
				result = result + numerals[i + 1] + numerals[i];
			} 
			//handle numbers like 1 or 200 where the same numeral is repeated for however many of that denomination
			else	{
				for (int j = 0; j < numOfDenomination[i + 1]; j += 1)	{
					result = result + numerals[i + 1];
				}
			}
		}
		return result;
	}
}
