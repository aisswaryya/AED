/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.TransplantCenter.Organ;
import java.util.Date;

/**
 *
 * @author Aissw
 */
public class OrganRequest {
    
    private int patientID;
    private String urgencyStatus;
    private String diagnosis;
    private Organ organ;
    private Date requestDate;
    private String networkName;
    private int doctorID;

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }
    

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getUrgencyStatus() {
        return urgencyStatus;
    }

    public void setUrgencyStatus(String urgencyStatus) {
        this.urgencyStatus = urgencyStatus;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    
    
}
