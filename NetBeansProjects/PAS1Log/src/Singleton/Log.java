/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author diegotxr
 */

public class Log {

    private String mensagem = "";
    private ArrayList<String> msgs = new ArrayList<String>();
    private static Log log;

    private Log() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Teste.txt"));
            while (reader.ready()) {
                msgs.add(reader.readLine());
            }
            reader.close();
        } catch (Exception e) {
        }
    }

    public static Log getInstance() {
        if (log == null) {
            log = new Log();
        }
        return log;
    }

    public void gravar(String msg) {
        try {
            msgs.add(msg);
            FileWriter writer = new FileWriter("Teste.txt");
            String str = " ";
            for (String s : msgs) {
                str += s + "\n";
            }
            writer.write(str);
            writer.close();
        } catch (Exception e) {
            System.out.println("fail.");
        }
    }

    public String mostrarMensagens() {
        String resul ="";
        for (String s : msgs) {
            System.out.println(s);
            resul+=s+ "\n";
        }
        return resul;

    }

    public void limpar() {
        this.msgs.clear();
    }



}
