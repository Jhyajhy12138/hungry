package entity;

public class Recipients {
    private Integer gid;
    private String gname;
    private String glocation;
    private String gphone;

    public void Recipients(){}

    public Recipients(Integer gid, String gname, String glocation, String gphone) {
        this.gid = gid;
        this.gname = gname;
        this.glocation = glocation;
        this.gphone = gphone;
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
}
