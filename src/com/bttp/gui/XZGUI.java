package com.bttp.gui;

import com.bttp.database.DBRegistrationManager;
import com.bttp.pojo.Book;
import com.bttp.pojo.Comment;
import com.bttp.pojo.Generator;
import com.bttp.pojo.Employee;
import com.bttp.pojo.Learner;
import com.bttp.pojo.ValidateSouthAfricanID;
import com.bttp.report.PrintBooks;
import com.bttp.report.PrintLearners;
import com.bttp.report.ReportGenerator;
import com.itextpdf.text.DocumentException;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class XZGUI extends javax.swing.JFrame implements Runnable {

    String gfirstname = "", glastname = "",
            gusername = "", gpassword = "",
            gidentityno = "", gemail = "", gcontactno = "";

    Employee gemployee = null;
    ArrayList<Learner> learners = null, viewlearners = null;
    ArrayList<Book> books = null, viewbooks = null;

    Random random = new Random();

    //Declare a thread
    Thread time;
    Generator generator;

    DefaultTableModel modelNewLearners, modelViewLearners, modelViewBooks, modelNewBooks;

    private void startTime() {
        time = new Thread(this);
        time.start();
    }

    public XZGUI() throws SQLException, ClassNotFoundException {
        generator = new Generator();
        startTime();
        initComponents();
        itemChangePassword.setVisible(false);
        itemLogout.setVisible(false);
        menuProfile.setVisible(false);
        menuSystem.setVisible(false);
        menuMessages.setVisible(false);
        btnNewLearnerRegisterProceed.setEnabled(false);
        btnNewBookRecordProceed.setEnabled(false);

        //Setting colors for time labels
        lblTime.setForeground(Color.RED);
        lblDate.setForeground(Color.RED);
        lblSlogan.setText("KNOWLEDGE IS LIGHT");

        modelNewLearners = (DefaultTableModel) tblNewLearners.getModel();
        tblNewLearners.setModel(modelNewLearners);
        tblNewLearners.setAutoCreateRowSorter(true);
        tblNewLearners.setShowGrid(true);
        tblNewLearners.setGridColor(Color.BLACK);
        //tblLearners.setBackground(Color.GRAY);
        tblNewLearners.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 20));

        modelViewLearners = (DefaultTableModel) tbViewLearners.getModel();
        tbViewLearners.setModel(modelViewLearners);
        tbViewLearners.setAutoCreateRowSorter(true);
        tbViewLearners.setShowGrid(true);
        tbViewLearners.setGridColor(Color.BLACK);
        //tblLearners.setBackground(Color.GRAY);
        tbViewLearners.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 20));

        modelNewBooks = (DefaultTableModel) tblNewBooks.getModel();
        tblNewBooks.setModel(modelNewBooks);
        tblNewBooks.setAutoCreateRowSorter(true);
        tblNewBooks.setShowGrid(true);
        tblNewBooks.setGridColor(Color.BLACK);
        //tblLearners.setBackground(Color.GRAY);
        tblNewBooks.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 20));

        modelViewBooks = (DefaultTableModel) tblViewBooks.getModel();
        tblViewBooks.setModel(modelViewBooks);
        tblViewBooks.setAutoCreateRowSorter(true);
        tblViewBooks.setShowGrid(true);
        tblViewBooks.setGridColor(Color.BLACK);
        //tblLearners.setBackground(Color.GRAY);
        tblViewBooks.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 20));

        learners = new ArrayList<>();
        books = new ArrayList<>();

        //Setting the form visible
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGConsent = new javax.swing.ButtonGroup();
        LoginFrame = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jPanel26 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnPassword = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        btnNewUserRegistration = new javax.swing.JButton();
        ForgottenPasswordFrame = new javax.swing.JInternalFrame();
        jPanel13 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtFPEmployeeNo = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtFPIDPassportNo = new javax.swing.JTextField();
        jPanel31 = new javax.swing.JPanel();
        btnForgottenPassword = new javax.swing.JButton();
        btnFPClose = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        RegisterFrame = new javax.swing.JInternalFrame();
        mainPanel = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtEmployeeNo = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtIDPassportNo = new javax.swing.JTextField();
        jPanel28 = new javax.swing.JPanel();
        btnMRegRegister = new javax.swing.JButton();
        btnMRegClose = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        CreateNewAccountFrame = new javax.swing.JInternalFrame();
        mainPanel1 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtContactno = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        txtEmailaddress = new javax.swing.JTextField();
        jPanel29 = new javax.swing.JPanel();
        btnCARegister = new javax.swing.JButton();
        btnCAClose = new javax.swing.JButton();
        ConfirmPasswordFrame = new javax.swing.JInternalFrame();
        mainPanel2 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtCPUsername = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtCPPassword = new javax.swing.JPasswordField();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtCPRetypePassword = new javax.swing.JPasswordField();
        jPanel30 = new javax.swing.JPanel();
        btnCPRegister = new javax.swing.JButton();
        btnCPClose = new javax.swing.JButton();
        ChangePasswordFrame = new javax.swing.JInternalFrame();
        mainPanel4 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtChOLDPassword = new javax.swing.JPasswordField();
        jPanel34 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtChNewPassword = new javax.swing.JPasswordField();
        jPanel35 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtChRetypePassword = new javax.swing.JPasswordField();
        jPanel36 = new javax.swing.JPanel();
        btnChSubmit = new javax.swing.JButton();
        btnChClose = new javax.swing.JButton();
        EditProfileFrame = new javax.swing.JInternalFrame();
        mainPanel6 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        panelFields = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        txtEPFirstname = new javax.swing.JTextField();
        jPanel39 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        txtEPLastname = new javax.swing.JTextField();
        jPanel40 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        txtEPIDNo = new javax.swing.JTextField();
        jPanel44 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        txtEPEmailAddress = new javax.swing.JTextField();
        jPanel46 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        txtEPContactNo = new javax.swing.JTextField();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        btnEPSubmit = new javax.swing.JButton();
        btnEPClose = new javax.swing.JButton();
        jPanel43 = new javax.swing.JPanel();
        NewLearnerFrame = new javax.swing.JInternalFrame();
        mainPanel3 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtLearnerNumber = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtLearnerFirstName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtLearnerLastName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtLearnerIDNumber = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtLearnerGrade = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtParentFirstName = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtParentLastName = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtParentIDNumber = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtParentContactNumber = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtParentLocation = new javax.swing.JTextField();
        jPanel33 = new javax.swing.JPanel();
        btnNewLearnerRegister = new javax.swing.JButton();
        btnNewLearnerRegisterProceed = new javax.swing.JButton();
        btnNewLearnerRegisterClose = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblNewLearners = new javax.swing.JTable();
        jLabel56 = new javax.swing.JLabel();
        NewBookFrame = new javax.swing.JInternalFrame();
        mainPanel7 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        txtBookTitle = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtPublisher = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        jPanel49 = new javax.swing.JPanel();
        btnNewBookRecord = new javax.swing.JButton();
        btnNewBookRecordProceed = new javax.swing.JButton();
        btnNewBookRecordClose = new javax.swing.JButton();
        lblStatus1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblNewBooks = new javax.swing.JTable();
        jLabel57 = new javax.swing.JLabel();
        MakePaymentFrame = new javax.swing.JInternalFrame();
        mainPanel5 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        txtPaymentStudentNo = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txtPayment = new javax.swing.JTextField();
        jPanel37 = new javax.swing.JPanel();
        btnPayment = new javax.swing.JButton();
        btnPaymentClose = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        ViewLearnersFrame = new javax.swing.JInternalFrame();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbViewLearners = new javax.swing.JTable();
        jPanel45 = new javax.swing.JPanel();
        btnSearchLearner = new javax.swing.JButton();
        btnPrintLearners = new javax.swing.JButton();
        btnLearnersClose = new javax.swing.JButton();
        ViewBooksFrame = new javax.swing.JInternalFrame();
        jPanel47 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblViewBooks = new javax.swing.JTable();
        jPanel48 = new javax.swing.JPanel();
        btnBooksSearch = new javax.swing.JButton();
        btnBooksPrint = new javax.swing.JButton();
        btnBooksClose = new javax.swing.JButton();
        AboutFrame = new javax.swing.JInternalFrame();
        btnAClose = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        ContactUsFrame = new javax.swing.JInternalFrame();
        btnCUClose = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel52 = new javax.swing.JLabel();
        PostMessageFrame = new javax.swing.JInternalFrame();
        btnPostMessageClose = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        btnSendMessage = new javax.swing.JButton();
        txtMessage = new javax.swing.JTextField();
        ViewPostedMessagesFrame = new javax.swing.JInternalFrame();
        btnPostMessageClose1 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tAreaMessages = new javax.swing.JTextArea();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblSlogan = new javax.swing.JLabel();
        lblDisplay = new javax.swing.JLabel();
        mainMenu = new javax.swing.JMenuBar();
        menuHome = new javax.swing.JMenu();
        itemLogin = new javax.swing.JMenuItem();
        itemLogout = new javax.swing.JMenuItem();
        itemRegister = new javax.swing.JMenuItem();
        lineSeparator = new javax.swing.JPopupMenu.Separator();
        itemExit = new javax.swing.JMenuItem();
        menuProfile = new javax.swing.JMenu();
        itemEditProfile = new javax.swing.JMenuItem();
        itemChangePassword = new javax.swing.JMenuItem();
        menuSystem = new javax.swing.JMenu();
        menuLearnerInformation = new javax.swing.JMenu();
        itemNewLearner = new javax.swing.JMenuItem();
        itemViewLearner = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        itemNewBook = new javax.swing.JMenuItem();
        itemViewBooks = new javax.swing.JMenuItem();
        itemViewSubjects = new javax.swing.JMenuItem();
        itemProofOfRegistration = new javax.swing.JMenuItem();
        itemPayments = new javax.swing.JMenuItem();
        menuMessages = new javax.swing.JMenu();
        itemPostMessage = new javax.swing.JMenuItem();
        itemViewMessages = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        itemHelpContent = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itemContactUs = new javax.swing.JMenuItem();
        itemAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Lawley Primary School");
        setIconImages(null);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        LoginFrame.setTitle("Login");
        LoginFrame.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LoginFrame.setVisible(false);
        LoginFrame.getContentPane().setLayout(new java.awt.GridLayout(5, 2, 2, 2));

        jPanel2.setLayout(new java.awt.GridLayout(1, 1, 2, 2));

        jLabel72.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("LOGIN ");
        jPanel2.add(jLabel72);

        LoginFrame.getContentPane().add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(1, 2, 1, 1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Username :");
        jPanel3.add(jLabel1);

        txtUsername.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtUsername.setToolTipText("");
        jPanel3.add(txtUsername);

        LoginFrame.getContentPane().add(jPanel3);

        jPanel1.setLayout(new java.awt.GridLayout(1, 2, 1, 1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password :");
        jPanel1.add(jLabel2);

        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtPassword.setToolTipText("");
        txtPassword.setEchoChar('*');
        jPanel1.add(txtPassword);

        LoginFrame.getContentPane().add(jPanel1);

        jPanel26.setLayout(new java.awt.GridLayout(1, 3, 1, 1));

        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 204));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel26.add(btnLogin);

        btnPassword.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnPassword.setForeground(new java.awt.Color(255, 0, 0));
        btnPassword.setText("Forgotten Password");
        btnPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasswordActionPerformed(evt);
            }
        });
        jPanel26.add(btnPassword);

        btnClose.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel26.add(btnClose);

        LoginFrame.getContentPane().add(jPanel26);

        jPanel27.setLayout(new java.awt.GridLayout(1, 1, 1, 1));

        btnNewUserRegistration.setBackground(new java.awt.Color(239, 239, 239));
        btnNewUserRegistration.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNewUserRegistration.setForeground(new java.awt.Color(0, 153, 0));
        btnNewUserRegistration.setMnemonic('R');
        btnNewUserRegistration.setText("New User?");
        btnNewUserRegistration.setToolTipText("Click here to register a new user!!!");
        btnNewUserRegistration.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnNewUserRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewUserRegistrationActionPerformed(evt);
            }
        });
        jPanel27.add(btnNewUserRegistration);

        LoginFrame.getContentPane().add(jPanel27);

        getContentPane().add(LoginFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 630, 290));

        ForgottenPasswordFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        ForgottenPasswordFrame.setTitle("Forgotten Password");
        ForgottenPasswordFrame.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ForgottenPasswordFrame.setVisible(false);
        ForgottenPasswordFrame.getContentPane().setLayout(new java.awt.GridLayout(5, 2, 2, 2));

        jPanel13.setLayout(new java.awt.GridLayout(1, 1, 2, 2));

        jLabel76.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("Forgotten Password");
        jPanel13.add(jLabel76);

        ForgottenPasswordFrame.getContentPane().add(jPanel13);

        jPanel14.setLayout(new java.awt.GridLayout(1, 2, 1, 1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Employee Number :");
        jPanel14.add(jLabel11);

        txtFPEmployeeNo.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtFPEmployeeNo.setToolTipText("");
        jPanel14.add(txtFPEmployeeNo);

        ForgottenPasswordFrame.getContentPane().add(jPanel14);

        jPanel15.setLayout(new java.awt.GridLayout(1, 2, 1, 1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Identity/Passport Number :");
        jPanel15.add(jLabel12);

        txtFPIDPassportNo.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel15.add(txtFPIDPassportNo);

        ForgottenPasswordFrame.getContentPane().add(jPanel15);

        jPanel31.setLayout(new java.awt.GridLayout(1, 2, 1, 1));

        btnForgottenPassword.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnForgottenPassword.setText("Submit");
        btnForgottenPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgottenPasswordActionPerformed(evt);
            }
        });
        jPanel31.add(btnForgottenPassword);

        btnFPClose.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnFPClose.setText("Close");
        btnFPClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFPCloseActionPerformed(evt);
            }
        });
        jPanel31.add(btnFPClose);

        ForgottenPasswordFrame.getContentPane().add(jPanel31);

        jPanel32.setLayout(new java.awt.GridLayout(1, 1, 1, 1));
        ForgottenPasswordFrame.getContentPane().add(jPanel32);

        getContentPane().add(ForgottenPasswordFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 211, 640, 290));

        RegisterFrame.setBorder(null);
        RegisterFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        RegisterFrame.setResizable(true);
        RegisterFrame.setTitle("Register");
        RegisterFrame.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RegisterFrame.setNormalBounds(new java.awt.Rectangle(0, 0, 1048, 730));
        RegisterFrame.setPreferredSize(new java.awt.Dimension(1360, 735));
        RegisterFrame.setVisible(false);

        mainPanel.setLayout(new java.awt.GridLayout(1, 1, 2, 2));

        jLabel73.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel73.setText("Registration");
        mainPanel.add(jLabel73);

        jPanel5.setLayout(new java.awt.GridLayout(2, 1, 1, 1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Employee Number :");
        jPanel5.add(jLabel3);

        txtEmployeeNo.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtEmployeeNo.setToolTipText("");
        jPanel5.add(txtEmployeeNo);

        jPanel6.setLayout(new java.awt.GridLayout(2, 1, 1, 1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Identity/Passport Number :");
        jPanel6.add(jLabel4);

        txtIDPassportNo.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtIDPassportNo.setToolTipText("");
        jPanel6.add(txtIDPassportNo);

        jPanel28.setLayout(new java.awt.GridLayout(2, 2, 1, 1));

        btnMRegRegister.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnMRegRegister.setText("Register");
        btnMRegRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMRegRegisterActionPerformed(evt);
            }
        });
        jPanel28.add(btnMRegRegister);

        btnMRegClose.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnMRegClose.setText("Close");
        btnMRegClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMRegCloseActionPerformed(evt);
            }
        });
        jPanel28.add(btnMRegClose);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );

        jPanel28.add(jPanel4);

        javax.swing.GroupLayout RegisterFrameLayout = new javax.swing.GroupLayout(RegisterFrame.getContentPane());
        RegisterFrame.getContentPane().setLayout(RegisterFrameLayout);
        RegisterFrameLayout.setHorizontalGroup(
            RegisterFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterFrameLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(RegisterFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(328, 328, 328))
        );
        RegisterFrameLayout.setVerticalGroup(
            RegisterFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterFrameLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        getContentPane().add(RegisterFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        CreateNewAccountFrame.setBorder(null);
        CreateNewAccountFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        CreateNewAccountFrame.setResizable(true);
        CreateNewAccountFrame.setTitle("Create Account");
        CreateNewAccountFrame.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CreateNewAccountFrame.setNormalBounds(new java.awt.Rectangle(0, 0, 1348, 730));
        CreateNewAccountFrame.setPreferredSize(new java.awt.Dimension(1360, 735));
        CreateNewAccountFrame.setVisible(false);

        mainPanel1.setLayout(new java.awt.GridLayout(1, 1, 2, 2));

        jLabel74.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel74.setText("Create new account");
        mainPanel1.add(jLabel74);

        jPanel7.setLayout(new java.awt.GridLayout(2, 1, 1, 1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("First Name(s) :");
        jPanel7.add(jLabel5);

        txtFirstname.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtFirstname.setToolTipText("");
        jPanel7.add(txtFirstname);

        jPanel8.setLayout(new java.awt.GridLayout(2, 1, 1, 1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Last Name :");
        jPanel8.add(jLabel6);

        txtLastname.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtLastname.setToolTipText("");
        jPanel8.add(txtLastname);

        jPanel9.setLayout(new java.awt.GridLayout(2, 1, 1, 1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Contact Number :");
        jPanel9.add(jLabel7);

        txtContactno.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtContactno.setToolTipText("");
        jPanel9.add(txtContactno);

        jPanel25.setLayout(new java.awt.GridLayout(2, 1, 1, 1));

        jLabel49.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel49.setText("E-mail Address :");
        jPanel25.add(jLabel49);

        txtEmailaddress.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtEmailaddress.setToolTipText("");
        jPanel25.add(txtEmailaddress);

        jPanel29.setLayout(new java.awt.GridLayout(1, 2, 1, 1));

        btnCARegister.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnCARegister.setText("Submit");
        btnCARegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCARegisterActionPerformed(evt);
            }
        });
        jPanel29.add(btnCARegister);

        btnCAClose.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnCAClose.setText("Close");
        btnCAClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCACloseActionPerformed(evt);
            }
        });
        jPanel29.add(btnCAClose);

        javax.swing.GroupLayout CreateNewAccountFrameLayout = new javax.swing.GroupLayout(CreateNewAccountFrame.getContentPane());
        CreateNewAccountFrame.getContentPane().setLayout(CreateNewAccountFrameLayout);
        CreateNewAccountFrameLayout.setHorizontalGroup(
            CreateNewAccountFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateNewAccountFrameLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(CreateNewAccountFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(328, 328, 328))
            .addGroup(CreateNewAccountFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CreateNewAccountFrameLayout.createSequentialGroup()
                    .addGap(99, 99, 99)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(661, Short.MAX_VALUE)))
        );
        CreateNewAccountFrameLayout.setVerticalGroup(
            CreateNewAccountFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateNewAccountFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(CreateNewAccountFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateNewAccountFrameLayout.createSequentialGroup()
                    .addContainerGap(405, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(204, 204, 204)))
        );

        getContentPane().add(CreateNewAccountFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ConfirmPasswordFrame.setBorder(null);
        ConfirmPasswordFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        ConfirmPasswordFrame.setResizable(true);
        ConfirmPasswordFrame.setTitle("Confirm Password");
        ConfirmPasswordFrame.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ConfirmPasswordFrame.setNormalBounds(new java.awt.Rectangle(0, 0, 1348, 730));
        ConfirmPasswordFrame.setPreferredSize(new java.awt.Dimension(1360, 735));
        ConfirmPasswordFrame.setVisible(false);

        mainPanel2.setLayout(new java.awt.GridLayout(1, 1, 2, 2));

        jLabel75.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel75.setText("Confirm Password");
        mainPanel2.add(jLabel75);

        jPanel10.setLayout(new java.awt.GridLayout(2, 1, 1, 1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Username :");
        jPanel10.add(jLabel8);

        txtCPUsername.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtCPUsername.setToolTipText("");
        jPanel10.add(txtCPUsername);

        jPanel11.setLayout(new java.awt.GridLayout(2, 1, 1, 1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Password :");
        jPanel11.add(jLabel9);

        txtCPPassword.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtCPPassword.setEchoChar('*');
        jPanel11.add(txtCPPassword);

        jPanel12.setLayout(new java.awt.GridLayout(2, 1, 1, 1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Retype Password :");
        jPanel12.add(jLabel10);

        txtCPRetypePassword.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtCPRetypePassword.setEchoChar('*');
        jPanel12.add(txtCPRetypePassword);

        jPanel30.setLayout(new java.awt.GridLayout(1, 2, 1, 1));

        btnCPRegister.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnCPRegister.setText("Submit");
        btnCPRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCPRegisterActionPerformed(evt);
            }
        });
        jPanel30.add(btnCPRegister);

        btnCPClose.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnCPClose.setText("Close");
        btnCPClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCPCloseActionPerformed(evt);
            }
        });
        jPanel30.add(btnCPClose);

        javax.swing.GroupLayout ConfirmPasswordFrameLayout = new javax.swing.GroupLayout(ConfirmPasswordFrame.getContentPane());
        ConfirmPasswordFrame.getContentPane().setLayout(ConfirmPasswordFrameLayout);
        ConfirmPasswordFrameLayout.setHorizontalGroup(
            ConfirmPasswordFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmPasswordFrameLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(ConfirmPasswordFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(328, 328, 328))
        );
        ConfirmPasswordFrameLayout.setVerticalGroup(
            ConfirmPasswordFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmPasswordFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        getContentPane().add(ConfirmPasswordFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ChangePasswordFrame.setBorder(null);
        ChangePasswordFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        ChangePasswordFrame.setResizable(true);
        ChangePasswordFrame.setTitle("Change Password");
        ChangePasswordFrame.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ChangePasswordFrame.setNormalBounds(new java.awt.Rectangle(0, 0, 1348, 730));
        ChangePasswordFrame.setPreferredSize(new java.awt.Dimension(1360, 735));
        ChangePasswordFrame.setVisible(false);

        mainPanel4.setLayout(new java.awt.GridLayout(1, 1, 2, 2));

        jLabel78.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel78.setText("Change Password");
        mainPanel4.add(jLabel78);

        jPanel23.setLayout(new java.awt.GridLayout(2, 1, 1, 1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("OLD Password :");
        jPanel23.add(jLabel20);

        txtChOLDPassword.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtChOLDPassword.setEchoChar('*');
        jPanel23.add(txtChOLDPassword);

        jPanel34.setLayout(new java.awt.GridLayout(2, 1, 1, 1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("New Password :");
        jPanel34.add(jLabel21);

        txtChNewPassword.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtChNewPassword.setEchoChar('*');
        jPanel34.add(txtChNewPassword);

        jPanel35.setLayout(new java.awt.GridLayout(2, 1, 1, 1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Retype Password :");
        jPanel35.add(jLabel22);

        txtChRetypePassword.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtChRetypePassword.setEchoChar('*');
        jPanel35.add(txtChRetypePassword);

        jPanel36.setLayout(new java.awt.GridLayout(1, 2, 1, 1));

        btnChSubmit.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnChSubmit.setText("Submit");
        btnChSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChSubmitActionPerformed(evt);
            }
        });
        jPanel36.add(btnChSubmit);

        btnChClose.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnChClose.setText("Close");
        btnChClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChCloseActionPerformed(evt);
            }
        });
        jPanel36.add(btnChClose);

        javax.swing.GroupLayout ChangePasswordFrameLayout = new javax.swing.GroupLayout(ChangePasswordFrame.getContentPane());
        ChangePasswordFrame.getContentPane().setLayout(ChangePasswordFrameLayout);
        ChangePasswordFrameLayout.setHorizontalGroup(
            ChangePasswordFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePasswordFrameLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(ChangePasswordFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ChangePasswordFrameLayout.setVerticalGroup(
            ChangePasswordFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePasswordFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        getContentPane().add(ChangePasswordFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        EditProfileFrame.setBorder(null);
        EditProfileFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        EditProfileFrame.setResizable(true);
        EditProfileFrame.setTitle("Edit Profile");
        EditProfileFrame.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EditProfileFrame.setNormalBounds(new java.awt.Rectangle(0, 0, 1348, 730));
        EditProfileFrame.setPreferredSize(new java.awt.Dimension(1360, 735));
        EditProfileFrame.setVisible(false);

        mainPanel6.setLayout(new java.awt.GridLayout(1, 1, 2, 2));

        jLabel80.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel80.setText("Edit Profile");
        mainPanel6.add(jLabel80);

        panelFields.setLayout(new java.awt.GridLayout(6, 1, 1, 1));

        jPanel38.setLayout(new java.awt.GridLayout(2, 1, 1, 1));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setText("First Name:");
        jPanel38.add(jLabel35);

        txtEPFirstname.setEditable(false);
        txtEPFirstname.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel38.add(txtEPFirstname);

        panelFields.add(jPanel38);

        jPanel39.setLayout(new java.awt.GridLayout(2, 1, 1, 1));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel36.setText("Last Name:");
        jPanel39.add(jLabel36);

        txtEPLastname.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel39.add(txtEPLastname);

        panelFields.add(jPanel39);

        jPanel40.setLayout(new java.awt.GridLayout(2, 1, 1, 1));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText("Identity Number:");
        jPanel40.add(jLabel37);

        txtEPIDNo.setEditable(false);
        txtEPIDNo.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel40.add(txtEPIDNo);

        panelFields.add(jPanel40);

        jPanel44.setLayout(new java.awt.GridLayout(2, 1, 1, 1));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("Email Address:");
        jPanel44.add(jLabel38);

        txtEPEmailAddress.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel44.add(txtEPEmailAddress);

        panelFields.add(jPanel44);

        jPanel46.setLayout(new java.awt.GridLayout(2, 1, 1, 1));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText("Contact Number:");
        jPanel46.add(jLabel39);

        txtEPContactNo.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel46.add(txtEPContactNo);

        panelFields.add(jPanel46);

        jPanel41.setLayout(new java.awt.GridLayout(2, 1, 1, 1));

        jPanel42.setLayout(new java.awt.GridLayout(1, 2, 2, 1));

        btnEPSubmit.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnEPSubmit.setText("Submit");
        btnEPSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEPSubmitActionPerformed(evt);
            }
        });
        jPanel42.add(btnEPSubmit);

        btnEPClose.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnEPClose.setText("Close");
        btnEPClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEPCloseActionPerformed(evt);
            }
        });
        jPanel42.add(btnEPClose);

        jPanel41.add(jPanel42);

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel41.add(jPanel43);

        panelFields.add(jPanel41);

        javax.swing.GroupLayout EditProfileFrameLayout = new javax.swing.GroupLayout(EditProfileFrame.getContentPane());
        EditProfileFrame.getContentPane().setLayout(EditProfileFrameLayout);
        EditProfileFrameLayout.setHorizontalGroup(
            EditProfileFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditProfileFrameLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(mainPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EditProfileFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditProfileFrameLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelFields, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(425, Short.MAX_VALUE)))
        );
        EditProfileFrameLayout.setVerticalGroup(
            EditProfileFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditProfileFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(638, Short.MAX_VALUE))
            .addGroup(EditProfileFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditProfileFrameLayout.createSequentialGroup()
                    .addContainerGap(107, Short.MAX_VALUE)
                    .addComponent(panelFields, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        getContentPane().add(EditProfileFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        NewLearnerFrame.setBorder(null);
        NewLearnerFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        NewLearnerFrame.setResizable(true);
        NewLearnerFrame.setTitle("Learner Registration");
        NewLearnerFrame.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NewLearnerFrame.setNormalBounds(new java.awt.Rectangle(0, 0, 1348, 730));
        NewLearnerFrame.setPreferredSize(new java.awt.Dimension(1360, 735));
        NewLearnerFrame.setVisible(false);

        mainPanel3.setLayout(new java.awt.GridLayout(1, 1, 2, 2));

        jLabel77.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/image/lawleyLogo.png"))); // NOI18N
        mainPanel3.add(jLabel77);

        jPanel16.setLayout(new java.awt.GridLayout(11, 2, 1, 1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Learner Number : ");
        jPanel16.add(jLabel13);

        txtLearnerNumber.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtLearnerNumber.setToolTipText("");
        jPanel16.add(txtLearnerNumber);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("First Name(s) :");
        jPanel16.add(jLabel14);

        txtLearnerFirstName.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtLearnerFirstName.setToolTipText("");
        jPanel16.add(txtLearnerFirstName);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Last Name :");
        jPanel16.add(jLabel15);

        txtLearnerLastName.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtLearnerLastName.setToolTipText("");
        jPanel16.add(txtLearnerLastName);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Identity Number :");
        jPanel16.add(jLabel16);

        txtLearnerIDNumber.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtLearnerIDNumber.setToolTipText("");
        jPanel16.add(txtLearnerIDNumber);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Grade :");
        jPanel16.add(jLabel17);

        txtLearnerGrade.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtLearnerGrade.setToolTipText("");
        jPanel16.add(txtLearnerGrade);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Parental Information");
        jPanel16.add(jLabel24);
        jPanel16.add(jLabel51);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("First Name :");
        jPanel16.add(jLabel25);

        txtParentFirstName.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtParentFirstName.setToolTipText("");
        jPanel16.add(txtParentFirstName);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Last Name :");
        jPanel16.add(jLabel26);

        txtParentLastName.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtParentLastName.setToolTipText("");
        jPanel16.add(txtParentLastName);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Identity Number :");
        jPanel16.add(jLabel19);

        txtParentIDNumber.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtParentIDNumber.setToolTipText("");
        jPanel16.add(txtParentIDNumber);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Contact Number :");
        jPanel16.add(jLabel18);

        txtParentContactNumber.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtParentContactNumber.setToolTipText("");
        jPanel16.add(txtParentContactNumber);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Residential Address :");
        jPanel16.add(jLabel23);

        txtParentLocation.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtParentLocation.setToolTipText("");
        jPanel16.add(txtParentLocation);

        jPanel33.setLayout(new java.awt.GridLayout(1, 3, 1, 1));

        btnNewLearnerRegister.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnNewLearnerRegister.setText("Submit");
        btnNewLearnerRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewLearnerRegisterActionPerformed(evt);
            }
        });
        jPanel33.add(btnNewLearnerRegister);

        btnNewLearnerRegisterProceed.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnNewLearnerRegisterProceed.setText("Proceed");
        btnNewLearnerRegisterProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewLearnerRegisterProceedActionPerformed(evt);
            }
        });
        jPanel33.add(btnNewLearnerRegisterProceed);

        btnNewLearnerRegisterClose.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnNewLearnerRegisterClose.setText("Close");
        btnNewLearnerRegisterClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewLearnerRegisterCloseActionPerformed(evt);
            }
        });
        jPanel33.add(btnNewLearnerRegisterClose);

        lblStatus.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tblNewLearners.setAutoCreateRowSorter(true);
        tblNewLearners.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblNewLearners.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        tblNewLearners.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Learner Number", "First Name", "Last Name", "Grade"
            }
        ));
        tblNewLearners.setRowHeight(40);
        jScrollPane5.setViewportView(tblNewLearners);
        if (tblNewLearners.getColumnModel().getColumnCount() > 0) {
            tblNewLearners.getColumnModel().getColumn(0).setResizable(false);
            tblNewLearners.getColumnModel().getColumn(1).setResizable(false);
            tblNewLearners.getColumnModel().getColumn(2).setResizable(false);
            tblNewLearners.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 70)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("New Learner");

        javax.swing.GroupLayout NewLearnerFrameLayout = new javax.swing.GroupLayout(NewLearnerFrame.getContentPane());
        NewLearnerFrame.getContentPane().setLayout(NewLearnerFrameLayout);
        NewLearnerFrameLayout.setHorizontalGroup(
            NewLearnerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewLearnerFrameLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(NewLearnerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewLearnerFrameLayout.createSequentialGroup()
                        .addGroup(NewLearnerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE))
                    .addGroup(NewLearnerFrameLayout.createSequentialGroup()
                        .addGroup(NewLearnerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NewLearnerFrameLayout.createSequentialGroup()
                                .addGap(618, 618, 618)
                                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NewLearnerFrameLayout.createSequentialGroup()
                                .addComponent(mainPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 1047, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        NewLearnerFrameLayout.setVerticalGroup(
            NewLearnerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewLearnerFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NewLearnerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mainPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NewLearnerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(NewLearnerFrameLayout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5))
                .addGap(4, 4, 4)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(NewLearnerFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        NewBookFrame.setBorder(null);
        NewBookFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        NewBookFrame.setResizable(true);
        NewBookFrame.setTitle("Learner Registration");
        NewBookFrame.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NewBookFrame.setNormalBounds(new java.awt.Rectangle(0, 0, 1348, 730));
        NewBookFrame.setPreferredSize(new java.awt.Dimension(1360, 735));
        NewBookFrame.setVisible(false);

        mainPanel7.setLayout(new java.awt.GridLayout(1, 1, 2, 2));

        jLabel81.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/image/lawleyLogo.png"))); // NOI18N
        mainPanel7.add(jLabel81);

        jPanel22.setLayout(new java.awt.GridLayout(7, 2, 1, 1));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel45.setText("Book Title : ");
        jPanel22.add(jLabel45);

        txtBookTitle.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtBookTitle.setToolTipText("");
        jPanel22.add(txtBookTitle);

        jLabel46.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel46.setText("Author(s) :");
        jPanel22.add(jLabel46);

        txtAuthor.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtAuthor.setToolTipText("");
        jPanel22.add(txtAuthor);

        jLabel47.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel47.setText("ISBN :");
        jPanel22.add(jLabel47);

        txtISBN.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtISBN.setToolTipText("");
        jPanel22.add(txtISBN);

        jLabel48.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel48.setText("Publisher :");
        jPanel22.add(jLabel48);

        txtPublisher.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtPublisher.setToolTipText("");
        jPanel22.add(txtPublisher);

        jLabel50.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel50.setText("Status :");
        jPanel22.add(jLabel50);

        txtStatus.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtStatus.setToolTipText("");
        jPanel22.add(txtStatus);

        jLabel54.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel54.setText("Quantity :");
        jPanel22.add(jLabel54);

        txtQuantity.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtQuantity.setToolTipText("");
        jPanel22.add(txtQuantity);

        jLabel55.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel55.setText("Year :");
        jPanel22.add(jLabel55);

        txtYear.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtYear.setToolTipText("");
        jPanel22.add(txtYear);

        jPanel49.setLayout(new java.awt.GridLayout(1, 3, 1, 1));

        btnNewBookRecord.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnNewBookRecord.setText("Submit");
        btnNewBookRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewBookRecordActionPerformed(evt);
            }
        });
        jPanel49.add(btnNewBookRecord);

        btnNewBookRecordProceed.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnNewBookRecordProceed.setText("Proceed");
        btnNewBookRecordProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewBookRecordProceedActionPerformed(evt);
            }
        });
        jPanel49.add(btnNewBookRecordProceed);

        btnNewBookRecordClose.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnNewBookRecordClose.setText("Close");
        btnNewBookRecordClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewBookRecordCloseActionPerformed(evt);
            }
        });
        jPanel49.add(btnNewBookRecordClose);

        lblStatus1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblStatus1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tblNewBooks.setAutoCreateRowSorter(true);
        tblNewBooks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblNewBooks.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        tblNewBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title", "Author", "ISBN", "Year"
            }
        ));
        tblNewBooks.setRowHeight(40);
        jScrollPane6.setViewportView(tblNewBooks);
        if (tblNewBooks.getColumnModel().getColumnCount() > 0) {
            tblNewBooks.getColumnModel().getColumn(0).setResizable(false);
            tblNewBooks.getColumnModel().getColumn(1).setResizable(false);
            tblNewBooks.getColumnModel().getColumn(2).setResizable(false);
            tblNewBooks.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 70)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("New Book");

        javax.swing.GroupLayout NewBookFrameLayout = new javax.swing.GroupLayout(NewBookFrame.getContentPane());
        NewBookFrame.getContentPane().setLayout(NewBookFrameLayout);
        NewBookFrameLayout.setHorizontalGroup(
            NewBookFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewBookFrameLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(NewBookFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewBookFrameLayout.createSequentialGroup()
                        .addGroup(NewBookFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE))
                    .addGroup(NewBookFrameLayout.createSequentialGroup()
                        .addGroup(NewBookFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NewBookFrameLayout.createSequentialGroup()
                                .addGap(618, 618, 618)
                                .addComponent(lblStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NewBookFrameLayout.createSequentialGroup()
                                .addComponent(mainPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        NewBookFrameLayout.setVerticalGroup(
            NewBookFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewBookFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NewBookFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mainPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NewBookFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(NewBookFrameLayout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)
                        .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6))
                .addGap(4, 4, 4)
                .addComponent(lblStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(NewBookFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MakePaymentFrame.setBorder(null);
        MakePaymentFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        MakePaymentFrame.setResizable(true);
        MakePaymentFrame.setTitle("Payment");
        MakePaymentFrame.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MakePaymentFrame.setNormalBounds(new java.awt.Rectangle(0, 0, 1048, 730));
        MakePaymentFrame.setPreferredSize(new java.awt.Dimension(1360, 735));
        MakePaymentFrame.setVisible(false);

        mainPanel5.setLayout(new java.awt.GridLayout(1, 1, 2, 2));

        jLabel79.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel79.setText("Payment");
        mainPanel5.add(jLabel79);

        jPanel17.setLayout(new java.awt.GridLayout(2, 1, 1, 1));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("Learner Number :");
        jPanel17.add(jLabel27);

        txtPaymentStudentNo.setEditable(false);
        txtPaymentStudentNo.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtPaymentStudentNo.setToolTipText("");
        jPanel17.add(txtPaymentStudentNo);

        jPanel18.setLayout(new java.awt.GridLayout(2, 1, 1, 1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Payment amount :");
        jPanel18.add(jLabel28);

        txtPayment.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtPayment.setToolTipText("");
        jPanel18.add(txtPayment);

        jPanel37.setLayout(new java.awt.GridLayout(2, 2, 1, 1));

        btnPayment.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnPayment.setText("Proceed");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });
        jPanel37.add(btnPayment);

        btnPaymentClose.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnPaymentClose.setText("Close");
        btnPaymentClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentCloseActionPerformed(evt);
            }
        });
        jPanel37.add(btnPaymentClose);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );

        jPanel37.add(jPanel19);

        javax.swing.GroupLayout MakePaymentFrameLayout = new javax.swing.GroupLayout(MakePaymentFrame.getContentPane());
        MakePaymentFrame.getContentPane().setLayout(MakePaymentFrameLayout);
        MakePaymentFrameLayout.setHorizontalGroup(
            MakePaymentFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MakePaymentFrameLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(MakePaymentFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(328, 328, 328))
        );
        MakePaymentFrameLayout.setVerticalGroup(
            MakePaymentFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MakePaymentFrameLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(mainPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        getContentPane().add(MakePaymentFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ViewLearnersFrame.setBorder(null);
        ViewLearnersFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        ViewLearnersFrame.setResizable(true);
        ViewLearnersFrame.setTitle("Learners");
        ViewLearnersFrame.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ViewLearnersFrame.setNormalBounds(new java.awt.Rectangle(0, 0, 1048, 730));
        ViewLearnersFrame.setPreferredSize(new java.awt.Dimension(1360, 735));
        ViewLearnersFrame.setVisible(false);

        jPanel20.setLayout(new java.awt.GridLayout(1, 1, 1, 1));

        tbViewLearners.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        tbViewLearners.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Number", "First Name", "Last Name", "ID Number", "Grade", "Parent", "Contact Number", "Res Address"
            }
        ));
        tbViewLearners.setRowHeight(40);
        jScrollPane1.setViewportView(tbViewLearners);
        if (tbViewLearners.getColumnModel().getColumnCount() > 0) {
            tbViewLearners.getColumnModel().getColumn(0).setResizable(false);
            tbViewLearners.getColumnModel().getColumn(1).setResizable(false);
            tbViewLearners.getColumnModel().getColumn(2).setResizable(false);
            tbViewLearners.getColumnModel().getColumn(3).setResizable(false);
            tbViewLearners.getColumnModel().getColumn(4).setResizable(false);
            tbViewLearners.getColumnModel().getColumn(5).setResizable(false);
            tbViewLearners.getColumnModel().getColumn(6).setResizable(false);
            tbViewLearners.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel20.add(jScrollPane1);

        jPanel45.setLayout(new java.awt.GridLayout(1, 3, 1, 1));

        btnSearchLearner.setBackground(new java.awt.Color(255, 255, 255));
        btnSearchLearner.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnSearchLearner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/image/search.png"))); // NOI18N
        btnSearchLearner.setText("Search");
        btnSearchLearner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchLearnerActionPerformed(evt);
            }
        });
        jPanel45.add(btnSearchLearner);

        btnPrintLearners.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnPrintLearners.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/image/printButton.png"))); // NOI18N
        btnPrintLearners.setText("Print");
        btnPrintLearners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintLearnersActionPerformed(evt);
            }
        });
        jPanel45.add(btnPrintLearners);

        btnLearnersClose.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnLearnersClose.setText("Close");
        btnLearnersClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLearnersCloseActionPerformed(evt);
            }
        });
        jPanel45.add(btnLearnersClose);

        javax.swing.GroupLayout ViewLearnersFrameLayout = new javax.swing.GroupLayout(ViewLearnersFrame.getContentPane());
        ViewLearnersFrame.getContentPane().setLayout(ViewLearnersFrameLayout);
        ViewLearnersFrameLayout.setHorizontalGroup(
            ViewLearnersFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLearnersFrameLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(ViewLearnersFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 1175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        ViewLearnersFrameLayout.setVerticalGroup(
            ViewLearnersFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLearnersFrameLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(ViewLearnersFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ViewBooksFrame.setBorder(null);
        ViewBooksFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        ViewBooksFrame.setResizable(true);
        ViewBooksFrame.setTitle("Books");
        ViewBooksFrame.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ViewBooksFrame.setNormalBounds(new java.awt.Rectangle(0, 0, 1048, 730));
        ViewBooksFrame.setPreferredSize(new java.awt.Dimension(1360, 735));
        ViewBooksFrame.setVisible(false);

        jPanel47.setLayout(new java.awt.GridLayout(1, 1, 1, 1));

        tblViewBooks.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        tblViewBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title", "Author", "ISBN", "Publisher", "Condition", "Quantity", "Year"
            }
        ));
        tblViewBooks.setRowHeight(40);
        jScrollPane2.setViewportView(tblViewBooks);

        jPanel47.add(jScrollPane2);

        jPanel48.setLayout(new java.awt.GridLayout(1, 3, 1, 1));

        btnBooksSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnBooksSearch.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnBooksSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/image/search.png"))); // NOI18N
        btnBooksSearch.setText("Search");
        btnBooksSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBooksSearchActionPerformed(evt);
            }
        });
        jPanel48.add(btnBooksSearch);

        btnBooksPrint.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnBooksPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/image/printButton.png"))); // NOI18N
        btnBooksPrint.setText("Print");
        btnBooksPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBooksPrintActionPerformed(evt);
            }
        });
        jPanel48.add(btnBooksPrint);

        btnBooksClose.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btnBooksClose.setText("Close");
        btnBooksClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBooksCloseActionPerformed(evt);
            }
        });
        jPanel48.add(btnBooksClose);

        javax.swing.GroupLayout ViewBooksFrameLayout = new javax.swing.GroupLayout(ViewBooksFrame.getContentPane());
        ViewBooksFrame.getContentPane().setLayout(ViewBooksFrameLayout);
        ViewBooksFrameLayout.setHorizontalGroup(
            ViewBooksFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewBooksFrameLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(ViewBooksFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, 1175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        ViewBooksFrameLayout.setVerticalGroup(
            ViewBooksFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewBooksFrameLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        getContentPane().add(ViewBooksFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        AboutFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        AboutFrame.setResizable(true);
        AboutFrame.setTitle("About Us");
        AboutFrame.setToolTipText("");
        AboutFrame.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AboutFrame.setNormalBounds(new java.awt.Rectangle(0, 0, 1348, 730));
        AboutFrame.setPreferredSize(new java.awt.Dimension(1360, 735));
        AboutFrame.setVisible(false);

        btnAClose.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnAClose.setText("Close");
        btnAClose.setToolTipText("");
        btnAClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACloseActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 70)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Software Developer(s)");

        jPanel21.setLayout(new java.awt.GridLayout(4, 2, 1, 1));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/image/GradBTech.jpg"))); // NOI18N
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel21.add(jLabel30);

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel31.setText("Lungisani Ndlovu");
        jPanel21.add(jLabel31);

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/image/IMG-20180522-WA0003.jpg"))); // NOI18N
        jPanel21.add(jLabel32);

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel33.setText("Brian Mlambo");
        jPanel21.add(jLabel33);

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/image/IMG-20180522-WA0002.jpg"))); // NOI18N
        jPanel21.add(jLabel34);

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel40.setText("Marshall Dube");
        jPanel21.add(jLabel40);

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel21.add(jLabel41);

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jPanel21.add(jLabel42);

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/image/companyLogo.png"))); // NOI18N

        javax.swing.GroupLayout AboutFrameLayout = new javax.swing.GroupLayout(AboutFrame.getContentPane());
        AboutFrame.getContentPane().setLayout(AboutFrameLayout);
        AboutFrameLayout.setHorizontalGroup(
            AboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutFrameLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(AboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AboutFrameLayout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AboutFrameLayout.createSequentialGroup()
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAClose, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        AboutFrameLayout.setVerticalGroup(
            AboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AboutFrameLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(AboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(AboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAClose))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        getContentPane().add(AboutFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ContactUsFrame.setBorder(null);
        ContactUsFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        ContactUsFrame.setResizable(true);
        ContactUsFrame.setTitle("Contact Us");
        ContactUsFrame.setToolTipText("");
        ContactUsFrame.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ContactUsFrame.setNormalBounds(new java.awt.Rectangle(0, 0, 1348, 730));
        ContactUsFrame.setPreferredSize(new java.awt.Dimension(1360, 735));
        ContactUsFrame.setVisible(false);

        btnCUClose.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnCUClose.setText("Close");
        btnCUClose.setToolTipText("");
        btnCUClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCUCloseActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/image/lawleyLogo.png"))); // NOI18N

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel44.setForeground(java.awt.Color.red);
        jLabel44.setText("Contact Centre");

        jScrollPane4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Tel: 073 370 6904\nSMS Number: 073 370 6904\nEmail: helpdesk@lawleypschool.co.za");
        jTextArea1.setBorder(null);
        jScrollPane4.setViewportView(jTextArea1);

        jLabel52.setFont(new java.awt.Font("Times New Roman", 1, 70)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Lawley Primary School");

        javax.swing.GroupLayout ContactUsFrameLayout = new javax.swing.GroupLayout(ContactUsFrame.getContentPane());
        ContactUsFrame.getContentPane().setLayout(ContactUsFrameLayout);
        ContactUsFrameLayout.setHorizontalGroup(
            ContactUsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactUsFrameLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(ContactUsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContactUsFrameLayout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContactUsFrameLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCUClose, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(369, 369, 369))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContactUsFrameLayout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        ContactUsFrameLayout.setVerticalGroup(
            ContactUsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactUsFrameLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(ContactUsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(ContactUsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCUClose)
                    .addGroup(ContactUsFrameLayout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(ContactUsFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PostMessageFrame.setBorder(null);
        PostMessageFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        PostMessageFrame.setResizable(true);
        PostMessageFrame.setTitle("Post Message");
        PostMessageFrame.setToolTipText("");
        PostMessageFrame.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PostMessageFrame.setNormalBounds(new java.awt.Rectangle(0, 0, 1348, 730));
        PostMessageFrame.setPreferredSize(new java.awt.Dimension(1360, 735));
        PostMessageFrame.setVisible(false);

        btnPostMessageClose.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnPostMessageClose.setText("Close");
        btnPostMessageClose.setToolTipText("");
        btnPostMessageClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostMessageCloseActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/image/lawleyLogo.png"))); // NOI18N

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel59.setForeground(java.awt.Color.red);
        jLabel59.setText("Enter message:");

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 70)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Post Message(s)");

        btnSendMessage.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnSendMessage.setText("Send Message");
        btnSendMessage.setToolTipText("");
        btnSendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendMessageActionPerformed(evt);
            }
        });

        txtMessage.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtMessage.setToolTipText("Post message");
        txtMessage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PostMessageFrameLayout = new javax.swing.GroupLayout(PostMessageFrame.getContentPane());
        PostMessageFrame.getContentPane().setLayout(PostMessageFrameLayout);
        PostMessageFrameLayout.setHorizontalGroup(
            PostMessageFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PostMessageFrameLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(PostMessageFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PostMessageFrameLayout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 83, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PostMessageFrameLayout.createSequentialGroup()
                        .addGroup(PostMessageFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMessage, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PostMessageFrameLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSendMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPostMessageClose, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(645, 645, 645))))
        );
        PostMessageFrameLayout.setVerticalGroup(
            PostMessageFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PostMessageFrameLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(PostMessageFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PostMessageFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPostMessageClose)
                    .addComponent(btnSendMessage))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(PostMessageFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ViewPostedMessagesFrame.setBorder(null);
        ViewPostedMessagesFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        ViewPostedMessagesFrame.setResizable(true);
        ViewPostedMessagesFrame.setTitle("Posted Messages");
        ViewPostedMessagesFrame.setToolTipText("");
        ViewPostedMessagesFrame.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ViewPostedMessagesFrame.setNormalBounds(new java.awt.Rectangle(0, 0, 1348, 730));
        ViewPostedMessagesFrame.setPreferredSize(new java.awt.Dimension(1360, 735));
        ViewPostedMessagesFrame.setVisible(false);

        btnPostMessageClose1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnPostMessageClose1.setText("Close");
        btnPostMessageClose1.setToolTipText("");
        btnPostMessageClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostMessageClose1ActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/image/lawleyLogo.png"))); // NOI18N

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel62.setForeground(java.awt.Color.red);

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 70)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Posted Message(s)");

        tAreaMessages.setEditable(false);
        tAreaMessages.setColumns(20);
        tAreaMessages.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        tAreaMessages.setRows(5);
        tAreaMessages.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(tAreaMessages);

        javax.swing.GroupLayout ViewPostedMessagesFrameLayout = new javax.swing.GroupLayout(ViewPostedMessagesFrame.getContentPane());
        ViewPostedMessagesFrame.getContentPane().setLayout(ViewPostedMessagesFrameLayout);
        ViewPostedMessagesFrameLayout.setHorizontalGroup(
            ViewPostedMessagesFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPostedMessagesFrameLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(ViewPostedMessagesFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewPostedMessagesFrameLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(645, 645, 645))
                    .addGroup(ViewPostedMessagesFrameLayout.createSequentialGroup()
                        .addGroup(ViewPostedMessagesFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPostMessageClose1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ViewPostedMessagesFrameLayout.createSequentialGroup()
                                .addComponent(jLabel61)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 83, Short.MAX_VALUE))))
        );
        ViewPostedMessagesFrameLayout.setVerticalGroup(
            ViewPostedMessagesFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPostedMessagesFrameLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(ViewPostedMessagesFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPostMessageClose1)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        getContentPane().add(ViewPostedMessagesFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblTime.setBackground(new java.awt.Color(0, 0, 0));
        lblTime.setFont(new java.awt.Font("Brush Script MT", 1, 50)); // NOI18N
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 290, 50));

        lblDate.setBackground(new java.awt.Color(0, 0, 0));
        lblDate.setFont(new java.awt.Font("Brush Script MT", 1, 55)); // NOI18N
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 290, 70));

        lblSlogan.setBackground(new java.awt.Color(0, 0, 0));
        lblSlogan.setFont(new java.awt.Font("Brush Script MT", 1, 24)); // NOI18N
        lblSlogan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(lblSlogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 430, 50));

        lblDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/image/student.png"))); // NOI18N
        lblDisplay.setPreferredSize(new java.awt.Dimension(1364, 768));
        getContentPane().add(lblDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 740));

        mainMenu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        menuHome.setText("Home");
        menuHome.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        menuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHomeActionPerformed(evt);
            }
        });

        itemLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        itemLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/icon/login.PNG"))); // NOI18N
        itemLogin.setMnemonic('L');
        itemLogin.setText("Login");
        itemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLoginActionPerformed(evt);
            }
        });
        menuHome.add(itemLogin);

        itemLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemLogout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        itemLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/icon/signout.png"))); // NOI18N
        itemLogout.setMnemonic('o');
        itemLogout.setText("Logout");
        itemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLogoutActionPerformed(evt);
            }
        });
        menuHome.add(itemLogout);

        itemRegister.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemRegister.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        itemRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/icon/user.png"))); // NOI18N
        itemRegister.setText("Register");
        itemRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegisterActionPerformed(evt);
            }
        });
        menuHome.add(itemRegister);
        menuHome.add(lineSeparator);

        itemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemExit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        itemExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/icon/cancel.PNG"))); // NOI18N
        itemExit.setText("Exit");
        itemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemExitActionPerformed(evt);
            }
        });
        menuHome.add(itemExit);

        mainMenu.add(menuHome);

        menuProfile.setText("Profile");
        menuProfile.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        itemEditProfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemEditProfile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        itemEditProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/icon/register.png"))); // NOI18N
        itemEditProfile.setText("Edit");
        itemEditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditProfileActionPerformed(evt);
            }
        });
        menuProfile.add(itemEditProfile);

        itemChangePassword.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemChangePassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        itemChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/icon/login.PNG"))); // NOI18N
        itemChangePassword.setText("Change Password");
        itemChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemChangePasswordActionPerformed(evt);
            }
        });
        menuProfile.add(itemChangePassword);

        mainMenu.add(menuProfile);

        menuSystem.setText("System");
        menuSystem.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        menuSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSystemActionPerformed(evt);
            }
        });

        menuLearnerInformation.setText("Learners information");
        menuLearnerInformation.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        itemNewLearner.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemNewLearner.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        itemNewLearner.setText("New learner");
        itemNewLearner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNewLearnerActionPerformed(evt);
            }
        });
        menuLearnerInformation.add(itemNewLearner);

        itemViewLearner.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemViewLearner.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        itemViewLearner.setText("View learner(s)");
        itemViewLearner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemViewLearnerActionPerformed(evt);
            }
        });
        menuLearnerInformation.add(itemViewLearner);

        menuSystem.add(menuLearnerInformation);

        jMenu1.setText("Books information");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        itemNewBook.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemNewBook.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        itemNewBook.setText("New book");
        itemNewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNewBookActionPerformed(evt);
            }
        });
        jMenu1.add(itemNewBook);

        itemViewBooks.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemViewBooks.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        itemViewBooks.setText("View book(s)");
        itemViewBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemViewBooksActionPerformed(evt);
            }
        });
        jMenu1.add(itemViewBooks);

        menuSystem.add(jMenu1);

        itemViewSubjects.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemViewSubjects.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        itemViewSubjects.setText("View subject(s)");
        itemViewSubjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemViewSubjectsActionPerformed(evt);
            }
        });
        menuSystem.add(itemViewSubjects);

        itemProofOfRegistration.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemProofOfRegistration.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        itemProofOfRegistration.setText("Proof of registration");
        itemProofOfRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProofOfRegistrationActionPerformed(evt);
            }
        });
        menuSystem.add(itemProofOfRegistration);

        itemPayments.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemPayments.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        itemPayments.setText("Record payments");
        itemPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPaymentsActionPerformed(evt);
            }
        });
        menuSystem.add(itemPayments);

        mainMenu.add(menuSystem);

        menuMessages.setText("Message");
        menuMessages.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        itemPostMessage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemPostMessage.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        itemPostMessage.setText("Post Message");
        itemPostMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPostMessageActionPerformed(evt);
            }
        });
        menuMessages.add(itemPostMessage);

        itemViewMessages.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemViewMessages.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        itemViewMessages.setText("View Message(s)");
        itemViewMessages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemViewMessagesActionPerformed(evt);
            }
        });
        menuMessages.add(itemViewMessages);

        mainMenu.add(menuMessages);

        menuHelp.setText("Help");
        menuHelp.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        itemHelpContent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        itemHelpContent.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        itemHelpContent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/icon/Information.png"))); // NOI18N
        itemHelpContent.setText("Help and support");
        itemHelpContent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemHelpContentActionPerformed(evt);
            }
        });
        menuHelp.add(itemHelpContent);
        menuHelp.add(jSeparator2);

        itemContactUs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itemContactUs.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        itemContactUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/icon/contactUs.jpg"))); // NOI18N
        itemContactUs.setText("Contact");
        itemContactUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemContactUsActionPerformed(evt);
            }
        });
        menuHelp.add(itemContactUs);

        itemAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        itemAbout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        itemAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bttp/icon/designers.PNG"))); // NOI18N
        itemAbout.setText("About");
        itemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAboutActionPerformed(evt);
            }
        });
        menuHelp.add(itemAbout);

        mainMenu.add(menuHelp);

        setJMenuBar(mainMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void login() {
        LoginFrame.setVisible(true);
        LoginFrame.toFront();
        clearLogin();
        itemLogin.setVisible(false);
        itemRegister.setVisible(false);
        lineSeparator.setVisible(false);
    }

    @SuppressWarnings("UseSpecificCatch")
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String lusername = txtUsername.getText();
        String lpassword = txtPassword.getText();

        if (lusername.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username field is empty.", "Warning", JOptionPane.WARNING_MESSAGE);
            flashMyField(txtUsername, Color.red, 200, 2000);
            txtUsername.requestFocus();
        } else if (lpassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password field is empty.", "Warning", JOptionPane.WARNING_MESSAGE);
            flashMyField(txtPassword, Color.red, 200, 2000);
            txtPassword.requestFocus();
        } else {
            try {
                DBRegistrationManager manager = new DBRegistrationManager();
                gemployee = manager.login(lusername, lpassword);

                if (gemployee != null) {
                    LoginFrame.setVisible(false);
                    itemChangePassword.setVisible(true);
                    itemLogout.setVisible(true);
                    itemRegister.setVisible(false);
                    lineSeparator.setVisible(true);
                    mainMenu.setVisible(true);
                    menuProfile.setVisible(true);
                    menuSystem.setVisible(true);
                    menuMessages.setVisible(true);

                    gidentityno = gemployee.getIdentityno();

                    JOptionPane.showMessageDialog(this, "Greetings, " + gemployee.getFirstname() + " " + gemployee.getLastname() + "\nYou have been successfully logged-in.", "Message", 1);

                    setTitle("Hi, " + gemployee.getFirstname() + " " + gemployee.getLastname() + " (" + gemployee.getOccupation() + ")");
                } else {
                    JOptionPane.showMessageDialog(this, "Could not log-in. Valid authentication credentials were not provided.", "Warning", JOptionPane.WARNING_MESSAGE);
                    flashMyField(txtPassword, Color.red, 200, 2000);
                    txtPassword.setText("");
                    txtPassword.requestFocus();
                }

                manager.closeConnection();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage() + "\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasswordActionPerformed
        // TODO add your handling code here:
        clearLogin();
        LoginFrame.setVisible(false);
        ForgottenPasswordFrame.setVisible(true);
        clearForgottenPassword();
    }//GEN-LAST:event_btnPasswordActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to close?",
                "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (n == JOptionPane.YES_OPTION) {
            LoginFrame.setVisible(false);
            itemLogin.setVisible(true);
            itemRegister.setVisible(true);
            lineSeparator.setVisible(true);
        }
    }//GEN-LAST:event_btnCloseActionPerformed

    public void logout() {
        menuProfile.setVisible(false);
        menuSystem.setVisible(false);
        menuMessages.setVisible(false);
        itemChangePassword.setVisible(false);
        itemLogout.setVisible(false);
        itemRegister.setVisible(true);
        itemLogin.setVisible(true);
        lineSeparator.setVisible(true);
        mainMenu.setVisible(true);
        clearLogin();
        LoginFrame.setVisible(true);
        setTitle("Lawley Primary School");
    }

    private void btnNewUserRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewUserRegistrationActionPerformed
        // TODO add your handling code here:
        clearLogin();
        LoginFrame.setVisible(false);
        mainMenu.setVisible(false);
        RegisterFrame.setVisible(true);
        clearRegister();
    }//GEN-LAST:event_btnNewUserRegistrationActionPerformed

    @SuppressWarnings("UseSpecificCatch")
    private void btnMRegRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMRegRegisterActionPerformed
        // TODO add your handling code here:
        String employeeno = txtEmployeeNo.getText();
        gidentityno = txtIDPassportNo.getText();

        if (employeeno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Employee Number field is empty.", "Warning", JOptionPane.WARNING_MESSAGE);
            flashMyField(txtEmployeeNo, Color.red, 200, 2000);
            txtEmployeeNo.requestFocus();
        } else if (gidentityno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Identity/Passport Number field is empty.", "Warning", JOptionPane.WARNING_MESSAGE);
            flashMyField(txtIDPassportNo, Color.red, 200, 2000);
            txtIDPassportNo.requestFocus();
        } else {
            if (employeeno.length() == 8) {
                try {
                    Long.parseLong(employeeno);
                    if (ValidateSouthAfricanID.isValidIDNumber(gidentityno)) {
                        try {
                            DBRegistrationManager manager = new DBRegistrationManager();
                            if (manager.isEmployeeRegistered(employeeno, gidentityno)) {
                                clearRegister();
                                RegisterFrame.setVisible(false);
                                mainMenu.setVisible(true);
                                LoginFrame.setVisible(true);
                                JOptionPane.showMessageDialog(this, "User account already registered. Please log-in", "Warning", JOptionPane.WARNING_MESSAGE);
                            } else {
                                gusername = employeeno;
                                clearRegister();
                                RegisterFrame.setVisible(false);
                                CreateNewAccountFrame.setVisible(true);
                            }
                            manager.closeConnection();
                        } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
                            JOptionPane.showMessageDialog(this, ex.getMessage() + "\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Identity Number is invalid.", "Warning", JOptionPane.WARNING_MESSAGE);
                        flashMyField(txtIDPassportNo, Color.red, 200, 2000);
                        txtIDPassportNo.setText("");
                        txtIDPassportNo.requestFocus();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Employee Number is invalid.", "Warning", JOptionPane.WARNING_MESSAGE);
                    flashMyField(txtEmployeeNo, Color.red, 200, 2000);
                    txtEmployeeNo.setText("");
                    txtEmployeeNo.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Employee Number is invalid.", "Warning", JOptionPane.WARNING_MESSAGE);
                flashMyField(txtEmployeeNo, Color.red, 200, 2000);
                txtEmployeeNo.setText("");
                txtEmployeeNo.requestFocus();
            }
        }
    }//GEN-LAST:event_btnMRegRegisterActionPerformed

    public boolean isValidStudentno(String studentno) {
        boolean isValid = true;
        for (int x = 0; x < studentno.length(); x++) {
            if (Character.isLetter(studentno.charAt(x)) || Character.isSpaceChar(studentno.charAt(x))) {
                isValid = false;
                break;
            }
        }
        return isValid;
    }

    private void btnMRegCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMRegCloseActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to close?",
                "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (n == JOptionPane.YES_OPTION) {
            clearRegister();
            RegisterFrame.setVisible(false);
            mainMenu.setVisible(true);
            LoginFrame.setVisible(true);
        }
    }//GEN-LAST:event_btnMRegCloseActionPerformed

    @SuppressWarnings("UseSpecificCatch")
    private void btnCARegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCARegisterActionPerformed
        // TODO add your handling code here:
        String rfirstName = txtFirstname.getText(),
                rlastName = txtLastname.getText(),
                rcontactNo = txtContactno.getText(),
                remailAddress = txtEmailaddress.getText();

        if (rfirstName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "First Name field is empty.", "Warning", 2);
            flashMyField(txtFirstname, Color.red, 200, 2000);
            txtFirstname.requestFocus();
        } else if (rlastName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Last Name field is empty.", "Warning", 2);
            flashMyField(txtLastname, Color.red, 200, 2000);
            txtLastname.requestFocus();
        } else if (rcontactNo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Contact Number field is empty.", "Warning", 2);
            flashMyField(txtContactno, Color.red, 200, 2000);
            txtContactno.requestFocus();
        } else if (remailAddress.isEmpty()) {
            JOptionPane.showMessageDialog(this, "E-mail Address field is empty.", "Warning", 2);
            flashMyField(txtEmailaddress, Color.red, 200, 2000);
            txtEmailaddress.requestFocus();
        } else {
            //Validate email address
            gfirstname = txtFirstname.getText();
            glastname = txtLastname.getText();
            //Setting the username
            txtCPUsername.setText(gusername);
            txtCPUsername.setEditable(false);

            clearNewAccount();
            CreateNewAccountFrame.setVisible(false);
            ConfirmPasswordFrame.setVisible(true);
            clearConfirmPassword();
        }
    }//GEN-LAST:event_btnCARegisterActionPerformed

    private void btnCACloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCACloseActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to close?",
                "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (n == JOptionPane.YES_OPTION) {
            clearNewAccount();
            CreateNewAccountFrame.setVisible(false);
            mainMenu.setVisible(true);
            LoginFrame.setVisible(true);
        }
    }//GEN-LAST:event_btnCACloseActionPerformed

    @SuppressWarnings("UseSpecificCatch")
    private void btnCPRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCPRegisterActionPerformed
        // TODO add your handling code here:
        String lpassword = txtCPPassword.getText(), lretypepassword = txtCPRetypePassword.getText();

        if (lpassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password field is empty.", "Warning", 2);
            flashMyField(txtCPPassword, Color.red, 200, 2000);
            txtCPPassword.requestFocus();
        } else if (lretypepassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Retype Password field is empty.", "Warning", 2);
            flashMyField(txtCPRetypePassword, Color.red, 200, 2000);
            txtCPRetypePassword.requestFocus();
        } else {
            if (lpassword.equals(lretypepassword)) {
                if (lpassword.length() >= 6) {
                    try {
                        DBRegistrationManager manager = new DBRegistrationManager();
                        gemployee = new Employee(gusername, gfirstname, glastname, gidentityno, gemail, gcontactno, "Teacher");
                        if (manager.newEmployeeRegistration(gemployee) > 0 && manager.registerLogin(gusername, lpassword, gidentityno) > 0) {
                            gpassword = lpassword;
                            txtUsername.setText(gusername);
                            txtPassword.setText(gpassword);

                            clearConfirmPassword();
                            //You are now registered
                            ConfirmPasswordFrame.setVisible(false);
                            JOptionPane.showMessageDialog(this, "Greetings, " + gfirstname + " " + glastname + "\nYour registration has been approved or completed successful.", "Message", JOptionPane.INFORMATION_MESSAGE);
                            mainMenu.setVisible(true);
                            LoginFrame.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(this, "Database error\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        manager.closeConnection();
                    } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
                        JOptionPane.showMessageDialog(this, ex.getMessage() + "\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Password should be more than 6 characters long.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Passwords do not match.", "Warning", JOptionPane.WARNING_MESSAGE);
                flashMyField(txtCPRetypePassword, Color.red, 200, 2000);
                txtCPRetypePassword.setText("");
                txtCPRetypePassword.requestFocus();
            }
        }
    }//GEN-LAST:event_btnCPRegisterActionPerformed

    private void btnCPCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCPCloseActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to close?",
                "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (n == JOptionPane.YES_OPTION) {
            clearConfirmPassword();
            ConfirmPasswordFrame.setVisible(false);
            mainMenu.setVisible(true);
            LoginFrame.setVisible(true);
        }
    }//GEN-LAST:event_btnCPCloseActionPerformed

    private void btnFPCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFPCloseActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to close?",
                "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (n == JOptionPane.YES_OPTION) {
            clearForgottenPassword();
            ForgottenPasswordFrame.setVisible(false);
            LoginFrame.setVisible(true);
        }
    }//GEN-LAST:event_btnFPCloseActionPerformed

    private void btnForgottenPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgottenPasswordActionPerformed
        // TODO add your handling code here:
        String employeeno = txtFPEmployeeNo.getText();
        String identityno = txtFPIDPassportNo.getText();

        if (employeeno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Employee Number field is empty.", "Warning", JOptionPane.WARNING_MESSAGE);
            flashMyField(txtFPEmployeeNo, Color.red, 200, 2000);
            txtFPEmployeeNo.requestFocus();
        } else if (identityno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Identity/Passport Number field is empty.", "Warning", JOptionPane.WARNING_MESSAGE);
            flashMyField(txtFPIDPassportNo, Color.red, 200, 2000);
            txtFPIDPassportNo.requestFocus();
        } else {
            try {
                DBRegistrationManager manager = new DBRegistrationManager();
                String[] dBasePassword = manager.forgottenPassword(employeeno, identityno);

                if (dBasePassword == null) {
                    clearForgottenPassword();
                    ForgottenPasswordFrame.setVisible(false);
                    JOptionPane.showMessageDialog(this, "Your account is not registered OR Valid authentication credentials were not provided.", "Warning", JOptionPane.WARNING_MESSAGE);
                    mainMenu.setVisible(true);
                    LoginFrame.setVisible(true);
                } else {
                    //Send an email with the password
                }
                manager.closeConnection();
            } catch (ClassNotFoundException | SQLException | HeadlessException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage() + "\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnForgottenPasswordActionPerformed

    private void btnChSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChSubmitActionPerformed
        // TODO add your handling code here:
        String oldpassword = txtChOLDPassword.getText(), chnewpassword = txtChNewPassword.getText(), chretypepassword = txtChRetypePassword.getText();

        if (oldpassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "OLD Password field is empty.", "Warning", 2);
            flashMyField(txtChOLDPassword, Color.red, 200, 2000);
            txtChOLDPassword.requestFocus();
        } else if (chnewpassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "New Password field is empty.", "Warning", 2);
            flashMyField(txtChNewPassword, Color.red, 200, 2000);
            txtChNewPassword.requestFocus();
        } else if (chretypepassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Retype Password field is empty.", "Warning", 2);
            flashMyField(txtChRetypePassword, Color.red, 200, 2000);
            txtChRetypePassword.requestFocus();
        } else {
            if (chnewpassword.equals(chretypepassword)) {
                try {
                    DBRegistrationManager manager = new DBRegistrationManager();
                    if (manager.changePassword(oldpassword, chnewpassword, gidentityno) > 0) {
                        clearChangePassword();
                        JOptionPane.showMessageDialog(this, "Your password has been successfully modified. Please log-in again", "Message", JOptionPane.INFORMATION_MESSAGE);
                        //Your password has been changed
                        ChangePasswordFrame.setVisible(false);
                        logout();
                    } else {
                        clearChangePassword();
                        JOptionPane.showMessageDialog(this, "Could not change password. Valid authentication credentials were not provided.", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                    manager.closeConnection();
                } catch (ClassNotFoundException | SQLException | HeadlessException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage() + "Database error\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Passwords do not match.", "Warning", JOptionPane.WARNING_MESSAGE);
                flashMyField(txtChRetypePassword, Color.red, 200, 2000);
                txtChRetypePassword.setText("");
                txtChRetypePassword.requestFocus();
            }
        }
    }//GEN-LAST:event_btnChSubmitActionPerformed

    private void btnChCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChCloseActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to close?",
                "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (n == JOptionPane.YES_OPTION) {
            clearChangePassword();
            ChangePasswordFrame.setVisible(false);
            mainMenu.setVisible(true);
        }
    }//GEN-LAST:event_btnChCloseActionPerformed

    private void btnEPSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEPSubmitActionPerformed
        // TODO add your handling code here:
        String editProfilelastname = txtEPLastname.getText(), emailAddress = txtEPEmailAddress.getText(), lcontactNo = txtEPContactNo.getText();

        if (editProfilelastname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Last Name field is empty.", "Warning", JOptionPane.WARNING_MESSAGE);
            flashMyField(txtEPLastname, Color.red, 200, 2000);
            txtEPLastname.requestFocus();
        } else if (emailAddress.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email Address field is empty.", "Warning", JOptionPane.WARNING_MESSAGE);
            flashMyField(txtEPEmailAddress, Color.red, 200, 2000);
            txtEPEmailAddress.requestFocus();
        } else if (lcontactNo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Contact Number field is empty.", "Warning", JOptionPane.WARNING_MESSAGE);
            flashMyField(txtEPContactNo, Color.red, 200, 2000);
            txtEPContactNo.requestFocus();
        } else {
            boolean isValidLastname = true;
            for (int x = 0; x < editProfilelastname.length(); x++) {
                if (Character.isDigit(editProfilelastname.charAt(x)) || Character.isSpaceChar(editProfilelastname.charAt(x))) {
                    isValidLastname = false;
                    break;
                }
            }

            if (isValidLastname) {
                try {
                    DBRegistrationManager manager = new DBRegistrationManager();

                    if (manager.editProfile(editProfilelastname, emailAddress, lcontactNo, gemployee.getIdentityno()) > 0) {
                        clearEditProfile();
                        //Your profile was changed
                        EditProfileFrame.setVisible(false);
                        logout();
                        JOptionPane.showMessageDialog(this, "Your profile has been successfully modified. Please log-in again.", "Message", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        clearEditProfile();
                        JOptionPane.showMessageDialog(this, "Database error\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
                        //Your profile was changed
                        EditProfileFrame.setVisible(false);
                        mainMenu.setVisible(true);
                    }

                    manager.closeConnection();
                } catch (ClassNotFoundException | SQLException | HeadlessException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage() + "\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Last Name is invalid.", "Warning", JOptionPane.WARNING_MESSAGE);
                flashMyField(txtEPLastname, Color.red, 200, 2000);
                txtEPLastname.setText("");
                txtEPLastname.requestFocus();
            }
        }
    }//GEN-LAST:event_btnEPSubmitActionPerformed

    private void btnEPCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEPCloseActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to close?",
                "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (n == JOptionPane.YES_OPTION) {
            clearEditProfile();
            EditProfileFrame.setVisible(false);
            mainMenu.setVisible(true);
        }
    }//GEN-LAST:event_btnEPCloseActionPerformed

    private void btnACloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACloseActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to close?",
                "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (n == JOptionPane.YES_OPTION) {
            mainMenu.setVisible(true);
            AboutFrame.setVisible(false);
        }
    }//GEN-LAST:event_btnACloseActionPerformed

    private void btnCUCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCUCloseActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to close?",
                "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (n == JOptionPane.YES_OPTION) {
            mainMenu.setVisible(true);
            ContactUsFrame.setVisible(false);
        }
    }//GEN-LAST:event_btnCUCloseActionPerformed

    private void btnNewLearnerRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewLearnerRegisterActionPerformed
        // TODO add your handling code here:
        String learnerno = txtLearnerNumber.getText(), firstname = txtLearnerFirstName.getText(),
                lastname = txtLearnerLastName.getText(), identityno = txtLearnerIDNumber.getText(),
                grade = txtLearnerGrade.getText(), pfirstname = txtParentFirstName.getText(),
                plastname = txtParentLastName.getText(), pidentityno = txtParentIDNumber.getText(),
                contactno = txtParentContactNumber.getText(), residentialaddress = txtParentLocation.getText();

        if (learnerno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Learner Number field is empty.", "Warning", 2);
            flashMyField(txtLearnerNumber, Color.red, 200, 2000);
            txtLearnerNumber.requestFocus();
        } else if (firstname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "First Name field is empty.", "Warning", 2);
            flashMyField(txtLearnerFirstName, Color.red, 200, 2000);
            txtLearnerFirstName.requestFocus();
        } else if (lastname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Last Name field is empty.", "Warning", 2);
            flashMyField(txtLearnerLastName, Color.red, 200, 2000);
            txtLearnerLastName.requestFocus();
        } else if (identityno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Identity Number field is empty.", "Warning", 2);
            flashMyField(txtLearnerIDNumber, Color.red, 200, 2000);
            txtLearnerIDNumber.requestFocus();
        } else if (grade.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Grade field is empty.", "Warning", 2);
            flashMyField(txtLearnerGrade, Color.red, 200, 2000);
            txtLearnerGrade.requestFocus();
        } else if (pfirstname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "First Name field is empty.", "Warning", 2);
            flashMyField(txtParentFirstName, Color.red, 200, 2000);
            txtParentFirstName.requestFocus();
        } else if (plastname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Last Name field is empty.", "Warning", 2);
            flashMyField(txtParentLastName, Color.red, 200, 2000);
            txtParentLastName.requestFocus();
        } else if (pidentityno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Identity Number field is empty.", "Warning", 2);
            flashMyField(txtParentIDNumber, Color.red, 200, 2000);
            txtParentIDNumber.requestFocus();
        } else if (contactno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Contact Number field is empty.", "Warning", 2);
            flashMyField(txtParentContactNumber, Color.red, 200, 2000);
            txtParentContactNumber.requestFocus();
        } else if (residentialaddress.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Residential Address field is empty.", "Warning", 2);
            flashMyField(txtParentLocation, Color.red, 200, 2000);
            txtParentLocation.requestFocus();
        } else {
            //create table model with data
            Learner learner = new Learner(learnerno, firstname, lastname, identityno, grade, pfirstname, plastname, pidentityno, contactno, residentialaddress, new Generator().currentDate());
            //Populate the array list
            learners.add(learner);

            modelNewLearners.insertRow(0, new Object[]{learnerno, firstname, lastname, identityno, grade,
                pfirstname, plastname, pidentityno, contactno, residentialaddress});
            btnNewLearnerRegisterProceed.setEnabled(true);
            //Clear the fields
            clearNewLearnerFields();
            txtLearnerNumber.setText(String.format("%04d", random.nextInt(10000)));
            //Generate a proof of registration
            try {
                new ReportGenerator().printRegistration(learner);
            } catch (DocumentException | IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage() + "\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnNewLearnerRegisterActionPerformed

    private void btnNewLearnerRegisterCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewLearnerRegisterCloseActionPerformed
        // TODO add your handling code here:
        modelNewLearners.getDataVector().removeAllElements();
        int n = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to close?",
                "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (n == JOptionPane.YES_OPTION) {
            mainMenu.setVisible(true);
            NewLearnerFrame.setVisible(false);
            btnNewLearnerRegisterProceed.setEnabled(false);
        }
    }//GEN-LAST:event_btnNewLearnerRegisterCloseActionPerformed

    public void clearNewLearnerFields() {
        txtLearnerNumber.setText("");
        txtLearnerFirstName.setText("");
        txtLearnerLastName.setText("");
        txtLearnerIDNumber.setText("");
        txtLearnerGrade.setText("");
        txtParentFirstName.setText("");
        txtParentLastName.setText("");
        txtParentIDNumber.setText("");
        txtParentContactNumber.setText("");
        txtParentLocation.setText("");
        txtLearnerNumber.requestFocus();
    }

    public void clearNewBookFields() {
        txtBookTitle.setText("");
        txtAuthor.setText("");
        txtISBN.setText("");
        txtPublisher.setText("");
        txtStatus.setText("");
        txtQuantity.setText("");
        txtYear.setText("");
        txtBookTitle.requestFocus();
    }

    private void btnNewLearnerRegisterProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewLearnerRegisterProceedActionPerformed
        // TODO add your handling code here:
        try {
            DBRegistrationManager manager = new DBRegistrationManager();

            boolean isLearnerRegistered = false;

            for (Learner learner : learners) {
                if (manager.newLearnerRegistration(learner) > 0) {
                    isLearnerRegistered = true;
                }
            }

            if (isLearnerRegistered) {
                JOptionPane.showMessageDialog(this, "Learner registrations have been approved or completed successful.", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Database error\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            manager.closeConnection();
        } catch (ClassNotFoundException | SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() + "\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            NewLearnerFrame.setVisible(false);
            mainMenu.setVisible(true);
            clearNewLearnerFields();
            modelNewLearners.getDataVector().removeAllElements();
            btnNewLearnerRegisterProceed.setEnabled(false);
        }
    }//GEN-LAST:event_btnNewLearnerRegisterProceedActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        // TODO add your handling code here:
        String studentno = txtPaymentStudentNo.getText();
        String strAmtToPay = txtPayment.getText();

        if (studentno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Student Number field is empty.", "Warning", JOptionPane.WARNING_MESSAGE);
            flashMyField(txtPaymentStudentNo, Color.red, 200, 2000);
            txtPaymentStudentNo.requestFocus();
        } else if (strAmtToPay.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Amount field is empty.", "Warning", JOptionPane.WARNING_MESSAGE);
            flashMyField(txtPayment, Color.red, 200, 2000);
            txtPayment.requestFocus();
        } else {
            try {
                double amtToPay = Double.parseDouble(strAmtToPay);
                DBRegistrationManager manager = new DBRegistrationManager();

                if (amtToPay < 1500 && !manager.isRegistrationPayed(studentno)) {
                    JOptionPane.showMessageDialog(this, "Insufficient funds, you must pay R1500 or more.", "Warning", JOptionPane.WARNING_MESSAGE);
                    txtPayment.setText("");
                    txtPayment.requestFocus();
                } else {
                    if (manager.makePayment(studentno, amtToPay) > 0) {
                        txtPayment.setText("");
                        MakePaymentFrame.setVisible(false);
                        mainMenu.setVisible(true);
                        JOptionPane.showMessageDialog(this, "Payment has been successfully made.\nYou also qualify for NSFAS.\nDocuments required\n=========================\n"
                                + "Certified ID Copy of Applicant.\nCertified ID Copy of Parents.\nCertified ID Copy of Family Members.\n"
                                + "Certified Copy of Matric Results.\nCertified Copy of Proof of Payment.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        txtPaymentStudentNo.setText("");
                        txtPayment.setText("");
                        JOptionPane.showMessageDialog(this, "Database error\n\nContact the administrator at helpdesk@lawleypschool.ac.za..", "Error", JOptionPane.ERROR_MESSAGE);
                        MakePaymentFrame.setVisible(false);
                        mainMenu.setVisible(true);
                    }
                }
                manager.closeConnection();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Amount is invalid.", "Warning", JOptionPane.WARNING_MESSAGE);
                flashMyField(txtPayment, Color.red, 200, 2000);
                txtPayment.setText("");
                txtPayment.requestFocus();
            } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage() + "\n\nContact the administrator at helpdesk@lawleypschool.ac.za..", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void btnPaymentCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentCloseActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to close?",
                "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (n == JOptionPane.YES_OPTION) {
            mainMenu.setVisible(true);
            MakePaymentFrame.setVisible(false);
        }
    }//GEN-LAST:event_btnPaymentCloseActionPerformed

    private void itemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAboutActionPerformed
        // TODO add your handling code here:
        mainMenu.setVisible(false);
        AboutFrame.setVisible(true);
    }//GEN-LAST:event_itemAboutActionPerformed

    private void itemContactUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemContactUsActionPerformed
        // TODO add your handling code here:
        mainMenu.setVisible(false);
        ContactUsFrame.setVisible(true);
    }//GEN-LAST:event_itemContactUsActionPerformed

    private void itemPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPaymentsActionPerformed
        // TODO add your handling code here:
        mainMenu.setVisible(false);
