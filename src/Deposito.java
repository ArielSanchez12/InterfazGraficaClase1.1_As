import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposito {
    public JPanel pantallaDeposito;
    public JTextField campoDeposito;
    public JButton menuButton;
    public JButton depositarButton;
    public Double saldoActual;


    public Deposito() {
        /*
        saldoActual = 0.0;
        Double calcDeposito = Double.parseDouble(campoDeposito.getText());
        saldoActual += calcDeposito;

         */

        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Menu");
                frame.setContentPane(new Opciones().menu);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(500, 300);
                frame.setPreferredSize(new Dimension(500, 300));
                frame.setLocationRelativeTo(null);
                frame.pack();
                frame.setVisible(true);
            }
        });
        depositarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Deposito exitoso");
            }
        });
    }
    public Double getSaldoActual() {
        return saldoActual;
    }
}

