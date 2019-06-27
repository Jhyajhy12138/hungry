package edu.njtech.hungry.service.Impl;

import edu.njtech.hungry.model.Order;
import edu.njtech.hungry.model.Recipients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.njtech.hungry.dao.HmDao;
import edu.njtech.hungry.model.Horseman;
import edu.njtech.hungry.service.HorsemanService;

import java.util.List;
import java.util.Map;

@Service
public class HorsemanServiceImpl implements HorsemanService{

    @Autowired
    private HmDao hmdao;

    /*
     * 检验用户登录业务
     *
     */

    public Horseman checkLogin(String hmname, String hmpassword) {

        Horseman horseman = hmdao.findByUsername(hmname);
        if(horseman != null && horseman.getHmpassword().equals(hmpassword)){

            return horseman;
        }
        return null;
    }

    public List<Map> findRecipientsByCid(){
        return hmdao.findRecipientsByCid();
    }



    @Override
    public void Regist(Horseman horseman) {

        hmdao.registerByUsernameAndPassword(horseman.getHmname(),horseman.getHmpassword(),horseman.getHmidcard(),horseman.getHmphone());

    }
}