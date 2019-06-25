package entity;

public class Menu {
    private Integer fid;
    private String fname;
    private Double fprice;

    public Menu(){}

    public Menu(Integer fid, String fname, Double fprice) {
        this.fid = fid;
        this.fname = fname;
        this.fprice = fprice;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Double getFprice() {
        return fprice;
    }

    public void setFprice(Double fprice) {
        this.fprice = fprice;
    }
}