//        txtPaymentStudentNo.setText(user.getStudentno());
        txtPayment.setText("");
        MakePaymentFrame.setVisible(true);
    }//GEN-LAST:event_itemPaymentsActionPerformed

    private void itemChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemChangePasswordActionPerformed
        // TODO add your handling code here:
        mainMenu.setVisible(false);
        clearChangePassword();
        ChangePasswordFrame.setVisible(true);
    }//GEN-LAST:event_itemChangePasswordActionPerformed

    private void itemEditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditProfileActionPerformed
        // TODO add your handling code here:
        mainMenu.setVisible(false);
        clearEditProfile();
        //Display default values
        txtEPFirstname.setText(gemployee.getFirstname());
        txtEPLastname.setText(gemployee.getLastname());
        txtEPIDNo.setText(gemployee.getIdentityno());
        txtEPEmailAddress.setText(gemployee.getEmail());
        txtEPContactNo.setText(gemployee.getContactno());
        EditProfileFrame.setVisible(true);
    }//GEN-LAST:event_itemEditProfileActionPerformed

    private void menuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuHomeActionPerformed

    private void itemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExitActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to quite?",
                "Exit Program", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (n == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Goodbye,\n"
                    + "Have a lovely day.", "Exit Program", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }//GEN-LAST:event_itemExitActionPerformed

    private void itemRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegisterActionPerformed
        // TODO add your handling code here:
        mainMenu.setVisible(false);
        RegisterFrame.setVisible(true);
        clearRegister();
    }//GEN-LAST:event_itemRegisterActionPerformed

    private void itemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLogoutActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to logout?",
                "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (n == JOptionPane.YES_OPTION) {
            logout();
        }
    }//GEN-LAST:event_itemLogoutActionPerformed

    private void itemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLoginActionPerformed
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_itemLoginActionPerformed

    private void btnLearnersCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLearnersCloseActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to close?",
                "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (n == JOptionPane.YES_OPTION) {
            mainMenu.setVisible(true);
            ViewLearnersFrame.setVisible(false);
            modelViewLearners.getDataVector().removeAllElements();
        }
    }//GEN-LAST:event_btnLearnersCloseActionPerformed

    private void itemViewSubjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemViewSubjectsActionPerformed
        // TODO add your handling code here:
