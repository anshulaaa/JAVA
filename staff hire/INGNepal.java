
/**
 * Write a description of class INGNepal here.
 * this class is used for creating gui for the user to hire the full time staff hire and part time staff hire.
 * this class has action listener method,main method
 * @author (Anshul Agarwal)
 * @version (23 April 2020 )
 */
import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.JLabel; 
import javax.swing.JTextField; 
import javax.swing.JButton; 
import javax.swing.JOptionPane; 
import javax.swing.JComboBox; 
import java.awt.Color; 
import java.util.ArrayList; 
 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import java.awt.Font; 
public class INGNepal implements ActionListener 
{ 
        private JFrame j_fframe; 
        private JPanel j_jjpanel; 
        private JLabel title,title1,pp,pp1,pp2,pp3,pp4,pp5,pp6,pp7,pp8,pp9,pp10,pp11,pp12,pp13,pp14,pp15,pp16,pp17,pp18,pp19,pp20,pp21; 
        private JTextField jk,jk1,jk2,jk3,jk4,jk5,jk6,jk7,jk8,jk9,jk10,jk11,jk12,jk13,jk14,jk16,jk17,jk18,jk19,jk20,jk21; 
        private Font f,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14,f15,f16,f17,f18,f19,f20,f21,f22,f23,f24,f25,f26, f27,f28,f30;  
        private JButton button,button1,button4,button5,button6,button7,button8; 
        private JComboBox jb; 
        FullTimeStaffHire obj2; 
        PartTimeStaffHire obj1; 
        FullTimeStaffHire h; 
        PartTimeStaffHire h9; 
        FullTimeStaffHire hh; 
        PartTimeStaffHire hh1; 
        PartTimeStaffHire hel; 
        ArrayList<StaffHire> all = new ArrayList(); 
         
