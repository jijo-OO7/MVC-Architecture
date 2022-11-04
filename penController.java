import java.util.ArrayList;
 public class penController {
     pen model;
     penView view;
     ArrayList<pen> a1;
    public penController(pen model, penView view,ArrayList<pen> a1)
    {
       this.model = model;
       this.view = view;
       this.a1=a1;
    }
    // itemId
    public void seteItemId(String ItemId){
       model.setItemId(ItemId);
    }
    public String getItemId(){
       return model.getItemId();
    }

// brand
    public void seteBrand(String rollNo){
       model.setBrand(rollNo);
    }
    public String getBrand(){
       return model.getBrand();
    }
// model
    public void setecolor(String color){
        model.setcolor(color);
     }
     public String getecolor(){
        return model.getcolor();
     }
// price
     public void setePrice(int price){
        model.setPrice(price);
     }
     public int getePrice(){
        return model.getPrice();
     }
// noOfPen

public void seteNo_of_pen(int no_of_pen){
    model.setNo_of_pen(no_of_pen);
 }
 public int geteNo_of_pen(){
    return model.getNo_of_pen();
 }



    public void updateView(){
       view.printPenDetails(model.getItemId(), model.getBrand(), model.getcolor(), model.getPrice(), model.getNo_of_pen());
    }
    public void viewallDetail()
    {
      view.printallDetails(a1);
    }
 }