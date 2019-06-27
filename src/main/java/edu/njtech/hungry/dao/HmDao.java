package edu.njtech.hungry.dao;

import edu.njtech.hungry.model.Horseman;
import edu.njtech.hungry.model.Order;
import edu.njtech.hungry.model.Recipients;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface HmDao {
    public void insertHm(Horseman horseman);
    public void deleteHm(Horseman horseman);
    public void updateHm(Horseman horseman);
    public void selectHm(Horseman horseman);

    Horseman findByUsername(String hmname);

    List<Map> findRecipientsByCid();


    void registerByUsernameAndPassword(@Param("hmname")String hmname,
                                       @Param("hmpassword")String hmpassword,
                                       @Param("hmidcard")String hmidcard,
                                       @Param("hmphone")String hmphone);
}