        public void ingnepal() 
        { 
                  
                   j_fframe =new JFrame();                   //creating j frame 

                   j_fframe.setVisible(true);               //makinh j frame visible  
                   j_fframe.setTitle ("Staff Hire");       //title of jframe 
                   j_fframe.setSize(700,800);             //giving the size of the frame in the from of (width,height) 
                   j_fframe.setResizable(false);         //making the jframe  resizable false so that user cannot make the size of it own 
                   
                    
                   j_fframe.setBackground(Color.RED);  //setting the j frame background color red  
                    
                   j_jjpanel =new JPanel();           //creating jpannnel inside the jframe 
                   j_jjpanel.setLayout(null);         //making jpannel null  
                   j_jjpanel.setBackground(Color.GRAY);           //giving the background color to jpanel 
                   j_fframe.add(j_jjpanel);             //adding jpannel in the jframe 
                    
                   /** 
                    * making the gui for the full time staff hire  
                    * start of  the full time staff hire   
                    */ 
                   title=new JLabel("Full Time Staff Hire");
                   f=new Font("Times New Roman",Font.BOLD,35);      //setting the position of the title 
                   title.setBounds(220,2,500,46);                    //setting bounds 
                   title.setFont(f);                                   //adding fontto the jlabel 
                   j_jjpanel.add(title);                                  //adding title to the pannel 
                    
                   pp=new JLabel(); 
                   pp.setText("Vaccancy Number:");                       //components of frame 
                   f1=new Font("ARIAL",Font.PLAIN,20);              //setting the font style,size 
                   pp.setBounds(27,40,125,50);                           //setting the position of the text 
                   j_jjpanel.add(pp);                                    //adding to jpannel 
                   j_jjpanel.setFont(f1);                                //adding to jpannel 
                    
                   jk=new JTextField();                                 //creating textfield 
                   jk.setBounds(145,55,90,20);                          //set bounds for jk field  
                   j_jjpanel.add(jk);                                   //adding field to pannel. 
                     
                   pp1=new JLabel(); 
                   pp1.setText("Designation:"); 
                   f2=new Font("ARIAL",Font.PLAIN,14); 
                   pp1.setBounds(425,40,85,50); 

                   j_jjpanel.add(pp1); 
                   pp1.setFont(f2); 
                    
                   jk1=new JTextField(); 
                   jk1.setBounds(515,55,90,20); 
                   j_jjpanel.add(jk1); 
                    
                    
                   pp2=new JLabel(); 
                   pp2.setText("Job Type:"); 
                   f3=new Font("ARIAL",Font.PLAIN,14); 
                   pp2.setBounds(27,72,125,50); 
                   j_jjpanel.add(pp2); 
                   pp2.setFont(f3); 
                    
                   jk2=new JTextField(); 
                   jk2.setBounds(145,85,90,20); 
                   j_jjpanel.add(jk2); 
                    
                   pp3=new JLabel(); 
                   pp3.setText("Salary:"); 

                   f4=new Font("ARIAL",Font.PLAIN,14); 
                   pp3.setBounds(425,72,85,50); 
                   j_jjpanel.add(pp3); 
                   pp3.setFont(f4); 
                    
                   jk3=new JTextField(); 
                   jk3.setBounds(515,85,90,20); 
                   j_jjpanel.add(jk3); 
                    
                   pp4=new JLabel(); 
                   pp4.setText("Working Hour:"); 
                   f5=new Font("ARIAL",Font.PLAIN,14); 
                   pp4.setBounds(27,100,125,50); 
                   j_jjpanel.add(pp4); 
                   pp4.setFont(f5); 
                    
                   jk4=new JTextField(); 
                   jk4.setBounds(145,115,90,20); 
                   j_jjpanel.add(jk4); 
                    
                   button = new JButton("ADD FOR FULL TIME STAFF");         //creating j button            
                   button.setBounds(425,115,200,20);                        //setting the bounds of jbutton 
                   button.addActionListener(this);                          //making the button work       
                   j_jjpanel.add(button);                                   //adding button to jframe 
                    
                   
                   pp5=new JLabel(); 
                   pp5.setText("Vaccancy Number:"); 
                   f6=new Font("ARIAL",Font.PLAIN,14); 
                   pp5.setBounds(27,150,125,50); 
                   j_jjpanel.add(pp5); 
                   pp5.setFont(f6); 
                    
                   jk5=new JTextField(); 
                   jk5.setBounds(145,165,90,14); 
                   j_jjpanel.add(jk5); 
                    

                   pp6=new JLabel(); 
                   pp6.setText("Staff Name :"); 
                   f7=new Font("ARIAL",Font.PLAIN,14); 
                   pp6.setBounds(425,150,85,50); 
                   j_jjpanel.add(pp6); 
                   pp6.setFont(f7); 
                    
                   jk6=new JTextField(); 
                   jk6.setBounds(515,165,90,20); 
                   j_jjpanel.add(jk6); 
 
                   pp7=new JLabel(); 
                   pp7.setText("Joining Date:"); 
                   f8=new Font("ARIAL",Font.PLAIN,14); 
                   pp7.setBounds(27,175,125,50); 
                   j_jjpanel.add(pp7); 
                   pp7.setFont(f8); 
                   
                   jk7=new JTextField(); 
                   jk7.setBounds(145,190,90,20); 
                   j_jjpanel.add(jk7); 

                    
                   pp8=new JLabel(); 
                   pp8.setText("Qualification:"); 
                   f9=new Font("ARIAL",Font.PLAIN,14); 
                   pp8.setBounds(425,175,85,50); 
                   j_jjpanel.add(pp8); 
                   pp8.setFont(f9); 
                    
                   jk8=new JTextField(); 
                   jk8.setBounds(515,190,90,20); 
                   j_jjpanel.add(jk8); 
                   
                   pp9=new JLabel(); 
                   pp9.setText("Appointed By:"); 
                   f10=new Font("ARIAL",Font.PLAIN,14); 
                   pp9.setBounds(27,205,125,50); 
                   j_jjpanel.add(pp9); 
                   pp9.setFont(f10); 
                    
                   jk9=new JTextField(); 
                   jk9.setBounds(145,220,90,20); 
                   j_jjpanel.add(jk9); 
                    
                   button1 = new JButton("APPOINT FOR FULL TIME STAFF"); 
                   button1.setBounds(400,220,230,20); 
                   j_jjpanel.add(button1); 
                   button1.addActionListener(this); 
                    
                  /** 
                   * end for full time staff hire 
                   * start for part time staff hire  
                   */ 
               
                   title1 =new JLabel("Part Time Staff Hire");    //title of jframe 
                   f12=new Font("Times New Roman",Font.BOLD,35);      //setting the position of the title 
                   title1.setBounds(190,300,500,46); 
                   title1.setFont(f12); 
                   j_jjpanel.add(title1);   
                    
                   pp10=new JLabel(); 
                   pp10.setText("Vaccancy Number:"); 

                   f13=new Font("ARIAL",Font.PLAIN,13); 
                   pp10.setBounds(27,370,125,50); 
                   j_jjpanel.add(pp10); 
                   pp10.setFont(f13); 
                    
                   jk10=new JTextField(); 
                   jk10.setBounds(145,385,90,20); 
                   j_jjpanel.add(jk10); 
                    
                   pp11=new JLabel(); 
                   pp11.setText("Designation:"); 
                   f14=new Font("ARIAL",Font.PLAIN,14); 
                   pp11.setBounds(425,370,85,50); 
                   j_jjpanel.add(pp11); 
                   pp11.setFont(f14); 
                    
                   jk11=new JTextField(); 
                   jk11.setBounds(515,385,90,20); 
                   j_jjpanel.add(jk11); 
               
                   pp12=new JLabel(); 

                   pp12.setText("Job Type:"); 
                   f15=new Font("ARIAL",Font.PLAIN,14); 
                   pp12.setBounds(27,405,125,50); 
                   j_jjpanel.add(pp12); 
                   pp12.setFont(f15); 
                    
                   jk12=new JTextField(); 
                   jk12.setBounds(145,420,90,20); 
                   j_jjpanel.add(jk12); 
                    
                   pp13=new JLabel(); 
                   pp13.setText("Working Hour:"); 
                   f16=new Font("ARIAL",Font.PLAIN,10); 
                   pp13.setBounds(425,405,85,50); 
                   j_jjpanel.add(pp13); 
                   pp13.setFont(f16); 
                    
                   jk13=new JTextField(); 
                   jk13.setBounds(515,420,90,20); 
                   j_jjpanel.add(jk13); 
                    

                    
                   pp14=new JLabel(); 
                   pp14.setText("Wages Per Hour:"); 
                   f17=new Font("ARIAL",Font.PLAIN,14); 
                   pp14.setBounds(27,435,125,50); 
                   j_jjpanel.add(pp14); 
                   pp14.setFont(f17); 
                    
                   jk14=new JTextField(); 
                   jk14.setBounds(145,450,90,20); 
                   j_jjpanel.add(jk14); 
                    
                    
                   pp15=new JLabel(); 
                   pp15.setText("Shift:"); 
                   f18=new Font("ARIAL",Font.PLAIN,14); 
                   pp15.setBounds(425,435,85,50); 
                   j_jjpanel.add(pp15); 
                   pp15.setFont(f18); 
                    
                   String Shift[]={"Select","Morning","Day","Night"}; 
                   jb= new JComboBox(Shift); 
                   jb.setBounds(515,450,90,20); 
                   j_jjpanel.add(jb); 
                    
                    
                   button4 = new JButton("ADD FOR PART TIME STAFF"); 
                   f19=new Font("ARIAL",Font.PLAIN,14); 
                   button4.setBounds(230,480,200,20); 
                   button4.addActionListener(this); 
                   j_jjpanel.add(button4); 
                   button4.setFont(f19); 
                    
                    
                   pp16=new JLabel(); 
                   pp16.setText("Vaccancy Number:"); 
                   Font f20=new Font("ARIAL",Font.PLAIN,13); 
                   pp16.setBounds(27,500,125,50); 
                   j_jjpanel.add(pp16); 
                   pp16.setFont(f20); 
                    
                   jk16=new JTextField(); 
 
                   jk16.setBounds(145,515,90,20); 
                   j_jjpanel.add(jk16); 
                    
                   pp17=new JLabel(); 
                   pp17.setText("Staff Name :"); 
                   f21=new Font("ARIAL",Font.PLAIN,14); 
                   pp17.setBounds(425,500,85,50); 
                   j_jjpanel.add(pp17); 
                   pp17.setFont(f21); 
                    
                   jk17=new JTextField(); 
                   jk17.setBounds(515,515,90,20); 
                   j_jjpanel.add(jk17); 
                    
                    
                   pp18=new JLabel(); 
                   pp18.setText("Joining Date:"); 
                   f22=new Font("ARIAL",Font.PLAIN,14); 
                   pp18.setBounds(27,530,125,50); 
                   j_jjpanel.add(pp18); 
                   pp18.setFont(f22); 
    
                   jk18=new JTextField(); 
                   jk18.setBounds(145,545,90,14); 
                   j_jjpanel.add(jk18); 
                    
                   pp19=new JLabel(); 
                   pp19.setText("Qualification:"); 
                   f23=new Font("ARIAL",Font.PLAIN,14); 
                   pp19.setBounds(425,530,85,50); 
                   j_jjpanel.add(pp19); 
                   pp19.setFont(f23); 
                    
                   jk19=new JTextField(); 
                   jk19.setBounds(515,545,90,20); 
                   j_jjpanel.add(jk19); 
                    
                   pp20=new JLabel(); 
                   pp20.setText("Appointed By:"); 
                   f24=new Font("ARIAL",Font.PLAIN,14); 
                   pp20.setBounds(27,560,125,50); 
                   j_jjpanel.add(pp20); 
 
                   pp20.setFont(f24); 
                    
                   jk20=new JTextField(); 
                   jk20.setBounds(145,575,90,20); 
                   j_jjpanel.add(jk20); 
                    
                   
                   button5 = new JButton("APPOINT FOR PART TIME STAFF"); 
                   button5.setBounds(400,575,230,20); 
                   f25=new Font("ARIAL",Font.PLAIN,14); 
                   button5.addActionListener(this);   
                   j_jjpanel.add(button5); 
                   button5.setFont(f25); 
                    
                    
                   button6= new JButton("Display"); 
                   button6.setBounds(27,630,90,20); 
                   f26=new Font("ARIAL",Font.PLAIN,14); 
                   button6.addActionListener(this); 
                   j_jjpanel.add(button6); 
                  button6.setFont(f26); 
 
                    
                   button7 = new JButton("Clear"); 
                   button7.setBounds(515,630,90,20); 
                   f27=new Font("ARIAL",Font.PLAIN,14); 
                   button7.addActionListener(this); 
                   j_jjpanel.add(button7); 
                  button7.setFont(f27); 
                    
                   pp21=new JLabel(); 
                   pp21.setText("Vacacy number:"); 
                   f30=new Font("ARIAL",Font.PLAIN,13); 
                   pp21.setBounds(27,660,125,50); 
                   j_jjpanel.add(pp21); 
                   pp21.setFont(f30); 
                    
                   jk21=new JTextField(); 
                   jk21.setBounds(130,675,90,20); 
                   j_jjpanel.add(jk21); 
                    
                   button8 = new JButton("TERMINATE"); 
                   button8.setBounds(230,675,150,20); 

                   f28=new Font("ARIAL",Font.PLAIN,14); 
                   button8.addActionListener(this); 
                   j_jjpanel.add(button8); 
                   button.setFont(f28); 
                    
                   j_fframe.setLayout(null); 
                   j_fframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                
        } 
        /** 
         * end of part time staff hire gui  
         * the below method is the working of the button and what action should be performed after clicking 
         */ 
        public void actionPerformed(ActionEvent event) 
        {     
               if(event.getSource()==button)       
               { 
                    addfulltimestaffhire(); 
               }              
               else if(event.getSource()==button1) 
 
               { 
                   appointfulltimestaffhire(); 
               } 
                else if(event.getSource()==button4) 
               { 
                   addparttimestaffhire(); 
               } 
               else if(event.getSource()==button5) 
               { 
                   appointparttimestaffhire(); 
               } 
               else if (event.getSource()==button6) 
               { 
                   display(); 
               } 
               else if (event.getSource()==button7) 
               { 
                   clear(); 
               } 
               else if (event.getSource()==button8) 
               { 

                   terminate(); 
               } 
        } 
        /** 
         * the below method is to add full time staff hire and check the fields are not allowed to keep empty and if the fields are  
         * kept  empty the pop message is displayed.we are not allowed to keep string or symbools in  the vaccancy number if we keep  
         * the values string or symbool the pop message is displayed.  
         */ 
        public void addfulltimestaffhire() 
        { 
                int  Vacancynumber=0; 
                String Designation=""; 
                String JobType=""; 
                int salary=0; 
                int workingHour=0; 
                 
                try 
                { 
                   if (jk.getText().equals("") || Designation.equals("") ||JobType.equals("")||jk3.getText().equals("")  ||jk4.getText().equals("")) 
   { 
                          JOptionPane.showMessageDialog(j_fframe,"Please enter all the fields"); 
                   }  
                     Vacancynumber=Integer.parseInt(jk.getText()); 
                     Designation=jk1.getText(); 
                     JobType=jk2.getText(); 
                     salary=Integer.parseInt(jk3.getText()); 
                     workingHour=Integer.parseInt(jk4.getText()); 
                     boolean isDuplicateVno=false; 
                     
                   for(StaffHire var:all)  
                   { 
                        if(var.getVacancynumber()==Vacancynumber) 
                        { 
                            isDuplicateVno=true; 
                             
                        } 
                   } 
                   if(isDuplicateVno==false) 
                   { 

                            obj2=new FullTimeStaffHire(Vacancynumber, Designation,JobType,salary,workingHour); 
                            all.add(obj2); 
                            JOptionPane.showMessageDialog(j_fframe,"vacancy added  for full time staff hire "); 
                   } 
                   else 
                   { 
                             JOptionPane.showMessageDialog(j_fframe,"Input Vacancy no is already in the list. ");  
                   } 
                } 
                 
                catch(Exception nfe) 
                { 
                     JOptionPane.showMessageDialog(j_fframe,"Numeric fileds are allowed"); 
                } 
        } 
        /** 
         * the below method is to add part time staff hire and check the fields are not allowed to keep empty and if the fields are  
         * kept  empty the pop message is displayed.we are not allowed to keep string or symbools in  the vaccancy number if we keep  

         * the values string or symbool the pop message is displayed.  
         */ 
        public void addparttimestaffhire() 
        { 
                    try 
                    { 
                         int Vacancynumber=Integer.parseInt(jk10.getText()); 
                         String Designation=jk11.getText(); 
                         String JobType=jk12.getText(); 
                         int workingHour=Integer.parseInt(jk13.getText()); 
                         int wagesPerHour=Integer.parseInt(jk14.getText()); 
                         String shifts=(jb.getSelectedItem()).toString(); 
                         boolean isDuplicateVacancynumber=false; 
                         for(StaffHire var:all)  
                         { 
                                if(var.getVacancynumber()==Vacancynumber) 
                                { 
                                    isDuplicateVacancynumber=true; 
                                    break; 
                                } 
                                if(isDuplicateVacancynumber==false) 
                                  { 
                                    obj1=new PartTimeStaffHire(Vacancynumber,Designation,JobType,workingHour,wagesPerHour,shifts); 
                                    all.add(obj1); 
                                    JOptionPane.showMessageDialog(j_fframe,"Successfully added for part time staff hire"); 
                             
                                  } 
                                else 
                                  { 
                                       JOptionPane.showMessageDialog(j_fframe,"Input Vacancy  no is alredy in the list");   
                                  }    
                          } 
                    
                     }
                    catch(Exception ee) 
                    { 
                            JOptionPane.showMessageDialog(j_fframe,"Please enter all the fields"); 
                      } 
                }
 
        
        /** 
         * the below method is to appoint the  full time staff hire.in this user has to keep same vaccancy number as keept on the add 
         * full time staff hire.if the user has keept the wrong vacancy number then the pop message is didplayed.if the vaccancy number 
         * is same and all the fields are field then when click on appoint button then the part time staff hired. 
         */ 
        public void appointfulltimestaffhire() 
        { 
                        int Vacancynumber=Integer.parseInt(jk5.getText());  
                        String staffName=jk6.getText(); 
                        String joiningDate=jk7.getText(); 
                        String qualification=jk8.getText(); 
                        String appointedBy=jk9.getText(); 
                        boolean vnoFound=false; 
                        for(StaffHire obj:all) 
                        { 
                            if(obj.getVacancynumber()==Vacancynumber) 
                            { 
                                vnoFound=true; 

                               if(obj instanceof FullTimeStaffHire) 
                               { 
                                     h=(FullTimeStaffHire)obj; 
                                    if(h.getjoined()==true) 
                                    { 
                                        JOptionPane.showMessageDialog(j_fframe,"Staff already hired!"); 
                                        break; 
                                    } 
                                    else 
                                    { 
                                       h.hirefulltimestaff(staffName,joiningDate,qualification,appointedBy); 
                                      JOptionPane.showMessageDialog(j_fframe,"Staff has been hired!"); 
                                      break; 
                                    } 
                               } 
                               else 
                               { 
                                    JOptionPane.showMessageDialog(j_fframe,"not for fulltime staff Hire"); 

                                    break; 
                               } 
                            } 
                            else  
                            { 
                                     JOptionPane.showMessageDialog(j_fframe,"invalid vacancy"); 
                                     break; 
                            } 
                        }  
        } 
          /** 
         * the below method is to appoint the part  time staff hire.in this user has to keep same vaccancy number as keept on the add 
         * part time staff hire.if the user has keept the wrong vacancy number then the pop message is didplayed.if the vaccancy number 
         * is same and all the fields are field then when click on appoint button then the part time staff hired.  
         */     
        public void appointparttimestaffhire() 
        { 
                    int Vacancynumber=Integer.parseInt(jk16.getText()); 
                    String staffName=jk17.getText(); 

                    String joiningDate=jk18.getText(); 
                    String qualification=jk19.getText(); 
                    String appointedBy=jk20.getText(); 
                    boolean vnoFound=false; 
                    for(StaffHire obj:all) 
                    { 
                        if(obj.getVacancynumber()==Vacancynumber) 
                        { 
                            vnoFound=true; 
                            if(obj instanceof PartTimeStaffHire) 
                            { 
                                 h9=(PartTimeStaffHire)obj; 
                                if(h9.getjoined()==true) 
                                { 
                                    JOptionPane.showMessageDialog(j_fframe,"Staff already hired!"); 
                                    break; 
                                }else 
                                { 
                                   h9.hireparttimestaffhire(staffName,joiningDate,qualification,appointedBy); 

                                  JOptionPane.showMessageDialog(j_fframe,"Staff has been hired!"); 
                                  break; 
                                } 
                            } 
                            else 
                            { 
                                JOptionPane.showMessageDialog(j_fframe,"not for parttime staff Hire"); 
                                break; 
                            } 
                        } 
                        else  
                        { 
                                 JOptionPane.showMessageDialog(j_fframe,"invalid vacancy");  
                        } 
                       
       
                    }  
        } 
       /** 

         * The below method is used to display all the values from the part time and full time who have been appointed . 
         */ 
           
