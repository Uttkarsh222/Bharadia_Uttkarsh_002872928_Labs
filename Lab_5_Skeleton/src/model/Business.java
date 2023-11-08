/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author uttkarsh
 */
public class Business {
    
    MasterOrderlist masterOrderList;
    SupplierDirectory supplierDirectory;


    public Business() {

        masterOrderList = new MasterOrderlist();
        supplierDirectory = new SupplierDirectory();

        }

    public MasterOrderlist getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(MasterOrderlist masterOrderList) {
        this.masterOrderList = masterOrderList;
    }

   

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

   public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }
    
    
}
