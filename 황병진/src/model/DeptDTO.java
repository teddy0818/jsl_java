package model;

public class DeptDTO {
	 private String syear;
	    private String sclass;
	    private String tname;
	    private int korTotal;
	    private int engTotal;
	    private int matTotal;
	    private double korAvg;
	    private double engAvg;
	    private double matAvg;

	    public String getSyear() {
	        return syear;
	    }

	    public void setSyear(String syear) {
	        this.syear = syear;
	    }

	    public String getSclass() {
	        return sclass;
	    }

	    public void setSclass(String sclass) {
	        this.sclass = sclass;
	    }

	    public String getTname() {
	        return tname;
	    }

	    public void setTname(String tname) {
	        this.tname = tname;
	    }

	    public int getKorTotal() {
	        return korTotal;
	    }

	    public void setKorTotal(int korTotal) {
	        this.korTotal = korTotal;
	    }

	    public int getEngTotal() {
	        return engTotal;
	    }

	    public void setEngTotal(int engTotal) {
	        this.engTotal = engTotal;
	    }

	    public int getMatTotal() {
	        return matTotal;
	    }

	    public void setMatTotal(int matTotal) {
	        this.matTotal = matTotal;
	    }

	    public double getKorAvg() {
	        return korAvg;
	    }

	    public void setKorAvg(double korAvg) {
	        this.korAvg = korAvg;
	    }

	    public double getEngAvg() {
	        return engAvg;
	    }

	    public void setEngAvg(double engAvg) {
	        this.engAvg = engAvg;
	    }

	    public double getMatAvg() {
	        return matAvg;
	    }

	    public void setMatAvg(double matAvg) {
	        this.matAvg = matAvg;
	    }
}
