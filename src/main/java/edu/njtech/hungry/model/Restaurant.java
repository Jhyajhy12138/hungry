package edu.njtech.hungry.model;

public class Restaurant {
    private Integer rid;
    private String rname;
    private String rpassword;
    private String ridcard;
    private String rnum;
    private String rphone;

    public void Restaurant(){}

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRpassword() {
        return rpassword;
    }

    public void setRpassword(String rpassword) {
        this.rpassword = rpassword;
    }

    public String getRidcard() {
        return ridcard;
    }

    public void setRidcard(String ridcard) {
        this.ridcard = ridcard;
    }

    public String getRnum() {
        return rnum;
    }

    public void setRnum(String rnum) {
        this.rnum = rnum;
    }

    public String getRphone() {
        return rphone;
    }

    public void setRphone(String rphone) {
        this.rphone = rphone;
    }
}
