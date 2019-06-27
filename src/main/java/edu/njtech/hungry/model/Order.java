package edu.njtech.hungry.model;

public class Order {
    private Integer oid;
    private Integer cid;
    private Integer rid;
    private Integer fnum;
    private Integer ostate;
    private Double sumprice;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getFnum() {
        return fnum;
    }

    public void setFnum(Integer fnum) {
        this.fnum = fnum;
    }

    public Order(){}

    public Order(Integer oid, Integer ostate, Double sumprice) {
        this.oid = oid;
        this.ostate = ostate;
        this.sumprice = sumprice;
    }

    public Order(Integer oid, Integer ostate) {
        this.oid = oid;
        this.ostate = ostate;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getOstate() {
        return ostate;
    }

    public void setOstate(Integer ostate) {
        this.ostate = ostate;
    }

    public Double getSumprice() {
        return sumprice;
    }

    public void setSumprice(Double sumprice) {
        this.sumprice = sumprice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                '}';
    }
}
