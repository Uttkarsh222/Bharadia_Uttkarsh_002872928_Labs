/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import javax.swing.ImageIcon;

/**
 *
 * @author Rushabh
 */
public class Supplier {
    
     private String supplyName;
    private ProductCatalog productCatalog;
    private ImageIcon logoImage;

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }

    public Supplier() {
        productCatalog = new ProductCatalog();
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void updateSupplier(String newSupplyName, ImageIcon newLogoImage) {
        if (newSupplyName != null) {
            this.supplyName = newSupplyName;
        }
        if (newLogoImage != null) {
            this.logoImage = newLogoImage;
        }
    }

    @Override
    public String toString() {
        return supplyName;
    }

    public void setDescription(String newDescription) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
