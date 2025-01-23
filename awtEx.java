import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ex1 extends Frame implements ActionListener{
    Button b1;
    TextField t1,t2;
    Label l1,l2,l3;
    ex1(){
        l1=new Label("Java Awt");
        l2=new Label("Enter Your Name");
        t1=new TextField(20);
        l3= new Label("Your Name");
        t2= new TextField(20);
        b1= new Button("Click");
        b1.addActionListener(this);
        add(l1);
        add(l2);
        add(t1);
        add(b1);
        add(l3);
        add(t2);
    
        setLayout(new FlowLayout());
        setSize(400,200);
        setVisible(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                dispose();
            }
        });
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            t2.setText(t1.getText());
        }
    }
}

class awtEx{
    public static void main(String[] args) {
        ex1 e1 = new ex1();
    }
}