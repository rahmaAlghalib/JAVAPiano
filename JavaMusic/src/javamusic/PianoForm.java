package javamusic;

public class PianoForm extends javax.swing.JFrame {

    public PianoForm() {
        initComponents();
        Disable();
    }

    // if the on/off button is off then disable all buttons----------------------
    private void Disable() {
        ASharp5.setEnabled(false);
        D3.setEnabled(false);
        E3.setEnabled(false);
        F3.setEnabled(false);
        G3.setEnabled(false);
        A3.setEnabled(false);
        B3.setEnabled(false);
        MiddleC.setEnabled(false);
        D4.setEnabled(false);
        E4.setEnabled(false);
        F4.setEnabled(false);
        F2.setEnabled(false);
        G4.setEnabled(false);
        A4.setEnabled(false);
        B4.setEnabled(false);
        C5.setEnabled(false);
        A5.setEnabled(false);
        D5.setEnabled(false);
        E5.setEnabled(false);
        F5.setEnabled(false);
        G5.setEnabled(false);
        CSharp3.setEnabled(false);
        G2.setEnabled(false);
        DSharp3.setEnabled(false);
        FSharp3.setEnabled(false);
        GSharp3.setEnabled(false);
        ASharp3.setEnabled(false);
        CSharp4.setEnabled(false);
        DSharp4.setEnabled(false);
        FSharp4.setEnabled(false);
        GSharp4.setEnabled(false);
        ASharp4.setEnabled(false);
        CSharp5.setEnabled(false);
        A2.setEnabled(false);
        DSharp5.setEnabled(false);
        FSharp5.setEnabled(false);
        B5.setEnabled(false);
        GSharp5.setEnabled(false);
        B2.setEnabled(false);
        C3.setEnabled(false);
        FSharp2.setEnabled(false);
        GSharp2.setEnabled(false);
        ASharp2.setEnabled(false);
    }

    // if on/off button is on then enable the buttons---------------------------
    private void Enable() {
        ASharp5.setEnabled(true);
        D3.setEnabled(true);
        E3.setEnabled(true);
        F3.setEnabled(true);
        G3.setEnabled(true);
        A3.setEnabled(true);
        B3.setEnabled(true);
        MiddleC.setEnabled(true);
        D4.setEnabled(true);
        E4.setEnabled(true);
        F4.setEnabled(true);
        F2.setEnabled(true);
        G4.setEnabled(true);
        A4.setEnabled(true);
        B4.setEnabled(true);
        C5.setEnabled(true);
        A5.setEnabled(true);
        D5.setEnabled(true);
        E5.setEnabled(true);
        F5.setEnabled(true);
        G5.setEnabled(true);
        CSharp3.setEnabled(true);
        G2.setEnabled(true);
        DSharp3.setEnabled(true);
        FSharp3.setEnabled(true);
        GSharp3.setEnabled(true);
        ASharp3.setEnabled(true);
        CSharp4.setEnabled(true);
        DSharp4.setEnabled(true);
        FSharp4.setEnabled(true);
        GSharp4.setEnabled(true);
        ASharp4.setEnabled(true);
        CSharp5.setEnabled(true);
        A2.setEnabled(true);
        DSharp5.setEnabled(true);
        FSharp5.setEnabled(true);
        B5.setEnabled(true);
        GSharp5.setEnabled(true);
        B2.setEnabled(true);
        C3.setEnabled(true);
        FSharp2.setEnabled(true);
        GSharp2.setEnabled(true);
        ASharp2.setEnabled(true);
    }

