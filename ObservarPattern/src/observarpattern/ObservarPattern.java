/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observarpattern;

import observarpattern.model.Product;
import observarpattern.model.User;

/**
 *
 * @author Test
 */
public class ObservarPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product dellXps13 = new Product("Dell XPS 13 (2019)", "Core i7 ; RAM 16 GB; SSD 512 GB", 2590);
        Product sufacebook = new Product("Microsoft Surface Book 2", "Core i7 GEN 8 ; RAM 16 GB; GPU GTX 1050TI;SSD 512 GB", 3590);
        
        User linjingyun12 = new User("Linjingyun12", "wdrdres3qew5ts21@gmail.com");
        User bigzaja4 = new User("bigzaja4", "bigzaja4@gmail.com");
        User vidadevil = new User("vidadevil", "vidadevil31@gmail.com");
        
        dellXps13.addSubscriber(linjingyun12);
        dellXps13.addSubscriber(bigzaja4);
        dellXps13.setProductName("Dell XPS 13 (2019) - Rose Gold (Edited)");
        
        dellXps13.addSubscriber(vidadevil);
        
        dellXps13.showSubscribeList();
        
        dellXps13.setPrice(3412);
    }
    
}
