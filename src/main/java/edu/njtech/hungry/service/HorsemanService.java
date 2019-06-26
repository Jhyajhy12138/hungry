package edu.njtech.hungry.service;

import edu.njtech.hungry.model.Horseman;

public interface HorsemanService {
    //检验用户登录
    Horseman checkLogin(String hmname, String hmpassword);
    void Regist(Horseman horseman);
}
