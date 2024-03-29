package asgn;

//mathematical calculations for generating tax
public class CalculateTax {
	// calculate tax for raw item
	public static double getRawItemTax(double price) {
		return (price * 12.5) / 100;
	}

	// calculate tax for manufactured item
	public static double getManufacturedItemTax(double price) {
		double x = (price * 12.5) / 100;
		return x + 2 * x / 100;
	}

	// calculate tax for imported item
	public static double getImportedItemTax(double price) {
		double tax = (price * 12.5) / 100;
		double importDuty = (price * 10) / 100;
		double finalCost = tax + importDuty;
		double surcharge = 0;
		if (finalCost <= 100) {
			surcharge = 5;
		} else if (finalCost <= 200) {
			surcharge = 10;
		} else {
			surcharge = (finalCost * 5) / 100;
		}
		return finalCost + surcharge;
	}
}
