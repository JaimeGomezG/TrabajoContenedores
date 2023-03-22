import javax.swing.*;

public class P21 extends JFrame{
    private JPanel P2;
    private JTextField textField1;
    private JTextField textField3;
    private JTextField textField4;
    private JTextArea descripcionDelContenidoTextArea;
    private JTextField textField5;
    private JRadioButton a1RadioButton;
    private JRadioButton a2RadioButton;
    private JRadioButton a3RadioButton;
    private JTextField textField2;
    private JCheckBox inspeccionadoEnAduanasCheckBox;

    public P21 (){
        setContentPane(P2);
        setTitle("Gestión de contenedores\n");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new P21();
    }
}

