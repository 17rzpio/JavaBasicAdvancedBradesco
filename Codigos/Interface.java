package pkginterface;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;
import java.io.File;
import javax.swing.JFileChooser;
public class Interface {
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Meu frame!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,900);
        frame.setLayout(null);
        JOptionPane.showMessageDialog(null,"Olá usuário!");
        JFileChooser fileChooser = new JFileChooser();
        int retorno = fileChooser.showOpenDialog(null);
        if(retorno == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            System.out.println(file.toString());
        }else{
            System.out.println("Nenhum arquivo foi selecionado");
        }
  JProgressBar progressBar = new JProgressBar(JProgressBar.HORIZONTAL,1,100);
        progressBar.setBounds(20,350,360,15);
        frame.add(progressBar);
 JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 50, 1, 0, 100);
        scrollBar.setBounds(20,320,360,15);
        frame.add(scrollBar);
        JTextArea textArea = new JTextArea();
        textArea.setBounds(20,220,360,120);
        frame.add(textArea);
        String[] itens2 = {"item 1", "item 2"};
        JComboBox comboBox = new JComboBox(itens2);
        comboBox.setBounds(20,190,360,40);
        frame.add(comboBox);
        String[] itens = {"item 1", "item 2"};
        JList list = new JList(itens);
        list.setBounds(20,160,360,40);
        frame.add(list);
        JRadioButton radioButton = new JRadioButton("radioButton");
        radioButton.setBounds(20,100,360,40);
        frame.add(radioButton);
        JCheckBox checkBox = new JCheckBox("checkBox");
        checkBox.setBounds(20,70,360,40);
        frame.add(checkBox);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem menuItem = new JMenuItem("Olá!");
        menu.add(menuItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        JButton button = new JButton("Botão");
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Botão foi acionado!");
            }
        });
        button.setBounds(20,40,360,40);
        frame.add(button);
        JPasswordField passwordTextField = new JPasswordField();
        passwordTextField.setBounds(20,1,360,40);
        frame.add(passwordTextField);
        JTextField textField = new JTextField();
        textField.setBounds(10,30,360,40);
        frame.add(textField);
        JLabel label = new JLabel("Hello World!",JLabel.CENTER);
        label.setBounds(20,130,360,40);
        frame.add(label);
        frame.setVisible(true);
    }}
