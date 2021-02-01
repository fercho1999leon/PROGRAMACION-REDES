/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FERNANDO
 */
// Fig. 24.3: LeerArchivoServidor.java
// Uso de un objeto JEditorPane para mostrar el contenido de un archivo en un servidor Web.
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class LeerArchivoServidor extends JFrame {

    private JTextField campoIntroducir; // objeto JTextField para escribir el nombre del sitio
    private JEditorPane areaContenido; // para mostrar un sitio Web

    // establece la GUI
    public LeerArchivoServidor() {
        super("Navegador Web simple");

        // crea campoIntroducir y registra su componente de escucha
        campoIntroducir = new JTextField("Escriba el URL del archivo");
        campoIntroducir.addActionListener(
                new ActionListener() {
            // obtiene el documento especificado por el usuario
            public void actionPerformed(ActionEvent evento) {
                obtenerLaPagina(evento.getActionCommand());
            } // fin del método actionPerformed
        } // fin de la clase interna
        ); // fin de la llamada a addActionListener
        add(campoIntroducir, BorderLayout.NORTH);
        areaContenido = new JEditorPane(); // crea areaContenido
        areaContenido.setEditable(false);
        areaContenido.addHyperlinkListener(
                new HyperlinkListener() {
// si el usuario hizo clic en un hipervínculo, va a la página especificada
            public void hyperlinkUpdate(HyperlinkEvent evento) {
                if (evento.getEventType()
                        == HyperlinkEvent.EventType.ACTIVATED) {
                    obtenerLaPagina(evento.getURL().toString());
                }
            } // fin del método hyperlinkUpdate
        } // fin de la clase interna anónima
        ); // fin de la llamada a addHyperlinkListener
        add(new JScrollPane(areaContenido), BorderLayout.CENTER);
        setSize(400, 300); // establece el tamaño de la ventana
        setVisible(true); // muestra la ventana
    } // fin del constructor de LeerArchivoServidor
// carga el documento

    private void obtenerLaPagina(String ubicacion) {
        try // carga el documento y muestra la ubicación
        {
            areaContenido.setPage(ubicacion); // establece la página
            campoIntroducir.setText(ubicacion); // establece el texto
        } // fin de try
        catch (IOException excepcionES) {
            JOptionPane.showMessageDialog(this,
                    "Error al obtener el URL especificado", "URL incorrecto",
                    JOptionPane.ERROR_MESSAGE);
        } // fin de catch
    } // fin del método obtenerLaPagina
} // fin de la clase LeerArchivoServidor 
