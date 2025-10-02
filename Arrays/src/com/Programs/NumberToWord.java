package com.Programs;

public class NumberToWord {
		public static void nw(int n,String s)
		{
			String[] one={ "","one", "two", "three", "four", "five",
				    "six", "seven", "eight", "nine", "ten",
				    "eleven", "twelve", "thirteen", "fourteen", "fifteen",
				    "sixteen", "seventeen", "eighteen", "nineteen"};
			String[] two={"","","twenty", "thirty", "forty", "fifty",
				    "sixty", "seventy", "eighty", "ninety"};
			if(n<=19)
			{
				System.out.print(one[n]);
			}
			else System.out.print(two[n/10]+""+one[n%10]);
			if(n!=0)System.out.print(s);
		}
	public static void main(String[] args) {
		int n=18732615;
		nw(n/10000000, " Crore ");
		nw((n/100000)%100," Lakhs ");
		nw((n/1000)%100," Thousands ");
		nw((n/100)%10," Hundred ");
		nw(n%100,"");
	}
}
// one Crore eightyseven Lakhs thirtytwo Thousands six Hundred fifteen
