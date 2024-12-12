import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saldo extends Deposito{
    public JButton menuButton;
    public JLabel lblSaldo;
    public JPanel pantallaSaldo;

    public Saldo() {

        /*
        Deposito deposito = new Deposito();
        lblSaldo.setText(String.valueOf(deposito.getSaldoActual()));

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
    }
}
