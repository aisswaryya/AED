/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Aissw
 */
public class TransplantCenterEnterprise extends Enterprise{
    public TransplantCenterEnterprise(String name){
        super(name,Enterprise.EnterpriseType.TransplantCenter);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
