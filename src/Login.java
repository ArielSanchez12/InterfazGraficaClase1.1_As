import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public JPanel login;
    private JTextField nickname;
    private JPasswordField password;
    private JButton validacion;
    private JLabel mensaje;
    private JLabel passw;
    private JLabel user;

    public Login() {
        validacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = nickname.getText();
                String contra = password.getText();

                if (usuario.isEmpty() || contra.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
                }else{
                    if (!usuario.equals("S") || !contra.equals("S1")) {
                        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta, intenta otra vez");
                    }else{
                        JFrame frame = new JFrame("Menu");
                        frame.setContentPane(new Opciones().menu);
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setSize(500, 300);
                        frame.setPreferredSize(new Dimension(500, 300));
                        frame.setLocationRelativeTo(null);
                        frame.pack();
                        frame.setVisible(true);
                    }
                }

            }
        });
    }
}
