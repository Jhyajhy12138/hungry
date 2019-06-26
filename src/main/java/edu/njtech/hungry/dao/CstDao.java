package edu.njtech.hungry.dao;

import edu.njtech.hungry.model.Customer;

public interface CstDao {
    public void insertCst(Customer customer);
    public void deleteCst(Customer customer);
    public void updateCst(Customer customer);
    public void selectCst(Customer customer);
}