       public void display() 
       { 
                for(StaffHire obj:all) 
                { 
                    if(obj instanceof FullTimeStaffHire) 
                    { 
                         hh=(FullTimeStaffHire)obj; 
                        hh.display(); 
                    } 
                    else if(obj instanceof PartTimeStaffHire) 
                    { 
                        hh1=(PartTimeStaffHire)obj; 
                        hh1.display(); 
                    } 
                } 
       } 
       /** 

         *the below method is used to clear all fields all the  values will cleared  from the fields from  the gui  
         */ 
         
        public void clear() 
        { 
             
               jk.setText(""); 
               jk1.setText(""); 
               jk2.setText(""); 
               jk3.setText(""); 
               jk4.setText(""); 
               jk5.setText(""); 
               jk6.setText(""); 
               jk7.setText(""); 
               jk8.setText(""); 
               jk9.setText(""); 
               jk10.setText(""); 
               jk11.setText(""); 
               jk12.setText(""); 
               jk13.setText(""); 
 
               jk14.setText(""); 
               jk16.setText(""); 
               jk17.setText(""); 
               jk18.setText(""); 
               jk19.setText(""); 
               jk20.setText(""); 
               jk21.setText(""); 
               jb.setSelectedIndex(0); 
               JOptionPane.showMessageDialog(j_fframe,"All the fields are been  cleared","CLEAR",JOptionPane.WARNING_MESSAGE); 
                
            } 
           /** 
            * this below method is used to terminate the part time staff hire and check the enter vaccancy number is of part time or 
            * full time or not if the vaccancy number is not of part time then the pop messgae is displayed. 
            */ 
           
