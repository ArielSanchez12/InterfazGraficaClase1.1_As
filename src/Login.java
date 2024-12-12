import javax.swing.*;
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
                if (!usuario.equals("SANCHEZ") || !contra.equals("SANCHEZ123")) {
                    mensaje.setText("Verifique que todos los datos sean correctos");
                }else{
                    mensaje.setText("Datos correctos, ingresando...");
                }
            }
        });
    }
}
