package softecon.javaswing.test.vo;

import java.io.Serializable;

/*
 * @author tkol
 */
public class VO_Employee implements Serializable{

    private int _empId;
    private String _empName;
    private String _empSurname;
    private VO_Job _empJob;

    //constructor
    public VO_Employee(int _empId, String _empName, String _empSurname, VO_Job _empJob) {
        this._empId = _empId;
        this._empName = _empName;
        this._empSurname = _empSurname;
        this._empJob = _empJob;
    }

    //getters and setters
    public int getEmpId() {
        return _empId;
    }

    public void setEmpId(int _empId) {
        this._empId = _empId;
    }

    public String getEmpName() {
        return _empName;
    }

    public void setEmpName(String _empName) {
        this._empName = _empName;
    }

    public String getEmpSurname() {
        return _empSurname;
    }

    public void setEmpSurname(String _empSurname) {
        this._empSurname = _empSurname;
    }

    public VO_Job getEmpJob() {
        return _empJob;
    }

    public void setEmpJob(VO_Job _empJob) {
        this._empJob = _empJob;
    }

   
    
    
}
