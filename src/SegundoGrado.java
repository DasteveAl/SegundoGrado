import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SegundoGrado extends JDialog{
    private JPanel Main;
    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtC;
    private JButton calcularButton;
    private JButton borrarButton;
    private JButton salirButton;

    public SegundoGrado(JFrame parent) {
        super(parent);
        setTitle("Triangulo Equilatero");
        setContentPane(Main);
        setMinimumSize(new Dimension(450, 300));
        setModal(true);
        setLocationRelativeTo(parent);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Soluciones slns = new Soluciones();

                double a = Double.parseDouble(txtA.getText());
                slns.setA(a);
                double b = Double.parseDouble(txtB.getText());
                slns.setB(b);
                double c = Double.parseDouble(txtC.getText());
                slns.setC(c);
                String msg = slns.getResult();

                JOptionPane.showMessageDialog(null, msg);
            }
        });

        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtA.setText("");
                txtB.setText("");
                txtC.setText("");
            }
        });

        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }
    public static void main(String args[]) {
        SegundoGrado form = new SegundoGrado(null);
    }
}
