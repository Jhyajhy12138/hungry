package dao;

import entity.Restaurant;

public interface RstDao {
    public void insertRst(Restaurant restaurant);
    public void deleteRst(Restaurant restaurant);
    public void updataRst(Restaurant restaurant);
    public void selectRst(Restaurant restaurant);
}
