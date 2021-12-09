
/**
 * Write a description of class Main here.
 *
 * @author (Intan Malahayati)
 * @NIM (1908107010034)
 */
public class Main {
    public static void main (String[] args) {
         
        //create a new Marvel object dengan Observable
        Observable company = new Marvel(); 
        
        //membuat 3 customer dengan observer observer
        Observer c1 = new Customer("Muns");
        Observer c2 = new Customer("Lins");
        Observer c3 = new Customer("Tans");

        //adding new Observer untuk objek company
        company.addObserver(c1);
        company.addObserver(c2);
        company.addObserver(c3);

        //calling method notification from subject
        company.notification(" has been published."); 
    }
}