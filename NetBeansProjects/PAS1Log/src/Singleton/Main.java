/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Singleton;

/**
 *
 * @author diegotxr
 */
public class Main {

    public static void main(String[] args) {
        Log l = Log.getInstance();
		l.gravar("pas1");
                l.mostrarMensagens();
                l.limpar();

    }
}
