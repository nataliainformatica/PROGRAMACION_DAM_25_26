import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VariosBotones extends JFrame implements ActionListener {

    // Componentes
    JButton btnInicio, btnPerfil, btnConfig;
    JLabel lblTexto;

    public MenuBasico() {

        // Configuración ventana
        setTitle("Menú básico");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ======================
        // PANEL DE BOTONES
        // ======================
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(3, 1));

        btnInicio = new JButton("Inicio");
        btnPerfil = new JButton("Perfil");
        btnConfig = new JButton("Configuración");

        // Asociar eventos
        btnInicio.addActionListener(this);
        btnPerfil.addActionListener(this);
        btnConfig.addActionListener(this);

        panelBotones.add(btnInicio);
        panelBotones.add(btnPerfil);
        panelBotones.add(btnConfig);

        // ======================
        // PANEL CENTRAL
        // ======================
        JPanel panelCentro = new JPanel();
        lblTexto = new JLabel("Selecciona una opción");
        panelCentro.add(lblTexto);

        // ======================
        // AÑADIR A LA VENTANA
        // ======================
        add(panelBotones, BorderLayout.WEST);
        add(panelCentro, BorderLayout.CENTER);
    }

    // ======================
    // MANEJO DE EVENTOS
    // ======================
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnInicio) {
            lblTexto.setText("Has pulsado INICIO");
        }

        if (e.getSource() == btnPerfil) {
            lblTexto.setText("Has pulsado PERFIL");
        }

        if (e.getSource() == btnConfig) {
            lblTexto.setText("Has pulsado CONFIGURACIÓN");
        }
    }

    // ======================
    // MAIN
    // ======================
    public static void main(String[] args) {
        MenuBasico ventana = new MenuBasico();
        ventana.setVisible(true);
    }
}
