/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.Role;
import Business.Role.TransplantCenterRole;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class LabTechnicianOrganization extends Organization{

    public LabTechnicianOrganization() {
        super(Organization.Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TransplantCenterRole());
        return roles;
    }
     
   
    
    
}
