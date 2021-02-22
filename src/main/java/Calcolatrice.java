import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Calcolatrice extends JFrame implements ActionListener
{
    private Container c = new Container();
    private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel();
    private JPanel p3 = new JPanel();
    private JPanel p4 = new JPanel();
    private JTextField Risultato = new JTextField(15);
    private JButton btnRadice = new JButton("\u221A");
    private JButton btnx = new JButton("x\u00B2");
    private JButton btnx2 = new JButton("x^3");
    private JButton btnlog = new JButton("log");
    private JButton btnln = new JButton("ln");
    private JButton btnuno = new JButton("1");
    private JButton btndue = new JButton("2");
    private JButton btntre = new JButton("3");
    private JButton btnquattro = new JButton("4");
    private JButton btncinque = new JButton("5");
    private JButton btnsei = new JButton("6");
    private JButton btnsette = new JButton("7");
    private JButton btnotto = new JButton("8");
    private JButton btnnove = new JButton("9");
    private JButton btnzero = new JButton("0");
    private JButton btnvirgola = new JButton(".");
    private JButton btnpigreco = new JButton("\u03c0");
    private JButton btnmolt = new JButton("*");
    private JButton btndiviso = new JButton("/");
    private JButton btnsomma = new JButton("+");
    private JButton btnsottrazione = new JButton("-");
    private JButton btnuguale = new JButton("=");
    private JButton btnvuota = new JButton("");
    private JButton btndell = new JButton("Del");
    private JButton btnoff = new JButton("OFF");
    private JButton btnon = new JButton("ON");
    
    public Calcolatrice()
    {
        c = this.getContentPane();
        c.setLayout(new GridLayout(6,2,3,3));
        this.setTitle("Calcolatrice");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(300, 450);
        this.setResizable(false);
        
        Risultato.setSize(600, 600);
        p1.add(Risultato);
        p2.add(btnRadice);
        p2.add(btnx);
        p2.add(btnx2);
        p2.add(btnlog);
        p2.add(btnln);
        p2.add(btnuno);
        p2.add(btndue);
        p2.add(btntre);
        p2.add(btnquattro);
        p2.add(btncinque);
        p2.add(btnsei);
        p3.add(btnsette);
        p3.add(btnotto);
        p3.add(btnnove);
        p3.add(btnzero);
        p3.add(btnvirgola);
        p3.add(btnpigreco);     
        p4.add(btnmolt);
        p4.add(btndiviso);
        p4.add(btnsomma);
        p4.add(btnsottrazione);
        p4.add(btnuguale);
        p4.add(btndell);
        p4.add(btnoff);
        p4.add(btnon);
        
        c.add(p1);
        c.add(p2);
        c.add(p3);
        c.add(p4);
        
         btnRadice.setEnabled(false);
         btnx.setEnabled(false);
         btnx2.setEnabled(false);
         btnlog.setEnabled(false);
         btnln.setEnabled(false);
         btnuno.setEnabled(false);
         btndue.setEnabled(false);
         btntre.setEnabled(false);
         btnquattro.setEnabled(false);
         btncinque.setEnabled(false);
         btnsei.setEnabled(false);
         btnsette.setEnabled(false);
         btnotto.setEnabled(false);
         btnnove.setEnabled(false);
         btnzero.setEnabled(false);
         btnvirgola.setEnabled(false);
         btnpigreco.setEnabled(false);
         btnmolt.setEnabled(false);
         btndiviso.setEnabled(false);
         btnsomma.setEnabled(false);
         btnsottrazione.setEnabled(false);
         btnuguale.setEnabled(false);
         btndell.setEnabled(false);
         btnoff.setEnabled(false);
         btnon.setEnabled(true);
        
        btnRadice.addActionListener(this);
        btnx.addActionListener(this);
        btnx2.addActionListener(this);
        btnlog.addActionListener(this);
        btnln.addActionListener(this);
        btnuno.addActionListener(this);
        btndue.addActionListener(this);
        btntre.addActionListener(this);
        btnquattro.addActionListener(this);
        btncinque.addActionListener(this);
        btnsei.addActionListener(this);
        btnsette.addActionListener(this);
        btnotto.addActionListener(this);
        btnnove.addActionListener(this);
        btnzero.addActionListener(this);
        btnvirgola.addActionListener(this);
        btnpigreco.addActionListener(this);
        btnmolt.addActionListener(this);
        btndiviso.addActionListener(this);
        btnsomma.addActionListener(this);
        btnsottrazione.addActionListener(this);
        btnuguale.addActionListener(this);
        btndell.addActionListener(this);
        btnoff.addActionListener(this);
        btnon.addActionListener(this);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Calcolo calc = new Calcolo("");
        String salva = "";
        String evento = e.getActionCommand();
        String lettura = "";
        
        switch(evento)
        {
            case "1":
                lettura = Risultato.getText();
                Risultato.setText(lettura += "1");
                break;
                
            case "2":
                lettura = Risultato.getText();
                Risultato.setText(lettura += "2");
                break;   
            
            case "3":
                lettura = Risultato.getText();
                Risultato.setText(lettura += "3");
                break;
             
            case "4":
                lettura = Risultato.getText();
                Risultato.setText(lettura += "4");
                break;
            
            case "5":
                lettura = Risultato.getText();
                Risultato.setText(lettura += "5");
                break;
                
            case "6":
                lettura = Risultato.getText();
                Risultato.setText(lettura += "6");
                break;
                
            case "7":
                lettura = Risultato.getText();
                Risultato.setText(lettura += "7");
                break;
                
            case "8":
                lettura = Risultato.getText();
                Risultato.setText(lettura += "8");
                break;
                
            case "9":
                lettura = Risultato.getText();
                Risultato.setText(lettura += "9");
                break;
                
            case "0":
                lettura = Risultato.getText();
                Risultato.setText(lettura += "0");
                break;
                
            case "+":
                lettura = Risultato.getText();
                Risultato.setText(lettura += "+"); 
                break;
                
            case "-":
                lettura = Risultato.getText();
                Risultato.setText(lettura += "-"); 
                break;
                
            case "*":
                lettura = Risultato.getText();
                Risultato.setText(lettura += "*"); 
                break;
                
            case "/":
                lettura = Risultato.getText();
                Risultato.setText(lettura += "/"); 
                break;
                
            case "=":
                int i = 0;
                
                lettura = Risultato.getText();
               salva = calc.operazione(lettura);
               if(salva.length() != 1)
               for(i = 1; salva.charAt(i) == '+' || salva.charAt(i) == '-' || salva.charAt(i) == '*' || salva.charAt(i) == '/' || i < salva.length() - 1;)
               {
                   salva = calc.operazione(salva);
                   i++;
               }
               salva = calc.x(salva);
               Risultato.setText(salva);
                break;
                
            case "OFF":
                btnRadice.setEnabled(false);
                btnx.setEnabled(false);
                btnx2.setEnabled(false);
                btnlog.setEnabled(false);
                btnln.setEnabled(false);
                btnuno.setEnabled(false);
                btndue.setEnabled(false);
                btntre.setEnabled(false);
                btnquattro.setEnabled(false);
                btncinque.setEnabled(false);
                btnsei.setEnabled(false);
                btnsette.setEnabled(false);
                btnotto.setEnabled(false);
                btnnove.setEnabled(false);
                btnzero.setEnabled(false);
                btnvirgola.setEnabled(false);
                btnpigreco.setEnabled(false);
                btnmolt.setEnabled(false);
                btndiviso.setEnabled(false);
                btnsomma.setEnabled(false);
                btnsottrazione.setEnabled(false);
                btnuguale.setEnabled(false);
                btndell.setEnabled(false);
                btnoff.setEnabled(false);
                btnon.setEnabled(true);
                break;
                
            case "ON":
                btnRadice.setEnabled(true);
                btnx.setEnabled(true);
                btnx2.setEnabled(true);
                btnlog.setEnabled(true);
                btnln.setEnabled(true);
                btnuno.setEnabled(true);
                btndue.setEnabled(true);
                btntre.setEnabled(true);
                btnquattro.setEnabled(true);
                btncinque.setEnabled(true);
                btnsei.setEnabled(true);
                btnsette.setEnabled(true);
                btnotto.setEnabled(true);
                btnnove.setEnabled(true);
                btnzero.setEnabled(true);
                btnvirgola.setEnabled(true);
                btnpigreco.setEnabled(true);
                btnmolt.setEnabled(true);
                btndiviso.setEnabled(true);
                btnsomma.setEnabled(true);
                btnsottrazione.setEnabled(true);
                btnuguale.setEnabled(true);
                btndell.setEnabled(true);
                btnoff.setEnabled(true);
                btnon.setEnabled(false);
                break;
                
        }
    }
}