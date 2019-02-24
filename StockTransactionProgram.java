import javax.swing.JOptionPane;

public class StockTransactionProgram
{

   public static void main (String[] args)
   {
   
      //Variables and fillers for conversion
      String fillerNumShares;
      String fillerPricePShare;
      String fillerSellingPrice;
      String fillerCommRate;
      double numOfShares;
      double pricePShare;
      double sellingPrice;
      double commRate;
      double totalShares;
      double commition1;
      double commition2;
      double totalSelling;
      double realCommRate;
      double totalBuy;
      double totalSell;
      double profitLoss;
      
      //User Inputs
      fillerNumShares    = JOptionPane.showInputDialog("How many shares did you purchase?");
      fillerPricePShare  = JOptionPane.showInputDialog("How much did each share cost?");
      fillerSellingPrice = JOptionPane.showInputDialog("At what price are you selling your shares?");
      fillerCommRate     = JOptionPane.showInputDialog("What is the commission rate?");
      
      //Calculations and Conversions
      numOfShares = Double.parseDouble(fillerNumShares);
      pricePShare = Double.parseDouble(fillerPricePShare);
      sellingPrice = Double.parseDouble(fillerSellingPrice);
      commRate = Double.parseDouble(fillerSellingPrice);
      
      realCommRate = commRate * 0.01;
      totalShares = numOfShares * pricePShare;
      commition1 = totalShares * realCommRate;
      totalSelling = numOfShares * sellingPrice;
      commition2 = totalSelling * realCommRate;
      totalBuy = totalShares + commition1;
      totalSell = totalSelling + commition2;
      profitLoss = totalSell - totalBuy;
      
      JOptionPane.showMessageDialog(null, "Purchase: \n\n   Stock: " +
                                     totalShares + "\n   Commition: " +
                                     commition1 + "\n   Total: " + totalBuy + 
                                     "Sale: \n\n   Stock: " + totalSelling + 
                                     "\n   Commition: " + commition2 + "\n   Total: "
                                     + totalSell + "\n\n  Profit/Loss: " + profitLoss);
                                     
      System.exit(0);                               
   
   }

}