import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUIWindow extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JTextField a0TextField2;
    private JTextField a0TextField1;
    private JTextField a0TextField;
    private JButton subtractTipButton;
    private JButton addTipButton;
    private JButton subtractPeopleButton;
    private JButton addPeopleButton;
    private JTextArea textArea1;
    private JTextArea textArea2;

    public MainGUIWindow() {
        createUIComponents();
    }

    private void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("Tip Calculator GUI");
        setSize(900, 600);
        setLocation(500,50);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        subtractTipButton.addActionListener(this);
        addTipButton.addActionListener(this);
        subtractPeopleButton.addActionListener(this);
        addPeopleButton.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
