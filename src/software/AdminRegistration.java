/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ELCOT
 */
public class AdminRegistration extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form AdminRegistration
     */
    
     int hour,

    /**
     * Creates new form AdminRegistration
     */
    minute,

    /**
     * Creates new form AdminRegistration
     */
    second;
      Thread Rclock=new Thread(this);
    SimpleDateFormat SDF=new SimpleDateFormat("dd-MM-yyyy");
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date DATE = new Date();
 
    //connection for sqlite database
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    
    static int administrationnumber;
    static String Firstname;
    static    String Lastname;
    static   String Fathername;
    static String Mothername;
    static   String Instrutename;
    static String Studentnumber;
    static String Contactnumber;
    static String Addharnumber;
    static String Mailid;
    static String Course;
    static String address;
    static  String Religion;
    static  String Year;
    static  String AcademyBackground;
    static  String Gender;
    static  String Institute ;
    static String Dob;
    static String Payment ; 
    static long Coursefees;
    static long Gst;
    static long Amountpaid; 
    static long Balanceamount;
    static String PG;
    static String Group;
    static String StudentWa;
    static String ParentsWa;
    static String dateTime;
    static  int totalcoursefees;
    static String note;
    ImageIcon icon;
    
    public AdminRegistration() {
        initComponents();
          //declare connection for sqlite database
        con=ConnectionDb.DbConnection();
    
        icon= new ImageIcon("D:\\Regestation form\\Software\\Logo (2).png");
        setIconImage(icon.getImage());
    
        //Stating the clock thread for clock
        Rclock.start();
        Showdate.setText(String.valueOf(java.time.LocalDate.now()));
    
        //caling class
          AdministionNumberCount administionnumbercount=new AdministionNumberCount(); 
        administrationnumber= administionnumbercount.Return();
        AdministrationNumber.setText(String.valueOf(administrationnumber));
        
       
        //declare the componet to be visible     
        InstituteLabel.setVisible(false);
        InstruteName.setVisible(false);
        yearLabel.setVisible(false);
        YearComboBox.setVisible(false);
        acaLabel.setVisible(false);
        AcademyBackgroundComboBox.setVisible(false);
        groupLabel.setVisible(false);
        GetGroup.setVisible(false);
        
    }
 @Override
      public void run(){
        while(true){
        Calendar cal=Calendar.getInstance();
        hour = cal.get(Calendar.HOUR_OF_DAY); 
        minute= cal.get (Calendar.MINUTE);
        second= cal.get (Calendar.SECOND);
        
        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
        Date dat=cal.getTime();
        String Time=sdf.format(dat);
        ShowTime.setText(Time);
        
        }
    }
          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        MaleRadioButton = new javax.swing.JRadioButton();
        FemaleRadioButton = new javax.swing.JRadioButton();
        FatherName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        SchoolRadioButton = new javax.swing.JRadioButton();
        CollegeRadioButton = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
        OtherGenderRadioButton = new javax.swing.JRadioButton();
        EmployeeRadioButton = new javax.swing.JRadioButton();
        UnEmployeeRadioButton = new javax.swing.JRadioButton();
        OtherEducationRadioButton = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        InstruteName = new javax.swing.JTextField();
        InstituteLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        YearComboBox = new javax.swing.JComboBox<>();
        acaLabel = new javax.swing.JLabel();
        groupLabel = new javax.swing.JLabel();
        GetGroup = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        GetReligion = new javax.swing.JTextField();
        AcademyBackgroundComboBox = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        MotherName = new javax.swing.JTextField();
        DOB = new com.toedter.calendar.JDateChooser();
        CoursePanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        CourseComboBox = new javax.swing.JComboBox<>();
        SelectCourse = new javax.swing.JButton();
        jPanel56 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        StudentNumber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        AddharNumber = new javax.swing.JTextField();
        MailId = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        PGName = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        ContactNumber = new javax.swing.JTextField();
        ParentwaCheckBox = new javax.swing.JCheckBox();
        StudentwaCheckBox = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        AgreeRadioBUtton = new javax.swing.JCheckBox();
        NextButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        PaymentPanel = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        SingelpayRadioButton = new javax.swing.JRadioButton();
        DoublepayRadioButton = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        CourseFees = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        AmountPaid = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        GST = new javax.swing.JTextField();
        Calculate = new javax.swing.JButton();
        Showdate = new javax.swing.JLabel();
        c = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        AdministrationNumber = new javax.swing.JTextField();
        ShowTime = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ShowBill = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 75)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Registration Form");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("First Name");

        FirstName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("Father Name");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Gender");

        MaleRadioButton.setBackground(new java.awt.Color(51, 153, 255));
        MaleRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        MaleRadioButton.setText("Male");
        MaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRadioButtonActionPerformed(evt);
            }
        });

        FemaleRadioButton.setBackground(new java.awt.Color(51, 153, 255));
        FemaleRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FemaleRadioButton.setText("Female");
        FemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleRadioButtonActionPerformed(evt);
            }
        });

        FatherName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Education");

        SchoolRadioButton.setBackground(new java.awt.Color(51, 153, 255));
        SchoolRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SchoolRadioButton.setText("School");
        SchoolRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SchoolRadioButtonActionPerformed(evt);
            }
        });

        CollegeRadioButton.setBackground(new java.awt.Color(51, 153, 255));
        CollegeRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CollegeRadioButton.setText("College");
        CollegeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CollegeRadioButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Last Name");

        LastName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        OtherGenderRadioButton.setBackground(new java.awt.Color(51, 153, 255));
        OtherGenderRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        OtherGenderRadioButton.setText("Other");
        OtherGenderRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherGenderRadioButtonActionPerformed(evt);
            }
        });

        EmployeeRadioButton.setBackground(new java.awt.Color(51, 153, 255));
        EmployeeRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        EmployeeRadioButton.setText("Employee");
        EmployeeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeRadioButtonActionPerformed(evt);
            }
        });

        UnEmployeeRadioButton.setBackground(new java.awt.Color(51, 153, 255));
        UnEmployeeRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        UnEmployeeRadioButton.setText("UnEmployee");
        UnEmployeeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnEmployeeRadioButtonActionPerformed(evt);
            }
        });

        OtherEducationRadioButton.setBackground(new java.awt.Color(51, 153, 255));
        OtherEducationRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        OtherEducationRadioButton.setText("Other");
        OtherEducationRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherEducationRadioButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Date Of Birth");

        InstruteName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        InstituteLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        InstituteLabel.setText("Institute Name");

        yearLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        yearLabel.setText("Year");

        YearComboBox.setEditable(true);
        YearComboBox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        YearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Std", "2 Std", "3 Std", "4 Std", "5 Std", "6 St", "7 Std", "8 Std", "9 Std", "10 Std", "11 Std", "12 Std", "1st year", "2nd year", "3rd year", "4th year" }));
        YearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearComboBoxActionPerformed(evt);
            }
        });

        acaLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        acaLabel.setText("Academy background");

        groupLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        groupLabel.setText("Group");

        GetGroup.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel23.setText("Religion");

        GetReligion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        AcademyBackgroundComboBox.setEditable(true);
        AcademyBackgroundComboBox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AcademyBackgroundComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "State board", "CBSE", "ICSE", "Anna university", "Madras university ", "Other   " }));
        AcademyBackgroundComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcademyBackgroundComboBoxActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel34.setText("Mother Name");

        MotherName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        DOB.setDateFormatString("dd-MMM-yyyy");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel23)
                            .addComponent(InstituteLabel))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MaleRadioButton)
                            .addComponent(FirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(FatherName)
                            .addComponent(FemaleRadioButton)
                            .addComponent(OtherGenderRadioButton)
                            .addComponent(GetReligion)
                            .addComponent(InstruteName)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(acaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AcademyBackgroundComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(yearLabel)
                            .addComponent(groupLabel))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(62, 62, 62)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MotherName)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(CollegeRadioButton)
                        .addGap(38, 38, 38)
                        .addComponent(SchoolRadioButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(EmployeeRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(UnEmployeeRadioButton))
                    .addComponent(OtherEducationRadioButton)
                    .addComponent(LastName)
                    .addComponent(DOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(YearComboBox, 0, 293, Short.MAX_VALUE)
                    .addComponent(GetGroup, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(76, 76, 76))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(FatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(MotherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(MaleRadioButton)
                    .addComponent(jLabel8)
                    .addComponent(CollegeRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SchoolRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FemaleRadioButton)
                    .addComponent(EmployeeRadioButton)
                    .addComponent(UnEmployeeRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OtherGenderRadioButton)
                    .addComponent(OtherEducationRadioButton))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GetGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(groupLabel)
                            .addComponent(acaLabel)
                            .addComponent(AcademyBackgroundComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23)
                                .addComponent(GetReligion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(YearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InstituteLabel)
                            .addComponent(InstruteName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        CoursePanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Course");

        CourseComboBox.setEditable(true);
        CourseComboBox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CourseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tally", "Tally Prime", "Oracle", "MS Office", "C & C++ Programming", "C Programming", "C++ Programming", "HTML", "PHP Developer", "Python", "Android", "Big Data Programming", "Big Data Analytics", "Cloud Computing", "Cyber Secure User", "Hacking Expert", "Forensic Investigator Computer Hacking - 007", "Secure Programmer Expert - Android", "Secure Programmer Expert - PHP", "Secure Programmer Expert - Java", "Secure Programmer Expert - .NET", "Mobile Forensic Advance Security", "Security Cyber Analytics", "Network Security Administrator Expert", "Incident Handler Expert - SIHE", "Penetration Testing Expert", "Expert Security Specialist", "Certified Software Testing", "Expert loT Specialist (SEIS)", "Digital Marketing Expert (SDME)", "Certified DevOps Expert", "Expert Blockchain Specialist", "DIPLOMA IN COMPUTER APPLICATION (DCA)", "HONORS DIPLOMA IN COMPUTER APPLICATION (HDCA)", "MASTER DIPLOMA IN COMPUTER APPLICATION (MDCA)", "HONORS DIPLOMA IN MULTIMEDIA PROGRAMMING (HDMP)", "MULTIMEDIA PROGRAMMING", "AUTO CADD", "SPOKEN ENGLISH", "SPOKEN ENGLISH- Level 1", "SPOKEN ENGLISH- Level 2", "SPOKEN ENGLISH- Level 3", "SPOKEN ENGLISH- Corporate Training", "DIPLOMA IN HARDWARE  NETWORK  (DHN)" }));
        CourseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseComboBoxActionPerformed(evt);
            }
        });

        SelectCourse.setBackground(new java.awt.Color(255, 255, 255));
        SelectCourse.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SelectCourse.setText("Select");
        SelectCourse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SelectCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectCourseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CoursePanelLayout = new javax.swing.GroupLayout(CoursePanel);
        CoursePanel.setLayout(CoursePanelLayout);
        CoursePanelLayout.setHorizontalGroup(
            CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoursePanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addGap(121, 121, 121)
                .addComponent(CourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211)
                .addComponent(SelectCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CoursePanelLayout.setVerticalGroup(
            CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(SelectCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel56.setBackground(new java.awt.Color(51, 153, 255));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Address");

        Address.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Student Number");

        StudentNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Addhar Number");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Mail Id");

        AddharNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        MailId.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel24.setText("Parent/Guardian Name");

        PGName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel25.setText("Contact Number");

        ContactNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        ParentwaCheckBox.setBackground(new java.awt.Color(51, 153, 255));
        ParentwaCheckBox.setText("Whatsapp Number");

        StudentwaCheckBox.setBackground(new java.awt.Color(51, 153, 255));
        StudentwaCheckBox.setText("Whatsapp Number");

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4))
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel56Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(StudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ParentwaCheckBox)
                            .addComponent(PGName, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Address, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addGap(59, 59, 59)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StudentwaCheckBox)
                    .addComponent(ContactNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(MailId)
                    .addComponent(AddharNumber))
                .addGap(63, 63, 63))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(PGName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(ContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(StudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ParentwaCheckBox))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel56Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StudentwaCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(MailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)))
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AddharNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel13.setText("By checking 'l Agree' below and submitting this form, you, the Parent or Guardian of the above student(s), agree to release  \"Studio Name Here\", including instructors and assistants from  liability for any and all injuries which occur  ");

        jLabel14.setText("while training,  practicing, performing, or during any studio event or activity. You also agree that you are responsible for health and accident insurance and any medical costs incurred due to injury. You give permission for ");

        jLabel16.setText("emergency medical transportation accident and treatment of your student(s) at your expense should the need arise. You also give your permission for the public display of any studio visual images that your child may appear in.  ");

        AgreeRadioBUtton.setBackground(new java.awt.Color(51, 153, 255));
        AgreeRadioBUtton.setText("agree terms and condition");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(AgreeRadioBUtton))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AgreeRadioBUtton)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel2);

        NextButton.setBackground(new java.awt.Color(255, 255, 255));
        NextButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        NextButton.setText("Save");
        NextButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        ClearButton.setBackground(new java.awt.Color(255, 255, 255));
        ClearButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        PaymentPanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel26.setText("Regestration Fees");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel27.setText("200");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel28.setText("Payment Type");

        SingelpayRadioButton.setBackground(new java.awt.Color(51, 153, 255));
        SingelpayRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SingelpayRadioButton.setText("Single Payment");
        SingelpayRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SingelpayRadioButtonActionPerformed(evt);
            }
        });

        DoublepayRadioButton.setBackground(new java.awt.Color(51, 153, 255));
        DoublepayRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DoublepayRadioButton.setText("Double Payment");
        DoublepayRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoublepayRadioButtonActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel29.setText("Course Fees");

        CourseFees.setEditable(false);
        CourseFees.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel30.setText("Amount Paid");

        AmountPaid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel31.setText("GST");

        GST.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Calculate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Calculate.setText("Calculate");
        Calculate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PaymentPanelLayout = new javax.swing.GroupLayout(PaymentPanel);
        PaymentPanel.setLayout(PaymentPanelLayout);
        PaymentPanelLayout.setHorizontalGroup(
            PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PaymentPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29))))
                .addGap(29, 29, 29)
                .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PaymentPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CourseFees, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                    .addComponent(AmountPaid, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaymentPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))
                    .addGroup(PaymentPanelLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel31))
                        .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaymentPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GST, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))
                            .addGroup(PaymentPanelLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DoublepayRadioButton)
                                    .addComponent(SingelpayRadioButton))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        PaymentPanelLayout.setVerticalGroup(
            PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(SingelpayRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DoublepayRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(CourseFees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(GST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AmountPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        Showdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        c.setBackground(new java.awt.Color(51, 153, 255));

        jLabel32.setBackground(new java.awt.Color(51, 153, 255));
        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel32.setText("Administration Number");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        AdministrationNumber.setEditable(false);
        AdministrationNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout cLayout = new javax.swing.GroupLayout(c);
        c.setLayout(cLayout);
        cLayout.setHorizontalGroup(
            cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(AdministrationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cLayout.setVerticalGroup(
            cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(AdministrationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ShowTime.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        ShowBill.setEditable(false);
        ShowBill.setColumns(20);
        ShowBill.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ShowBill.setRows(5);
        jScrollPane2.setViewportView(ShowBill);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ShowTime, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Showdate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(417, 417, 417)
                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel56, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CoursePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 1207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PaymentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 66, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ShowTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Showdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)))
                .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CoursePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(PaymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1132, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Back to previous page
        AdminOptionForm optionform=new AdminOptionForm();
        optionform.setVisible(true);dispose();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleRadioButtonActionPerformed
        // when one radio button is selecte is set off the another
        if(MaleRadioButton.isSelected()){
            FemaleRadioButton.setSelected(false);
            OtherGenderRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_MaleRadioButtonActionPerformed

    private void FemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleRadioButtonActionPerformed
        // when one radio button is selecte is set off the another

        if(FemaleRadioButton.isSelected()){
            MaleRadioButton.setSelected(false);
            OtherGenderRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_FemaleRadioButtonActionPerformed

    private void SchoolRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SchoolRadioButtonActionPerformed
        // when one radio button is selecte is set off the another
        if(SchoolRadioButton.isSelected()){

            CollegeRadioButton.setSelected(false);
            EmployeeRadioButton.setSelected(false);
            OtherEducationRadioButton.setSelected(false);
            EmployeeRadioButton.setSelected(false);
            InstituteLabel.setVisible(true);
            InstruteName.setVisible(true);
            yearLabel.setVisible(true);
            YearComboBox.setVisible(true);
            acaLabel.setVisible(true);
            AcademyBackgroundComboBox.setVisible(true);
            groupLabel.setVisible(true);
            GetGroup.setVisible(true);

        }
    }//GEN-LAST:event_SchoolRadioButtonActionPerformed

    private void CollegeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CollegeRadioButtonActionPerformed
        // when one radio button is selecte is set off the another
        if(CollegeRadioButton.isSelected()){
            SchoolRadioButton.setSelected(false);
            EmployeeRadioButton.setSelected(false);
            OtherEducationRadioButton.setSelected(false);
            UnEmployeeRadioButton.setSelected(false);
            InstituteLabel.setVisible(true);
            InstruteName.setVisible(true);
            yearLabel.setVisible(true);
            YearComboBox.setVisible(true);
            acaLabel.setVisible(true);
            AcademyBackgroundComboBox.setVisible(true);
            groupLabel.setVisible(true);
            GetGroup.setVisible(true);
        }
    }//GEN-LAST:event_CollegeRadioButtonActionPerformed

    private void OtherGenderRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherGenderRadioButtonActionPerformed
        //when one radio button is selecte is set off the another
        if(OtherGenderRadioButton.isSelected()){

            FemaleRadioButton.setSelected(false);
            MaleRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_OtherGenderRadioButtonActionPerformed

    private void EmployeeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeRadioButtonActionPerformed
        // when one radio button is selecte is set off the another
        if(EmployeeRadioButton.isSelected()){
            CollegeRadioButton.setSelected(false);
            SchoolRadioButton.setSelected(false);
            OtherEducationRadioButton.setSelected(false);
            UnEmployeeRadioButton.setSelected(false);
            InstituteLabel.setVisible(false);
            InstruteName.setVisible(false);
            yearLabel.setVisible(false);
            YearComboBox.setVisible(false);
            acaLabel.setVisible(false);
            AcademyBackgroundComboBox.setVisible(false);
            groupLabel.setVisible(false);
            GetGroup.setVisible(false);
        }
    }//GEN-LAST:event_EmployeeRadioButtonActionPerformed

    private void UnEmployeeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnEmployeeRadioButtonActionPerformed
        // when one radio button is selecte is set off the another
        if( UnEmployeeRadioButton.isSelected()){
            CollegeRadioButton.setSelected(false);
            SchoolRadioButton.setSelected(false);
            EmployeeRadioButton.setSelected(false);
            OtherEducationRadioButton.setSelected(false);
            InstituteLabel.setVisible(false);
            InstruteName.setVisible(false);
            yearLabel.setVisible(false);
            YearComboBox.setVisible(false);
            acaLabel.setVisible(false);
            AcademyBackgroundComboBox.setVisible(false);
            groupLabel.setVisible(false);
            GetGroup.setVisible(false);
        }

    }//GEN-LAST:event_UnEmployeeRadioButtonActionPerformed

    private void OtherEducationRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherEducationRadioButtonActionPerformed
        // when one radio button is selecte is set off the another
        if(OtherEducationRadioButton.isSelected()){
            CollegeRadioButton.setSelected(false);
            SchoolRadioButton.setSelected(false);
            EmployeeRadioButton.setSelected(false);
            UnEmployeeRadioButton.setSelected(false);
            InstituteLabel.setVisible(false);
            InstruteName.setVisible(false);
            yearLabel.setVisible(false);
            YearComboBox.setVisible(false);
            acaLabel.setVisible(false);
            AcademyBackgroundComboBox.setVisible(false);
            groupLabel.setVisible(false);
            GetGroup.setVisible(false);
        }
    }//GEN-LAST:event_OtherEducationRadioButtonActionPerformed

    private void YearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearComboBoxActionPerformed
        //combo box list

        YearComboBox.addItem("1 Std");
        YearComboBox.addItem("2 Std");
        YearComboBox.addItem("3 Std");
        YearComboBox.addItem("4 Std");
        YearComboBox.addItem("5 Std");
        YearComboBox.addItem("6 Std");
        YearComboBox.addItem("7 Std");
        YearComboBox.addItem("8 Std");
        YearComboBox.addItem("9 Std");
        YearComboBox.addItem("10 Std");
        YearComboBox.addItem("11 Std");
        YearComboBox.addItem("12 Std");
        YearComboBox.addItem("1st year");
        YearComboBox.addItem("2nd year");
        YearComboBox.addItem("3rd year");
        YearComboBox.addItem("4th year");
        YearComboBox.setVisible(true);

    }//GEN-LAST:event_YearComboBoxActionPerformed

    private void AcademyBackgroundComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcademyBackgroundComboBoxActionPerformed
        ///combo box list
        AcademyBackgroundComboBox.addItem("State board");
        AcademyBackgroundComboBox.addItem("CBSE");
        AcademyBackgroundComboBox.addItem("ICSE");
        AcademyBackgroundComboBox.addItem("Anna university");
        AcademyBackgroundComboBox.addItem("Madras university");
        AcademyBackgroundComboBox.addItem("Other");
        AcademyBackgroundComboBox.setEditable(true);
        AcademyBackgroundComboBox.setVisible(true);

        AcademyBackground=AcademyBackgroundComboBox.getSelectedItem().toString();

    }//GEN-LAST:event_AcademyBackgroundComboBoxActionPerformed

    private void CourseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseComboBoxActionPerformed
        // combo box list
        CourseComboBox.addItem("Tally");
        CourseComboBox.addItem("Tally Prime");
        CourseComboBox.addItem("Oracle");
        CourseComboBox.addItem("MS Office");
        CourseComboBox.addItem("C & C++ Programming");
        CourseComboBox.addItem("C Programming");
        CourseComboBox.addItem("C++ Programming");
        CourseComboBox.addItem("HTML");
        CourseComboBox.addItem("PHP Developer");
        CourseComboBox.addItem("Python");
        CourseComboBox.addItem("Android");
        CourseComboBox.addItem("Big Data Programming");
        CourseComboBox.addItem("Big Data Analytics");
        CourseComboBox.addItem("Cloud Computing");
        CourseComboBox.addItem("Cyber Secure User");
        CourseComboBox.addItem("Hacking Expert");
        CourseComboBox.addItem("Forensic Investigator Computer Hacking - 007");
        CourseComboBox.addItem("Secure Programmer Expert - Android");
        CourseComboBox.addItem("Secure Programmer Expert - PHP");
        CourseComboBox.addItem("Secure Programmer Expert - Java");
        CourseComboBox.addItem("Secure Programmer Expert - .NET");
        CourseComboBox.addItem("Mobile Forensic Advance Security");
        CourseComboBox.addItem("Security Cyber Analytics");
        CourseComboBox.addItem("Network Security Administrator Expert");
        CourseComboBox.addItem("Incident Handler Expert - SIHE");
        CourseComboBox.addItem("Penetration Testing Expert");
        CourseComboBox.addItem("Expert Security Specialist");
        CourseComboBox.addItem("Certified Software Testing");
        CourseComboBox.addItem("Expert loT Specialist (SEIS)");
        CourseComboBox.addItem("Digital Marketing Expert (SDME)");
        CourseComboBox.addItem("Certified DevOps Expert");
        CourseComboBox.addItem("Expert Blockchain Specialist");
        CourseComboBox.addItem("DIPLOMA IN COMPUTER APPLICATION (DCA)");
        CourseComboBox.addItem("HONORS DIPLOMA IN COMPUTER APPLICATION (HDCA)");
        CourseComboBox.addItem("MASTER DIPLOMA IN COMPUTER APPLICATION (MDCA)");
        CourseComboBox.addItem("HONORS DIPLOMA IN MULTIMEDIA PROGRAMMING (HDMP)");
        CourseComboBox.addItem("MULTIMEDIA PROGRAMMING");
        CourseComboBox.addItem("AUTO CADD");
        CourseComboBox.addItem("SPOKEN ENGLISH");
        CourseComboBox.addItem("SPOKEN ENGLISH- Level 1");
        CourseComboBox.addItem("SPOKEN ENGLISH- Level 2");
        CourseComboBox.addItem("SPOKEN ENGLISH- Level 3");
        CourseComboBox.addItem("SPOKEN ENGLISH- Corporate Training");
        CourseComboBox.addItem("DIPLOMA IN HARDWARE  NETWORK  (DHN)");
        CourseComboBox.setVisible(true);
        CourseComboBox.setEditable(true);

    }//GEN-LAST:event_CourseComboBoxActionPerformed

    private void SelectCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectCourseActionPerformed

        Course=CourseComboBox.getSelectedItem().toString();
        Coursefee();
        CourseFees.setText(String.valueOf(Coursefees));
    }//GEN-LAST:event_SelectCourseActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        //Save the Student data in sqlite database

        if(!AgreeRadioBUtton.isSelected()){
            JOptionPane.showMessageDialog(this,"Terms and conditiion are not agreed");

        }else{
            //sent thew data to next page for printout
            GetDatas();
            UserPrintoutPage printoutpage=new UserPrintoutPage();
            printoutpage.DataStudent(Firstname, Lastname, Fathername, Instrutename, Studentnumber, Contactnumber,
                Addharnumber, Mailid, Course, address, Religion, Year, AcademyBackground, Gender, Institute,
                Dob, Payment, Coursefees, Gst, Amountpaid, Balanceamount,PG,Group,Institute,dateTime,
                administrationnumber,totalcoursefees);
            printoutpage.setVisible(true);

            try{
                String sql="INSERT INTO Registrationtable VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                pst =con.prepareStatement(sql);

                pst.setLong(1,  administrationnumber);                                                         //1
                pst.setString(2, Firstname);                                                                   //2
                pst.setString(3, Lastname);                                                                    //3
                pst.setString(4, Fathername);                                                                  //4
                pst.setString(5, Mothername);                                                                  //5
                pst.setString(6,  Religion);                                                                   //6
                pst.setString(7,   ((JTextField)DOB.getDateEditor().getUiComponent()).getText());              //7
                pst.setString(8,  Gender);                                                                     //8
                pst.setString(9, Institute);                                                                   //9
                pst.setString(10,  Instrutename);                                                              //10
                pst.setString(11,  AcademyBackground);                                                         //11
                pst.setString(12, Group);                                                                      //12
                pst.setString(13, Year);                                                                       //13
                pst.setString(14,  Course);                                                                   //14
                pst.setString(15, PG);                                                                        //15
                pst.setString(16, Studentnumber);                                                             //16
                pst.setString(17, StudentWa);                                                                 //17
                pst.setString(18, Contactnumber);                                                             //18
                pst.setString(19, ParentsWa);                                                                 //19
                pst.setString(20,  Addharnumber);                                                             //20
                pst.setString(21, Mailid);                                                                    //21
                pst.setString(22, address);                                                                   //22
                pst.setString(23,  Payment);                                                                  //23
                pst.setLong(24, Coursefees);                                                                  ///24
                pst.setLong(25, Gst);                                                                         //25
                pst.setLong(26,  Amountpaid);                                                                 //26
                pst.setInt(27,totalcoursefees );                                                              //27
                pst.setLong(28, Balanceamount);                                                               //28
                pst.setString(29, dateTime);                                                                  //29
                pst.setString(30, "null");                                                                   //30

                pst.execute();
                JOptionPane.showMessageDialog(this,"Saved");
                System.out.println("Successfully saved the student data");
                dispose();

            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"fail to save student data");
                System.out.println("fail to save student data"+e);

            }finally{
                try{
                    pst.close();
                    System.out.println("Sucessfuly closed the database");

                }catch(Exception e){
                    System.out.println("fail to close the database"+e);
                }
            }
            Rclock.stop();
        }
    }//GEN-LAST:event_NextButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // clear text felid
        FirstName.setText(null);
        LastName.setText(null);
        FatherName.setText(null);
        Address.setText(null);
        InstruteName.setText(null);
        StudentNumber.setText(null);
        AddharNumber.setText(null);
        MailId.setText(null);
        AgreeRadioBUtton.setSelected(false);

    }//GEN-LAST:event_ClearButtonActionPerformed

    private void SingelpayRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SingelpayRadioButtonActionPerformed
        // when one radio button is selecte is set off the another
        if(SingelpayRadioButton.isSelected()){
            DoublepayRadioButton.setSelected(false);

        }
    }//GEN-LAST:event_SingelpayRadioButtonActionPerformed

    private void DoublepayRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoublepayRadioButtonActionPerformed
        // when one radio button is selecte is set off the another
        if(DoublepayRadioButton.isSelected()){
            SingelpayRadioButton.setSelected(false);
        }

    }//GEN-LAST:event_DoublepayRadioButtonActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        // Calculation for the fees

        Gst=Integer.valueOf(GST.getText());
        Amountpaid=Long.valueOf(AmountPaid.getText());

        long Gstamount=Coursefees*Gst/100;
        totalcoursefees=(int) (Coursefees+Gstamount+200);
        Balanceamount=totalcoursefees-Amountpaid;
        ShowBill.setText("                               My First Step Computer Skill"
            +"\n Course Fees                                                           "+String.valueOf(Coursefees)
            +"\n GST%                                          "+Gst+"%                  "+String.valueOf(Gstamount)
            +"\n Total Course Fees                                                  "+String.valueOf(totalcoursefees)
            +"\n Fess Paid                                                              "+String.valueOf(Amountpaid)
            +"\n Balance to pay                                                       "+String.valueOf(Balanceamount));
    }//GEN-LAST:event_CalculateActionPerformed

    private void Coursefee(){
          try{
           //SELECT UNIQUE column_name  FROM table_name;  
                   String sql="SELECT Course,Price   FROM Coursedata WHERE Course='"+Course+"';";
                   pst =con.prepareStatement(sql);
                   rs=pst.executeQuery();
                   
                   if(rs.next()){
                    Coursefees= rs.getLong("Price");
                    
                   }
                   
            
                    System.out.println("1");
            }catch(Exception e){
                 System.out.println("2"+e);
             }finally{
                 try{
                    
                     pst.close();
                     System.out.println("3");
                 }catch(Exception e){
                     System.out.println("4"+e);
                 }
             }
    }
   private  void GetDatas(){
         if(!AgreeRadioBUtton.isSelected()){
            JOptionPane.showMessageDialog(this,"Terms and conditiion are not agreed");

        }{
            //get user details

            Firstname=FirstName.getText();
            Lastname=LastName.getText();
            Fathername=FatherName.getText();
            Mothername=MotherName.getText();
            
            Studentnumber=StudentNumber.getText();
            Contactnumber=ContactNumber.getText();
            Addharnumber= AddharNumber.getText();
            Mailid=MailId.getText().toLowerCase();
            Course=CourseComboBox.getSelectedItem().toString();
            
            Religion=GetReligion.getText();
            // Dob= SDF.format(DOB.getValue());
            PG=PGName.getText();
            
            dateTime=formatter.format(DATE);
            Dob=((JTextField)DOB.getDateEditor().getUiComponent()).getText();
           
            address=Address.getText();

            StudentWa=null;
            if(StudentwaCheckBox.isSelected()){
                StudentWa="yes";
            }else{
                StudentWa="no";
            }

            ParentsWa=null;
            if(ParentwaCheckBox.isSelected()){
                ParentsWa="yes";
            }else{
                ParentsWa="no";
            }

            Gender=null;
            if(MaleRadioButton.isSelected()){
                Gender="Male";
            }if(FemaleRadioButton.isSelected()){
                Gender="Female";
            } if(OtherGenderRadioButton.isSelected()){
                Gender="Other";
            }

            Institute =null;
            if(SchoolRadioButton.isSelected()){
                Institute ="School";
                Instrutename=InstruteName.getText();
                AcademyBackground=AcademyBackgroundComboBox.getSelectedItem().toString();
                Group=GetGroup.getText();
                  Year= YearComboBox.getSelectedItem().toString();
            }if(CollegeRadioButton.isSelected()){
                Institute ="College";
                Instrutename=InstruteName.getText();
                AcademyBackground=AcademyBackgroundComboBox.getSelectedItem().toString();
                Group=GetGroup.getText();
                  Year= YearComboBox.getSelectedItem().toString();
            }if(OtherEducationRadioButton.isSelected()){
                Institute ="Other";
                Instrutename="nill";
                AcademyBackground="nill";
                Group="nill";
                Year="nill";
                        
            }if(EmployeeRadioButton.isSelected()){
                Institute ="Employee";
                
                 Instrutename="nill";
                AcademyBackground="nill";
                Group="nill";
                Year="nill";
                
            }if(UnEmployeeRadioButton.isSelected()){
                Institute="UnEmployee";
                
                 Instrutename="nill";
                AcademyBackground="nill";
                Group="nill";
                Year="nill";
                
            }

            Payment=null;
            if(DoublepayRadioButton.isSelected()){
                Payment="Double Payment";
            }
            if(SingelpayRadioButton.isSelected()){
                Payment="Single Payment";
            }
    }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminRegistration().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AcademyBackgroundComboBox;
    private javax.swing.JTextField AddharNumber;
    private javax.swing.JTextField Address;
    private javax.swing.JTextField AdministrationNumber;
    private javax.swing.JCheckBox AgreeRadioBUtton;
    private javax.swing.JTextField AmountPaid;
    private javax.swing.JButton Calculate;
    private javax.swing.JButton ClearButton;
    private javax.swing.JRadioButton CollegeRadioButton;
    private javax.swing.JTextField ContactNumber;
    private javax.swing.JComboBox<String> CourseComboBox;
    private javax.swing.JTextField CourseFees;
    private javax.swing.JPanel CoursePanel;
    private com.toedter.calendar.JDateChooser DOB;
    private javax.swing.JRadioButton DoublepayRadioButton;
    private javax.swing.JRadioButton EmployeeRadioButton;
    public static javax.swing.JTextField FatherName;
    private javax.swing.JRadioButton FemaleRadioButton;
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField GST;
    private javax.swing.JTextField GetGroup;
    private javax.swing.JTextField GetReligion;
    private javax.swing.JLabel InstituteLabel;
    private javax.swing.JTextField InstruteName;
    private javax.swing.JTextField LastName;
    private javax.swing.JTextField MailId;
    private javax.swing.JRadioButton MaleRadioButton;
    private javax.swing.JTextField MotherName;
    private javax.swing.JButton NextButton;
    private javax.swing.JRadioButton OtherEducationRadioButton;
    private javax.swing.JRadioButton OtherGenderRadioButton;
    private javax.swing.JTextField PGName;
    private javax.swing.JCheckBox ParentwaCheckBox;
    private javax.swing.JPanel PaymentPanel;
    private javax.swing.JRadioButton SchoolRadioButton;
    private javax.swing.JButton SelectCourse;
    private javax.swing.JTextArea ShowBill;
    private javax.swing.JLabel ShowTime;
    private javax.swing.JLabel Showdate;
    private javax.swing.JRadioButton SingelpayRadioButton;
    private javax.swing.JTextField StudentNumber;
    private javax.swing.JCheckBox StudentwaCheckBox;
    private javax.swing.JRadioButton UnEmployeeRadioButton;
    private javax.swing.JComboBox<String> YearComboBox;
    private javax.swing.JLabel acaLabel;
    private javax.swing.JPanel c;
    private javax.swing.JLabel groupLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables

  
}
