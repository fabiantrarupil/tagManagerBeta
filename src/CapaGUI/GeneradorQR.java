/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGUI;

/**
 *
 * @author Kyle
 */
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeReader;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author Kyle
 */
public class GeneradorQR {

    private int idProducto;
    private String cadena;

    public GeneradorQR(String cadena, int idProducto) {
        //this.cadena=cadena;

        TestQRCode qr = new TestQRCode();
        //donde se guarda el archivo
        //File f = new File("C://Users//Kyle//Documents//NetBeansProjects//Tag Manager//dist//QRImages"+idProducto+".jpg");

        File f = new File("qr_images//qr_" + idProducto + ".png");

        String text = cadena;

        try {

            //tamaño en pixeles
            qr.generateQR(f, text, 200, 200);

            System.out.println("QRCode Generated: " + f.getAbsolutePath());
            // QRCode Generado: c:\qrCode.png

            String qrString = qr.decoder(f);

            System.out.println("Text QRCode: " + qrString);
            // Text QRCode: dsfd
            //return true;
        } catch (Exception e) {
            System.out.println(e+" error");
            return;
        }
    }

    public File generateQR(File file, String text, int h, int w) throws Exception {

        Charset charset = Charset.forName("ISO-8859-1");
        CharsetEncoder encoder = charset.newEncoder();
        byte[] b = null;
        ByteBuffer bbuf = encoder.encode(CharBuffer.wrap(text));
        b = bbuf.array();
        String data = new String(b, "ISO-8859-1");
        // get a byte matrix for the data
        BitMatrix matrix = null;
        QRCodeWriter writer = new QRCodeWriter();
        matrix = writer.encode(data, com.google.zxing.BarcodeFormat.QR_CODE, w, h);
        // matrix = generateVCardQRCode(null, "H");
        MatrixToImageWriter.writeToFile(matrix, "PNG", file);
        return file;

    }

    public String decoder(File file) throws Exception {

        FileInputStream inputStream = new FileInputStream(file);

        BufferedImage image = ImageIO.read(inputStream);

        // convert the image to a binary bitmap source
        LuminanceSource source = new BufferedImageLuminanceSource(image);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

        // decode the barcode
        QRCodeReader reader = new QRCodeReader();

        Result result = reader.decode(bitmap);

        return new String(result.getText().getBytes("UTF8"));

    }
}
