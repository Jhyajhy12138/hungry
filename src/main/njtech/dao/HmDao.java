package dao;

import entity.Horseman;

public interface HmDao {
    public void insertHm(Horseman horseman);
    public void deleteHm(Horseman horseman);
    public void updataHm(Horseman horseman);
    public void selectHm(Horseman horseman);
}
