/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import java.util.ArrayList;

/**
 *
 * @author Aissw
 */
public class OrganRequestList {

    private ArrayList<OrganRequest> organRequestList;

    public OrganRequestList() {
        organRequestList = new ArrayList<OrganRequest>();
    }

    public ArrayList<OrganRequest> getOrganRequestList() {
        return organRequestList;
    }

    public void setOrganRequestList(ArrayList<OrganRequest> organRequestList) {
        this.organRequestList = organRequestList;
    }

    public OrganRequest addPrescription() {
        OrganRequest organRequest = new OrganRequest();
        organRequestList.add(organRequest);
        return organRequest;

    }

}
