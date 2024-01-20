import java.awt.*;
import java.awt.event.*;

public class ChecklistAwt {
    Frame frame;
    Checkbox c1,c2,c3,c4,c5;
    Label l1;
    Button b,b1;
    ChecklistAwt(){
        frame = new Frame("General Store");
        frame.setVisible(true);
        frame.setBackground(Color.blue);
        frame.setSize(500,700);
        frame.setLayout(null);
        l1=new Label("Select the item you want to purchase");
        l1.setFont(new Font("Serif",Font.BOLD,20));
        l1.setForeground(Color.BLACK);
        c1=new Checkbox("Shampoo");
        c2=new Checkbox("Soap");
        c3=new Checkbox("Detergent");
        c4=new Checkbox("Brush");
        c5=new Checkbox("Knife");
        b=new Button("Calculate");
        b1=new Button("Clear");
        l1.setBounds(50,50,400,50);
        c1.setBounds(150,150,100,50);
        c2.setBounds(150,210,100,50);
        c3.setBounds(150,270,100,50);
        c4.setBounds(150,330,100,50);
        c5.setBounds(150,390,100,50);
        b.setBounds(300,410,100,50);
        b1.setBounds(300,510,100,50);
        frame.add(l1);
        frame.add(c1);
        frame.add(c2);
        frame.add(c3);
        frame.add(c4);
        frame.add(c5);
        frame.add(b);
        frame.add(b1);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String item="";
                int price=0;
                if (c1.getState()){
                    item=item+c1.getLabel()+" & ";
                    price=price+105;
                //    c1.setState(false);   //for clear the check box
                }
                if (c2.getState()){
                    item=item+c2.getLabel()+" & ";
                    price=price+45;
                }
                if (c3.getState()){
                    item=item+c3.getLabel()+" & ";
                    price=price+125;
                }
                if (c4.getState()){
                    item=item+c4.getLabel()+" & ";
                    price=price+50;
                }
                if (c5.getState()){
                    item=item+c5.getLabel()+" & ";
                    price=price+85;
                }
                Label l2=new Label(item);
                Label l3 =new Label(new String(String.valueOf(price)));
                frame.add(l2);
                frame.add(l3);
                l2.setBounds(200,500,100,50);
                l3.setBounds(200,560,100,50);
            }
        });
    }
    public static void main(String[] args) {
        new ChecklistAwt();
    }
}
