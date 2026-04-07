import javax.swing.*;
import java.awt.event.*;

public class Ventana {

    public static void main(String[] args) {

        // Crear ventana
        JFrame frame = new JFrame("Mi primera ventana");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Crear botón
        JButton boton = new JButton("Haz clic");
        boton.setBounds(130, 100, 120, 40);

        // Crear etiqueta
        JLabel etiqueta = new JLabel("Texto inicial");
        etiqueta.setBounds(140, 50, 200, 30);

        // Evento del botón
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText("¡Botón pulsado!");
            }
        });

        // Añadir componentes
        frame.add(boton);
        frame.add(etiqueta);

        // Mostrar ventana
        frame.setVisible(true);
    }
}
