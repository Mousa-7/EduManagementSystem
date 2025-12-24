package gui;

import gui.usersMenuActions.AddAdminDialog;
import dao.*;
import gui.InstructorsMenuActions.GetAllinsDialog;
import gui.coursesMenuActions.DeleteCourseDialog;
import gui.coursesMenuActions.GetCoursesDialog;
import gui.studentsMenuActions.GetAllStudentsDialog;
import gui.usersMenuActions.DeleteUserDialog;
import gui.usersMenuActions.GetAllUsersDialog;
import gui.usersMenuActions.GetUserByUsernameDialog;
import gui.usersMenuActions.GetUserbyIdDialog;
import gui.usersMenuActions.GetUsersCount;
import gui.usersMenuActions.UpdateUserDialog;
import java.awt.Color;
import javax.swing.JFrame;
//import java.util.ArrayList;
//import javax.swing.table.DefaultTableModel;
//import model.Student;


public class AdminDashboard extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AdminDashboard.class.getName());
    
    public AdminDashboard() {
        initComponents();
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        loadDashboardData();
        
        
        
    }
    
    public AdminDashboard(String username) {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        welcomeLapel.setText("Welcome, Admin " + username);
        loadDashboardData();
    }

    
    private void loadDashboardData() {

    StudentDao s = new StudentDao();
    countStudents.setText(String.valueOf(s.countStudents()));

    InstructorDao ins = new InstructorDao();
    countInstructors.setText(String.valueOf(ins.countInstructors()));

    CourseDao course = new CourseDao();
    countCourses.setText(String.valueOf(course.countCourses()));
}

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t = new javax.swing.JTable();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        parentCoursesPanel = new javax.swing.JPanel();
        parentInstructorsPanel = new javax.swing.JPanel();
        parentStuddentsPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        kGradientPanel10 = new com.k33ptoo.components.KGradientPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        kGradientPanel12 = new com.k33ptoo.components.KGradientPanel();
        usersMenu = new javax.swing.JPopupMenu();
        addAdmin = new javax.swing.JMenuItem();
        updateUser = new javax.swing.JMenuItem();
        deleteUser = new javax.swing.JMenuItem();
        getUserById = new javax.swing.JMenuItem();
        getUserByUsername = new javax.swing.JMenuItem();
        getAllUsers = new javax.swing.JMenuItem();
        UsersNum = new javax.swing.JMenuItem();
        studentsMenu = new javax.swing.JPopupMenu();
        searchStudent = new javax.swing.JMenuItem();
        getAllStudents = new javax.swing.JMenuItem();
        instructorsMenu = new javax.swing.JPopupMenu();
        addIns = new javax.swing.JMenuItem();
        getAll_ins = new javax.swing.JMenuItem();
        coursesMenu = new javax.swing.JPopupMenu();
        deleteCourse = new javax.swing.JMenuItem();
        getCourses = new javax.swing.JMenuItem();
        bigPanel = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        jLabel6 = new javax.swing.JLabel();
        ManageUsersLapel = new javax.swing.JLabel();
        manageInstructorsLapel = new javax.swing.JLabel();
        manageStudentsLapel = new javax.swing.JLabel();
        homeLapel = new javax.swing.JLabel();
        LogOutLapel = new javax.swing.JLabel();
        manageCoursesLapel = new javax.swing.JLabel();
        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel13 = new com.k33ptoo.components.KGradientPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        kGradientPanel5 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel8 = new com.k33ptoo.components.KGradientPanel();
        jLabel14 = new javax.swing.JLabel();
        countStudents = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        kGradientPanel6 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel9 = new com.k33ptoo.components.KGradientPanel();
        jLabel15 = new javax.swing.JLabel();
        countInstructors = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        kGradientPanel7 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel11 = new com.k33ptoo.components.KGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        countCourses = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        welcomeLapel = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(2, 59, 89));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/r.png"))); // NOI18N

        kGradientPanel1.setkEndColor(new java.awt.Color(69, 210, 254));
        kGradientPanel1.setkStartColor(new java.awt.Color(98, 110, 254));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );

        jList1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Manage Users", "Manage Students", "Manage Instructors", "Manage Courses" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        t.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Firsrt name", "Last name", "email", "phone"
            }
        ));
        jScrollPane2.setViewportView(t);

        kGradientPanel2.setkEndColor(new java.awt.Color(69, 210, 254));
        kGradientPanel2.setkStartColor(new java.awt.Color(98, 110, 254));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/r.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Poor Richard", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Welcome back !");

        jButton1.setText("get students");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(137, 137, 137)
                .addComponent(jLabel4)
                .addContainerGap(233, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 915, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/r.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        parentCoursesPanel.setBackground(new java.awt.Color(5, 150, 105));

        javax.swing.GroupLayout parentCoursesPanelLayout = new javax.swing.GroupLayout(parentCoursesPanel);
        parentCoursesPanel.setLayout(parentCoursesPanelLayout);
        parentCoursesPanelLayout.setHorizontalGroup(
            parentCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        parentCoursesPanelLayout.setVerticalGroup(
            parentCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout parentInstructorsPanelLayout = new javax.swing.GroupLayout(parentInstructorsPanel);
        parentInstructorsPanel.setLayout(parentInstructorsPanelLayout);
        parentInstructorsPanelLayout.setHorizontalGroup(
            parentInstructorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        parentInstructorsPanelLayout.setVerticalGroup(
            parentInstructorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );

        parentStuddentsPanel.setBackground(new java.awt.Color(37, 99, 235));

        javax.swing.GroupLayout parentStuddentsPanelLayout = new javax.swing.GroupLayout(parentStuddentsPanel);
        parentStuddentsPanel.setLayout(parentStuddentsPanelLayout);
        parentStuddentsPanelLayout.setHorizontalGroup(
            parentStuddentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );
        parentStuddentsPanelLayout.setVerticalGroup(
            parentStuddentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel12.setText("Dashboard");

        javax.swing.GroupLayout kGradientPanel10Layout = new javax.swing.GroupLayout(kGradientPanel10);
        kGradientPanel10.setLayout(kGradientPanel10Layout);
        kGradientPanel10Layout.setHorizontalGroup(
            kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        kGradientPanel10Layout.setVerticalGroup(
            kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        kGradientPanel12.setkEndColor(new java.awt.Color(102, 102, 102));
        kGradientPanel12.setkStartColor(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout kGradientPanel12Layout = new javax.swing.GroupLayout(kGradientPanel12);
        kGradientPanel12.setLayout(kGradientPanel12Layout);
        kGradientPanel12Layout.setHorizontalGroup(
            kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1223, Short.MAX_VALUE)
        );
        kGradientPanel12Layout.setVerticalGroup(
            kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        usersMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usersMenu.setToolTipText("");
        usersMenu.setBorder(null);
        usersMenu.setPreferredSize(new java.awt.Dimension(228, 222));
        usersMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMenuMouseClicked(evt);
            }
        });

        addAdmin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        addAdmin.setText("Add Admin");
        addAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addAdminMouseClicked(evt);
            }
        });
        addAdmin.addActionListener(this::addAdminActionPerformed);
        usersMenu.add(addAdmin);

        updateUser.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        updateUser.setText("Edit User");
        updateUser.addActionListener(this::updateUserActionPerformed);
        usersMenu.add(updateUser);

        deleteUser.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        deleteUser.setText("Delete User");
        deleteUser.addActionListener(this::deleteUserActionPerformed);
        usersMenu.add(deleteUser);

        getUserById.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getUserById.setText("Get User by ID");
        getUserById.addActionListener(this::getUserByIdActionPerformed);
        usersMenu.add(getUserById);

        getUserByUsername.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getUserByUsername.setText("Get User by username");
        getUserByUsername.addActionListener(this::getUserByUsernameActionPerformed);
        usersMenu.add(getUserByUsername);

        getAllUsers.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getAllUsers.setText("Get all Users");
        getAllUsers.addActionListener(this::getAllUsersActionPerformed);
        usersMenu.add(getAllUsers);

        UsersNum.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        UsersNum.setText("Users Count");
        UsersNum.addActionListener(this::UsersNumActionPerformed);
        usersMenu.add(UsersNum);

        studentsMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        studentsMenu.setToolTipText("");
        studentsMenu.setBorder(null);
        studentsMenu.setPreferredSize(new java.awt.Dimension(228, 64));
        studentsMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentsMenuMouseClicked(evt);
            }
        });

        searchStudent.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        searchStudent.setText("Search Student");
        studentsMenu.add(searchStudent);

        getAllStudents.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getAllStudents.setText("Get all Students");
        getAllStudents.addActionListener(this::getAllStudentsActionPerformed);
        studentsMenu.add(getAllStudents);

        instructorsMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        instructorsMenu.setToolTipText("");
        instructorsMenu.setBorder(null);
        instructorsMenu.setPreferredSize(new java.awt.Dimension(228, 64));
        instructorsMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instructorsMenuMouseClicked(evt);
            }
        });

        addIns.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        addIns.setText("Add Instructor");
        instructorsMenu.add(addIns);

        getAll_ins.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getAll_ins.setText("Get all Instructors");
        getAll_ins.addActionListener(this::getAll_insActionPerformed);
        instructorsMenu.add(getAll_ins);

        coursesMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        coursesMenu.setToolTipText("");
        coursesMenu.setBorder(null);
        coursesMenu.setPreferredSize(new java.awt.Dimension(228, 64));
        coursesMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coursesMenuMouseClicked(evt);
            }
        });

        deleteCourse.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        deleteCourse.setText("Delete Course");
        deleteCourse.addActionListener(this::deleteCourseActionPerformed);
        coursesMenu.add(deleteCourse);

        getCourses.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getCourses.setText("Get Courses");
        getCourses.addActionListener(this::getCoursesActionPerformed);
        coursesMenu.add(getCourses);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bigPanel.setBackground(new java.awt.Color(255, 255, 255));

        leftPanel.setBackground(new java.awt.Color(22, 34, 44));

        kGradientPanel3.setkBorderRadius(2);
        kGradientPanel3.setkEndColor(new java.awt.Color(17, 39, 78));
        kGradientPanel3.setkStartColor(new java.awt.Color(126, 126, 126));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/r.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        ManageUsersLapel.setBackground(new java.awt.Color(22, 34, 44));
        ManageUsersLapel.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        ManageUsersLapel.setForeground(new java.awt.Color(255, 255, 255));
        ManageUsersLapel.setText("Manage Users");
        ManageUsersLapel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageUsersLapel.setOpaque(true);
        ManageUsersLapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageUsersLapelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManageUsersLapelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManageUsersLapelMouseExited(evt);
            }
        });

        manageInstructorsLapel.setBackground(new java.awt.Color(22, 34, 44));
        manageInstructorsLapel.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        manageInstructorsLapel.setForeground(new java.awt.Color(255, 255, 255));
        manageInstructorsLapel.setText("Manage Instructors");
        manageInstructorsLapel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageInstructorsLapel.setOpaque(true);
        manageInstructorsLapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageInstructorsLapelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageInstructorsLapelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageInstructorsLapelMouseExited(evt);
            }
        });

        manageStudentsLapel.setBackground(new java.awt.Color(22, 34, 44));
        manageStudentsLapel.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        manageStudentsLapel.setForeground(new java.awt.Color(255, 255, 255));
        manageStudentsLapel.setText("Manage Students");
        manageStudentsLapel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageStudentsLapel.setOpaque(true);
        manageStudentsLapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageStudentsLapelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageStudentsLapelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageStudentsLapelMouseExited(evt);
            }
        });

        homeLapel.setBackground(new java.awt.Color(22, 34, 44));
        homeLapel.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        homeLapel.setForeground(new java.awt.Color(255, 255, 255));
        homeLapel.setText("Home");
        homeLapel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeLapel.setOpaque(true);
        homeLapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLapelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeLapelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeLapelMouseExited(evt);
            }
        });

        LogOutLapel.setBackground(new java.awt.Color(22, 34, 44));
        LogOutLapel.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        LogOutLapel.setForeground(new java.awt.Color(255, 255, 255));
        LogOutLapel.setText("Log out");
        LogOutLapel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogOutLapel.setOpaque(true);
        LogOutLapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutLapelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogOutLapelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogOutLapelMouseExited(evt);
            }
        });

        manageCoursesLapel.setBackground(new java.awt.Color(22, 34, 44));
        manageCoursesLapel.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        manageCoursesLapel.setForeground(new java.awt.Color(255, 255, 255));
        manageCoursesLapel.setText("Manage Courses");
        manageCoursesLapel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageCoursesLapel.setOpaque(true);
        manageCoursesLapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageCoursesLapelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageCoursesLapelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageCoursesLapelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manageInstructorsLapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ManageUsersLapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageStudentsLapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogOutLapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageCoursesLapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeLapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeLapel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManageUsersLapel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageStudentsLapel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageInstructorsLapel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageCoursesLapel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                .addComponent(LogOutLapel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel4.setkEndColor(new java.awt.Color(235, 25, 102));
        kGradientPanel4.setkStartColor(new java.awt.Color(240, 85, 47));

        kGradientPanel13.setkEndColor(new java.awt.Color(210, 85, 131));
        kGradientPanel13.setkStartColor(new java.awt.Color(229, 138, 115));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("+ Notifications");

        javax.swing.GroupLayout kGradientPanel13Layout = new javax.swing.GroupLayout(kGradientPanel13);
        kGradientPanel13.setLayout(kGradientPanel13Layout);
        kGradientPanel13Layout.setHorizontalGroup(
            kGradientPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel13Layout.setVerticalGroup(
            kGradientPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("- Instructor Ahmad assigned to new Java course ");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("- 12 new students have registered this semester ");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("- 3 new courses were added successfully");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("- System is running normally with no errors");

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(359, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addComponent(kGradientPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addGap(59, 59, 59))
        );

        kGradientPanel5.setkEndColor(new java.awt.Color(92, 7, 111));
        kGradientPanel5.setkStartColor(new java.awt.Color(199, 7, 134));

        kGradientPanel8.setkEndColor(new java.awt.Color(130, 72, 143));
        kGradientPanel8.setkStartColor(new java.awt.Color(220, 87, 175));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Students");

        javax.swing.GroupLayout kGradientPanel8Layout = new javax.swing.GroupLayout(kGradientPanel8);
        kGradientPanel8.setLayout(kGradientPanel8Layout);
        kGradientPanel8Layout.setHorizontalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel8Layout.setVerticalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        countStudents.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        countStudents.setForeground(new java.awt.Color(255, 255, 255));
        countStudents.setText("112");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Total Registerd Students");

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(countStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addComponent(kGradientPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(countStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        kGradientPanel6.setkEndColor(new java.awt.Color(51, 93, 180));
        kGradientPanel6.setkStartColor(new java.awt.Color(48, 193, 182));

        kGradientPanel9.setkEndColor(new java.awt.Color(117, 148, 214));
        kGradientPanel9.setkStartColor(new java.awt.Color(141, 215, 210));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Instructors");

        javax.swing.GroupLayout kGradientPanel9Layout = new javax.swing.GroupLayout(kGradientPanel9);
        kGradientPanel9.setLayout(kGradientPanel9Layout);
        kGradientPanel9Layout.setHorizontalGroup(
            kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel9Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel9Layout.setVerticalGroup(
            kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        countInstructors.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        countInstructors.setForeground(new java.awt.Color(255, 255, 255));
        countInstructors.setText("7");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Active Instructors");

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countInstructors, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addComponent(kGradientPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(countInstructors, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        kGradientPanel7.setkEndColor(new java.awt.Color(147, 218, 151));
        kGradientPanel7.setkStartColor(new java.awt.Color(62, 95, 68));

        kGradientPanel11.setkEndColor(new java.awt.Color(141, 215, 145));
        kGradientPanel11.setkStartColor(new java.awt.Color(194, 217, 176));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Courses");

        javax.swing.GroupLayout kGradientPanel11Layout = new javax.swing.GroupLayout(kGradientPanel11);
        kGradientPanel11.setLayout(kGradientPanel11Layout);
        kGradientPanel11Layout.setHorizontalGroup(
            kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel11Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel11Layout.setVerticalGroup(
            kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        countCourses.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        countCourses.setForeground(new java.awt.Color(255, 255, 255));
        countCourses.setText("11");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Available Courses");

        javax.swing.GroupLayout kGradientPanel7Layout = new javax.swing.GroupLayout(kGradientPanel7);
        kGradientPanel7.setLayout(kGradientPanel7Layout);
        kGradientPanel7Layout.setHorizontalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        kGradientPanel7Layout.setVerticalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                .addComponent(kGradientPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(countCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        welcomeLapel.setFont(new java.awt.Font("Segoe UI", 1, 52)); // NOI18N
        welcomeLapel.setText("Dashboard");

        javax.swing.GroupLayout bigPanelLayout = new javax.swing.GroupLayout(bigPanel);
        bigPanel.setLayout(bigPanelLayout);
        bigPanelLayout.setHorizontalGroup(
            bigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bigPanelLayout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bigPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(bigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcomeLapel)
                            .addGroup(bigPanelLayout.createSequentialGroup()
                                .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(kGradientPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bigPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        bigPanelLayout.setVerticalGroup(
            bigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bigPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(welcomeLapel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(bigPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    // HOME
    private void homeLapelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLapelMouseEntered
        homeLapel.setBackground(new Color(125,125,125));        
    }//GEN-LAST:event_homeLapelMouseEntered

    private void homeLapelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLapelMouseExited
        homeLapel.setBackground(new Color(22, 34, 44));
    }//GEN-LAST:event_homeLapelMouseExited

    
    // MANAGE USERS
    private void ManageUsersLapelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageUsersLapelMouseEntered
        ManageUsersLapel.setBackground(new Color(125, 125, 125));
    }//GEN-LAST:event_ManageUsersLapelMouseEntered

    private void ManageUsersLapelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageUsersLapelMouseExited
        ManageUsersLapel.setBackground(new Color(22, 34, 44));
    }//GEN-LAST:event_ManageUsersLapelMouseExited

    // MANAGE STUDENTS
    private void manageStudentsLapelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageStudentsLapelMouseEntered
        manageStudentsLapel.setBackground(new Color(125, 125, 125));
    }//GEN-LAST:event_manageStudentsLapelMouseEntered

    private void manageStudentsLapelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageStudentsLapelMouseExited
        manageStudentsLapel.setBackground(new Color(22, 34, 44));
    }//GEN-LAST:event_manageStudentsLapelMouseExited

    // MANAGE INSTRUCTORS
    private void manageInstructorsLapelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageInstructorsLapelMouseEntered
        manageInstructorsLapel.setBackground(new Color(125, 125, 125));
    }//GEN-LAST:event_manageInstructorsLapelMouseEntered

    private void manageInstructorsLapelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageInstructorsLapelMouseExited
        manageInstructorsLapel.setBackground(new Color(22, 34, 44));
    }//GEN-LAST:event_manageInstructorsLapelMouseExited

    // LOG OUT
    private void LogOutLapelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutLapelMouseEntered
        LogOutLapel.setBackground(new Color(125, 125, 125));
    }//GEN-LAST:event_LogOutLapelMouseEntered

    private void LogOutLapelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutLapelMouseExited
        LogOutLapel.setBackground(new Color(22, 34, 44));
    }//GEN-LAST:event_LogOutLapelMouseExited

    // MANAGE COURSES
    private void manageCoursesLapelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageCoursesLapelMouseEntered
        manageCoursesLapel.setBackground(new Color(125, 125, 125));
    }//GEN-LAST:event_manageCoursesLapelMouseEntered

    private void manageCoursesLapelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageCoursesLapelMouseExited
        manageCoursesLapel.setBackground(new Color(22, 34, 44));
    }//GEN-LAST:event_manageCoursesLapelMouseExited

    
    private void usersMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMenuMouseClicked

    }//GEN-LAST:event_usersMenuMouseClicked

    
    
    private void ManageUsersLapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageUsersLapelMouseClicked
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
           usersMenu.show(
                ManageUsersLapel,
                0,
                ManageUsersLapel.getHeight()
            );
        }
    }//GEN-LAST:event_ManageUsersLapelMouseClicked

    private void LogOutLapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutLapelMouseClicked
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            this.setVisible(false);
            Login log = new Login();
            log.setVisible(true);
        }
    }//GEN-LAST:event_LogOutLapelMouseClicked

    private void studentsMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_studentsMenuMouseClicked

    private void manageStudentsLapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageStudentsLapelMouseClicked
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            studentsMenu.show(manageStudentsLapel,0, manageStudentsLapel.getHeight());
        }
    }//GEN-LAST:event_manageStudentsLapelMouseClicked

    private void instructorsMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instructorsMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_instructorsMenuMouseClicked

    private void manageInstructorsLapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageInstructorsLapelMouseClicked
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            instructorsMenu.show(manageInstructorsLapel, 0, manageInstructorsLapel.getHeight());
        }
    }//GEN-LAST:event_manageInstructorsLapelMouseClicked

    private void homeLapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLapelMouseClicked
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            this.setVisible(true);
        }
    }//GEN-LAST:event_homeLapelMouseClicked

    private void coursesMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursesMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_coursesMenuMouseClicked

    private void manageCoursesLapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageCoursesLapelMouseClicked
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            coursesMenu.show(manageCoursesLapel, 0, manageCoursesLapel.getHeight());
        }
    }//GEN-LAST:event_manageCoursesLapelMouseClicked

    private void addAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addAdminMouseClicked
        
    }//GEN-LAST:event_addAdminMouseClicked

    
    
    // User mene dialogs
    private void addAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAdminActionPerformed
        AddAdminDialog dialog = new AddAdminDialog(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_addAdminActionPerformed

    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserActionPerformed
        DeleteUserDialog dialog = new DeleteUserDialog(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_deleteUserActionPerformed

    private void deleteCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCourseActionPerformed
        DeleteCourseDialog dialog = new DeleteCourseDialog(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_deleteCourseActionPerformed

    private void getAllUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAllUsersActionPerformed
        GetAllUsersDialog dialog = new GetAllUsersDialog(this, true); 
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_getAllUsersActionPerformed

    private void getAllStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAllStudentsActionPerformed
        GetAllStudentsDialog dialog = new GetAllStudentsDialog(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_getAllStudentsActionPerformed

    private void UsersNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsersNumActionPerformed
        GetUsersCount dialog = new GetUsersCount(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_UsersNumActionPerformed

    private void getUserByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getUserByIdActionPerformed
        GetUserbyIdDialog dialog = new GetUserbyIdDialog(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_getUserByIdActionPerformed

    private void getUserByUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getUserByUsernameActionPerformed
        GetUserByUsernameDialog dialog = new GetUserByUsernameDialog(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_getUserByUsernameActionPerformed

    private void updateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserActionPerformed
        UpdateUserDialog dialog = new UpdateUserDialog(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_updateUserActionPerformed

    private void getAll_insActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAll_insActionPerformed
        GetAllinsDialog dialog = new GetAllinsDialog(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_getAll_insActionPerformed

    private void getCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getCoursesActionPerformed
        GetCoursesDialog dialog = new GetCoursesDialog(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_getCoursesActionPerformed

    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Create and display the form
        java.awt.EventQueue.invokeLater(() -> new AdminDashboard().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogOutLapel;
    private javax.swing.JLabel ManageUsersLapel;
    private javax.swing.JMenuItem UsersNum;
    private javax.swing.JMenuItem addAdmin;
    private javax.swing.JMenuItem addIns;
    private javax.swing.JPanel bigPanel;
    private javax.swing.JLabel countCourses;
    private javax.swing.JLabel countInstructors;
    private javax.swing.JLabel countStudents;
    private javax.swing.JPopupMenu coursesMenu;
    private javax.swing.JMenuItem deleteCourse;
    private javax.swing.JMenuItem deleteUser;
    private javax.swing.JMenuItem getAllStudents;
    private javax.swing.JMenuItem getAllUsers;
    private javax.swing.JMenuItem getAll_ins;
    private javax.swing.JMenuItem getCourses;
    private javax.swing.JMenuItem getUserById;
    private javax.swing.JMenuItem getUserByUsername;
    private javax.swing.JLabel homeLapel;
    private javax.swing.JPopupMenu instructorsMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel10;
    private com.k33ptoo.components.KGradientPanel kGradientPanel11;
    private com.k33ptoo.components.KGradientPanel kGradientPanel12;
    private com.k33ptoo.components.KGradientPanel kGradientPanel13;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private com.k33ptoo.components.KGradientPanel kGradientPanel5;
    private com.k33ptoo.components.KGradientPanel kGradientPanel6;
    private com.k33ptoo.components.KGradientPanel kGradientPanel7;
    private com.k33ptoo.components.KGradientPanel kGradientPanel8;
    private com.k33ptoo.components.KGradientPanel kGradientPanel9;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel manageCoursesLapel;
    private javax.swing.JLabel manageInstructorsLapel;
    private javax.swing.JLabel manageStudentsLapel;
    private javax.swing.JPanel parentCoursesPanel;
    private javax.swing.JPanel parentInstructorsPanel;
    private javax.swing.JPanel parentStuddentsPanel;
    private javax.swing.JMenuItem searchStudent;
    private javax.swing.JPopupMenu studentsMenu;
    private javax.swing.JTable t;
    private javax.swing.JMenuItem updateUser;
    private javax.swing.JPopupMenu usersMenu;
    private javax.swing.JLabel welcomeLapel;
    // End of variables declaration//GEN-END:variables
}
