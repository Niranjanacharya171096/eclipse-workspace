import java.io.*; 
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ScCalculator extends JFrame implements ActionListener{
  
  double num,ans;
  int cal;
  
  JLabel l1;
  JTextField t1;
  JRadioButton r1,r2;
  ButtonGroup g;
  JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,
  btn0,btndot,btnsqrt,btnex,btnsin,btncos,btntan,btnsinh,btncosh,btntanh,
  btnxy,btnper,btnclr,btnback,btnadd,btnx3,btnx2,btnsub,btndiv,btnmul,btnfact,
  btnpm,btneq,btnlog,btn1x;
  
  ScCalculator(){
    super("Scientific Calculator");
    //l2=new JLabel("Scientific Calculator in JAVA");
    l1=new JLabel("");
    //ImageIcon icon=new ImageIcon("Image/tex.jpg");
    //l3=new JLabel(icon); 
    t1=new JTextField();
    r1=new JRadioButton("on");
    r2=new JRadioButton("off");
    g=new ButtonGroup();
    
    btn1=new JButton("1");
    btn2=new JButton("2");
    btn3=new JButton("3");
    btn4=new JButton("4");
    btn5=new JButton("5");
    btn6=new JButton("6");
    btn7=new JButton("7");
    btn8=new JButton("8");
    btn9=new JButton("9");
    btn0=new JButton("0");
    btndot=new JButton(".");
    btneq=new JButton("=");
    btnsqrt=new JButton("sqr");
    btnex=new JButton("e^x");
    btnsin=new JButton("sin");
    btncos=new JButton("cos");
    btntan=new JButton("tan");
    btnsinh=new JButton("sinh");
    btncosh=new JButton("cosh");
    btntanh=new JButton("tanh");
    btnxy=new JButton("x^y");
    btnper=new JButton("%");
    btnclr=new JButton("C");
    btnback=new JButton("B");
    btnadd=new JButton("+");
    btnx3=new JButton("x^3");
    btnx2=new JButton("x^2");
    btnsub=new JButton("-");
    btndiv=new JButton("/");
    btnmul=new JButton("*");
    btnfact=new JButton("n!");
    btnpm=new JButton("+/-");
    btnlog=new JButton("log");
    btn1x=new JButton("1/x");
    
    //font stylling
    
    btncosh.setFont(new Font("Times New Roman",Font.BOLD,13));
    //l2.setFont(new Font("Comic Sans MS",Font.BOLD,30));
    //l2.setForeground(Color.GREEN);
    t1.setFont(new Font("Times New Roman",Font.BOLD,20));
    
    //Arranging the components 
    setLayout(null);
    //l3.setBounds(0,0,500,600);
    //l2.setBounds(0,0,600,30);
    
    t1.setBounds(40,40,300,40);
    r1.setBounds(40,100,40,30);
    r2.setBounds(80,100,40,30);
    l1.setBounds(160,100,150,30);
    
    btnsqrt.setBounds(40,140,60,40);
    btnex.setBounds(100,140,60,40);
    btnsin.setBounds(160,140,60,40);
    btncos.setBounds(220,140,60,40);
    btntan.setBounds(280,140,60,40);
    
    btn1x.setBounds(40,200,60,40);
    btnlog.setBounds(100,200,60,40);
    btnsinh.setBounds(160,200,60,40);
    btncosh.setBounds(220,200,60,40);
    btntanh.setBounds(280,200,60,40);
    
    btnxy.setBounds(40,260,60,40);
    btnper.setBounds(100,260,60,40);
    btnclr.setBounds(160,260,60,40);
    btnback.setBounds(220,260,60,40);
    btnadd.setBounds(280,260,60,40);
    
    btnx3.setBounds(40,320,60,40);
    btn7.setBounds(100,320,60,40);
    btn8.setBounds(160,320,60,40);
    btn9.setBounds(220,320,60,40);
    btnsub.setBounds(280,320,60,40);
    
    btnx2.setBounds(40,380,60,40);
    btn4.setBounds(100,380,60,40);
    btn5.setBounds(160,380,60,40);
    btn6.setBounds(220,380,60,40);
    btnmul.setBounds(280,380,60,40);
    
    btnfact.setBounds(40,440,60,40);
    btn1.setBounds(100,440,60,40);
    btn2.setBounds(160,440,60,40);
    btn3.setBounds(220,440,60,40);
    btndiv.setBounds(280,440,60,40);
    
    btnpm.setBounds(40,500,60,40);
    btn0.setBounds(100,500,120,40);
    
    btndot.setBounds(220,500,60,40);
    btneq.setBounds(280,500,60,40);
    
    //Adding the components
    
    //add(l2);
    add(t1);
    add(r1);
    add(r2);
    g.add(r1);
    g.add(r2);
    add(l1);
    add(btnsqrt);
    add(btnex);
    add(btnsin);
    add(btncos);
    add(btntan);
    add(btn1x);
    add(btnlog);
    add(btnsinh);
    add(btncosh);
    add(btntanh);
    add(btnxy);
    add(btnper);
    add(btnclr);
    add(btnback);
    add(btnadd);
    add(btnx3);
    add(btn7);
    add(btn8);
    add(btn9);
    add(btnsub);
    add(btnx2);
    add(btn4);
    add(btn5);
    add(btn6);
    add(btnmul);
    add(btnfact);
    add(btn1);
    add(btn2);
    add(btn3);
    add(btndiv);
    add(btnpm);
    add(btn0);
    add(btndot);
    add(btneq);
    //add(l3);
    //Adding the ActionListener to the all the buttons 
    btn1.addActionListener(this);
    btn2.addActionListener(this);
    btn3.addActionListener(this);
    btn4.addActionListener(this);
    btn5.addActionListener(this);
    btn6.addActionListener(this);
    btn7.addActionListener(this);
    btn8.addActionListener(this);
    btn9.addActionListener(this);
    btn0.addActionListener(this);
    btndot.addActionListener(this);
    btnclr.addActionListener(this);
    btnadd.addActionListener(this);
    btneq.addActionListener(this);
    btnsub.addActionListener(this);
    btnmul.addActionListener(this);
    btndiv.addActionListener(this);
    btnsin.addActionListener(this);
    btnsinh.addActionListener(this);
    btncos.addActionListener(this);
    btncosh.addActionListener(this);
    btntan.addActionListener(this);
    btntanh.addActionListener(this);
    btnsqrt.addActionListener(this);
    btnex.addActionListener(this);
    btnlog.addActionListener(this);
    btnper.addActionListener(this);
    btnpm.addActionListener(this);
    btnfact.addActionListener(this);
    btnback.addActionListener(this);
    btnx2.addActionListener(this);
    btnx3.addActionListener(this);
    btn1x.addActionListener(this);
    r1.addActionListener(this);
    r2.addActionListener(this);
    btnfact.addActionListener(this);
    btnpm.addActionListener(this);    
    setResizable(false);
    setSize(500,600);
    setLocation(300,60);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  }
  //Method for ON/OFF
  public void enable(){
    t1.setEditable(true);
    btn1.setEnabled(true);
    btn2.setEnabled(true);
    btn3.setEnabled(true);
    btn4.setEnabled(true);
    btn5.setEnabled(true);
    btn6.setEnabled(true);
    btn7.setEnabled(true);
    btn8.setEnabled(true);
    btn9.setEnabled(true);
    btn0.setEnabled(true);
    btndot.setEnabled(true);
    btnsin.setEnabled(true);
    btncos.setEnabled(true);
    btntan.setEnabled(true);
    btncosh.setEnabled(true);
    btnsinh.setEnabled(true);
    btntanh.setEnabled(true);
    btnx2.setEnabled(true);
    btnx3.setEnabled(true);
    btnadd.setEnabled(true);
    btnmul.setEnabled(true);
    btndiv.setEnabled(true);
    btnsub.setEnabled(true);
    btnsqrt.setEnabled(true);
    btnex.setEnabled(true);
    btneq.setEnabled(true);
    btnlog.setEnabled(true);
    btnper.setEnabled(true);
    btnpm.setEnabled(true);
    btnfact.setEnabled(true);
    btnclr.setEnabled(true);
    btn1x.setEnabled(true);
    btnxy.setEnabled(true);
    btnback.setEnabled(true);
  }
  
  public void disable(){
    t1.setEditable(false);
    btn1.setEnabled(false);
    btn2.setEnabled(false);
    btn3.setEnabled(false);
    btn4.setEnabled(false);
    btn5.setEnabled(false);
    btn6.setEnabled(false);
    btn7.setEnabled(false);
    btn8.setEnabled(false);
    btn9.setEnabled(false);
    btn0.setEnabled(false);
    btndot.setEnabled(false);
    btnsin.setEnabled(false);
    btncos.setEnabled(false);
    btntan.setEnabled(false);
    btncosh.setEnabled(false);
    btnsinh.setEnabled(false);
    btntanh.setEnabled(false);
    btnx2.setEnabled(false);
    btnx3.setEnabled(false);
    btnadd.setEnabled(false);
    btnmul.setEnabled(false);
    btndiv.setEnabled(false);
    btnsub.setEnabled(false);
    btnsqrt.setEnabled(false);
    btnex.setEnabled(false);
    btneq.setEnabled(false);
    btnlog.setEnabled(false);
    btnper.setEnabled(false);
    btnpm.setEnabled(false);
    btnfact.setEnabled(false);
    btnclr.setEnabled(false);
    btn1x.setEnabled(false);
    btnxy.setEnabled(false);
    btnback.setEnabled(false);
  }
  
  //Method to calculation   
  public void calculation(){
  switch(cal){
    case 1://addition
       ans=num + Double.parseDouble(t1.getText());
       t1.setText(Double.toString(ans));
    break;
    case 2://subtraction
       ans=num - Double.parseDouble(t1.getText());
       t1.setText(Double.toString(ans));
    break;
    case 3://multiplication
       ans=num * Double.parseDouble(t1.getText());
       t1.setText(Double.toString(ans));
    break;
    case 4://division
       ans=num / Double.parseDouble(t1.getText());
       t1.setText(Double.toString(ans));
    break;
  }
}

  //Method to perform action 
  public void actionPerformed(ActionEvent e){
    if(e.getSource()==btn1){
      t1.setText(t1.getText()+"1");
    }
    else if(e.getSource()==btn2){
      t1.setText(t1.getText()+"2");
    }
    else if(e.getSource()==btn3){
      t1.setText(t1.getText()+"3");
    }else if(e.getSource()==btn4){
      t1.setText(t1.getText()+"4");
    }
    else if(e.getSource()==btn5){
      t1.setText(t1.getText()+"5");
    }
    else if(e.getSource()==btn6){
      t1.setText(t1.getText()+"6");
    }
    else if(e.getSource()==btn7){
      t1.setText(t1.getText()+"7");
    }
    else if(e.getSource()==btn8){
      t1.setText(t1.getText()+"8");
    }
    else if(e.getSource()==btn9){
      t1.setText(t1.getText()+"9");
    }
    else if(e.getSource()==btn0){
      t1.setText(t1.getText()+"0");
    }
    else if(e.getSource()==btndot){
      t1.setText(t1.getText()+".");
    }
    else if(e.getSource()==btnclr){
      t1.setText("");
    }
    else if(e.getSource()==btnadd){
     num=Double.parseDouble(t1.getText());
     cal=1;
     t1.setText("");
     l1.setText(num+"+");
     
  }
  else if(e.getSource()==btnsub){
     num=Double.parseDouble(t1.getText());
     cal=2;
     t1.setText("");
     l1.setText(num+"-");
     
  }
  else if(e.getSource()==btnmul){
     num=Double.parseDouble(t1.getText());
     cal=3;
     t1.setText("");
     l1.setText(num+"*");
     
  }
  else if(e.getSource()==btndiv){
     num=Double.parseDouble(t1.getText());
     cal=4;
     t1.setText("");
     l1.setText(num+"/");
     
  }else if(e.getSource()==btneq){
     calculation();
     l1.setText("");  
  }
  else if(e.getSource()==btnsqrt){
      num=Double.parseDouble(t1.getText());
      ans=Math.sqrt(num);
      t1.setText(Double.toString(ans));
    }
  else if(e.getSource()==btnsin){
      num=Double.parseDouble(t1.getText());
      ans=Math.sin(num);
      t1.setText(Double.toString(ans));
    }
  else if(e.getSource()==btnsinh){
      num=Double.parseDouble(t1.getText());
      ans=Math.sinh(num);
      t1.setText(Double.toString(ans));
    }
else if(e.getSource()==btncos){
      num=Double.parseDouble(t1.getText());
      ans=Math.cos(num);
      t1.setText(Double.toString(ans));
    }
else if(e.getSource()==btncosh){
      num=Double.parseDouble(t1.getText());
      ans=Math.cosh(num);
      t1.setText(Double.toString(ans));
    }
else if(e.getSource()==btntan){
      num=Double.parseDouble(t1.getText());
      ans=Math.tan(num);
      t1.setText(Double.toString(ans));
    }
else if(e.getSource()==btntanh){
      num=Double.parseDouble(t1.getText());
      ans=Math.tanh(num);
      t1.setText(Double.toString(ans));
    } 
else if(e.getSource()==btnlog){
      num=Double.parseDouble(t1.getText());
      ans=Math.log(num);
      t1.setText(Double.toString(ans));
    }
  else if(e.getSource()==btn1x){
      num=Double.parseDouble(t1.getText());
      ans=(1/num);
      t1.setText(Double.toString(ans));
    }
else if(e.getSource()==btnx3){
      num=Double.parseDouble(t1.getText());
      ans=num *num *num ;
      t1.setText(Double.toString(ans));
    }
else if(e.getSource()==btnx2){
      num=Double.parseDouble(t1.getText());
      ans=num *num;
      t1.setText(Double.toString(ans));
    }
    else if(e.getSource()==r1){
      enable();
    }
       else if(e.getSource()==r2){
      disable();
    }
    else if(e.getSource()==btnpm){
      num=Double.parseDouble(String.valueOf(t1.getText()));
      num=num*(-1);
      t1.setText(String.valueOf(num));
      }
  }

public static void main(String args[]){
  new ScCalculator();
}

}