            public void terminate() 
            { 
               try 
               { 
                    int Vacancy_no=Integer.parseInt(jk21.getText());   
                    for(StaffHire obj:all) 
                    { 
                        if(obj.getVacancynumber()==Vacancy_no) 
                        { 
                            if(obj instanceof PartTimeStaffHire) 
                            { 
                                PartTimeStaffHire hel=(PartTimeStaffHire)obj; 
                                if(hel.getterminated()==true) 
                                { 
                                    JOptionPane.showMessageDialog(j_fframe,"Part-Time Staff is already terminated!"); 
                                    break; 
                                } 
                                else 
                                { 
                                    hel.setterminated(); 
                                    JOptionPane.showMessageDialog(j_fframe,"Part-Time Staff is  terminated!"); 
                                    break; 
                                } 

                            } 
                            else 
                            { 
                                JOptionPane.showMessageDialog(j_fframe,"Not for Part Time Terminate."); 
                                break; 
                            } 
                        } 
                    } 
                } 
                catch(Exception e) 
                { 
                        JOptionPane.showMessageDialog(j_fframe,"Enter the vaccancy number"); 
                } 
            } 
         
          
        public static void main(String[] args) 
        { 
           INGNepal oo = new INGNepal(); // object is created of the INGNepal class 
            oo.ingnepal(); 

        }     
} 