package entity;

public class Order {
    private Integer oid;
    private Integer ostate;
    private Double sumprice;

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
}
