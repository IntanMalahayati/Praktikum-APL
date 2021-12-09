//import agar bisa menggunakan arraylist
import java.util.*;

public class Marvel implements Observable
{
    // arraylist yang akan digunakan untuk menampung user
    private ArrayList<Observer> cust = new ArrayList<>();

    /**
     * override method from interface Observable
     */
    @Override
    public void addObserver(Observer observer) {
        cust.add(observer);
    }

     @Override
    public void removeObserver(Observer observer) {
        cust.remove(observer);
    }

    @Override
    public void notification(String s) {
        for (Observer c : cust) {
            c.update(s);
        }
    }
}
