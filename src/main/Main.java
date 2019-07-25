package main;
import javax.swing.*;
import enumerados.Constantes;
import enumerados.Valores;

public class Main {
    public  static  void main(String[] args){
        String valor = JOptionPane.showInputDialog(null,"Ingresa el valor del Dolar");
        int val = Integer.parseInt(valor);
        if(val < Valores.DOLAR.getValor()){
            JOptionPane.showMessageDialog(null, Valores.DOLAR.getValor(),Constantes.MENSAJE_DOLAR_BAJO.getMensaje(),
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, Valores.DOLAR.getValor(), Constantes.MENSAJE_DOLAR_ALTO.getMensaje(),
                    JOptionPane.INFORMATION_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, Constantes.MENSAJE_CUADRO.getMensaje(),
                Constantes.MENSAJE_TITLE.getMensaje(),JOptionPane.QUESTION_MESSAGE);



}
}
