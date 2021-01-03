/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TransplantCenter;

/**
 *
 * @author Aissw
 */
public class Organ {
    private String organName;
    private int    organSize;
    private String tissueType;
    private String bloodType;
    
    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public int getOrganSize() {
        return organSize;
    }

    public void setOrganSize(int organSize) {
        this.organSize = organSize;
    }

    public String getTissueType() {
        return tissueType;
    }

    public void setTissueType(String tissueType) {
        this.tissueType = tissueType;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
}
