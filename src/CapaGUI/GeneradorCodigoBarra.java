/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGUI;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import net.sourceforge.jbarcodebean.JBarcodeBean;
import net.sourceforge.jbarcodebean.model.Ean13;

/**
 *
 * @author Kyle
 */
public class GeneradorCodigoBarra {

    private int idProducto;
    private String codigoBarra;

    public GeneradorCodigoBarra(int idProducto, String codigoBarra) {
        //TestBarCode tb = new TestBarCode();

        JBarcodeBean barcode = new JBarcodeBean();

        // nuestro tipo de codigo de barra
        barcode.setCodeType(new Ean13());
        //barcode.setCodeType(new Code39());

        // nuestro valor a codificar y algunas configuraciones mas
        barcode.setCode(codigoBarra);
        barcode.setCheckDigit(true);

        BufferedImage bufferedImage = barcode.draw(new BufferedImage(100, 50, BufferedImage.TYPE_INT_RGB));

        // guardar en disco como png
        File file = new File("barcode_images//codebar_"+idProducto+".png");
        try {
            ImageIO.write(bufferedImage, "png", file);
        } catch (IOException ex) {
            Logger.getLogger(GeneradorCodigoBarra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
