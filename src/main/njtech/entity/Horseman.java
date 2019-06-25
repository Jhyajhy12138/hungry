package entity;

public class Horseman {
    private Integer hmid;
    private String hmname;
    private String hmpassword;
    private String hmidcard;
    private Integer hmstate;
    private String hmphone;

    public Horseman(){}

    public Horseman(Integer hmid, String hmname, String hmpassword, String hmidcard, Integer hmstate, String hmphone) {
        this.hmid = hmid;
        this.hmname = hmname;
        this.hmpassword = hmpassword;
        this.hmidcard = hmidcard;
        this.hmstate = hmstate;
        this.hmphone = hmphone;
    }

    public Horseman(Integer hmid, String hmname, String hmpassword, String hmidcard, Integer hmstate) {
        this.hmid = hmid;
        this.hmname = hmname;
        this.hmpassword = hmpassword;
        this.hmidcard = hmidcard;
        this.hmstate = hmstate;
    }

    public Integer getHmid() {
        return hmid;
    }

    public void setHmid(Integer hmid) {
        this.hmid = hmid;
    }

    public String getHmname() {
        return hmname;
    }

    public void setHmname(String hmname) {
        this.hmname = hmname;
    }

    public String getHmpassword() {
        return hmpassword;
    }

    public void setHmpassword(String hmpassword) {
        this.hmpassword = hmpassword;
    }

    public String getHmidcard() {
        return hmidcard;
    }

    public void setHmidcard(String hmidcard) {
        this.hmidcard = hmidcard;
    }

    public Integer getHmstate() {
        return hmstate;
    }

    public void setHmstate(Integer hmstate) {
        this.hmstate = hmstate;
    }

    public String getHmphone() {
        return hmphone;
    }

    public void setHmphone(String hmphone) {
        this.hmphone = hmphone;
    }
}
