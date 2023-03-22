import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P2 extends JFrame{
    private JPanel panel1;
    private JRadioButton a1RadioButton;
    private JCheckBox inspeccionadoEnAduanasCheckBox;
    private JComboBox comboBox1;
    private JRadioButton a2RadioButton;
    private JRadioButton a3RadioButton;
    private JTextArea estadoTextArea;
    private JButton apilarButton;
    private JTextField textField4;
    private JTextField textField5;
    private JButton desapilarButton;
    private JTextField numeroDeColumnaTextField;
    private JTextField textField1;
    private JTextField textField3;
    private JButton mostrarDatosContenedorButton;
    private JButton cuantosButton;
    private JTextField IDContenedorTextField;
    private JComboBox comboBox2;
    private JTextArea descripcionDelContenidoTextArea;

    public P2(){
        setContentPane(panel1);
        setTitle("Gestión de contenedores\n");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        mostrarDatosContenedorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new P21().setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        new P2();
    }
}
