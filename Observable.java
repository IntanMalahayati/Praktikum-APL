// interface untuk menggunakan pada  class Marvel
public interface Observable
{
    /**
     * method abstract yang akan diimplementasikan pada class object observer
     */
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notification(String s);
}
