/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGUI;

import java.awt.Component;
 
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Kyle
 */

public class JOptionPaneConTimeOut {
     private static JOptionPane option = new JOptionPane("",
            JOptionPane.INFORMATION_MESSAGE);
 
    private static JDialog dialogo = null;
 
    /**
     * Solo hace caso a padre la primera vez que se llama a este método. La
     * llamada a este metodo se queda bloqueada hasta que el usuario cierra el
     * JOptionPane o pasa el timeout.
     * 
     * @param padre
     * @param texto
     * @param titulo
     * @param timeout
     *            En mili segundos
     */
    public static void visualizaDialogo( Component padre, String texto,
            String titulo, final long timeout)
    {
        option.setMessage(texto);
        if ( null == dialogo )
        {
            dialogo = option.createDialog(padre, titulo);
        }
        else
        {
            dialogo = option.createDialog(padre, titulo);
        }
 
        Thread hilo = new Thread()
        {
            public void run()
            {
                try
                {
                    Thread.sleep(timeout);
                    if ( dialogo.isVisible() )
                    {
                        dialogo.setVisible(false);
                    }
                }
                catch ( InterruptedException e )
                {
                    e.printStackTrace();
                }
            }
        };
        hilo.start();
 
        dialogo.setVisible(true);
    }
}