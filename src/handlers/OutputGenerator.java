
package handlers;


public class OutputGenerator {
    
    public void purchApproved(Approver app, int id, double cost){
        System.out.println(app.getClass().getSimpleName()+" approved purchase with id " + id + " that costs " + cost);
    }
    
    public void purchGoHigher(Approver app, int id, double cost){
        System.out.println("Purchase with id " + id + " needs approval from higher position than " + app.getClass().getSimpleName() + ".");
    }
}
