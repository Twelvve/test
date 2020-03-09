import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class Test implements ActionListener
{ 
    JFrame f;
    JTextField n1, n2, rslt;
    JButton fact, perm, comb;
    JLabel head, num1, num2, result;
    int a,i,temp=1;
    public Test()
    {
      JFrame f=new JFrame("Pc Calculator");
      f.setSize(800,500);
      f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      head=new JLabel("P.C Calculator");
      head.setBounds(360,30,500,10);
      num1=new JLabel("Num1");
      num1.setBounds(120,60,500,50);
      n1=new JTextField();
      n1.setBounds(50,100,200,40);
      num2=new JLabel("Num2");
      num2.setBounds(580,60,500,50);
      n2=new JTextField();
      n2.setBounds(500,100,200,40);
      fact=new JButton("factorial");
      fact.setBounds(70,200,150,50);
      perm=new JButton("permutation");
      perm.setBounds(300,200,150,50);
      comb=new JButton("combination");
      comb.setBounds(530,200,150,50);
      result=new JLabel("Result");
      result.setBounds(120,260,450,50);
      rslt=new JTextField();
      rslt.setBounds(50,300,650,40);
      final JPanel p = new JPanel();
      p.setBackground(Color.LIGHT_GRAY);
      p.add(head);
      p.add(num1);
      p.add(n1);
      p.add(num2);
      p.add(n2);
      p.add(fact);
      p.add(perm);
      p.add(comb);
      p.add(result);
      p.add(rslt);
      f.add(p);
      p.setLayout(null);
      p.setVisible(true);
      perm.addActionListener(this);
      comb.addActionListener(this);
      fact.addActionListener(this);
   }
   public  void actionPerformed(final ActionEvent evt){
    final int  a=Integer.parseInt(n1.getText());
       for(i=1; i<=a; i++)
       {
       temp= temp*i;
       }
       final String anser= String.valueOf(temp);
       rslt.setText(anser);
     }

  
   
 
    public static void main(final String[] args)
    {
        Test ak= new Test();
    }   
}
