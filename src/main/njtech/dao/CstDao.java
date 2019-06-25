package dao;

import entity.Customer;

public interface CstDao {
    public void insertCst(Customer customer);
    public void deleteCst(Customer customer);
    public void updataCst(Customer customer);
    public void selectCst(Customer customer);
}
