import java.util.ArrayList;

public class penView {
    public void printPenDetails(String ItemId, String Brand, String color, int Price, int NO_OF_PEN){
       System.out.println("penDetails: ");
       System.out.println("ItemId: " + ItemId);
       System.out.println("Brand: " + Brand);
       System.out.println("color: " + color);
       System.out.println("Price: " + Price);
       System.out.println("NO_OF_PEN: " + NO_OF_PEN);
    }
    public void printallDetails(ArrayList<pen> a1)
    {
      System.out.println("ItemId"+ " "+"Brand"+" "+"color"+" "+"Price"+" "+"No of pen");
     for(int i=0;a1.size()>i;i++)
      System.out.println(a1.get(i).itemId+" "+a1.get(i).brand+" "+a1.get(i).color+" "+a1.get(i).price+a1.get(i).no_of_pen);
    }
 }
