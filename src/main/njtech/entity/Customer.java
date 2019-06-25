package entity;

public class Customer {
    private Integer cid;
    private String cname;
    private String cpassword;
    private String cphone;

    public Customer(){

    }

    public Customer(Integer cid, String cname, String cpassword, String cphone) {
        this.cid = cid;
        this.cname = cname;
        this.cpassword = cpassword;
        this.cphone = cphone;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone;
    }
}
