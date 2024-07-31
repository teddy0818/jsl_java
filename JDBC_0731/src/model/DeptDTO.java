package model;

public class DeptDTO {
	private int deptId;        // 부서 ID
    private String deptName;   // 부서명
    private String location;   // 부서 위치

    // Getter 및 Setter 메서드

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
