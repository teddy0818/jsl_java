package model;

public class ScoreDTO {
	private String syear;   // 학년
    private String sclass;  // 반
    private String sno;     // 번호
    private int kor;        // 국어 점수
    private int eng;        // 영어 점수
    private int mat;        // 수학 점수

    // Getter 및 Setter 메서드

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

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }
    
    public double getAverage() {
        return Math.round(((kor + eng + mat) / 3.0) * 10) / 10.0;
    }
}
