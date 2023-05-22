import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainGUIWindow extends JFrame implements ActionListener, KeyListener {
    private JPanel mainPanel;
    private JTextField numPeopTextField;
    private JButton addNumPeopButton;
    private JButton subtractNumButton;
    private JTextField tipTextField;
    private JTextField billTextField;
    private JTextArea textAreaTip;
    private JTextArea textAreaTotal;
    private JButton subtractTipButton;
    private JButton addTipButton;
    private JButton saveLikeSethButton;
    private int tipPercent;
    private int numPeople;
    private double bill;


    public MainGUIWindow() {
        createUIComponents();
        tipPercent = 1;
        numPeople = 1;
        bill = 1;
    }

    private void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("Tip Calculator GUI");
        setSize(500, 250);
        setLocation(500,50);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        subtractTipButton.addActionListener(this);
        addTipButton.addActionListener(this);
        addNumPeopButton.addActionListener(this);
        subtractNumButton.addActionListener(this);
        tipTextField.addKeyListener(this);
        billTextField.addKeyListener(this);
        numPeopTextField.addKeyListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton button) {
            if (button.equals(addTipButton)) {
                tipPercent++;
            }
            if (button.equals(subtractTipButton)) {
                tipPercent--;
            }
            if (button.equals(addNumPeopButton)) {
                numPeople++;
            }
            if (button.equals(subtractNumButton)) {
                numPeople--;
            }
            if (button.equals(saveLikeSethButton)) {
                bill = Double.parseDouble(billTextField.getText());
            }

            textAreaTip.setText((int) (bill*tipPercent/numPeople)/100.0+"");
            textAreaTotal.setText("abc"+((bill*(1+tipPercent/100.0))/numPeople));

            tipTextField.setText(Integer.toString(tipPercent));
            numPeopTextField.setText(""+numPeople);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
