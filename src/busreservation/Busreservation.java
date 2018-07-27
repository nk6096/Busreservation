package busreservation;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Busreservation extends javax.swing.JFrame {

    public Busreservation() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        s = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        d = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        sl = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dt = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        l16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        l17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        l18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        l19 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        l20 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        l21 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(628, 429));
        jPanel1.setMinimumSize(new java.awt.Dimension(627, 428));
        jPanel1.setPreferredSize(new java.awt.Dimension(627, 428));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VOLVO BUS RESERVATION ");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Source:");

        s.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delhi", "Mussorie", "Rishikesh", "Mathura", "Shimla" }));
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Destination:");

        d.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mussorie", "Delhi", "Rishikesh", "Mathura", "Shimla" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DOJ:");

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Select Flight Detail & Load:");

        sl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101:Volvo LX @ 12 pm", "102:Volvo LXI @ 3 pm", "103:Volvo VXI @ 8 pm", "104:Volvo S DLX @ 10 am" }));

        jButton3.setText("Load");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        l1.setText("........................................................");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        b1.setBackground(new java.awt.Color(0, 153, 51));
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b10.setBackground(new java.awt.Color(0, 153, 51));
        b10.setForeground(new java.awt.Color(255, 255, 255));
        b10.setText("10");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(0, 153, 51));
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(0, 153, 51));
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(0, 153, 51));
        b4.setForeground(new java.awt.Color(255, 255, 255));
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(0, 153, 51));
        b5.setForeground(new java.awt.Color(255, 255, 255));
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(0, 153, 51));
        b6.setForeground(new java.awt.Color(255, 255, 255));
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(0, 153, 51));
        b7.setForeground(new java.awt.Color(255, 255, 255));
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(0, 153, 51));
        b8.setForeground(new java.awt.Color(255, 255, 255));
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(0, 153, 51));
        b9.setForeground(new java.awt.Color(255, 255, 255));
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b11.setBackground(new java.awt.Color(0, 153, 51));
        b11.setForeground(new java.awt.Color(255, 255, 255));
        b11.setText("11");
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b12.setBackground(new java.awt.Color(0, 153, 51));
        b12.setForeground(new java.awt.Color(255, 255, 255));
        b12.setText("12");
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        b13.setBackground(new java.awt.Color(0, 153, 51));
        b13.setForeground(new java.awt.Color(255, 255, 255));
        b13.setText("13");
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });

        b14.setBackground(new java.awt.Color(0, 153, 51));
        b14.setForeground(new java.awt.Color(255, 255, 255));
        b14.setText("14");
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });

        b15.setBackground(new java.awt.Color(0, 153, 51));
        b15.setForeground(new java.awt.Color(255, 255, 255));
        b15.setText("15");
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });

        b16.setBackground(new java.awt.Color(0, 153, 51));
        b16.setForeground(new java.awt.Color(255, 255, 255));
        b16.setText("16");
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });

        b17.setBackground(new java.awt.Color(0, 153, 51));
        b17.setForeground(new java.awt.Color(255, 255, 255));
        b17.setText("17");
        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });

        b18.setBackground(new java.awt.Color(0, 153, 51));
        b18.setForeground(new java.awt.Color(255, 255, 255));
        b18.setText("18");
        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });

        b19.setBackground(new java.awt.Color(0, 153, 51));
        b19.setForeground(new java.awt.Color(255, 255, 255));
        b19.setText("19");
        b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19ActionPerformed(evt);
            }
        });

        b20.setBackground(new java.awt.Color(0, 153, 51));
        b20.setForeground(new java.awt.Color(255, 255, 255));
        b20.setText("20");
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });

        b21.setBackground(new java.awt.Color(0, 153, 51));
        b21.setForeground(new java.awt.Color(255, 255, 255));
        b21.setText("21");
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });

        b22.setBackground(new java.awt.Color(0, 153, 51));
        b22.setForeground(new java.awt.Color(255, 255, 255));
        b22.setText("22");
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });

        b23.setBackground(new java.awt.Color(0, 153, 51));
        b23.setForeground(new java.awt.Color(255, 255, 255));
        b23.setText("23");
        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b23ActionPerformed(evt);
            }
        });

        b24.setBackground(new java.awt.Color(0, 153, 51));
        b24.setForeground(new java.awt.Color(255, 255, 255));
        b24.setText("24");
        b24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b24))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b15))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(b10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b16)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b18, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b19, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b24, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton28.setText("Make Reservation");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("..........................");

        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setText(".........................");

        jButton1.setText("Get Bus Detail");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sl, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(d, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(l2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(l3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(dt, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, "1");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ABHA TRAVELS");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("D.O.J             :");

        l16.setText("...............................");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Bus No.        :");

        l17.setText("...............................");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Source         :");

        l18.setText("...............................");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Destination :");

        l19.setText("..............................");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Seats no.     :");

        l20.setText("..............................");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Passanger 1 Name&Number:");

        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });

        jButton4.setText("Submit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Bus Timing   :");

        l21.setText("..............................");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addComponent(l16, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel13)
                .addGap(6, 6, 6)
                .addComponent(l17, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel15)
                .addGap(6, 6, 6)
                .addComponent(l18, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel17)
                .addGap(6, 6, 6)
                .addComponent(l19, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addGap(6, 6, 6)
                .addComponent(l20, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jButton4)
                .addGap(125, 125, 125)
                .addComponent(jButton5))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l21))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(l16))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(l17))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(l18))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(l19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(l20, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(l21))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, "2");

        jMenu1.setText("Reservation");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Fare Calculator");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Tickets");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Bus Management");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Admin Login");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
       try{
           String s1=(String)s.getSelectedItem();
           String s2=(String)d.getSelectedItem();
           java.util.Date dts=dt.getDate();
           if(dts!=null){
           java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("dd/MM/yyyy");
           String s3=sdf.format(dts);
           l16.setText(s3);
           }
           l18.setText(s1);
           l19.setText(s2);
      java.awt.Container ct=getContentPane();
      java.awt.CardLayout cd=(java.awt.CardLayout)ct.getLayout();
      cd.show(ct,"2");
       }catch(Exception ex){
           JOptionPane.showMessageDialog(this, ex);
           ex.printStackTrace();
       }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void b24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b24ActionPerformed
       try{
         b24.setBackground(Color.red);
         l1.setText("Seat No.-24");
         l20.setText("24");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b24 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b24ActionPerformed

    private void b23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b23ActionPerformed
         try{
         b23.setBackground(Color.red);
         l1.setText("Seat No.-23");
         l20.setText("23");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b23 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b23ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
        try{
         b22.setBackground(Color.red);
         l1.setText("Seat No.-22");
         l20.setText("22");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b22 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b22ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
        try{
         b21.setBackground(Color.red);
         l1.setText("Seat No.-21");
         l20.setText("21");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b21 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b21ActionPerformed

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
         try{
         b20.setBackground(Color.red);
         l1.setText("Seat No.-20");
         l20.setText("20");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b20 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b20ActionPerformed

    private void b19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19ActionPerformed
         try{
         b19.setBackground(Color.red);
         l1.setText("Seat No.-19");
         l20.setText("19");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b19 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b19ActionPerformed

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b18ActionPerformed
         try{
         b18.setBackground(Color.red);
         l1.setText("Seat No.-18");
         l20.setText("18");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b18 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b18ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
        try{
         b17.setBackground(Color.red);
         l1.setText("Seat No.-17");
         l20.setText("17");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b17 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b17ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
        try{
         b16.setBackground(Color.red);
         l1.setText("Seat No.-16");
         l20.setText("16");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b16 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b16ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
         try{
         b15.setBackground(Color.red);
         l1.setText("Seat No.-15");
         l20.setText("15");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b15 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b15ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
         try{
         b14.setBackground(Color.red);
         l1.setText("Seat No.-14");
         l20.setText("14");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b14 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b14ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        try{
         b13.setBackground(Color.red);
         l1.setText("Seat No.-13");
         l20.setText("13");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b13 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b13ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        try{
         b12.setBackground(Color.red);
         l1.setText("Seat No.-12");
         l20.setText("12");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b12 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b12ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
         try{
         b11.setBackground(Color.red);
         l1.setText("Seat No.-11");
         l20.setText("11");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b11 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b11ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
         try{
         b9.setBackground(Color.red);
         l1.setText("Seat No.-9");
         l20.setText("9");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b9 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b9ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
         try{
         b8.setBackground(Color.red);
         l1.setText("Seat No.-8");
         l20.setText("8");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b8 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b8ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        try{
         b7.setBackground(Color.red);
         l1.setText("Seat No.-7");
         l20.setText("7");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b7 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b7ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
         try{
         b6.setBackground(Color.red);
         l1.setText("Seat No.-6");
         l20.setText("6");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b6 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b6ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
         try{
         b5.setBackground(Color.red);
         l1.setText("Seat No.-5");
         l20.setText("5");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b5 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b5ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        try{
         b4.setBackground(Color.red);
         l1.setText("Seat No.-4");
         l20.setText("4");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b4 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b4ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        try{
         b3.setBackground(Color.red);
         l1.setText("Seat No.-3");
         l20.setText("3");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b3 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        try{
         b2.setBackground(Color.red);
         l1.setText("Seat No.-2");
         l20.setText("2");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b2 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b2ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
       try{
         b10.setBackground(Color.red);
         l1.setText("Seat No.-10");
         l20.setText("10");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b10 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b10ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
     try{
         b1.setBackground(Color.red);
         l1.setText("Seat No.-1");
         l20.setText("1");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(this,"b1 error");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_b1ActionPerformed

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new Sticket().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try{
           java.util.Date dts=dt.getDate();
           if(dts!=null){
           java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("dd/MM/yyyy");
           String s3=sdf.format(dts);
           l2.setText("DOJ:"+s3);
           String s4=(String)sl.getSelectedItem();
           }
           if(sl.getSelectedItem().equals("101:Volvo LX @ 12 pm")){
               l3.setText("Bus id: 101");
                l17.setText("101");
                l21.setText("12 pm");
           }
           if(sl.getSelectedItem().equals("102:Volvo LXI @ 3 pm")){
               l3.setText("Bus id: 102");
                l17.setText("102");
                l21.setText("3 pm");
           }
           if(sl.getSelectedItem().equals("103:Volvo VXI @ 8 pm")){
               l3.setText("Bus id: 103");
                l17.setText("103");
                l21.setText("8 pm");
           }
          if(sl.getSelectedItem().equals("104:Volvo S DLX @ 10 am")){
               l3.setText("Bus id: 104");
                l17.setText("104");
                l21.setText("10 am");
          }  
       }catch(Exception ex){
           JOptionPane.showMessageDialog(this, "load error");
           ex.printStackTrace();
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
        String t1=tf1.getText();//name
        String t2=tf2.getText();//mobile no.
        if(s.getSelectedItem().equals("Delhi")&&d.getSelectedItem().equals("Mussorie")){
            String t3="282";//total dst.
            String t4="8.1 hrs";//total time
            String t5="Rs.500";//total cost
             db.DBConnect.addUser.setString(5, t3);
             
             db.DBConnect.addUser.setString(6, t4);
         
             db.DBConnect.addUser.setString(7, t5);
        }
        if(s.getSelectedItem().equals("Delhi")&&d.getSelectedItem().equals("Rishikesh")){
             String t3="226";
            String t4="7.2 hrs";
            String t5="Rs.480";
             db.DBConnect.addUser.setString(5, t3);
             db.DBConnect.addUser.setString(6, t4);
             db.DBConnect.addUser.setString(7, t5);
             
        }
        if(s.getSelectedItem().equals("Delhi")&&d.getSelectedItem().equals("Mathura")){
             String t3="162";
            String t4="4.0 hrs";
            String t5="Rs.300";  
             db.DBConnect.addUser.setString(5, t3);
             db.DBConnect.addUser.setString(6, t4);
             db.DBConnect.addUser.setString(7, t5);
             
        }
        if(s.getSelectedItem().equals("Delhi")&&d.getSelectedItem().equals("Shimla")){
             String t3="350";
            String t4="7.5 hrs";
            String t5="Rs.650";  
             db.DBConnect.addUser.setString(5, t3);
             db.DBConnect.addUser.setString(6, t4);
             db.DBConnect.addUser.setString(7, t5);
            
        }
        if(s.getSelectedItem().equals("Mussorie")&&d.getSelectedItem().equals("Delhi")){
            String t3="282";
            String t4="8.1 hrs";
            String t5="Rs.500";      
             db.DBConnect.addUser.setString(5, t3);
             db.DBConnect.addUser.setString(6, t4);
             db.DBConnect.addUser.setString(7, t5);
             
        }
        if(s.getSelectedItem().equals("Mussorie")&&d.getSelectedItem().equals("Rishikesh")){
             String t3="85";
            String t4="2.0 hrs";
            String t5="Rs.150";  
             db.DBConnect.addUser.setString(5, t3);
             db.DBConnect.addUser.setString(6, t4);
             db.DBConnect.addUser.setString(7, t5);
             
        }
        if(s.getSelectedItem().equals("Mussorie")&&d.getSelectedItem().equals("Mathura")){
             String t3="419";
            String t4="9.0 hrs";
            String t5="Rs.950";
             db.DBConnect.addUser.setString(5, t3);
             db.DBConnect.addUser.setString(6, t4);
             db.DBConnect.addUser.setString(7, t5);
            
        }
        if(s.getSelectedItem().equals("Mussorie")&&d.getSelectedItem().equals("Shimla")){
            String t3="256";
            String t4="5.0 hrs";
            String t5="Rs.550";
             db.DBConnect.addUser.setString(5, t3);
             db.DBConnect.addUser.setString(6, t4);
             db.DBConnect.addUser.setString(7, t5);
            
        }
        if(s.getSelectedItem().equals("Rishikesh")&&d.getSelectedItem().equals("Mussorie")){
             String t3="85";
            String t4="2.0 hrs";
            String t5="Rs.150";  
             db.DBConnect.addUser.setString(5, t3);
             db.DBConnect.addUser.setString(6, t4);
             db.DBConnect.addUser.setString(7, t5);
             
        }
        if(s.getSelectedItem().equals("Rishikesh")&&d.getSelectedItem().equals("Delhi")){
               String t3="226";
            String t4="7.2 hrs";
            String t5="Rs.480";
             db.DBConnect.addUser.setString(5, t3);
             db.DBConnect.addUser.setString(6, t4);
             db.DBConnect.addUser.setString(7, t5);
             
        }
        if(s.getSelectedItem().equals("Rishikesh")&&d.getSelectedItem().equals("Mathura")){
             String t3="362";
            String t4="7.0 hrs";
            String t5="Rs.700";  
             db.DBConnect.addUser.setString(5, t3);
             db.DBConnect.addUser.setString(6, t4);
             db.DBConnect.addUser.setString(7, t5);
            
        }
        if(s.getSelectedItem().equals("Rishikesh")&&d.getSelectedItem().equals("Shimla")){
             String t3="271";
            String t4="4.5 hrs";
            String t5="Rs.700"; 
             db.DBConnect.addUser.setString(5, t3);
             db.DBConnect.addUser.setString(6, t4);
             db.DBConnect.addUser.setString(7, t5);
            
        }
        if(s.getSelectedItem().equals("Mathura")&&d.getSelectedItem().equals("Delhi")){
             String t3="162";
            String t4="4.0 hrs";
            String t5="Rs.300";  
             db.DBConnect.addUser.setString(5, t3);
             db.DBConnect.addUser.setString(6, t4);
             db.DBConnect.addUser.setString(7, t5);
             
        }
        if(s.getSelectedItem().equals("Mathura")&&d.getSelectedItem().equals("Rishikesh")){
            String t3="362";
            String t4="7.0 hrs";
            String t5="Rs.700";  
             db.DBConnect.addUser.setString(5, t3);
             db.DBConnect.addUser.setString(6, t4);
             db.DBConnect.addUser.setString(7, t5);
            
        }
        if(s.getSelectedItem().equals("Mathura")&&d.getSelectedItem().equals("Mussorie")){
             String t3="419";
            String t4="9.0 hrs";
            String t5="Rs.950";
             db.DBConnect.addUser.setString(5, t3);
             db.DBConnect.addUser.setString(6, t4);
             db.DBConnect.addUser.setString(7, t5);
            
        }
        if(s.getSelectedItem().equals("Mathura")&&d.getSelectedItem().equals("Shimla")){
             String t3="508";
            String t4="11.0 hrs";
            String t5="Rs.1200";   
             db.DBConnect.addUser.setString(5, t3);
             db.DBConnect.addUser.setString(6, t4);
             db.DBConnect.addUser.setString(7, t5);
            
        }
         if(s.getSelectedItem().equals("Shimla")&&d.getSelectedItem().equals("Delhi")){
            String t3="350";
            String t4="7.5 hrs";
            String t5="Rs.650";  
             db.DBConnect.addUser.setString(5, t3);
             db.DBConnect.addUser.setString(6, t4);
             db.DBConnect.addUser.setString(7, t5);
            
        }
        if(s.getSelectedItem().equals("Shimla")&&d.getSelectedItem().equals("Rishikesh")){
             String t3="271";
            String t4="4.5 hrs";
            String t5="Rs.700";   
             db.DBConnect.addUser.setString(5, t3);
             db.DBConnect.addUser.setString(6, t4);
             db.DBConnect.addUser.setString(7, t5);
           
        }
        if(s.getSelectedItem().equals("Shimla")&&d.getSelectedItem().equals("Mussorie")){
              String t3="256";
            String t4="5.0 hrs";
            String t5="Rs.550";
             db.DBConnect.addUser.setString(5, t3);
             db.DBConnect.addUser.setString(6, t4);
             db.DBConnect.addUser.setString(7, t5);
           
        }
        if(s.getSelectedItem().equals("Shimla")&&d.getSelectedItem().equals("Mathura")){
             String t3="508";
            String t4="11.0 hrs";
            String t5="Rs.1200";   
             db.DBConnect.addUser.setString(5, t3);
             db.DBConnect.addUser.setString(6, t4);
             db.DBConnect.addUser.setString(7, t5);
            
        }
           java.util.Date dts=dt.getDate();
           if(dts!=null){
           java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("dd/MM/yyyy");
           String s3=sdf.format(dts);
           java.sql.Date sd=
           new java.sql.Date(dts.getTime());
           db.DBConnect.addUser.setDate(3, sd);
           }
        String t6=l17.getText();//bus no.
        String t7=l18.getText();//source
        String t8=l19.getText();//destinstion
        String t9=l20.getText();//seat no.
        String t10=l21.getText();//bus timing
       
            db.DBConnect.addUser.setString(1, t7);
            db.DBConnect.addUser.setString(2, t8);
            db.DBConnect.addUser.setString(4, t10);
            db.DBConnect.addUser.setString(8, t6);
            db.DBConnect.addUser.setString(9, t9);
            db.DBConnect.addUser.setString(10, t1);
            db.DBConnect.addUser.setString(11, t2);
            db.DBConnect.addUser.executeUpdate();
            new ticket().setVisible(true);
            dispose();
       }catch(Exception ex){
ex.printStackTrace();
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new Busreservation().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new farecal().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Busreservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busreservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busreservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busreservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Busreservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b19;
    private javax.swing.JButton b2;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.JButton b24;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JComboBox<String> d;
    private com.toedter.calendar.JDateChooser dt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l16;
    private javax.swing.JLabel l17;
    private javax.swing.JLabel l18;
    private javax.swing.JLabel l19;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l20;
    private javax.swing.JLabel l21;
    private javax.swing.JLabel l3;
    private javax.swing.JComboBox<String> s;
    private javax.swing.JComboBox<String> sl;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    // End of variables declaration//GEN-END:variables
}
