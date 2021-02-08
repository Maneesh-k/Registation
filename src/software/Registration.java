//Package
package software;

//imports
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Registration extends javax.swing.JFrame implements Runnable{
     
    //creating therad for clock
    int hour,minute,second;
    Thread Rclock=new Thread(this);
    SimpleDateFormat SDF=new SimpleDateFormat("dd-MM-yyyy");
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date DATE = new Date();
 
    //connection for sqlite database
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;

    //create objects
    static long administrationnumber;
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
    
    //main class
    public Registration() {
        
        //declare connection for sqlite database
        con=ConnectionDb.DbConnection();
    
        //declare he jcomponets
        initComponents();
    
        //Stating the clock thread for clock
        Rclock.start();
        Showdate.setText(String.valueOf(java.time.LocalDate.now()));
    
        //caling class
        Administrationnumber();
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
    
      
    //override for clock thread
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
      
    //create the thread for stop the clock  
    private void stop() {
        Rclock.stop();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        CourseComboBox = new javax.swing.JComboBox<>();
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
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
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

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

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
        FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("Father Name");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Gender");

        MaleRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        MaleRadioButton.setText("Male");
        MaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRadioButtonActionPerformed(evt);
            }
        });

        FemaleRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FemaleRadioButton.setText("Female");
        FemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleRadioButtonActionPerformed(evt);
            }
        });

        FatherName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FatherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FatherNameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Education");

        SchoolRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SchoolRadioButton.setText("School");
        SchoolRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SchoolRadioButtonActionPerformed(evt);
            }
        });

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
        LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameActionPerformed(evt);
            }
        });

        OtherGenderRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        OtherGenderRadioButton.setText("Other");
        OtherGenderRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherGenderRadioButtonActionPerformed(evt);
            }
        });

        EmployeeRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        EmployeeRadioButton.setText("Employee");
        EmployeeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeRadioButtonActionPerformed(evt);
            }
        });

        UnEmployeeRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        UnEmployeeRadioButton.setText("UnEmployee");
        UnEmployeeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnEmployeeRadioButtonActionPerformed(evt);
            }
        });

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
        InstruteName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstruteNameActionPerformed(evt);
            }
        });

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
        GetReligion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetReligionActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel19)
                    .addComponent(InstituteLabel)
                    .addComponent(acaLabel)
                    .addComponent(jLabel23)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(AcademyBackgroundComboBox, 0, 186, Short.MAX_VALUE)
                                        .addComponent(FemaleRadioButton, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(MaleRadioButton))
                                .addGap(55, 55, 55))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(GetReligion)
                                    .addComponent(FatherName)
                                    .addComponent(InstruteName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(yearLabel)
                            .addComponent(groupLabel)
                            .addComponent(jLabel8)
                            .addComponent(jLabel34)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(OtherGenderRadioButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(YearComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 219, Short.MAX_VALUE)
                        .addComponent(GetGroup, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(CollegeRadioButton)
                        .addGap(38, 38, 38)
                        .addComponent(SchoolRadioButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(EmployeeRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(UnEmployeeRadioButton))
                    .addComponent(OtherEducationRadioButton)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(MotherName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LastName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(135, 135, 135))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(FatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(MotherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GetReligion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GetGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(groupLabel)
                            .addComponent(acaLabel)
                            .addComponent(AcademyBackgroundComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(YearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearLabel)
                            .addComponent(InstituteLabel)
                            .addComponent(InstruteName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Course");

        CourseComboBox.setEditable(true);
        CourseComboBox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CourseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Company Introduction", "Star C Programming", "Star C++ Programming", "Star HTML", "Star PHP Developer", "Star Python", "Star Android", "Star Big Data Programming", "Star Big Data Analytics", "Star Cloud Computing", "Star Cyber Secure User", "Ethical Hacking Expert", "Star Forensic Investigator Computer Hacking - 007", "Star Secure Programmer Expert - Android", "Star Secure Programmer Expert - Java", "Star Secure Programmer Expert - PHP", "Star Secure Programmer Expert - NET", "Star Mobile Forensic Advance Security", "Star Security Cyber Analytics", "Star Network Security Administrator Expert", "Star Incident Handler Expert - SIHE", "Star Penetration Testing Expert", "Star Expert Security Specialist", "Star Certified Software Testing", "Star Expert loT Specialist (SEIS)", "Star Digital Marketing Expert (SDME)", "Star Certified DevOps Expert", "Star Expert Blockchain Specialist" }));
        CourseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(136, 136, 136)
                .addComponent(CourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel56.setBackground(new java.awt.Color(51, 153, 255));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Address");

        Address.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Student Number");

        StudentNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        StudentNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentNumberActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Addhar Number");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Mail Id");

        AddharNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AddharNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddharNumberActionPerformed(evt);
            }
        });

        MailId.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        MailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MailIdActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel24.setText("Parent/Guardian Name");

        PGName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PGName.setToolTipText(FatherName.getUIClassID());

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel25.setText("Contact Number");

        ContactNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ContactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactNumberActionPerformed(evt);
            }
        });

        ParentwaCheckBox.setText("Whatsapp Number");

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
                .addGap(18, 18, 18)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Address, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                        .addComponent(StudentNumber)
                        .addComponent(PGName))
                    .addComponent(ParentwaCheckBox))
                .addGap(45, 45, 45)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(45, 45, 45)
                        .addComponent(AddharNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel12))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StudentwaCheckBox)
                            .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(MailId, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                .addComponent(ContactNumber)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel56Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(StudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel56Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ParentwaCheckBox))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel56Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StudentwaCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(34, 34, 34)))
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(AddharNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel13.setText("By checking 'l Agree' below and submitting this form, you, the Parent or Guardian of the above student(s), agree to release ");

        jLabel14.setText(" \"Studio Name Here\", including instructors and assistants from liability for any and all injuries which occur while training,");

        jLabel15.setText(" practicing, performing, or during any studio event or activity. You also agree that you are responsible for health and");

        jLabel16.setText("accident insurance and any medical costs incurred due to injury. You give permission for emergency medical transportation ");

        jLabel17.setText("and treatment of your student(s) at your expense should the need arise. You also give your permission for ");

        jLabel18.setText("the public display of any studio visual images that your child may appear in.");

        AgreeRadioBUtton.setText("agree terms and condition");
        AgreeRadioBUtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgreeRadioBUttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(AgreeRadioBUtton)
                    .addComponent(jLabel16)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AgreeRadioBUtton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel2);

        NextButton.setBackground(new java.awt.Color(255, 255, 255));
        NextButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        NextButton.setText("Save");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        ClearButton.setBackground(new java.awt.Color(255, 255, 255));
        ClearButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ClearButton.setText("Clear");
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

        SingelpayRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SingelpayRadioButton.setText("Single Payment");
        SingelpayRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SingelpayRadioButtonActionPerformed(evt);
            }
        });

        DoublepayRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DoublepayRadioButton.setText("Double Payment");
        DoublepayRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoublepayRadioButtonActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel29.setText("Course Fees");

        CourseFees.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CourseFees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseFeesActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel30.setText("Amount Paid");

        AmountPaid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AmountPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountPaidActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel31.setText("GST");

        GST.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        GST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GSTActionPerformed(evt);
            }
        });

        Calculate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Calculate.setText("Calculate");
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
                    .addComponent(AmountPaid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(CourseFees, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PaymentPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(134, 134, 134)
                .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel31))
                .addGap(44, 44, 44)
                .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DoublepayRadioButton)
                    .addComponent(SingelpayRadioButton)
                    .addComponent(GST, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calculate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DoublepayRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaymentPanelLayout.createSequentialGroup()
                        .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(CourseFees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AmountPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(Calculate)))
                    .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdministrationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel56, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PaymentPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(119, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ShowTime, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Showdate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266)
                .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325))
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
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)))
                .addGap(39, 39, 39)
                .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(PaymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NextButton, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleRadioButtonActionPerformed
        // when one radio button is selecte is set off the another
        if(MaleRadioButton.isSelected()){
            FemaleRadioButton.setSelected(false);
            OtherGenderRadioButton.setSelected(false);   
        }
    }//GEN-LAST:event_MaleRadioButtonActionPerformed
       
    private void MailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MailIdActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_MailIdActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        //Save the Student data in sqlite database
       if(!AgreeRadioBUtton.isSelected()){
            JOptionPane.showMessageDialog(this,"Terms and conditiion are not agreed");  
       
    }{
         //get user details 
         
          

        Firstname=FirstName.getText().toString();
        Lastname=LastName.getText().toString();
        Fathername=FatherName.getText().toString();
        Mothername=MotherName.getText().toString();
        Instrutename=InstruteName.getText().toString();
        Studentnumber=StudentNumber.getText();
        Contactnumber=ContactNumber.getText();
        Addharnumber= AddharNumber.getText();
        Mailid=MailId.getText().toLowerCase().toString();
        Course=CourseComboBox.getSelectedItem().toString();
        AcademyBackground=AcademyBackgroundComboBox.getSelectedItem().toString();
        Religion=GetReligion.getText().toString();
       // Dob= SDF.format(DOB.getValue());
        PG=PGName.getText();
        Group=GetGroup.getText();
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
        }if(CollegeRadioButton.isSelected()){
            Institute ="College";
        }if(OtherEducationRadioButton.isSelected()){
            Institute ="Other";
        }if(EmployeeRadioButton.isSelected()){
           Institute ="Employee";
        }if(UnEmployeeRadioButton.isSelected()){
            Institute="UnEmployee";
        }
       
        
             Payment=null;
       if(DoublepayRadioButton.isSelected()){
           Payment="Double Payment";
       }
       if(SingelpayRadioButton.isSelected()){
            Payment="Single Payment";
       }
       
       //sent thew data to next page for printout
       PrintoutPage printoutpage=new PrintoutPage();
       printoutpage.DataStudent(Firstname, Lastname, Fathername, Instrutename, Studentnumber, Contactnumber,
               Addharnumber, Mailid, Course, address, Religion, Year, AcademyBackground, Gender, Institute, 
               Dob, Payment, Coursefees, Gst, Amountpaid, Balanceamount,PG,Group,Institute,dateTime,
               administrationnumber);
       printoutpage.setVisible(true);
      
      
        try{
            String sql="INSERT INTO Registrationtable VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
                                
             
            pst.execute();
            JOptionPane.showMessageDialog(this,"Saved,");
            System.out.println("Successfully saved the student data");
          
       }catch(Exception e){
           System.out.println("fail to save student data"+e);
       
       }finally{
            try{
                pst.close();
                System.out.println("Sucessfuly closed the database");
                
            }catch(Exception e){
                System.out.println("fail to close the database"+e);
            }
        }
        stop();
    }          
    }//GEN-LAST:event_NextButtonActionPerformed

    private void FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_FirstNameActionPerformed

    private void FemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleRadioButtonActionPerformed
        // when one radio button is selecte is set off the another
           
        if(FemaleRadioButton.isSelected()){
            MaleRadioButton.setSelected(false);
            OtherGenderRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_FemaleRadioButtonActionPerformed

    private void OtherGenderRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherGenderRadioButtonActionPerformed
        //when one radio button is selecte is set off the another
         if(OtherGenderRadioButton.isSelected()){
             
             FemaleRadioButton.setSelected(false);
             MaleRadioButton.setSelected(false);  
         }
    }//GEN-LAST:event_OtherGenderRadioButtonActionPerformed

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

    private void CourseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseComboBoxActionPerformed
        // combo box list
       CourseComboBox.addItem("Company Introduction");
       CourseComboBox.addItem("Star C Programming");
       CourseComboBox.addItem("Star C++ Programming");
       CourseComboBox.addItem("Star HTML");
       CourseComboBox.addItem("Star PHP Developer");
       CourseComboBox.addItem(";Star Python");
       CourseComboBox.addItem("Star Android");
       CourseComboBox.addItem("Star Big Data Programming");
       CourseComboBox.addItem("Star Big Data Analytics");
       CourseComboBox.addItem("Star Cloud Computing");
       CourseComboBox.addItem("Star Cyber Secure User");
       CourseComboBox.addItem("Ethical Hacking Expert");
       CourseComboBox.addItem("star Forensic Investigator Computer Hacking - 007");
       CourseComboBox.addItem("Star Secure Programmer Expert - Android");
       CourseComboBox.addItem("Star Secure Programmer Expert - PHP");
       CourseComboBox.addItem("Star Secure Programmer Expert - Java");
       CourseComboBox.addItem(" Star Secure Programmer Expert - NET");
       CourseComboBox.addItem("Star Mobile Forensic Advance Security");
       CourseComboBox.addItem("Star Security Cyber Analytics");
       CourseComboBox.addItem("Star Network Security Administrator Expert");
       CourseComboBox.addItem("Star Incident Handler Expert - SIHE");
       CourseComboBox.addItem("Star Penetration Testing Expert");
       CourseComboBox.addItem("Star Expert Security Specialist");
       CourseComboBox.addItem("Star Certified Software Testing");
       CourseComboBox.addItem("Star Expert loT Specialist (SEIS)");
       CourseComboBox.addItem("Star Digital Marketing Expert (SDME)");
       CourseComboBox.addItem("Star Certified DevOps Expert");
       CourseComboBox.addItem("Star Expert Blockchain Specialist");
       CourseComboBox.setVisible(true);
       CourseComboBox.setEditable(true);
       
      
        
    }//GEN-LAST:event_CourseComboBoxActionPerformed

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

    private void AgreeRadioBUttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgreeRadioBUttonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_AgreeRadioBUttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Back to previous page
        OptionForm optionform=new OptionForm();
        optionform.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FatherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FatherNameActionPerformed
      
    }//GEN-LAST:event_FatherNameActionPerformed

    private void ContactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactNumberActionPerformed
      
    }//GEN-LAST:event_ContactNumberActionPerformed

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
         
         Year= YearComboBox.getSelectedItem().toString();
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

    private void LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_LastNameActionPerformed

    private void InstruteNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstruteNameActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_InstruteNameActionPerformed

    private void StudentNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentNumberActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_StudentNumberActionPerformed

    private void AddharNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddharNumberActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_AddharNumberActionPerformed

    private void AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressActionPerformed

    private void GetReligionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetReligionActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_GetReligionActionPerformed

    private void CourseFeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseFeesActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_CourseFeesActionPerformed

    private void AmountPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountPaidActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_AmountPaidActionPerformed

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

    private void GSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GSTActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_GSTActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        // Calculation for the fees
        Coursefees=Long.valueOf(CourseFees.getText());
        Gst=Integer.valueOf(GST.getText());
        Amountpaid=Long.valueOf(AmountPaid.getText());
        
        long Gstamount=Coursefees*Gst/100;
        totalcoursefees=(int) (Coursefees+Gstamount);
        Balanceamount=totalcoursefees-Amountpaid;
        ShowBill.setText("                             My First Step Computer Skill"
                        +"\n Course Fees                                                           "+String.valueOf(Coursefees)
                        +"\n GST%                                          "+Gst+"%                  "+String.valueOf(Gstamount)
                        +"\n Total Course Fees                                                  "+String.valueOf(totalcoursefees)
                        +"\n Fess Paid                                                              "+String.valueOf(Amountpaid)
                        +"\n Balance to pay                                                       "+String.valueOf(Balanceamount));
    }//GEN-LAST:event_CalculateActionPerformed

    //adminsition number fech form the cdatabase
    private void Administrationnumber(){
        int Administrationnumber ;
        try{
            String sql= "SELECT COUNT(Firstname) FROM Registrationtable";
            pst =con.prepareStatement(sql);
            rs= pst.executeQuery();
                
            if(rs.next()){
                Administrationnumber =rs.getInt("COUNT(Firstname)");
                administrationnumber=Administrationnumber + 1000; 
            }
            
            System.out.println("Load the Adminstraton number");
          
        }catch(Exception e){
            
            System.out.println("Faild to load the adminstration number"+e);
            
            }finally{
                try{
                    pst.close();
                    System.out.println("successfully closed the database");
                    
                }catch(Exception e){
                    System.out.println("4"+e);
                 }
             }
    }   

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
               Thread Transfer =new Thread();
                   
                          
            }
        });
        Thread Transfer =new Thread(); 
        Transfer.start();
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
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
    private javax.swing.JTextArea ShowBill;
    private javax.swing.JLabel ShowTime;
    private javax.swing.JLabel Showdate;
    private javax.swing.JRadioButton SingelpayRadioButton;
    private javax.swing.JTextField StudentNumber;
    private javax.swing.JCheckBox StudentwaCheckBox;
    private javax.swing.JRadioButton UnEmployeeRadioButton;
    private javax.swing.JComboBox<String> YearComboBox;
    private javax.swing.JLabel acaLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel c;
    private javax.swing.JLabel groupLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables

   
}
