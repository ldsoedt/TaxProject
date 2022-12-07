/*
    Logan Soedt
    GUI Tax project
    12/06/2022
    1. Get purchase price from the user
    2. Calculate the State TAX at 4% (purchase price * 0.06)
    3. Calculate the County TAX at 2% (purchase price * 0.02)
    4. Calculate the total Sales TAX (TAX State Tax + County Tax)
    5. Calculate the total Sales (purchase price + total Tax)

 */

import javax.swing.*;

public class TAXGUI {
    public static void main(String[] args) {
        String PurchasePriceString;
        double TotalTax,PurchasePrice,CStateTax, CCountyTax, TotalSales;
        final double StateTax = 0.04;
        final double CountyTax = 0.02;

        PurchasePriceString = JOptionPane.showInputDialog(null, "Enter the purchase price",
                "Purchase dialog 1", JOptionPane.INFORMATION_MESSAGE);
        PurchasePrice = Double.parseDouble(PurchasePriceString);

        CStateTax = PurchasePrice * StateTax;

        CCountyTax = PurchasePrice * CountyTax;

        TotalTax = CCountyTax + CStateTax;

        TotalSales = TotalTax + PurchasePrice;

        JOptionPane.showMessageDialog(null, "SubTotal is " + PurchasePrice +
                "\nState tax is " + CStateTax + "\nCounty tax is " + CCountyTax +
                "\nTotal tax is " + TotalTax + "\nTotal is " + TotalSales);

    }
}