    // JFORM------------------------------------------------------------------------
    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Base = new javax.swing.JPanel();
        OnOffButton = new javax.swing.JToggleButton();
        ASharp5 = new javax.swing.JButton();
        FSharp2 = new javax.swing.JButton();
        GSharp2 = new javax.swing.JButton();
        ASharp2 = new javax.swing.JButton();
        CSharp3 = new javax.swing.JButton();
        DSharp3 = new javax.swing.JButton();
        FSharp3 = new javax.swing.JButton();
        GSharp3 = new javax.swing.JButton();
        ASharp3 = new javax.swing.JButton();
        CSharp4 = new javax.swing.JButton();
        DSharp4 = new javax.swing.JButton();
        FSharp4 = new javax.swing.JButton();
        GSharp4 = new javax.swing.JButton();
        ASharp4 = new javax.swing.JButton();
        CSharp5 = new javax.swing.JButton();
        DSharp5 = new javax.swing.JButton();
        FSharp5 = new javax.swing.JButton();
        GSharp5 = new javax.swing.JButton();
        RedStripe = new javax.swing.JPanel();
        F2 = new javax.swing.JButton();
        G2 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        D3 = new javax.swing.JButton();
        E3 = new javax.swing.JButton();
        F3 = new javax.swing.JButton();
        G3 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        MiddleC = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        E4 = new javax.swing.JButton();
        F4 = new javax.swing.JButton();
        G4 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        D5 = new javax.swing.JButton();
        E5 = new javax.swing.JButton();
        F5 = new javax.swing.JButton();
        G5 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Base.setBackground(new java.awt.Color(51, 51, 51));
        Base.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OnOffButton.setBackground(new java.awt.Color(0, 0, 0));
        OnOffButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OnOffButton.setFocusable(false);
        OnOffButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                OnOffButtonStateChanged(evt);
            }
        });
        OnOffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnOffButtonActionPerformed(evt);
            }
        });
        Base.add(OnOffButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 50, 30));

        jPanel1.add(Base, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 80));

        ASharp5.setBackground(new java.awt.Color(0, 0, 0));
        ASharp5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ASharp5.setFocusable(false);
        ASharp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASharp5ActionPerformed(evt);
            }
        });
        jPanel1.add(ASharp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 80, 40, 210));

        FSharp2.setBackground(new java.awt.Color(0, 0, 0));
        FSharp2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FSharp2.setFocusable(false);
        FSharp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FSharp2ActionPerformed(evt);
            }
        });
        jPanel1.add(FSharp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 40, 210));

        GSharp2.setBackground(new java.awt.Color(0, 0, 0));
        GSharp2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GSharp2.setFocusable(false);
        GSharp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GSharp2ActionPerformed(evt);
            }
        });
        jPanel1.add(GSharp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 40, 210));

        ASharp2.setBackground(new java.awt.Color(0, 0, 0));
        ASharp2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ASharp2.setFocusable(false);
        ASharp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASharp2ActionPerformed(evt);
            }
        });
        jPanel1.add(ASharp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 40, 210));

        CSharp3.setBackground(new java.awt.Color(0, 0, 0));
        CSharp3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CSharp3.setFocusable(false);
        CSharp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSharp3ActionPerformed(evt);
            }
        });
        jPanel1.add(CSharp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 40, 210));

        DSharp3.setBackground(new java.awt.Color(0, 0, 0));
        DSharp3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DSharp3.setFocusable(false);
        DSharp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DSharp3ActionPerformed(evt);
            }
        });
        jPanel1.add(DSharp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 40, 210));

        FSharp3.setBackground(new java.awt.Color(0, 0, 0));
        FSharp3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FSharp3.setFocusable(false);
        FSharp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FSharp3ActionPerformed(evt);
            }
        });
        jPanel1.add(FSharp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 40, 210));

        GSharp3.setBackground(new java.awt.Color(0, 0, 0));
        GSharp3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GSharp3.setFocusable(false);
        GSharp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GSharp3ActionPerformed(evt);
            }
        });
        jPanel1.add(GSharp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 40, 210));

        ASharp3.setBackground(new java.awt.Color(0, 0, 0));
        ASharp3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ASharp3.setFocusable(false);
        ASharp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASharp3ActionPerformed(evt);
            }
        });
        jPanel1.add(ASharp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 40, 210));

        CSharp4.setBackground(new java.awt.Color(0, 0, 0));
        CSharp4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CSharp4.setFocusable(false);
        CSharp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSharp4ActionPerformed(evt);
            }
        });
        jPanel1.add(CSharp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 40, 210));

        DSharp4.setBackground(new java.awt.Color(0, 0, 0));
        DSharp4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DSharp4.setFocusable(false);
        DSharp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DSharp4ActionPerformed(evt);
            }
        });
        jPanel1.add(DSharp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 40, 210));

        FSharp4.setBackground(new java.awt.Color(0, 0, 0));
        FSharp4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FSharp4.setFocusable(false);
        FSharp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FSharp4ActionPerformed(evt);
            }
        });
        jPanel1.add(FSharp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, 40, 210));

        GSharp4.setBackground(new java.awt.Color(0, 0, 0));
        GSharp4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GSharp4.setFocusable(false);
        GSharp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GSharp4ActionPerformed(evt);
            }
        });
        jPanel1.add(GSharp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 80, 40, 210));

        ASharp4.setBackground(new java.awt.Color(0, 0, 0));
        ASharp4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ASharp4.setFocusable(false);
        ASharp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASharp4ActionPerformed(evt);
            }
        });
        jPanel1.add(ASharp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 80, 40, 210));

        CSharp5.setBackground(new java.awt.Color(0, 0, 0));
        CSharp5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CSharp5.setFocusable(false);
        CSharp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSharp5ActionPerformed(evt);
            }
        });
        jPanel1.add(CSharp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 80, 40, 210));

        DSharp5.setBackground(new java.awt.Color(0, 0, 0));
        DSharp5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DSharp5.setFocusable(false);
        DSharp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DSharp5ActionPerformed(evt);
            }
        });
        jPanel1.add(DSharp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 80, 40, 210));

        FSharp5.setBackground(new java.awt.Color(0, 0, 0));
        FSharp5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FSharp5.setFocusable(false);
        FSharp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FSharp5ActionPerformed(evt);
            }
        });
        jPanel1.add(FSharp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 80, 40, 210));

        GSharp5.setBackground(new java.awt.Color(0, 0, 0));
        GSharp5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GSharp5.setFocusable(false);
        GSharp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GSharp5ActionPerformed(evt);
            }
        });
        jPanel1.add(GSharp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 80, 40, 210));

        RedStripe.setBackground(new java.awt.Color(165, 36, 17));
        RedStripe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(RedStripe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1500, 10));

        F2.setToolTipText("");
        F2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F2.setFocusable(false);
        F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F2ActionPerformed(evt);
            }
        });
        jPanel1.add(F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 60, 310));

        G2.setToolTipText("");
        G2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        G2.setFocusable(false);
        G2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G2ActionPerformed(evt);
            }
        });
        jPanel1.add(G2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 70, 310));

        A2.setToolTipText("");
        A2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A2.setFocusable(false);
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });
        jPanel1.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 80, 310));

        B2.setToolTipText("");
        B2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B2.setFocusable(false);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        jPanel1.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 80, 310));

        C3.setToolTipText("");
        C3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C3.setFocusable(false);
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });
        jPanel1.add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 80, 310));

        D3.setToolTipText("");
        D3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        D3.setFocusable(false);
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });
        jPanel1.add(D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 80, 310));

        E3.setToolTipText("");
        E3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        E3.setFocusable(false);
        E3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E3ActionPerformed(evt);
            }
        });
        jPanel1.add(E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 80, 310));

        F3.setToolTipText("");
        F3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F3.setFocusable(false);
        F3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F3ActionPerformed(evt);
            }
        });
        jPanel1.add(F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 80, 310));

        G3.setToolTipText("");
        G3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        G3.setFocusable(false);
        G3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G3ActionPerformed(evt);
            }
        });
        jPanel1.add(G3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 80, 310));

        A3.setToolTipText("");
        A3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A3.setFocusable(false);
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });
        jPanel1.add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 80, 310));

        B3.setToolTipText("");
        B3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B3.setFocusable(false);
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        jPanel1.add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 80, 310));

        MiddleC.setToolTipText("");
        MiddleC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MiddleC.setFocusable(false);
        MiddleC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiddleCActionPerformed(evt);
            }
        });
        jPanel1.add(MiddleC, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 80, 310));

        D4.setToolTipText("");
        D4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        D4.setFocusable(false);
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });
        jPanel1.add(D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 80, 310));

        E4.setToolTipText("");
        E4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        E4.setFocusable(false);
        E4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4ActionPerformed(evt);
            }
        });
        jPanel1.add(E4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 80, 310));

        F4.setToolTipText("");
        F4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F4.setFocusable(false);
        F4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F4ActionPerformed(evt);
            }
        });
        jPanel1.add(F4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, 70, 310));

        G4.setToolTipText("");
        G4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        G4.setFocusable(false);
        G4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G4ActionPerformed(evt);
            }
        });
        jPanel1.add(G4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 80, 70, 310));

        A4.setToolTipText("");
        A4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A4.setFocusable(false);
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });
        jPanel1.add(A4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 80, 70, 310));

        B4.setToolTipText("");
        B4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B4.setFocusable(false);
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        jPanel1.add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 80, 70, 310));

        C5.setToolTipText("");
        C5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C5.setFocusable(false);
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });
        jPanel1.add(C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 80, 70, 310));

        D5.setToolTipText("");
        D5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        D5.setFocusable(false);
        D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D5ActionPerformed(evt);
            }
        });
        jPanel1.add(D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 80, 70, 310));

        E5.setToolTipText("");
        E5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        E5.setFocusable(false);
        E5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E5ActionPerformed(evt);
            }
        });
        jPanel1.add(E5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 80, 70, 310));

        F5.setToolTipText("");
        F5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F5.setFocusable(false);
        F5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F5ActionPerformed(evt);
            }
        });
        jPanel1.add(F5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 80, 70, 310));

        G5.setToolTipText("");
        G5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        G5.setFocusable(false);
        G5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G5ActionPerformed(evt);
            }
        });
        jPanel1.add(G5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 80, 70, 310));

        A5.setToolTipText("");
        A5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A5.setFocusable(false);
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });
        jPanel1.add(A5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 80, 70, 310));

        B5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B5.setFocusable(false);
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        jPanel1.add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1425, 80, 80, 310));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 390));

        pack();
    }
    // ------------------------------------------------------------------------------

    // if the user turns on the piano ------------------------------------------
    private void OnOffButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Enable();
    }
    // --------------------------------------------------------------------------

    // If the user turns off the piano -----------------------------------------
    private void OnOffButtonStateChanged(javax.swing.event.ChangeEvent evt) {
        if (!OnOffButton.isSelected()) {
            Disable();
        }
    }
    // --------------------------------------------------------------------------

    // PLAYING THE NOTES--------------------------------------------------------
    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/A4.wav");
        note.play();
    }

    private void ASharp4ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/A#4.wav");
        note.play();
    }

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/B4.wav");
        note.play();
    }

    private void G4ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/G4.wav");
        note.play();
    }

    private void F4ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/F4.wav");
        note.play();
    }

    private void GSharp4ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/G#4.wav");
        note.play();
    }

    private void FSharp4ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/F#4.wav");
        note.play();
    }

    private void E4ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/E4.wav");
        note.play();
    }

    private void DSharp4ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/D#4.wav");
        note.play();
    }

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/D4.wav");
        note.play();
    }

    private void CSharp4ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/C#4.wav");
        note.play();
    }

    private void MiddleCActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/C4.wav");
        note.play();
    }

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/C3.wav");
        note.play();
    }

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/D3.wav");
        note.play();
    }

    private void CSharp3ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/C#3.wav");
        note.play();
    }

    private void DSharp3ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/D#3.wav");
        note.play();
    }

    private void E3ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/E3.wav");
        note.play();
    }

    private void F3ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/F3.wav");
        note.play();
    }

    private void FSharp3ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/F#3.wav");
        note.play();
    }

    private void G3ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/G3.wav");
        note.play();
    }

    private void GSharp3ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/G#3.wav");
        note.play();
    }

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/A3.wav");
        note.play();
    }

    private void ASharp3ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/A#3.wav");
        note.play();
    }

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/B3.wav");
        note.play();
    }

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/C5.wav");
        note.play();
    }

    private void CSharp5ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/C#5.wav");
        note.play();
    }

    private void D5ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/D5.wav");
        note.play();
    }

    private void DSharp5ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/D#5.wav");
        note.play();
    }

    private void E5ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/E5.wav");
        note.play();
    }

    private void F5ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/F5.wav");
        note.play();
    }

    private void FSharp5ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/F#5.wav");
        note.play();
    }

    private void G5ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/G5.wav");
        note.play();
    }

    private void GSharp5ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/G#5.wav");
        note.play();
    }

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/A5.wav");
        note.play();
    }

    private void ASharp5ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/A#5.wav");
        note.play();
    }

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/B5.wav");
        note.play();
    }

    private void F2ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/F2.wav");
        note.play();
    }

    private void FSharp2ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/F#2.wav");
        note.play();
    }

    private void G2ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/G2.wav");
        note.play();
    }

    private void GSharp2ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/G#2.wav");
        note.play();
    }

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/A2.wav");
        note.play();
    }

    private void ASharp2ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/A#2.wav");
        note.play();
    }

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {
        Piano note = new Piano("Notes/B2.wav");
        note.play();
    }
    // --------------------------------------------------------------------------

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PianoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PianoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PianoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PianoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PianoForm().setVisible(true);
            }
        });

    }

    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton ASharp2;
    private javax.swing.JButton ASharp3;
    private javax.swing.JButton ASharp4;
    private javax.swing.JButton ASharp5;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JPanel Base;
    private javax.swing.JButton C3;
    private javax.swing.JButton C5;
    private javax.swing.JButton CSharp3;
    private javax.swing.JButton CSharp4;
    private javax.swing.JButton CSharp5;
    private javax.swing.JButton D3;
    private javax.swing.JButton D4;
    private javax.swing.JButton D5;
    private javax.swing.JButton DSharp3;
    private javax.swing.JButton DSharp4;
    private javax.swing.JButton DSharp5;
    private javax.swing.JButton E3;
    private javax.swing.JButton E4;
    private javax.swing.JButton E5;
    private javax.swing.JButton F2;
    private javax.swing.JButton F3;
    private javax.swing.JButton F4;
    private javax.swing.JButton F5;
    private javax.swing.JButton FSharp2;
    private javax.swing.JButton FSharp3;
    private javax.swing.JButton FSharp4;
    private javax.swing.JButton FSharp5;
    private javax.swing.JButton G2;
    private javax.swing.JButton G3;
    private javax.swing.JButton G4;
    private javax.swing.JButton G5;
    private javax.swing.JButton GSharp2;
    private javax.swing.JButton GSharp3;
    private javax.swing.JButton GSharp4;
    private javax.swing.JButton GSharp5;
    private javax.swing.JButton MiddleC;
    private javax.swing.JToggleButton OnOffButton;
    private javax.swing.JPanel RedStripe;
    private javax.swing.JPanel jPanel1;

}
