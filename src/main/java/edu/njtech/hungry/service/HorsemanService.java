package edu.njtech.hungry.service;

import edu.njtech.hungry.model.Horseman;
import edu.njtech.hungry.model.Order;
import edu.njtech.hungry.model.Recipients;

import java.util.List;
import java.util.Map;

import java.util.List;

public interface HorsemanService {
    //检验用户登录
    Horseman checkLogin(String hmname, String hmpassword);
    List<Map> findRecipientsByCid();
    void Regist(Horseman horseman);



}
