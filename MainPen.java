import java.util.ArrayList;
import java.util.Scanner;

public class MainPen {
   // 
    public static void main(String[] args) {

       //fetch pen record based on his roll no from the database
       ArrayList<pen> a1 = new ArrayList<pen>(18);
       pen model  = retrivepenFromDatabase();
       a1.add(model);
       a1.add(retrivepenFromDatabase1());
       a1.add(retrivepenFromDatabase3());
       a1.add(retrivepenFromDatabase4());
       //Create a view : to write pen details on console
       penView view = new penView();
       penController controller = new penController(model,view,a1);
       controller.updateView();
       controller.viewallDetail();
       //update model data
       //controller.seteItemId("1234");
       //System.out.println("**************MAIN****************");
      // Scanner sc = new Scanner();
    //   String choice = sc.next();

      // controller.updateView();
    }
    private static pen retrivepenFromDatabase(){
       pen pen1 = new pen();
       pen1.setItemId("1235");
       pen1.setBrand("reynolds");
       pen1.setcolor("blue");
       pen1.setPrice(10);
       pen1.setNo_of_pen(110);
       return pen1;
    }
    private static pen retrivepenFromDatabase1(){
      pen pen1 = new pen();
      pen1.setItemId("1235");
      pen1.setBrand("reynolds");
      pen1.setcolor("blue");
      pen1.setPrice(10);
      pen1.setNo_of_pen(110);
      return pen1;
   }
   private static pen retrivepenFromDatabase2(){
      pen pen1 = new pen();
      pen1.setItemId("1235");
      pen1.setBrand("reynolds");
      pen1.setcolor("blue");
      pen1.setPrice(10);
      pen1.setNo_of_pen(110);
      return pen1;
   }
   private static pen retrivepenFromDatabase3(){
      pen pen1 = new pen();
      pen1.setItemId("1235");
      pen1.setBrand("reynolds");
      pen1.setcolor("blue");
      pen1.setPrice(10);
      pen1.setNo_of_pen(110);
      return pen1;
   }
   private static pen retrivepenFromDatabase4(){
      pen pen1 = new pen();
      pen1.setItemId("1235");
      pen1.setBrand("reynolds");
      pen1.setcolor("blue");
      pen1.setPrice(10);
      pen1.setNo_of_pen(110);
      return pen1;
   }
 }