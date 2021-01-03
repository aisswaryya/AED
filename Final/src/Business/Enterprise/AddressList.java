/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Aissw
 */
public class AddressList {
    private ArrayList<Address> addressList;
    ArrayList<Address> searchresult;

    public ArrayList<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(ArrayList<Address> addressList) {
        this.addressList = addressList;
    }

    public ArrayList<Address> getSearchresult() {
        return searchresult;
    }

    public void setSearchresult(ArrayList<Address> searchresult) {
        this.searchresult = searchresult;
    }
    
    public Address AddAddress (){
        Address a=new Address();
        addressList.add(a);
        return a;
    }
    
    
    public ArrayList<Address> searchAddress(String zip){
         searchresult=new ArrayList<>();
        for(Address a : addressList){
            if (a.getZipcode()==zip){
                searchresult.add(a);
                return searchresult;
            }
            
        }
        return null;
    }
}
