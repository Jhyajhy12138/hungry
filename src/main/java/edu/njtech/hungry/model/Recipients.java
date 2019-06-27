package edu.njtech.hungry.model;

public class Recipients {
    private Integer cid;
    private Integer gid;
    private String gname;
    private String glocation;
    private String gphone;

    public void Recipients(){}

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGlocation() {
        return glocation;
    }

    public void setGlocation(String glocation) {
        this.glocation = glocation;
    }

    public String getGphone() {
        return gphone;
    }

    public void setGphone(String gphone) {
        this.gphone = gphone;
    }

    @Override
    public String toString() {
        return "Recipients{" +
                "gname='" + gname + '\'' +
                ", glocation='" + glocation + '\'' +
                ", gphone='" + gphone + '\'' +
                '}';
    }
}
