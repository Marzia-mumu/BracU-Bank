
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainFrame extends javax.swing.JFrame 
{
    FileReader fr;
    BufferedReader br;
    String id;
    String pass;
    String last = "0.0";
        
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        
        TittlePanel.setBackground(new Color (0, 0, 102, 150));
        LogIn2Panel.setBackground(new Color (0, 0, 102, 150));
        TittlePanel1.setBackground(new Color (0, 0, 102, 150));
        AccountPanel.setBackground(new Color (0, 0, 102, 150));
        BalanceCheckField.setEditable(false);
    }

    public void Default()
    {
        EnterIdTextField.setText("");
        PasswordField.setText("");
        EnterIdTextField1.setText("");
        PinField.setText("");
        ReEnterPinField.setText("");
        WithdrawAmountField.setText("");
        TransferMoneyIdField.setText("");
        TransferMoneyAmountIdField.setText("");
        PayTuitionSIdField.setText("");
        PayTSemesterField.setText("");
        PayTuitionDepField.setText("");
        PayTuitionAmountField3.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        LogInPanel = new javax.swing.JPanel();
        TittlePanel = new javax.swing.JPanel();
        TittleLabel = new javax.swing.JLabel();
        LogIn2Panel = new javax.swing.JPanel();
        StudentIdLabel = new javax.swing.JLabel();
        EnterIdTextField = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        LogInButton = new javax.swing.JButton();
        CAButton = new javax.swing.JButton();
        LogInLabel = new javax.swing.JLabel();
        BackgroundLabel = new javax.swing.JLabel();
        CreateAccountPanel = new javax.swing.JPanel();
        TittlePanel1 = new javax.swing.JPanel();
        TittleLabel1 = new javax.swing.JLabel();
        AccountPanel = new javax.swing.JPanel();
        StudentIdLabel1 = new javax.swing.JLabel();
        EnterIdTextField1 = new javax.swing.JTextField();
        EnterPinLabel = new javax.swing.JLabel();
        PinField = new javax.swing.JPasswordField();
        BackButton = new javax.swing.JButton();
        CAccountButton = new javax.swing.JButton();
        LogInLabel1 = new javax.swing.JLabel();
        ReEnterPinLabel = new javax.swing.JLabel();
        ReEnterPinField = new javax.swing.JPasswordField();
        BackgroundLabel1 = new javax.swing.JLabel();
        MenuPanel = new javax.swing.JPanel();
        ButtonPanel1 = new javax.swing.JPanel();
        CheckBalanceButton = new javax.swing.JButton();
        WithdrawMoneyButton = new javax.swing.JButton();
        LogoLabel = new javax.swing.JLabel();
        ButtonPanel2 = new javax.swing.JPanel();
        PayTutionButton = new javax.swing.JButton();
        TransferMoneyButton = new javax.swing.JButton();
        LogOutButton = new javax.swing.JButton();
        MenuHeadPanel = new javax.swing.JPanel();
        MenuHeadLabel = new javax.swing.JLabel();
        MenuLogoPanel = new javax.swing.JPanel();
        MenuLogoLabel = new javax.swing.JLabel();
        WithdrawMoneyPanel = new javax.swing.JPanel();
        WithPanel = new javax.swing.JPanel();
        WithdrawMoneyLabel = new javax.swing.JLabel();
        WithdrawAmountField = new javax.swing.JTextField();
        AmountLabel = new javax.swing.JLabel();
        WithdrawMoneyConformButton = new javax.swing.JButton();
        BalCheckPanel = new javax.swing.JPanel();
        BalanceCheckPanel = new javax.swing.JPanel();
        BalanceCheckLabel = new javax.swing.JLabel();
        BalanceCheckField = new javax.swing.JTextField();
        BalanceCheckAmountLabel = new javax.swing.JLabel();
        PayTutionPanel = new javax.swing.JPanel();
        WithPanel2 = new javax.swing.JPanel();
        PayTuitionLabel = new javax.swing.JLabel();
        PayTuitionSIdField = new javax.swing.JTextField();
        PayStudentIdLebel = new javax.swing.JLabel();
        PTSemesterLabel = new javax.swing.JLabel();
        PayTuitionDepertmentLabel = new javax.swing.JLabel();
        PayTuitionAmountLabel = new javax.swing.JLabel();
        PayTSemesterField = new javax.swing.JTextField();
        PayTuitionDepField = new javax.swing.JTextField();
        PayTuitionAmountField3 = new javax.swing.JTextField();
        PayTuitionConformButton = new javax.swing.JButton();
        TransferMoneyPanel = new javax.swing.JPanel();
        WithPanel3 = new javax.swing.JPanel();
        WithdrawMoneyLabel3 = new javax.swing.JLabel();
        TransferMoneyAmountIdField = new javax.swing.JTextField();
        TransferMoneyIdLabel = new javax.swing.JLabel();
        TransferMoneyAmountIdLabel = new javax.swing.JLabel();
        TransferMoneyIdField = new javax.swing.JTextField();
        TransferMoneyConformButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BracU Bank");

        MainPanel.setBackground(new java.awt.Color(139, 139, 139));
        MainPanel.setForeground(new java.awt.Color(0, 51, 255));
        MainPanel.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        MainPanel.setPreferredSize(new java.awt.Dimension(1300, 650));
        MainPanel.setLayout(new java.awt.CardLayout());

        LogInPanel.setBackground(new java.awt.Color(139, 139, 139));
        LogInPanel.setFocusable(false);
        LogInPanel.setLayout(null);

        TittleLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        TittleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TittleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TittleLabel.setText("BRACU STUDENT BANK");

        javax.swing.GroupLayout TittlePanelLayout = new javax.swing.GroupLayout(TittlePanel);
        TittlePanel.setLayout(TittlePanelLayout);
        TittlePanelLayout.setHorizontalGroup(
            TittlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TittlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TittleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );
        TittlePanelLayout.setVerticalGroup(
            TittlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TittlePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TittleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        LogInPanel.add(TittlePanel);
        TittlePanel.setBounds(350, 50, 600, 100);

        StudentIdLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        StudentIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        StudentIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StudentIdLabel.setText("Student ID");

        EnterIdTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        EnterIdTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EnterIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterIdTextFieldActionPerformed(evt);
            }
        });

        PasswordLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordLabel.setText("Password");

        PasswordField.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        PasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        LogInButton.setBackground(new java.awt.Color(51, 51, 51));
        LogInButton.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        LogInButton.setForeground(new java.awt.Color(255, 255, 255));
        LogInButton.setText("Login");
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });

        CAButton.setBackground(new java.awt.Color(51, 51, 51));
        CAButton.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        CAButton.setForeground(new java.awt.Color(255, 255, 255));
        CAButton.setText("Create Account");
        CAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAButtonActionPerformed(evt);
            }
        });

        LogInLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LogInLabel.setForeground(new java.awt.Color(255, 255, 255));
        LogInLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogInLabel.setText("Log In");

        javax.swing.GroupLayout LogIn2PanelLayout = new javax.swing.GroupLayout(LogIn2Panel);
        LogIn2Panel.setLayout(LogIn2PanelLayout);
        LogIn2PanelLayout.setHorizontalGroup(
            LogIn2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogIn2PanelLayout.createSequentialGroup()
                .addGroup(LogIn2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogIn2PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(LogIn2PanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(StudentIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)))
                .addGroup(LogIn2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EnterIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
            .addGroup(LogIn2PanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(CAButton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogIn2PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LogIn2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogIn2PanelLayout.createSequentialGroup()
                        .addComponent(LogInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogIn2PanelLayout.createSequentialGroup()
                        .addComponent(LogInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))))
        );
        LogIn2PanelLayout.setVerticalGroup(
            LogIn2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogIn2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(LogIn2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StudentIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(LogIn2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(LogInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CAButton)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        LogInPanel.add(LogIn2Panel);
        LogIn2Panel.setBounds(400, 240, 470, 330);

        BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG_2639.jpg"))); // NOI18N
        BackgroundLabel.setText("jLabel1");
        LogInPanel.add(BackgroundLabel);
        BackgroundLabel.setBounds(0, 0, 1300, 650);

        MainPanel.add(LogInPanel, "card2");

        CreateAccountPanel.setBackground(new java.awt.Color(139, 139, 139));
        CreateAccountPanel.setFocusable(false);
        CreateAccountPanel.setLayout(null);

        TittleLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        TittleLabel1.setForeground(new java.awt.Color(255, 255, 255));
        TittleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TittleLabel1.setText("BRACU STUDENT BANK");

        javax.swing.GroupLayout TittlePanel1Layout = new javax.swing.GroupLayout(TittlePanel1);
        TittlePanel1.setLayout(TittlePanel1Layout);
        TittlePanel1Layout.setHorizontalGroup(
            TittlePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TittlePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TittleLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );
        TittlePanel1Layout.setVerticalGroup(
            TittlePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TittlePanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TittleLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        CreateAccountPanel.add(TittlePanel1);
        TittlePanel1.setBounds(350, 50, 600, 100);

        StudentIdLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        StudentIdLabel1.setForeground(new java.awt.Color(255, 255, 255));
        StudentIdLabel1.setText("Student ID");

        EnterIdTextField1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        EnterIdTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EnterIdTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterIdTextField1ActionPerformed(evt);
            }
        });

        EnterPinLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        EnterPinLabel.setForeground(new java.awt.Color(255, 255, 255));
        EnterPinLabel.setText("Enter Pin");

        PinField.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PinField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PinField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PinFieldActionPerformed(evt);
            }
        });

        BackButton.setBackground(new java.awt.Color(51, 51, 51));
        BackButton.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        CAccountButton.setBackground(new java.awt.Color(51, 51, 51));
        CAccountButton.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        CAccountButton.setForeground(new java.awt.Color(255, 255, 255));
        CAccountButton.setText("Create Account");
        CAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAccountButtonActionPerformed(evt);
            }
        });

        LogInLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LogInLabel1.setForeground(new java.awt.Color(255, 255, 255));
        LogInLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogInLabel1.setText("Create Account");

        ReEnterPinLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        ReEnterPinLabel.setForeground(new java.awt.Color(255, 255, 255));
        ReEnterPinLabel.setText("Confirm Pin");

        ReEnterPinField.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        ReEnterPinField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ReEnterPinField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReEnterPinFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AccountPanelLayout = new javax.swing.GroupLayout(AccountPanel);
        AccountPanel.setLayout(AccountPanelLayout);
        AccountPanelLayout.setHorizontalGroup(
            AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountPanelLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AccountPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(CAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AccountPanelLayout.createSequentialGroup()
                        .addGroup(AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(StudentIdLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EnterPinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ReEnterPinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ReEnterPinField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(EnterIdTextField1)
                            .addComponent(PinField))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(AccountPanelLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(LogInLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AccountPanelLayout.setVerticalGroup(
            AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(LogInLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterIdTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StudentIdLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EnterPinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(PinField))
                .addGap(29, 29, 29)
                .addGroup(AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ReEnterPinField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReEnterPinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        CreateAccountPanel.add(AccountPanel);
        AccountPanel.setBounds(410, 190, 470, 370);

        BackgroundLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG_2639.jpg"))); // NOI18N
        BackgroundLabel1.setText("jLabel1");
        CreateAccountPanel.add(BackgroundLabel1);
        BackgroundLabel1.setBounds(0, 0, 1300, 650);

        MainPanel.add(CreateAccountPanel, "card2");

        MenuPanel.setBackground(new java.awt.Color(139, 139, 139));

        ButtonPanel1.setBackground(new java.awt.Color(139, 139, 139));

        CheckBalanceButton.setBackground(new java.awt.Color(0, 0, 102));
        CheckBalanceButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CheckBalanceButton.setForeground(new java.awt.Color(255, 255, 255));
        CheckBalanceButton.setText("Check Balance");
        CheckBalanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBalanceButtonActionPerformed(evt);
            }
        });

        WithdrawMoneyButton.setBackground(new java.awt.Color(0, 0, 102));
        WithdrawMoneyButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        WithdrawMoneyButton.setForeground(new java.awt.Color(255, 255, 255));
        WithdrawMoneyButton.setText("Withdraw Money");
        WithdrawMoneyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawMoneyButtonActionPerformed(evt);
            }
        });

        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank.png"))); // NOI18N

        javax.swing.GroupLayout ButtonPanel1Layout = new javax.swing.GroupLayout(ButtonPanel1);
        ButtonPanel1.setLayout(ButtonPanel1Layout);
        ButtonPanel1Layout.setHorizontalGroup(
            ButtonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(ButtonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LogoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WithdrawMoneyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CheckBalanceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        ButtonPanel1Layout.setVerticalGroup(
            ButtonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(CheckBalanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(WithdrawMoneyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ButtonPanel2.setBackground(new java.awt.Color(139, 139, 139));

        PayTutionButton.setBackground(new java.awt.Color(0, 0, 102));
        PayTutionButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PayTutionButton.setForeground(new java.awt.Color(255, 255, 255));
        PayTutionButton.setText("Pay Tuition Fees");
        PayTutionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayTutionButtonActionPerformed(evt);
            }
        });

        TransferMoneyButton.setBackground(new java.awt.Color(0, 0, 102));
        TransferMoneyButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TransferMoneyButton.setForeground(new java.awt.Color(255, 255, 255));
        TransferMoneyButton.setText("Deposit Money");
        TransferMoneyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferMoneyButtonActionPerformed(evt);
            }
        });

        LogOutButton.setBackground(new java.awt.Color(0, 0, 102));
        LogOutButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LogOutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogOutButton.setText("Log Out");
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonPanel2Layout = new javax.swing.GroupLayout(ButtonPanel2);
        ButtonPanel2.setLayout(ButtonPanel2Layout);
        ButtonPanel2Layout.setHorizontalGroup(
            ButtonPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(ButtonPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LogOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(PayTutionButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(TransferMoneyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        ButtonPanel2Layout.setVerticalGroup(
            ButtonPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(PayTutionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(TransferMoneyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MenuHeadPanel.setBackground(new java.awt.Color(0, 0, 102));
        MenuHeadPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        MenuHeadLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        MenuHeadLabel.setForeground(new java.awt.Color(255, 255, 255));
        MenuHeadLabel.setText("BRACU STUDENT BANK");

        javax.swing.GroupLayout MenuHeadPanelLayout = new javax.swing.GroupLayout(MenuHeadPanel);
        MenuHeadPanel.setLayout(MenuHeadPanelLayout);
        MenuHeadPanelLayout.setHorizontalGroup(
            MenuHeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuHeadPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MenuHeadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        MenuHeadPanelLayout.setVerticalGroup(
            MenuHeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuHeadPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(MenuHeadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        MenuLogoPanel.setBackground(new java.awt.Color(255, 255, 255));
        MenuLogoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MenuLogoPanel.setLayout(new java.awt.CardLayout());

        MenuLogoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/custom2_all-you-need-to-know-about-banking-as-a-service-baas.jpg"))); // NOI18N
        MenuLogoLabel.setMaximumSize(new java.awt.Dimension(600, 400));
        MenuLogoLabel.setMinimumSize(new java.awt.Dimension(600, 400));
        MenuLogoLabel.setPreferredSize(new java.awt.Dimension(600, 400));
        MenuLogoPanel.add(MenuLogoLabel, "card2");

        WithdrawMoneyPanel.setBackground(new java.awt.Color(139, 139, 139));

        WithPanel.setBackground(new java.awt.Color(0, 0, 102));

        WithdrawMoneyLabel.setBackground(new java.awt.Color(51, 51, 255));
        WithdrawMoneyLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        WithdrawMoneyLabel.setForeground(new java.awt.Color(255, 255, 255));
        WithdrawMoneyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WithdrawMoneyLabel.setText("Withdraw Money");

        WithdrawAmountField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        WithdrawAmountField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        WithdrawAmountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawAmountFieldActionPerformed(evt);
            }
        });

        AmountLabel.setBackground(new java.awt.Color(0, 51, 204));
        AmountLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        AmountLabel.setForeground(new java.awt.Color(255, 255, 255));
        AmountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AmountLabel.setText("Withdraw Money");

        javax.swing.GroupLayout WithPanelLayout = new javax.swing.GroupLayout(WithPanel);
        WithPanel.setLayout(WithPanelLayout);
        WithPanelLayout.setHorizontalGroup(
            WithPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WithPanelLayout.createSequentialGroup()
                .addGroup(WithPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WithPanelLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(WithdrawMoneyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(WithPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(AmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(WithdrawAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        WithPanelLayout.setVerticalGroup(
            WithPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WithPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(WithdrawMoneyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(WithPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WithdrawAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        WithdrawMoneyConformButton.setBackground(new java.awt.Color(0, 0, 102));
        WithdrawMoneyConformButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        WithdrawMoneyConformButton.setForeground(new java.awt.Color(255, 255, 255));
        WithdrawMoneyConformButton.setText("Confirm");
        WithdrawMoneyConformButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawMoneyConformButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WithdrawMoneyPanelLayout = new javax.swing.GroupLayout(WithdrawMoneyPanel);
        WithdrawMoneyPanel.setLayout(WithdrawMoneyPanelLayout);
        WithdrawMoneyPanelLayout.setHorizontalGroup(
            WithdrawMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WithdrawMoneyPanelLayout.createSequentialGroup()
                .addGroup(WithdrawMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WithdrawMoneyPanelLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(WithdrawMoneyConformButton, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(WithdrawMoneyPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(WithPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        WithdrawMoneyPanelLayout.setVerticalGroup(
            WithdrawMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WithdrawMoneyPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(WithPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(WithdrawMoneyConformButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        MenuLogoPanel.add(WithdrawMoneyPanel, "card3");

        BalCheckPanel.setBackground(new java.awt.Color(139, 139, 139));

        BalanceCheckPanel.setBackground(new java.awt.Color(0, 0, 102));

        BalanceCheckLabel.setBackground(new java.awt.Color(51, 51, 255));
        BalanceCheckLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        BalanceCheckLabel.setForeground(new java.awt.Color(255, 255, 255));
        BalanceCheckLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BalanceCheckLabel.setText("Balance Check");

        BalanceCheckField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BalanceCheckField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BalanceCheckField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalanceCheckFieldActionPerformed(evt);
            }
        });

        BalanceCheckAmountLabel.setBackground(new java.awt.Color(0, 51, 204));
        BalanceCheckAmountLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        BalanceCheckAmountLabel.setForeground(new java.awt.Color(255, 255, 255));
        BalanceCheckAmountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BalanceCheckAmountLabel.setText("Your Current Balance is- ");

        javax.swing.GroupLayout BalanceCheckPanelLayout = new javax.swing.GroupLayout(BalanceCheckPanel);
        BalanceCheckPanel.setLayout(BalanceCheckPanelLayout);
        BalanceCheckPanelLayout.setHorizontalGroup(
            BalanceCheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BalanceCheckPanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(BalanceCheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BalanceCheckAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BalanceCheckLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addComponent(BalanceCheckField))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        BalanceCheckPanelLayout.setVerticalGroup(
            BalanceCheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BalanceCheckPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BalanceCheckLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(BalanceCheckAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BalanceCheckField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BalCheckPanelLayout = new javax.swing.GroupLayout(BalCheckPanel);
        BalCheckPanel.setLayout(BalCheckPanelLayout);
        BalCheckPanelLayout.setHorizontalGroup(
            BalCheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BalCheckPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(BalanceCheckPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        BalCheckPanelLayout.setVerticalGroup(
            BalCheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BalCheckPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(BalanceCheckPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );

        MenuLogoPanel.add(BalCheckPanel, "card3");

        PayTutionPanel.setBackground(new java.awt.Color(139, 139, 139));

        WithPanel2.setBackground(new java.awt.Color(0, 0, 102));

        PayTuitionLabel.setBackground(new java.awt.Color(51, 51, 255));
        PayTuitionLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        PayTuitionLabel.setForeground(new java.awt.Color(255, 255, 255));
        PayTuitionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PayTuitionLabel.setText("Pay Tuition Fee");

        PayTuitionSIdField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        PayTuitionSIdField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PayTuitionSIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayTuitionSIdFieldActionPerformed(evt);
            }
        });

        PayStudentIdLebel.setBackground(new java.awt.Color(0, 51, 204));
        PayStudentIdLebel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        PayStudentIdLebel.setForeground(new java.awt.Color(255, 255, 255));
        PayStudentIdLebel.setText("Student Id");

        PTSemesterLabel.setBackground(new java.awt.Color(0, 51, 204));
        PTSemesterLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        PTSemesterLabel.setForeground(new java.awt.Color(255, 255, 255));
        PTSemesterLabel.setText("Semester");

        PayTuitionDepertmentLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        PayTuitionDepertmentLabel.setForeground(new java.awt.Color(255, 255, 255));
        PayTuitionDepertmentLabel.setText("Department");

        PayTuitionAmountLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        PayTuitionAmountLabel.setForeground(new java.awt.Color(255, 255, 255));
        PayTuitionAmountLabel.setText("Amount");

        PayTSemesterField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        PayTSemesterField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        PayTuitionDepField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        PayTuitionDepField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        PayTuitionAmountField3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        PayTuitionAmountField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout WithPanel2Layout = new javax.swing.GroupLayout(WithPanel2);
        WithPanel2.setLayout(WithPanel2Layout);
        WithPanel2Layout.setHorizontalGroup(
            WithPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WithPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(WithPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PayTuitionAmountLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PayTuitionDepertmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PTSemesterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PayStudentIdLebel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(WithPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PayTuitionSIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(PayTSemesterField)
                    .addComponent(PayTuitionDepField)
                    .addComponent(PayTuitionAmountField3))
                .addGap(93, 93, 93))
            .addGroup(WithPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(PayTuitionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        WithPanel2Layout.setVerticalGroup(
            WithPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WithPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PayTuitionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(WithPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PayTuitionSIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PayStudentIdLebel))
                .addGap(18, 18, 18)
                .addGroup(WithPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(WithPanel2Layout.createSequentialGroup()
                        .addComponent(PTSemesterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(PayTuitionDepertmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(WithPanel2Layout.createSequentialGroup()
                        .addComponent(PayTSemesterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PayTuitionDepField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(WithPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PayTuitionAmountField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PayTuitionAmountLabel))
                .addGap(65, 65, 65))
        );

        PayTuitionConformButton.setBackground(new java.awt.Color(0, 0, 102));
        PayTuitionConformButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        PayTuitionConformButton.setForeground(new java.awt.Color(255, 255, 255));
        PayTuitionConformButton.setText("Confirm");
        PayTuitionConformButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayTuitionConformButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PayTutionPanelLayout = new javax.swing.GroupLayout(PayTutionPanel);
        PayTutionPanel.setLayout(PayTutionPanelLayout);
        PayTutionPanelLayout.setHorizontalGroup(
            PayTutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PayTutionPanelLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(WithPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(PayTutionPanelLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(PayTuitionConformButton, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PayTutionPanelLayout.setVerticalGroup(
            PayTutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayTutionPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(WithPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(PayTuitionConformButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        MenuLogoPanel.add(PayTutionPanel, "card3");

        TransferMoneyPanel.setBackground(new java.awt.Color(139, 139, 139));

        WithPanel3.setBackground(new java.awt.Color(0, 0, 102));

        WithdrawMoneyLabel3.setBackground(new java.awt.Color(51, 51, 255));
        WithdrawMoneyLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        WithdrawMoneyLabel3.setForeground(new java.awt.Color(255, 255, 255));
        WithdrawMoneyLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WithdrawMoneyLabel3.setText("Transfer/Deposit Money");

        TransferMoneyAmountIdField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TransferMoneyAmountIdField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TransferMoneyAmountIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferMoneyAmountIdFieldActionPerformed(evt);
            }
        });

        TransferMoneyIdLabel.setBackground(new java.awt.Color(0, 51, 204));
        TransferMoneyIdLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        TransferMoneyIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        TransferMoneyIdLabel.setText("Account ID");

        TransferMoneyAmountIdLabel.setBackground(new java.awt.Color(0, 51, 204));
        TransferMoneyAmountIdLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        TransferMoneyAmountIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        TransferMoneyAmountIdLabel.setText("Amount");

        TransferMoneyIdField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TransferMoneyIdField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TransferMoneyIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferMoneyIdFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WithPanel3Layout = new javax.swing.GroupLayout(WithPanel3);
        WithPanel3.setLayout(WithPanel3Layout);
        WithPanel3Layout.setHorizontalGroup(
            WithPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WithPanel3Layout.createSequentialGroup()
                .addGroup(WithPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WithPanel3Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(WithdrawMoneyLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(WithPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(WithPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TransferMoneyIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TransferMoneyAmountIdLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(WithPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TransferMoneyIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(TransferMoneyAmountIdField))))
                .addGap(90, 90, 90))
        );
        WithPanel3Layout.setVerticalGroup(
            WithPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WithPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WithdrawMoneyLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(WithPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TransferMoneyIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TransferMoneyIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(WithPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TransferMoneyAmountIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TransferMoneyAmountIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        TransferMoneyConformButton.setBackground(new java.awt.Color(0, 0, 102));
        TransferMoneyConformButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        TransferMoneyConformButton.setForeground(new java.awt.Color(255, 255, 255));
        TransferMoneyConformButton.setText("Confirm");
        TransferMoneyConformButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferMoneyConformButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TransferMoneyPanelLayout = new javax.swing.GroupLayout(TransferMoneyPanel);
        TransferMoneyPanel.setLayout(TransferMoneyPanelLayout);
        TransferMoneyPanelLayout.setHorizontalGroup(
            TransferMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransferMoneyPanelLayout.createSequentialGroup()
                .addGroup(TransferMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransferMoneyPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(WithPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TransferMoneyPanelLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(TransferMoneyConformButton, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        TransferMoneyPanelLayout.setVerticalGroup(
            TransferMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransferMoneyPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(WithPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(TransferMoneyConformButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        MenuLogoPanel.add(TransferMoneyPanel, "card3");

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addComponent(ButtonPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MenuHeadPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MenuLogoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ButtonPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addComponent(MenuHeadPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MenuLogoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MainPanel.add(MenuPanel, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterIdTextFieldActionPerformed

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        if (EnterIdTextField.getText().isEmpty() || PasswordField.getText().isEmpty()) 
        {
            WARNING.main(null);
        } 
        
        else
        {
            id = EnterIdTextField.getText();
            String pwd = new String(PasswordField.getPassword());
            
            try 
            {
                fr = new FileReader("./" + id + ".txt");
                br = new BufferedReader(fr);
                
                pass = br.readLine();
                File f = new File("./" + id + ".txt");
                
                if((f.exists() && !f.isDirectory()) && (pass.equals(pwd))) 
                { 
                    MainPanel.removeAll();
                    MainPanel.add(MenuPanel);
                    MainPanel.repaint();
                    MainPanel.revalidate(); 
                    
                    String line;
        
                    try 
                    {
                        while ((line = br.readLine()) != null) 
                        { 
                            last = line;
                        }
                    } 
                    catch (IOException ex) 
                    {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                else
                {
                    WARNING1.main(null);
                }
            }   
            catch (IOException ex) 
            {
                WARNING1.main(null);
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }    
        }
        
        Default();
    }//GEN-LAST:event_LogInButtonActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void CAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAButtonActionPerformed
        Default();
        
        MainPanel.removeAll();
        MainPanel.add(CreateAccountPanel);
        MainPanel.repaint();
        MainPanel.revalidate();
    }//GEN-LAST:event_CAButtonActionPerformed

    private void CheckBalanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBalanceButtonActionPerformed
        Default();
        
        String line;
        
        try 
        {
            while ((line = br.readLine()) != null) 
            { 
                last = line;
            }
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        BalanceCheckField.setText(last + " TK");

        MenuLogoPanel.removeAll();
        MenuLogoPanel.add(BalCheckPanel);
        MenuLogoPanel.repaint();
        MenuLogoPanel.revalidate();
    }//GEN-LAST:event_CheckBalanceButtonActionPerformed

    private void WithdrawMoneyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawMoneyButtonActionPerformed
        Default();
        
        MenuLogoPanel.removeAll();
        MenuLogoPanel.add(WithdrawMoneyPanel);
        MenuLogoPanel.repaint();
        MenuLogoPanel.revalidate();
    }//GEN-LAST:event_WithdrawMoneyButtonActionPerformed

    private void PayTutionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayTutionButtonActionPerformed
        Default();
        
        MenuLogoPanel.removeAll();
        MenuLogoPanel.add(PayTutionPanel);
        MenuLogoPanel.repaint();
        MenuLogoPanel.revalidate();
    }//GEN-LAST:event_PayTutionButtonActionPerformed

    private void TransferMoneyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferMoneyButtonActionPerformed
        Default();
        
        MenuLogoPanel.removeAll();
        MenuLogoPanel.add(TransferMoneyPanel);
        MenuLogoPanel.repaint();
        MenuLogoPanel.revalidate();
    }//GEN-LAST:event_TransferMoneyButtonActionPerformed

    private void WithdrawAmountFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawAmountFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WithdrawAmountFieldActionPerformed

    private void WithdrawMoneyConformButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawMoneyConformButtonActionPerformed
        if (WithdrawAmountField.getText().isEmpty()) 
        {
            WARNING.main(null);
        }
        
        else
        {
            String line;
            String wd = WithdrawAmountField.getText();
            
            int val = Integer.valueOf(wd);
            Double total = Double.valueOf(last);
            
            if (total > val)
            {
             
                total = total - val;
                
                FileWriter fileWriter;
                
                try 
                {
                    File f = new File ("./" + id + ".txt");
                    fileWriter = new FileWriter(f, true);

                    try (BufferedWriter bufferedwriter = new BufferedWriter(fileWriter)) 
                    {
                        bufferedwriter.write(Double.toString(total));
                        bufferedwriter.newLine();
                    }
                } 
                catch (Exception e) 
                {
                    e.printStackTrace();
                }
                
                WARNING4.main(null);
                
            }
            
            else
            {
                WARNING3.main(null);
            }
        }
        
        Default();
    }//GEN-LAST:event_WithdrawMoneyConformButtonActionPerformed

    private void EnterIdTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterIdTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterIdTextField1ActionPerformed

    private void PinFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PinFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PinFieldActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        Default();
        
        MainPanel.removeAll();
        MainPanel.add(LogInPanel);
        MainPanel.repaint();
        MainPanel.revalidate();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void CAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAccountButtonActionPerformed
        if (EnterIdTextField1.getText().isEmpty() || PinField.getText().isEmpty() || ReEnterPinField.getText().isEmpty()) 
        {
            WARNING.main(null);
        } 
        
        else
        {
            String Nid = EnterIdTextField1.getText();
            String pwd1 = new String(PinField.getPassword());
            String pwd2 = new String(ReEnterPinField.getPassword());
            
            try 
            {
                PrintWriter writer = new PrintWriter("./" + Nid + ".txt");
                
                if ((pwd1.equals(pwd2)))
                {
                    writer.println(pwd2);
                    writer.println("0.0");
                    writer.close();

                    MainPanel.removeAll();
                    MainPanel.add(LogInPanel);
                    MainPanel.repaint();
                    MainPanel.revalidate(); 
                }
                
                else
                {
                     WARNING1.main(null);
                }
            } 
            catch (FileNotFoundException ex) 
            {
                WARNING1.main(null);
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        
        Default();
    }//GEN-LAST:event_CAccountButtonActionPerformed

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_LogOutButtonActionPerformed

    private void BalanceCheckFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalanceCheckFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BalanceCheckFieldActionPerformed

    private void PayTuitionSIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayTuitionSIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PayTuitionSIdFieldActionPerformed

    private void PayTuitionConformButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayTuitionConformButtonActionPerformed
        if (PayTuitionSIdField.getText().isEmpty() || PayTSemesterField.getText().isEmpty() || PayTuitionDepField.getText().isEmpty() || PayTuitionAmountField3.getText().isEmpty()) 
        {
            WARNING.main(null);
        }
        
        else
        {
            String line;
            String PTid = PayTuitionSIdField.getText();
            String PTS = PayTSemesterField.getText();
            String PTD = PayTuitionDepField.getText();
            String PTA = PayTuitionAmountField3.getText();
            
            int val = Integer.valueOf(PTA);
            Double total = Double.valueOf(last);
            
            if (PTid.equals(id))
            {    
                if (total > val)
                {
                    total = total - val;
                     
                    FileWriter fileWriter;
                    FileWriter fileWriter1;
                
                    try 
                    {
                        File f = new File ("./" + id + ".txt");
                        fileWriter = new FileWriter(f, true);

                        try (BufferedWriter bufferedwriter = new BufferedWriter(fileWriter)) 
                        {
                            bufferedwriter.write(Double.toString(total));
                            bufferedwriter.newLine();
                        }
                        
                        File f1 = new File ("TutionFees.txt");
                        fileWriter1 = new FileWriter(f1, true);

                        try (BufferedWriter bufferedwriter1 = new BufferedWriter(fileWriter1)) 
                        {
                            bufferedwriter1.write(PTid);
                            bufferedwriter1.newLine();
                            bufferedwriter1.write(PTS);
                            bufferedwriter1.newLine();
                            bufferedwriter1.write(PTD);
                            bufferedwriter1.newLine();
                            bufferedwriter1.write(Double.toString(total));
                            bufferedwriter1.newLine();
                        }
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                    
                     WARNING4.main(null); 
                }
                
                else
                {
                    WARNING6.main(null);
                }              
            }
            
            else
            {
                WARNING7.main(null);
            }
        }
        
        Default();
    }//GEN-LAST:event_PayTuitionConformButtonActionPerformed

    private void TransferMoneyAmountIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferMoneyAmountIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TransferMoneyAmountIdFieldActionPerformed

    private void TransferMoneyConformButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferMoneyConformButtonActionPerformed
        if (TransferMoneyIdField.getText().isEmpty() || TransferMoneyAmountIdField.getText().isEmpty()) 
        {
            WARNING.main(null);
        }
        
        else
        {
            String line;
            String wd = TransferMoneyAmountIdField.getText();
            String Tid = TransferMoneyIdField.getText();
            
            int val = Integer.valueOf(wd);
            Double total = Double.valueOf(last);
            total = total + val;
            
            if (Tid.equals(id))
            {     
                FileWriter fileWriter;
                
                try 
                {
                    File f = new File ("./" + id + ".txt");
                    fileWriter = new FileWriter(f, true);

                    try (BufferedWriter bufferedwriter = new BufferedWriter(fileWriter)) 
                    {
                        bufferedwriter.write(Double.toString(total));
                        bufferedwriter.newLine();
                    }
                } 
                catch (Exception e) 
                {
                    e.printStackTrace();
                }
                
                WARNING4.main(null);
                
            }
            
            else
            {
                WARNING5.main(null);
            }
        }
        
        Default();
    }//GEN-LAST:event_TransferMoneyConformButtonActionPerformed

    private void TransferMoneyIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferMoneyIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TransferMoneyIdFieldActionPerformed

    private void ReEnterPinFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReEnterPinFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReEnterPinFieldActionPerformed

    /**
     * @param args the command line arguments
     */
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
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AccountPanel;
    private javax.swing.JLabel AmountLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JLabel BackgroundLabel1;
    private javax.swing.JPanel BalCheckPanel;
    private javax.swing.JLabel BalanceCheckAmountLabel;
    private javax.swing.JTextField BalanceCheckField;
    private javax.swing.JLabel BalanceCheckLabel;
    private javax.swing.JPanel BalanceCheckPanel;
    private javax.swing.JPanel ButtonPanel1;
    private javax.swing.JPanel ButtonPanel2;
    private javax.swing.JButton CAButton;
    private javax.swing.JButton CAccountButton;
    private javax.swing.JButton CheckBalanceButton;
    private javax.swing.JPanel CreateAccountPanel;
    private javax.swing.JTextField EnterIdTextField;
    private javax.swing.JTextField EnterIdTextField1;
    private javax.swing.JLabel EnterPinLabel;
    private javax.swing.JPanel LogIn2Panel;
    private javax.swing.JButton LogInButton;
    private javax.swing.JLabel LogInLabel;
    private javax.swing.JLabel LogInLabel1;
    private javax.swing.JPanel LogInPanel;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel MenuHeadLabel;
    private javax.swing.JPanel MenuHeadPanel;
    private javax.swing.JLabel MenuLogoLabel;
    private javax.swing.JPanel MenuLogoPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JLabel PTSemesterLabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel PayStudentIdLebel;
    private javax.swing.JTextField PayTSemesterField;
    private javax.swing.JTextField PayTuitionAmountField3;
    private javax.swing.JLabel PayTuitionAmountLabel;
    private javax.swing.JButton PayTuitionConformButton;
    private javax.swing.JTextField PayTuitionDepField;
    private javax.swing.JLabel PayTuitionDepertmentLabel;
    private javax.swing.JLabel PayTuitionLabel;
    private javax.swing.JTextField PayTuitionSIdField;
    private javax.swing.JButton PayTutionButton;
    private javax.swing.JPanel PayTutionPanel;
    private javax.swing.JPasswordField PinField;
    private javax.swing.JPasswordField ReEnterPinField;
    private javax.swing.JLabel ReEnterPinLabel;
    private javax.swing.JLabel StudentIdLabel;
    private javax.swing.JLabel StudentIdLabel1;
    private javax.swing.JLabel TittleLabel;
    private javax.swing.JLabel TittleLabel1;
    private javax.swing.JPanel TittlePanel;
    private javax.swing.JPanel TittlePanel1;
    private javax.swing.JTextField TransferMoneyAmountIdField;
    private javax.swing.JLabel TransferMoneyAmountIdLabel;
    private javax.swing.JButton TransferMoneyButton;
    private javax.swing.JButton TransferMoneyConformButton;
    private javax.swing.JTextField TransferMoneyIdField;
    private javax.swing.JLabel TransferMoneyIdLabel;
    private javax.swing.JPanel TransferMoneyPanel;
    private javax.swing.JPanel WithPanel;
    private javax.swing.JPanel WithPanel2;
    private javax.swing.JPanel WithPanel3;
    private javax.swing.JTextField WithdrawAmountField;
    private javax.swing.JButton WithdrawMoneyButton;
    private javax.swing.JButton WithdrawMoneyConformButton;
    private javax.swing.JLabel WithdrawMoneyLabel;
    private javax.swing.JLabel WithdrawMoneyLabel3;
    private javax.swing.JPanel WithdrawMoneyPanel;
    // End of variables declaration//GEN-END:variables
}
