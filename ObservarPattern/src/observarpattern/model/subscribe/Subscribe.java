/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observarpattern.model.subscribe;

import java.util.ArrayList;
import java.util.List;
import observarpattern.model.User;

/**
 *
 * @author Test
 */
public class Subscribe {
    
    protected List<?> subsriberList = new ArrayList<>();
    
    public void notifyProductDetail(String changedAttribute, String attributeBeforeChange, String changedAttributeDetail) {
        this.subsriberList.forEach(subscribe -> {
            System.out.println("----- Subscribe User ------");
            System.out.println(subscribe.toString());
            System.out.println("Attribute That had Been change : " + changedAttribute);
            System.out.println(changedAttribute + "Before Change : " + attributeBeforeChange + " | " + changedAttribute + " After change : " + changedAttributeDetail);
            this.toString();
            System.out.println();
        });
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
    
}