//        try {
//        mainMenu.setVisible(false);
//        ViewLearnersFrame.setVisible(true);
//        txtDisplaySubects.setText("");
//            DBRegistrationManager manager = new DBRegistrationManager();
//            String title = "Subject code\t\tSubject\n============================================================\n", output = "";
//            ArrayList<Subject> subjects = manager.subjects(manager.studentCourse(user.getStudentno()).getCoursename());
//            for (Subject subject : subjects) {
//                output += subject.getSubjectcode() + "\t\t" + subject.getSubjectname() + "\n";
//            }
//            txtDisplaySubects.append(title + output);
//            manager.closeConnection();
//        } catch (ClassNotFoundException | SQLException ex) {
//            JOptionPane.showMessageDialog(this, ex.getMessage() + "\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_itemViewSubjectsActionPerformed

    private void menuSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSystemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSystemActionPerformed

    private void itemProofOfRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProofOfRegistrationActionPerformed
        // TODO add your handling code here:
        printProof();
    }//GEN-LAST:event_itemProofOfRegistrationActionPerformed

    public void printProof() {
        if (Desktop.isDesktopSupported()) {
            String studentNo = JOptionPane.showInputDialog(this, "What is the earner's number to print proof of registration?");
            if (studentNo.isEmpty()) {
                do {
                    JOptionPane.showMessageDialog(this, "Student Number field is empty.", "Warning", JOptionPane.WARNING_MESSAGE);
                    studentNo = JOptionPane.showInputDialog(this, "Please re-enter the learner's number to print proof of registration.");
                } while (studentNo.isEmpty());
                displayProof(studentNo);
            } else {
                displayProof(studentNo);
            }
        } else {
            JOptionPane.showMessageDialog(this, "System Error\n\nContact the administrator at helpdesk@lawleypschool.ac.za..", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void displayProof(String studentNo) {
        try {
            File myFile = new File("./" + studentNo + ".pdf");
            Desktop.getDesktop().open(myFile);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() + "\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void itemHelpContentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemHelpContentActionPerformed
        // TODO add your handling code here:
//        if (Desktop.isDesktopSupported()) {
//            try {
//                File myFile = new File("./usermanual.pdf");
//                Desktop.getDesktop().open(myFile);
//            } catch (IOException ex) {
//                JOptionPane.showMessageDialog(this, ex.getMessage() + "\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
//            }
//        }
    }//GEN-LAST:event_itemHelpContentActionPerformed

    private void itemNewLearnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNewLearnerActionPerformed
        // TODO add your handling code here:
        txtLearnerNumber.setText(String.format("%04d", random.nextInt(10000)));
        txtLearnerNumber.setEditable(false);
        modelNewLearners.getDataVector().removeAllElements();
        mainMenu.setVisible(false);
        NewLearnerFrame.setVisible(true);
    }//GEN-LAST:event_itemNewLearnerActionPerformed

    private void itemViewLearnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemViewLearnerActionPerformed
        // TODO add your handling code here:
        try {
            modelViewLearners.getDataVector().removeAllElements();
            DBRegistrationManager manager = new DBRegistrationManager();
            viewlearners = manager.retrieveLearners();
            int x = 0;

            if (viewlearners.size() > 0) {
                mainMenu.setVisible(false);
                ViewLearnersFrame.setVisible(true);

                for (Learner learner : viewlearners) {
                    modelViewLearners.insertRow(x, new Object[]{
                        learner.getLearnerno(),
                        learner.getFirstname(),
                        learner.getLastname(),
                        learner.getIdentityno(),
                        learner.getGrade(),
                        learner.getPfirstname() + " " + learner.getPlastname(),
                        learner.getContactno(),
                        learner.getResidentialaddress()});
                    x++;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Database error\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            manager.closeConnection();
        } catch (ClassNotFoundException | SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() + "\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_itemViewLearnerActionPerformed

    private void btnBooksCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBooksCloseActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to close?",
                "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (n == JOptionPane.YES_OPTION) {
            mainMenu.setVisible(true);
            ViewBooksFrame.setVisible(false);
            modelViewBooks.getDataVector().removeAllElements();
        }
    }//GEN-LAST:event_btnBooksCloseActionPerformed

    private void itemViewBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemViewBooksActionPerformed
        // TODO add your handling code here:
        try {
            modelViewBooks.getDataVector().removeAllElements();
            DBRegistrationManager manager = new DBRegistrationManager();
            viewbooks = manager.retrieveBooks();
            int x = 0;

            if (viewbooks.size() > 0) {
                mainMenu.setVisible(false);
                ViewBooksFrame.setVisible(true);

                for (Book book : viewbooks) {
                    modelViewBooks.insertRow(x, new Object[]{
                        book.getTitle(),
                        book.getAuthor(),
                        book.getISBN(),
                        book.getPublisher(),
                        book.getStatus(),
                        book.getQuantity(),
                        book.getYear()});
                    x++;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Database error\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            manager.closeConnection();
        } catch (ClassNotFoundException | SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() + "\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_itemViewBooksActionPerformed

    private void btnBooksPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBooksPrintActionPerformed
        // TODO add your handling code here:
        try {
            new PrintBooks().printBooks(viewbooks);
            if (Desktop.isDesktopSupported()) {
                File myFile = new File("./books.pdf");
                Desktop.getDesktop().open(myFile);
            }
        } catch (DocumentException | IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() + "\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBooksPrintActionPerformed

    private void btnBooksSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBooksSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBooksSearchActionPerformed

    private void btnPrintLearnersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintLearnersActionPerformed
        // TODO add your handling code here:
        try {
            new PrintLearners().printLearners(viewlearners);
            if (Desktop.isDesktopSupported()) {
                File myFile = new File("./learners.pdf");
                Desktop.getDesktop().open(myFile);
            }
        } catch (DocumentException | IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() + "\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPrintLearnersActionPerformed

    private void btnSearchLearnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchLearnerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchLearnerActionPerformed

    private void itemNewBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNewBookActionPerformed
        // TODO add your handling code here:
        modelNewBooks.getDataVector().removeAllElements();
        mainMenu.setVisible(false);
        NewBookFrame.setVisible(true);
    }//GEN-LAST:event_itemNewBookActionPerformed

    private void btnNewBookRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewBookRecordActionPerformed
        // TODO add your handling code here:
        String title = txtBookTitle.getText(), author = txtAuthor.getText(),
                isbn = txtISBN.getText(), publisher = txtPublisher.getText(),
                status = txtStatus.getText(), quantity = txtQuantity.getText(),
                year = txtYear.getText();

        if (title.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Book title field is empty.", "Warning", 2);
            flashMyField(txtBookTitle, Color.red, 200, 2000);
            txtBookTitle.requestFocus();
        } else if (author.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Author field is empty.", "Warning", 2);
            flashMyField(txtAuthor, Color.red, 200, 2000);
            txtAuthor.requestFocus();
        } else if (isbn.isEmpty()) {
            JOptionPane.showMessageDialog(this, "ISBN field is empty.", "Warning", 2);
            flashMyField(txtISBN, Color.red, 200, 2000);
            txtISBN.requestFocus();
        } else if (publisher.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Publisher field is empty.", "Warning", 2);
            flashMyField(txtPublisher, Color.red, 200, 2000);
            txtPublisher.requestFocus();
        } else if (status.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Status field is empty.", "Warning", 2);
            flashMyField(txtStatus, Color.red, 200, 2000);
            txtStatus.requestFocus();
        } else if (quantity.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Quantity field is empty.", "Warning", 2);
            flashMyField(txtQuantity, Color.red, 200, 2000);
            txtQuantity.requestFocus();
        } else if (year.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Year field is empty.", "Warning", 2);
            flashMyField(txtYear, Color.red, 200, 2000);
            txtYear.requestFocus();
        } else {
            //create table model with data
            Book book = new Book(title, author, isbn, publisher, status, quantity, year);
            //Populate the array list
            books.add(book);

            modelNewBooks.insertRow(0, new Object[]{title, author, isbn, year});
            btnNewBookRecordProceed.setEnabled(true);
            //Clear the fields
            clearNewBookFields();
        }
    }//GEN-LAST:event_btnNewBookRecordActionPerformed

    private void btnNewBookRecordProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewBookRecordProceedActionPerformed
        // TODO add your handling code here:
        try {
            DBRegistrationManager manager = new DBRegistrationManager();

            boolean isBookRegistered = false;

            for (Book book : books) {
                if (manager.newBookRegistration(book) > 0) {
                    isBookRegistered = true;
                }
            }

            if (isBookRegistered) {
                JOptionPane.showMessageDialog(this, "New book(s) registrations have been approved or completed successful.", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Database error\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            manager.closeConnection();
        } catch (ClassNotFoundException | SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() + "\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            NewBookFrame.setVisible(false);
            mainMenu.setVisible(true);
            clearNewBookFields();
            modelNewBooks.getDataVector().removeAllElements();
            btnNewBookRecordProceed.setEnabled(false);
        }
    }//GEN-LAST:event_btnNewBookRecordProceedActionPerformed

    private void btnNewBookRecordCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewBookRecordCloseActionPerformed
        // TODO add your handling code here:
        modelNewBooks.getDataVector().removeAllElements();
        int n = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to close?",
                "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (n == JOptionPane.YES_OPTION) {
            mainMenu.setVisible(true);
            NewBookFrame.setVisible(false);
            btnNewBookRecordProceed.setEnabled(false);
        }
    }//GEN-LAST:event_btnNewBookRecordCloseActionPerformed

    private void btnPostMessageCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostMessageCloseActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to close?",
                "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (n == JOptionPane.YES_OPTION) {
            mainMenu.setVisible(true);
            PostMessageFrame.setVisible(false);
            txtMessage.setText("");
        }
    }//GEN-LAST:event_btnPostMessageCloseActionPerformed

    private void itemPostMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPostMessageActionPerformed
        // TODO add your handling code here:
        txtMessage.setText("");
        mainMenu.setVisible(false);
        PostMessageFrame.setVisible(true);
    }//GEN-LAST:event_itemPostMessageActionPerformed

    private void btnSendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendMessageActionPerformed
        // TODO add your handling code here:
        try {
            String message = txtMessage.getText();
            if (message.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Message field is empty.", "Warning", 2);
                txtMessage.requestFocus();
            } else {
                DBRegistrationManager manager = new DBRegistrationManager();
                Generator gen = new Generator();
                if (manager.postComment(new Comment(0, gidentityno, message, gen.currentDate(), gen.currentTime())) > 0) {
                    JOptionPane.showMessageDialog(this, "Message has been successfully delivered.", "Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Database error\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                manager.closeConnection();
            }
        } catch (ClassNotFoundException | SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() + "\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            NewLearnerFrame.setVisible(false);
            mainMenu.setVisible(true);
            clearNewLearnerFields();
            modelNewLearners.getDataVector().removeAllElements();
            btnNewLearnerRegisterProceed.setEnabled(false);
        }
    }//GEN-LAST:event_btnSendMessageActionPerformed

    private void itemViewMessagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemViewMessagesActionPerformed
        // TODO add your handling code here:
        try {
            DBRegistrationManager manager = new DBRegistrationManager();
            ArrayList<Comment> comments = manager.retrieveComments();
            if (comments.size() > 0) {
                for (Comment comment : comments) {
                    String content = comment.getIdentityno().toUpperCase() + "\n" + comment.getComment()
                            + "\nPosted on the " + comment.getPostDate() + " at " + comment.getPostTime();
                    tAreaMessages.setText(content + "\n\n");
                }
                mainMenu.setVisible(false);
                ViewPostedMessagesFrame.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "There are no message available yet.", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
            manager.closeConnection();
        } catch (ClassNotFoundException | SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() + "\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_itemViewMessagesActionPerformed

    private void btnPostMessageClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostMessageClose1ActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to close?",
                "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (n == JOptionPane.YES_OPTION) {
            mainMenu.setVisible(true);
            ViewPostedMessagesFrame.setVisible(false);
            tAreaMessages.setText("");
        }
    }//GEN-LAST:event_btnPostMessageClose1ActionPerformed

    public static void main(String[] args) {

        try {
            XZGUI gui = new XZGUI();
            gui.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + "\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + "\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame AboutFrame;
    private javax.swing.JInternalFrame ChangePasswordFrame;
    private javax.swing.JInternalFrame ConfirmPasswordFrame;
    private javax.swing.JInternalFrame ContactUsFrame;
    private javax.swing.JInternalFrame CreateNewAccountFrame;
    private javax.swing.JInternalFrame EditProfileFrame;
    private javax.swing.JInternalFrame ForgottenPasswordFrame;
    private javax.swing.JInternalFrame LoginFrame;
    private javax.swing.JInternalFrame MakePaymentFrame;
    private javax.swing.JInternalFrame NewBookFrame;
    private javax.swing.JInternalFrame NewLearnerFrame;
    private javax.swing.JInternalFrame PostMessageFrame;
    private javax.swing.JInternalFrame RegisterFrame;
    private javax.swing.JInternalFrame ViewBooksFrame;
    private javax.swing.JInternalFrame ViewLearnersFrame;
    private javax.swing.JInternalFrame ViewPostedMessagesFrame;
    private javax.swing.JButton btnAClose;
    private javax.swing.JButton btnBooksClose;
    private javax.swing.JButton btnBooksPrint;
    private javax.swing.JButton btnBooksSearch;
    private javax.swing.JButton btnCAClose;
    private javax.swing.JButton btnCARegister;
    private javax.swing.JButton btnCPClose;
    private javax.swing.JButton btnCPRegister;
    private javax.swing.JButton btnCUClose;
    private javax.swing.JButton btnChClose;
    private javax.swing.JButton btnChSubmit;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnEPClose;
    private javax.swing.JButton btnEPSubmit;
    private javax.swing.JButton btnFPClose;
    private javax.swing.JButton btnForgottenPassword;
    private javax.swing.ButtonGroup btnGConsent;
    private javax.swing.JButton btnLearnersClose;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnMRegClose;
    private javax.swing.JButton btnMRegRegister;
    private javax.swing.JButton btnNewBookRecord;
    private javax.swing.JButton btnNewBookRecordClose;
    private javax.swing.JButton btnNewBookRecordProceed;
    private javax.swing.JButton btnNewLearnerRegister;
    private javax.swing.JButton btnNewLearnerRegisterClose;
    private javax.swing.JButton btnNewLearnerRegisterProceed;
    private javax.swing.JButton btnNewUserRegistration;
    private javax.swing.JButton btnPassword;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnPaymentClose;
    private javax.swing.JButton btnPostMessageClose;
    private javax.swing.JButton btnPostMessageClose1;
    private javax.swing.JButton btnPrintLearners;
    private javax.swing.JButton btnSearchLearner;
    private javax.swing.JButton btnSendMessage;
    private javax.swing.JMenuItem itemAbout;
    private javax.swing.JMenuItem itemChangePassword;
    private javax.swing.JMenuItem itemContactUs;
    private javax.swing.JMenuItem itemEditProfile;
    private javax.swing.JMenuItem itemExit;
    private javax.swing.JMenuItem itemHelpContent;
    private javax.swing.JMenuItem itemLogin;
    private javax.swing.JMenuItem itemLogout;
    private javax.swing.JMenuItem itemNewBook;
    private javax.swing.JMenuItem itemNewLearner;
    private javax.swing.JMenuItem itemPayments;
    private javax.swing.JMenuItem itemPostMessage;
    private javax.swing.JMenuItem itemProofOfRegistration;
    private javax.swing.JMenuItem itemRegister;
    private javax.swing.JMenuItem itemViewBooks;
    private javax.swing.JMenuItem itemViewLearner;
    private javax.swing.JMenuItem itemViewMessages;
    private javax.swing.JMenuItem itemViewSubjects;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDisplay;
    private javax.swing.JLabel lblSlogan;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStatus1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JPopupMenu.Separator lineSeparator;
    private javax.swing.JMenuBar mainMenu;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel mainPanel1;
    private javax.swing.JPanel mainPanel2;
    private javax.swing.JPanel mainPanel3;
    private javax.swing.JPanel mainPanel4;
    private javax.swing.JPanel mainPanel5;
    private javax.swing.JPanel mainPanel6;
    private javax.swing.JPanel mainPanel7;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuHome;
    private javax.swing.JMenu menuLearnerInformation;
    private javax.swing.JMenu menuMessages;
    private javax.swing.JMenu menuProfile;
    private javax.swing.JMenu menuSystem;
    private javax.swing.JPanel panelFields;
    private javax.swing.JTextArea tAreaMessages;
    private javax.swing.JTable tbViewLearners;
    private javax.swing.JTable tblNewBooks;
    private javax.swing.JTable tblNewLearners;
    private javax.swing.JTable tblViewBooks;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBookTitle;
    private javax.swing.JPasswordField txtCPPassword;
    private javax.swing.JPasswordField txtCPRetypePassword;
    private javax.swing.JTextField txtCPUsername;
    private javax.swing.JPasswordField txtChNewPassword;
    private javax.swing.JPasswordField txtChOLDPassword;
    private javax.swing.JPasswordField txtChRetypePassword;
    private javax.swing.JTextField txtContactno;
    private javax.swing.JTextField txtEPContactNo;
    private javax.swing.JTextField txtEPEmailAddress;
    private javax.swing.JTextField txtEPFirstname;
    private javax.swing.JTextField txtEPIDNo;
    private javax.swing.JTextField txtEPLastname;
    private javax.swing.JTextField txtEmailaddress;
    private javax.swing.JTextField txtEmployeeNo;
    private javax.swing.JTextField txtFPEmployeeNo;
    private javax.swing.JTextField txtFPIDPassportNo;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtIDPassportNo;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtLearnerFirstName;
    private javax.swing.JTextField txtLearnerGrade;
    private javax.swing.JTextField txtLearnerIDNumber;
    private javax.swing.JTextField txtLearnerLastName;
    private javax.swing.JTextField txtLearnerNumber;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtParentContactNumber;
    private javax.swing.JTextField txtParentFirstName;
    private javax.swing.JTextField txtParentIDNumber;
    private javax.swing.JTextField txtParentLastName;
    private javax.swing.JTextField txtParentLocation;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPayment;
    private javax.swing.JTextField txtPaymentStudentNo;
    private javax.swing.JTextField txtPublisher;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

    //The useful methods
    public void clearLogin() {
        txtUsername.setText("");
        txtPassword.setText("");
        txtUsername.requestFocus();
    }

    public void clearRegister() {
        txtEmployeeNo.setText("");
        txtIDPassportNo.setText("");
        txtEmployeeNo.requestFocus();
    }

    public void clearNewAccount() {
        txtFirstname.setText("");
        txtLastname.setText("");
        txtContactno.setText("");
        txtFirstname.requestFocus();
    }

    public void clearConfirmPassword() {
        txtCPPassword.setText("");
        txtCPRetypePassword.setText("");
        txtCPPassword.requestFocus();
    }

    public void clearChangePassword() {
        txtChOLDPassword.setText("");
        txtChNewPassword.setText("");
        txtChRetypePassword.setText("");
        txtChOLDPassword.requestFocus();
    }

    public void clearForgottenPassword() {
        txtFPEmployeeNo.setText("");
        txtFPIDPassportNo.setText("");
        txtFPEmployeeNo.requestFocus();
    }

    public void clearEditProfile() {
        txtEPLastname.setText("");
        txtEPEmailAddress.setText("");
        txtEPContactNo.setText("");
        txtEPContactNo.requestFocus();
    }

    public void flashMyField(final JTextField field, final Color flashColor,
            int timerDelay, int totalTime) {
        final int totalCount = totalTime / timerDelay;
        Timer timer = new Timer(timerDelay, new ActionListener() {
            int count = 0;

            @Override
            public void actionPerformed(ActionEvent evt) {
                if (count % 2 == 0) {
                    field.setBackground(flashColor);
                } else {
                    field.setBackground(Color.WHITE);
                    if (count >= totalCount) {
                        ((Timer) evt.getSource()).stop();
                    }
                }
                count++;
            }
        });
        timer.start();
    }

    @Override
    public void run() {
        while (time.isAlive()) {
            try {
                Thread.sleep(999);
                lblTime.setText(generator.currentTime());
                lblDate.setText(generator.currentDate());
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage() + "\n\nContact the administrator at helpdesk@lawleypschool.ac.za.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
