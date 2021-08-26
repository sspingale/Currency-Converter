package Learn;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Currency_Converter {
    public static void main(String[] args) {
        //frame of swing window in java
        JFrame f = new JFrame();
        //label 1 and its boundaries
        JLabel l1 = new JLabel("Select the input Currency:");
        l1.setBounds(143, 100, 200, 30);
        //label 2 and its boundaries
        JLabel l2 = new JLabel("Select the output Currency:");
        l2.setBounds(135, 200, 200, 30);
        //label 3 and its boundaries
        JLabel l3 = new JLabel("Amount");
        l3.setBounds(500,100,50,30);
        //lable 4 and its boundaries
        JLabel l4 = new JLabel("Amount");
        l4.setBounds(500, 200, 50, 30);
        //Currencies that are in use
        String Currency[] = {" Currency"," Indian Rupees"," US Dollars"," Canadian Dollars"," Euro"," British Pound"};
        //using combobox to add the currencies in window and its boundaries
        JComboBox cb1 = new JComboBox(Currency);
        cb1.setBounds(300,200,150,30);
        //using combobox to add the currencies in window and its boundaries
        JComboBox cb2 = new JComboBox(Currency);
        cb2.setBounds(300, 100, 150, 30);
        //textfield 1 and its boundaries
        JTextField tf1 = new JTextField();
        tf1.setBounds(550, 100, 150, 30);
        //setting textfield 1 to "0"
        tf1.setText("0");
        //textfield 2 and its boundaries
        JTextField tf2 = new JTextField();
        tf2.setBounds(550, 200, 150, 30);
        //setting textfield 2 to "0"
        tf2.setText("0");
        //code that will not allow the textfield 2 to be edited   // (Textfield 2 will not be editable)
        tf2.setEditable(false);
        //button 1 and its boundaries
        JButton b1 = new JButton("Convert Currency");
        b1.setBounds(400, 300, 150, 30);
        //adding action listener to the button Convert Currency
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double a=0;
                try{
                   a = Double.parseDouble(tf1.getText());
                }catch(Exception Ex){
                    JOptionPane.showMessageDialog(new JFrame(), " INVALID INPUT \n Please enter a valid Number", "Warning ", JOptionPane.ERROR_MESSAGE);
                }
                //a takes input from the 1st textfield and b is for taking the value from a and storing it
                double b = 0;
                // c and d takes the selected index of the combox 1 and 2 respectively
                int c = cb2.getSelectedIndex() , d = cb1.getSelectedIndex();
                //if any of the selected index is 0 then
                if((c==0)||(d==0)||((c==0)&(d==0))){
                    //a new window will open in front of it named warning and it will throw a message Please select the Currency
                    JOptionPane.showMessageDialog(new JFrame(), "Please Select the Currency ", "Warning", JOptionPane.ERROR_MESSAGE);
                }
                //or else if both the selected index are equal to each other then 
                else if(c==d){
                    // the value of a is assigned to b and then it is also assigned to the textfield 2
                    b=a;
                    tf2.setText(String.valueOf(b));
                }
                // or else if the indexes are as given then
                else if(c==1&d==2){
                    // the value of a with conversion is assigned to b and then it is also assigned to the textfield 2
                    b=a*0.01;
                    tf2.setText(String.valueOf(b));
                }
                // or else if the indexes are as given then
                else if(c==1&d==3){
                    // the value of a with conversion is assigned to b and then it is also assigned to the textfield 2
                    b=a*0.02;
                    tf2.setText(String.valueOf(b));
                }
                // or else if the indexes are as given then
                else if(c==1&d==4){
                    // the value of a with conversion is assigned to b and then it is also assigned to the textfield 2
                    b=a*0.01;
                    tf2.setText(String.valueOf(b));
                }
                // or else if the indexes are as given then
                else if(c==1&d==5){
                    // the value of a with conversion is assigned to b and then it is also assigned to the textfield 2
                    b=a*0.0099;
                    tf2.setText(String.valueOf(b));
                }
                // or else if the indexes are as given then
                else if(c==2&d==1){
                    // the value of a with conversion is assigned to b and then it is also assigned to the textfield 2
                    b=a*74.34;
                    tf2.setText(String.valueOf(b));
                }
                // or else if the indexes are as given then
                else if(c==2&d==3){
                    // the value of a with conversion is assigned to b and then it is also assigned to the textfield 2
                    b=a*1.29;
                    tf2.setText(String.valueOf(b));
                }
                // or else if the indexes are as given then
                else if(c==2&d==4){
                    // the value of a with conversion is assigned to b and then it is also assigned to the textfield 2
                    b=a*0.86;
                    tf2.setText(String.valueOf(b));
                }
                // or else if the indexes are as given then
                else if(c==2&d==5){
                    // the value of a with conversion is assigned to b and then it is also assigned to the textfield 2
                    b=a*0.73;
                    tf2.setText(String.valueOf(b));
                }
                // or else if the indexes are as given then
                else if(c==3&d==1){
                    // the value of a with conversion is assigned to b and then it is also assigned to the textfield 2
                    b=a*57.82;
                    tf2.setText(String.valueOf(b));
                }
                // or else if the indexes are as given then
                else if(c==3&d==2){
                    // the value of a with conversion is assigned to b and then it is also assigned to the textfield 2
                    b=a*0.78;
                    tf2.setText(String.valueOf(b));
                }
                // or else if the indexes are as given then
                else if(c==3&d==4){
                    // the value of a with conversion is assigned to b and then it is also assigned to the textfield 2
                    b=a*0.67;
                    tf2.setText(String.valueOf(b));
                }
                // or else if the indexes are as given then
                else if(c==3&d==5){
                    // the value of a with conversion is assigned to b and then it is also assigned to the textfield 2
                    b=a*0.57;
                    tf2.setText(String.valueOf(b));
                }
                // or else if the indexes are as given then
                else if(c==4&d==1){
                    // the value of a with conversion is assigned to b and then it is also assigned to the textfield 2
                    b=a*86.88;
                    tf2.setText(String.valueOf(b));
                }
                // or else if the indexes are as given then
                else if(c==4&d==2){
                    // the value of a with conversion is assigned to b and then it is also assigned to the textfield 2
                    b=a*1.17;
                    tf2.setText(String.valueOf(b));
                }
                // or else if the indexes are as given then
                else if(c==4&d==3){
                    // the value of a with conversion is assigned to b and then it is also assigned to the textfield 2
                    b=a*1.5;
                    tf2.setText(String.valueOf(b));
                }
                // or else if the indexes are as given then
                else if(c==4&d==5){
                    // the value of a with conversion is assigned to b and then it is also assigned to the textfield 2
                    b=a*0.86;
                    tf2.setText(String.valueOf(b));
                }
                // or else if the indexes are as given then
                else if(c==5&d==1){
                    // the value of a with conversion is assigned to b and then it is also assigned to the textfield 2
                    b=a*101.26;
                    tf2.setText(String.valueOf(b));
                }
                // or else if the indexes are as given then
                else if(c==5&d==2){
                    // the value of a with conversion is assigned to b and then it is also assigned to the textfield 2
                    b=a*1.36;
                    tf2.setText(String.valueOf(b));
                }
                // or else if the indexes are as given then
                else if(c==5&d==3){
                    // the value of a with conversion is assigned to b and then it is also assigned to the textfield 2
                    b=a*1.75;
                    tf2.setText(String.valueOf(b));
                }
                // or else if the indexes are as given then
                else if(c==5&d==4){
                    // the value of a with conversion is assigned to b and then it is also assigned to the textfield 2
                    b=a*1.17;
                    tf2.setText(String.valueOf(b));
                }
                // or else any error if occured then
                else{
                    //the textfield 2 will show error occured
                    tf2.setText("Error occured ");
                    /* and then automatically a new window will be launched named warning and it will throw a error message that Please Click the Clear Button*/
                    JOptionPane.showMessageDialog(new JFrame(), "Please Click the \"Clear\" Button ", "Warning", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        //button 2 and its boundaries
        JButton b2 = new JButton(" Clear ");
        b2.setBounds(250, 450, 150, 30);
        //code on button 2 that will clear the text present in the textfield at that particular instant
        b2.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                tf1.setText("0");
                tf2.setText("0");
            }
        });
        //button exit and its boundaries
        JButton b3 = new JButton(" Exit ");
        b3.setBounds(550, 450, 150, 30);
        // code on button 3 that exits the window when clicked with the mouse 
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //closing the swing window frame f
                System.exit(0);
            }
        });
        //adding all labels to frame f
        f.add(l1);f.add(l2);f.add(l3);f.add(l4);
        //adding all combobox to the frame f
        f.add(cb1);f.add(cb2);
        //adding all textfield to the frame f 
        f.add(tf1);f.add(tf2);
        //adding all the button to the frame f
        f.add(b1);f.add(b2);f.add(b3);
        //setting title to the frmae f 
        f.setTitle("Currency Converter");
        //setting size of the window to be displayed on the screen
        f.setSize(950, 600);
        // code that keeps our window aligned at the center of the screen
        f.setLocationRelativeTo(null);
        //code that sets layout of the frame f
        f.setLayout(null);
        // code that keeps our frame f visible to ous
        f.setVisible(true);
        // code that will exit when the "X" button is pressed present atthe corner of the frame f 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}