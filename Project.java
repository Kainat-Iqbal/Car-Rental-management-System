package project;
//import all packages which we need
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.lang.*;
abstract class Write{   //it is an abstract class
    abstract void Print();      //it is an abstract method
}
class CarRental extends Write implements ActionListener{    //it is our base class 
JFrame jf;  //declare variable of JFrame
// variables for JLabel
JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,
label11,label12,label13,label14,label15,label16,label17,label18,label19,label20
,label21,label22,label23,label24,label25,label26;
//variables for JComboBox
JComboBox jcb,jcb1,jcb2,jcb3,jcb4,jcb5,jcb6,jcb7;
//variables for JTextField
JTextField txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12;
JButton b1,b2;  //variables for JButton
JPanel panel1;  //variables for JPanel
// private variables of type String
private String str1,str2,str3,str4,str5,str6,str7,str8,str9,str10,str11,str12,str13,
str14,str15,str16;
//Private variables of type int
private int num1, num2, num3, num4, num5,num6,num7,num8;
CarRental(){        //constructor
    jf = new JFrame("Car Rental Management System");    //create window with specified name
    label1 = new JLabel("Processed By");    //create JLabel with specified text
    label1.setBounds(10, 10, 250, 20);      //set bounds of specified JLabel
    label1.setOpaque(true);
    label1.setBackground(Color.LIGHT_GRAY);     //set background colour
    jf.add(label1);     //add this label on our frame
    label2 = new JLabel("Employee Name");
    label2.setBounds(10, 40, 120, 20);
    jf.add(label2);
    String [] options1 = {"Ali","Rizwan","Fardan","Jawwad","Arman"};    //list for availabel options
    jcb = new JComboBox(options1);      //create dropdown menu
    jcb.setBounds(120, 40, 140, 20);
    jcb.addActionListener(this);        //add action listener to know which task is done
    jf.add(jcb);
    label3 = new JLabel("Type your ID");
    label3.setBounds(10, 70, 120, 20);
    jf.add(label3);
    txt1 = new JTextField();        //create JTextField 
    txt1.setBounds(120, 70, 140, 20);
    txt1.addActionListener(this);
    jf.add(txt1);
    label4 = new JLabel("Customer Information");
    label4.setOpaque(true);
    label4.setBackground(Color.LIGHT_GRAY);
    label4.setBounds(10,100,250,20);
    jf.add(label4);
    label5 = new JLabel("Name");
    label5.setBounds(10,130,100, 20);
    jf.add(label5);
    txt2 = new JTextField();
    txt2.setBounds(120, 130, 140, 20);
    txt2.addActionListener(this);
    jf.add(txt2);
    label6 = new JLabel("CNIC");
    label6.setBounds(10, 160, 100, 20);
    jf.add(label6);
    txt3 = new JTextField();
    txt3.setBounds(120, 160, 140, 20);
    txt3.addActionListener(this);
    jf.add(txt3);
    label7 = new JLabel("Address");
    label7.setBounds(10, 190, 100, 20);
    jf.add(label7);
    txt4 = new JTextField();
    txt4.setBounds(120, 190, 140, 20);
    txt4.addActionListener(this);
    jf.add(txt4);
    label8 = new JLabel("Contact number");
    label8.setBounds(10, 220, 100, 20);
    jf.add(label8);
    txt5 = new JTextField();
    txt5.setBounds(120, 220, 140, 20);
    txt5.addActionListener(this);
    jf.add(txt5);
    label9 = new JLabel("Account number");
    label9.setBounds(10, 250, 100, 20);
    jf.add(label9);
    txt6 = new JTextField();
    txt6.setBounds(120, 250, 140, 20);
    txt6.addActionListener(this);
    jf.add(txt6);
    label10 = new JLabel("City");
    label10.setBounds(10, 280, 100, 20);
    jf.add(label10);
    String [] options2 = {"Karachi","Hyderabad","Faislabad","Islamabad","Lahore",
    "Quetta","Muree","Gawadar"};
    jcb1 = new JComboBox(options2);
    jcb1.setBounds(120, 280, 140, 20);
    jcb1.addActionListener(this);
    jf.add(jcb1);
    label11 = new JLabel("Car Selection");
    label11.setBounds(10, 310, 250, 20);
    label11.setOpaque(true);
    label11.setBackground(Color.LIGHT_GRAY);
    jf.add(label11);
    label12 = new JLabel("Make");
    label12.setBounds(10, 340, 100, 20);
    jf.add(label12);
    String [] options3 = {"Honda","Toyota","Suzuki","KIA"};
    jcb2 = new JComboBox(options3);
    jcb2.setBounds(120, 340, 140, 20);
    jcb2.addActionListener(this);
    jf.add(jcb2);
    label13 = new JLabel("Model");
    label13.setBounds(10, 370, 100, 20);
    jf.add(label13);
    String [] options4 = {"BR-V","Civic","Corolla","Cultus","Alto","Sonet",
    "Seltos"};
    jcb3 = new JComboBox(options4);
    jcb3.setBounds(120, 370, 140, 20);
    jcb3.addActionListener(this);
    jf.add(jcb3);
    label14 = new JLabel("Car Condition");
    label14.setBounds(10, 400, 100, 20);
    jf.add(label14);
    String [] options5 = {"Exellent","Good","Fine"};
    jcb4 = new JComboBox(options5);
    jcb4.setBounds(120, 400, 140, 20);
    jcb4.addActionListener(this);
    jf.add(jcb4);   
    label15 = new JLabel("Order Timing");
    label15.setBounds(300, 10, 250, 20);
    label15.setOpaque(true);
    label15.setBackground(Color.LIGHT_GRAY);
    jf.add(label15);
    label16 = new JLabel("Starting Date");
    label16.setBounds(300, 40, 100, 20);
    jf.add(label16);    
    txt7 = new JTextField();
    txt7.setBounds(410, 40, 140, 20);
    jf.add(txt7);
    label17 = new JLabel("Ending Date");
    label17.setBounds(300, 70, 100, 20);
    jf.add(label17);    
    txt8 = new JTextField();
    txt8.setBounds(410, 70, 140, 20);
    jf.add(txt8);
    label18 = new JLabel("Number of Days");
    label18.setBounds(300, 100, 100, 20);
    jf.add(label18);    
    txt9 = new JTextField("0");
    txt9.setBounds(410, 100, 140, 20);
    txt9.addActionListener(this);
    jf.add(txt9);
    label19 = new JLabel("Facilities");
    label19.setBounds(300, 130, 250, 20);
    label19.setOpaque(true);
    label19.setBackground(Color.LIGHT_GRAY);
    jf.add(label19);
    label20 = new JLabel("Driver facility");
    label20.setBounds(300, 160, 100, 20);
    jf.add(label20);    
    String [] options6 = {"With Driver","Without Driver"};
    jcb5 = new JComboBox(options6);
    jcb5.setBounds(410, 160, 140, 20);
    jcb5.addActionListener(this);
    jf.add(jcb5);   
    label21 = new JLabel("Fuel facility");
    label21.setBounds(300, 190, 100, 20);
    jf.add(label21);    
    String [] options7 = {"With Fuel","Without Fuel"};
    jcb6 = new JComboBox(options7);
    jcb6.setBounds(410, 190, 140, 20);
    jcb6.addActionListener(this);
    jf.add(jcb6);   
    label22 = new JLabel("Order");
    label22.setBounds(300, 220, 250, 20);
    label22.setOpaque(true);
    label22.setBackground(Color.LIGHT_GRAY);
    jf.add(label22);
    label23 = new JLabel("Discount");
    label23.setBounds(300, 250, 100, 20);
    jf.add(label23);    
    txt10 = new JTextField("0");
    txt10.setBounds(410, 250, 140, 20);
    txt10.addActionListener(this);
    jf.add(txt10);
    label24 = new JLabel("Rent");
    label24.setBounds(300, 280, 100, 20);
    jf.add(label24);    
    txt11 = new JTextField("0");
    txt11.setBounds(410, 280, 140, 20);
    jf.add(txt11);
    label25 = new JLabel("Payment method");
    label25.setBounds(300, 310, 100, 20);
    jf.add(label25);    
    String [] options8 = {"Cash","Online"};
    jcb7 = new JComboBox(options8);
    jcb7.setBounds(410, 310, 140, 20);
    jf.add(jcb7);   
    label26 = new JLabel("Total Amount");
    label26.setBounds(300, 340, 100, 20);
    jf.add(label26);    
    txt12 = new JTextField("0");
    txt12.setBounds(410, 340, 140, 20);
    jf.add(txt12);
    b1 = new JButton("Calculate Total");    //create JButton with specified text
    b1.setBounds(300, 380, 120, 40);
    b1.addActionListener(this);
    jf.add(b1);
    b2 = new JButton("Confirm order");
    b2.setBounds(430, 380, 120, 40);
    b2.addActionListener(this);
    jf.add(b2);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      //close window by clicking cross on top
    jf.setSize(600, 500);      //size of window
    jf.setLayout(null);  
    jf.setLocationRelativeTo(null);
    jf.setVisible(true);
}
public void actionPerformed(ActionEvent e){     //override method of ActionListener interface
    str1 = (String) jcb.getSelectedItem();      //get which option is selected from drop down menu
    str2 = txt1.getText();      //to know what is written in text field
    str3 = txt2.getText();
    str4 = txt3.getText();
    str5 = txt4.getText();
    str6 = txt5.getText();
    str7 = txt6.getText();
    str8 = (String) jcb1.getSelectedItem();
    str9 = (String) jcb2.getSelectedItem();
    str10 = (String) jcb3.getSelectedItem();
    str11 = (String) jcb4.getSelectedItem();
    str12 = txt9.getText();
    str13 = (String) jcb5.getSelectedItem();
    str14 = (String) jcb6.getSelectedItem();
    str15 = txt10.getText();
    str16 = (String) jcb7.getSelectedItem();
    String str = e.getActionCommand();
    if (str == "Confirm order"){    //checking either confirm order or calculate total button is pressed
        Print();
        JOptionPane.showMessageDialog(jf,"Order is Successfully placed");
    }
    else if(str == "Calculate Total"){
        if(str10 == "BR-V"){ num1 = 5000;}      //set per day rent for different cars
        else if (str10 == "Civic"){num1 = 6000;}
        else if(str10 == "Corolla"){ num1 = 5500;}
        else if(str10 == "Cultus"){ num1 = 4500;}
        else if(str10 == "Alto"){ num1 = 4000;}
        else if(str10 == "Sonet"){ num1 = 5000;}
        else if(str10 == "Seltos"){ num1 = 5500;}
        String s = String.valueOf(num1);        //convert int in String
        txt11.setText(s);           //write value in text field
        if(str11 == "Exellent"){num2 = 1500;}   //set price according to car condition
        else if(str11 == "Good"){num2 = 1000;}
        else if(str11 == "Fine"){num2 = 500;}
        num3 = Integer.parseInt(str12);     //convert String into int
        if (str13 == "With Driver"){ num4 = 1000;}      //set price according to facilities
        else{ num4 =0;}
        if (str14 == "With Fuel"){ num5 = 1000;}
        else{ num5 =0;}
        num6 = Integer.parseInt(str15);
        num7 = (num1+num2+num4+num5-num6)*num3 ;       //calculate total
        String s1 = String.valueOf(num7);
        txt12.setText(s1);    
    }
}
void Print(){       //override method of abstract class "Write"
    try{    //try to run the following code
        File file = new File("Order Details.txt");      //create object of file
        FileWriter fr = new FileWriter(file, true);     //create object of FileWriter
        BufferedWriter br = new BufferedWriter(fr);     //create object of BufferedWriter
        PrintWriter pw = new PrintWriter(br);       //create object of PrintWriter
        //we use above classes to append data in the end of file rather than over write the previous data
        String s1 = "Employee name: "+str1;     //making String to write in file
        String s2 = "Employee Id: "+str2;
        String s3 = "Customer name: "+str3;
        String s4 = "Customer CNIC: "+str4;
        String s5 = "Customer Address: "+str5;
        String s6 = "Customer Contact Number: "+str6;
        String s7 = "Customer Account Number: "+str7;
        String s8 = "Customer's City: "+str8;
        String s9 = "Car make: "+str9;
        String s10 = "Car Model: "+str10;
        String s11 = "Car Condition: "+str11;
        String s12 = "Number of Days: "+str12;
        String s13 = "Driver Facility: "+str13;
        String s14 = "Fuel Facility: "+str14;
        String s15 = "Discount: "+str15;
        String s16 = "Payment Method: "+str16;
        String s17 = "Total Amount: "+num7;
        pw.println(s1);     //write data in file
        pw.println(s2);
        pw.println(s3);
        pw.println(s4);
        pw.println(s5);
        pw.println(s6);
        pw.println(s7);
        pw.println(s8);
        pw.println(s9);
        pw.println(s10);
        pw.println(s11);
        pw.println(s12);
        pw.println(s13);
        pw.println(s14);
        pw.println(s15);
        pw.println(s16);
        pw.println(s17);
        pw.println();
        pw.flush();     //enforce all data to write in file
        pw.close();     //closes PrintWriter
        br.close();     //closes BufferedWriter
        fr.close();     //closes FileWriter
    }
    catch(Exception e){ // use try catch if the following code gives error then program does not crash
        System.out.println(e);
    }
}
}

public class Project {      
public static void main(String[] args) {
CarRental obj1 = new CarRental();   //create object of our base class
}    
}
