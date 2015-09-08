// Arithmetic Calculator
//Alex James
//9-6-15
//CSE 002
public class Arithmetic
{
	public static void main(String[] args){

		//Variables
		int nSocks=3; //Number of pairs of socks
		double sockCost$=2.58; //Cost per pair of socks (‘$’ is part of the variable name)
		int nGlasses=6; //Number of drinking glasses
		double glassCost$=2.29; //Cost per glass
		int nEnvelopes=1; //Number of boxes of envelopes
		double envelopeCost$=3.25; //cost per box of envelopes
		double taxPercent=0.06; // Pennsylvania's tax percent
		double sockCostWithoutTax$; //total cost of socks without tax
		double sockTax$; // total tax on the socks
		double glassCostWithoutTax$; //total cost of socks without tax
		double glassTax$; //total tax on the glass
		double envelopeCostWithoutTax$; //total cost of socks without tax
		double envelopeTax$; //total tax on envelope
		double transactionCostWithoutTax$; // total transaction cost without tax
		double totalSockCost$; //total cost of socks with tax
		double totalGlassCost$; //total cost of socks with tax
		double totalEnvelopeCost$; //total cost of socks with tax
		double totalTaxPercentCost$; // total cost of tax
		double totalTransactionCost$; // total transaction cost with tax

		//Calculation
		sockCostWithoutTax$ = (int)((nSocks * sockCost$)*100)/100.0;
		sockTax$ = (int)((sockCostWithoutTax$*taxPercent)*100)/100.0;
		glassCostWithoutTax$ = (int)((nGlasses * glassCost$)*100)/100.0;
		glassTax$ = (int)((glassCostWithoutTax$*taxPercent)*100)/100.0;
		envelopeCostWithoutTax$ = (int)((nEnvelopes * envelopeCost$)*100)/100.0;
		envelopeTax$ = (int)((envelopeCostWithoutTax$*taxPercent)*100)/100.0;
		transactionCostWithoutTax$ = (int)((sockCostWithoutTax$ + glassCostWithoutTax$ + envelopeCostWithoutTax$)*100)/100.0;
		totalSockCost$ = (int)((sockTax$ + sockCostWithoutTax$)*100)/100.00;
		totalGlassCost$ = (int)((glassTax$ + glassCostWithoutTax$)*100)/100.00;
		totalEnvelopeCost$ = (int)((envelopeTax$ + envelopeCostWithoutTax$)*100)/100.00;
		totalTaxPercentCost$ = (int)((sockTax$ + glassTax$ + envelopeTax$)*100)/100.00;
		totalTransactionCost$ = (int)((totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$)*100)/100.00;

		//Print Outs
		System.out.println("Item: Socks  Number of: " + nSocks +"  Cost of individual item: $" + sockCost$);
		System.out.println("Cost of socks without tax: $" + sockCostWithoutTax$ + "  Sales Tax on socks: $" +
							sockTax$);
		System.out.println("Total cost: $" + totalSockCost$);
		System.out.println("Item: Glasses  Number of: " + nGlasses +"  Cost of individal item: $" + glassCost$);
		System.out.println("Cost of socks without tax: $" + glassCostWithoutTax$ + "  Sales Tax on socks: $" +
							glassTax$);
		System.out.println("Total cost: $" + totalGlassCost$);
		System.out.println("Item: Envelopes  Number of: " + nEnvelopes +"  Cost of individual item: $" + envelopeCost$);
		System.out.println("Cost of socks without tax: $" + envelopeCostWithoutTax$ + "  Sales Tax on socks: $" +
							envelopeTax$);
		System.out.println("Total cost: $" + totalEnvelopeCost$);
		System.out.println("Total cost without tax: $" + transactionCostWithoutTax$ + " Total tax cost: $" + totalTaxPercentCost$);
		System.out.println("Total transaction with tax: $" + totalTransactionCost$);
}}