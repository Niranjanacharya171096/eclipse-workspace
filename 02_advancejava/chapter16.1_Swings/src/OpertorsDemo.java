import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

class Operators extends Frame implements ActionListener {
  JLabel jl1, jl2, jl3;
  JTextField jtf1, jtf2, jtf3;
  JButton jb1, jb2, jb3, jb4;
  
  Operators () {
    setTitle ("Operations");
    setSize (200, 200);
    setLayout (new FlowLayout ());
    jl1=new JLabel ("Enter first number: ");
    jl2=new JLabel ("Enter second number: ");
    jl3=new JLabel ("Result: ");
    jtf1=new JTextField (20);
    jtf2=new JTextField (20);
    jtf3=new JTextField (20);
    jb1=new JButton ("Sum");
    jb2=new JButton ("Sub");
    jb3=new JButton ("Mul");
    jb4=new JButton ("Exit");
    add (jl1);add (jtf1);
    add (jl2);add (jtf2);
    add (jl3);add (jtf3);
    add (jb1);add (jb2);add (jb3);add (jb4);
    jb1.addActionListener (this);
    jb2.addActionListener (this);
    jb3.addActionListener (this);
    jb4.addActionListener (this);
    setVisible (true);
  }
  
  public void actionPerformed (ActionEvent ae) {
    if (ae.getSource ()==jb1) {
    String s1=jtf1.getText ();
    String s2=jtf2.getText ();
    int n3=Integer.parseInt (s1)+Integer.parseInt (s2);
    String s3=String.valueOf (n3);
    jtf3.setText (s3);
    }
    if (ae.getSource ()==jb2) {
      String s1=jtf1.getText ();
      String s2=jtf2.getText ();
      int n3=Integer.parseInt (s1)-Integer.parseInt (s2);
      String s3=String.valueOf (n3);
      jtf3.setText (s3);
    }
    if (ae.getSource ()==jb3) {
      String s1=jtf1.getText ();
      String s2=jtf2.getText ();
      int n3=Integer.parseInt (s1)*Integer.parseInt (s2);
      String s3=String.valueOf (n3);
      jtf3.setText (s3);
    }
    if (ae.getSource ()==jb4) {
      System.exit (0);
    }
  }
}

class OpertorsDemo {
  public static void main (String [] args) {
    Operators o1=new Operators ();
  }
}
