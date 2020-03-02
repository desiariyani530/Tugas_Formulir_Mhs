
//Desi Ariyani
import javax.swing.*;


public class Formulir extends JFrame {
   JLabel judul,nama,nim,jk,agama,alamat;
   JTextField n1,n2,a1;
   JRadioButton p,l;
   JComboBox ag;
   JButton ok;
   public void formulir()
   {
       judul=new JLabel("Formulir Mahasiswa");
       nama=new JLabel("Nama");
       n1=new JTextField();//kolom nama
        
       nim=new JLabel("NIM");
       n2=new JTextField();//kolom nim
         
       jk=new JLabel("Jenis Kelamin");
       p=new JRadioButton("P");
       l=new JRadioButton("L");
       
       agama=new JLabel("Agama");
       String[] macam_agama = {"Islam","Kristen","Katolik","Hindu","Budha" };
       ag=new JComboBox(macam_agama);
       
       alamat=new JLabel("Alamat");
       a1=new JTextField();//kolom alamat
      
       ok=new JButton("OKE");
       
       ButtonGroup group=new ButtonGroup();
       group.add(p);
       group.add(l);
       
   setLayout(null);
        add (judul);
        add (nama);
        add (n1);//kolom pengisian nama
        add (nim);
        add (n2);//kolom pengisian nim
        add (jk);
        add (p);
        add (l);
        add (alamat);
        add (a1);//kolom pengisian alamat
        add (agama);
        add (ag);
        add (ok);   
        
        
         judul.setBounds(170,20,200,20);
         nama.setBounds(20,50,100,20);
         n1.setBounds(140,50,200,20);
         nim.setBounds(20,100,90,20);
         n2.setBounds(140,90,200,20);
         jk.setBounds(20,130,100,20);
         p.setBounds(140,130,100,20);
         l.setBounds(240,130,100,20);
         alamat.setBounds(20,210,100,20);
         a1.setBounds(140,210,250,150);
         agama.setBounds(20,170,100,20);
         ag.setBounds(140,170,200,20);
         ok.setBounds(330,365,60,20);
     
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
   } 

    
}
