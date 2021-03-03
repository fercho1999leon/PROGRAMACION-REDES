/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementos;

/**
 *
 * @author FERNANDO
 */
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;

public class RunJavaAndPython implements Runnable {

    private int port;
    private boolean bandera;
    private DataOutputStream out;
    private Socket request;
    private ServerSocket my_server;
    private String name;
    private String itens;

    public RunJavaAndPython(int port, String name, String itens) {
        this.port = port;
        bandera = true;
        this.name=name;
        this.itens=itens;
    }

    @Override
    public void run() {
        try {
            my_server = new ServerSocket(port);
            while (true) {
                try {
                    request = my_server.accept();
                    out = new DataOutputStream(request.getOutputStream());
                    out.write(name.getBytes());
                    out.write(itens.getBytes());
                    if (!bandera) {
                        break;
                    }

                    if (request.isConnected()) {
                        break;
                    }
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    System.out.println(e.getMessage());
                    break;
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }

    }
}
