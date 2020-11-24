
package source;


import java.text.SimpleDateFormat;
import javax.swing.JTextField;


/**
 *
 * @author Rajkumar
 */
public class MainWindow extends javax.swing.JFrame {
    
    String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thusday","Friday","Saturday"};
    String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    int day, dd, mm, yy;
    
    public MainWindow() {
        setTitle("Next Date Problem");  
        initComponents();        
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        Jdate = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        findDate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        preday = new javax.swing.JLabel();
        today = new javax.swing.JLabel();
        nextday = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(460, 150));

        Jdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setText("Choose Date  :");
        jLabel1.setToolTipText("");

        findDate.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        findDate.setText("Find Next & Previous Date");
        findDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findDate(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel5.setText("Pre. Date    :");

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel2.setText("Today          :");

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel3.setText("Next Date   :");

        preday.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        preday.setForeground(new java.awt.Color(51, 51, 51));

        today.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        nextday.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        nextday.setForeground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel4.setText("NEXT DATE PROBLEM");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(findDate, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(106, 106, 106))))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jdate, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(today, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(preday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nextday, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(Jdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addComponent(findDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preday, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(today, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextday, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        getAccessibleContext().setAccessibleParent(jFrame1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void findDate(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findDate
        
        SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = dcn.format(Jdate.getDate() );
        System.out.println();
        
        day = Jdate.getDate().getDay();
        yy = Integer.parseInt(strDate.toString().substring(0, 4));
        mm = Integer.parseInt(strDate.toString().substring(5, 7));
        dd = Integer.parseInt(strDate.toString().substring(8, 10));
        
        System.out.println("date="+dd+" month="+mm+" year="+yy);
        System.out.println(((JTextField)Jdate.getDateEditor().getUiComponent()).getText());
        
        displayToday();     // Find today...      
        displayNextday();   // Find next day... 
        displayPreday();    // Find previous day...
    }//GEN-LAST:event_findDate
    
    public void displayToday(){
        System.out.println(""+days[day]);
        today.setText(months[mm-1]+"  "+String.valueOf(dd)+",  "+String.valueOf(yy)+"   "+days[day]);
    }
    
    public void displayNextday(){
        int year, month, date;
        
        if(mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12){
            if(mm == 12 && dd == 31){
                year = yy + 1;
                month = (1) - 1;
                date = 1;
            }
            else if(dd == 31){
                year = yy;
                month = (mm + 1) - 1;
                date = 1;
            }
            else{
                year = yy;
                month = (mm) - 1;
                date = dd + 1;
            }
            int d = setNextDayValue(day);
            nextday.setText(months[month]+"  "+String.valueOf(date)+",  "+String.valueOf(year)+"   "+days[d]);
        }
        else if(mm == 4 || mm == 6 || mm == 9 || mm == 11){
            if(dd == 30){
                year = yy;
                month = (mm + 1) - 1;
                date = 1;
            }
            else{
                year = yy;
                month = (mm) - 1;
                date = dd + 1;
            }
            int d = setNextDayValue(day);
            nextday.setText(months[month]+"  "+String.valueOf(date)+",  "+String.valueOf(year)+"   "+days[d]);
        }
        else if(mm == 2){
            if (((yy % 4 == 0) && (yy % 100!= 0)) || (yy % 400 == 0)){
                if(dd == 29){
                    year = yy;
                    month = (3) - 1;
                    date = 1;
                }
                else{
                    year = yy;
                    month = (mm) - 1;
                    date = dd + 1;
                }
            }else{
                if(dd == 28){
                    year = yy;
                    month = (3) - 1;
                    date = 1;
                }
                else{
                    year = yy;
                    month = (mm) - 1;
                    date = dd + 1;
                }
            }
            int d = setNextDayValue(day);
            nextday.setText(months[month]+"  "+String.valueOf(date)+",  "+String.valueOf(year)+"   "+days[d]);
        }
    }
    
    public void displayPreday(){
        int year, month, date;
        
        if (mm == 5 || mm == 7 || mm == 10 || mm == 12){
            if (dd == 1){
                year = yy;
                month = (mm - 1)-1; // -1 bcz months index is starting from zero.
                date = 30;
            }
            else{
                year = yy;
                month = (mm) - 1;
                date = dd - 1;
            }
            int d = setPreDayValue(day);
            preday.setText(months[month]+"  "+String.valueOf(date)+",  "+String.valueOf(year)+"   "+days[d]);
        }
        else if(mm == 1 || mm == 2 || mm == 4 || mm == 6 || mm == 8 || mm == 9 || mm == 11){
            if(mm == 1 && dd == 1){
                year = yy - 1;
                month = (12) - 1;
                date = 31;
            }
            else if (dd == 1){
                year = yy;
                month = (mm - 1) - 1;
                date = 31;
            }
            else{
                year = yy;
                month = (mm) - 1;
                date = dd - 1;
            }
            int d = setPreDayValue(day);
            preday.setText(months[month]+"  "+String.valueOf(date)+",  "+String.valueOf(year)+"   "+days[d]);
        }
        else if(mm == 3){
            if(dd == 1){
                if (((yy % 4 == 0) && (yy % 100!= 0)) || (yy % 400 == 0)){
                    year = yy;
                    month = (2) - 1;
                    date = 29;
                }
                else{
                    year = yy;
                    month = (2) - 1;
                    date = 28;
                }
            }
            else{
                year = yy;
                month = (mm) - 1;
                date = dd - 1;
            }
            int d = setPreDayValue(day);
            preday.setText(months[month]+"  "+String.valueOf(date)+",  "+String.valueOf(year)+"   "+days[d]);
        }
    }
    
    public int setNextDayValue(int d){
        if (d == 6)
            return 0;
        else
            return d + 1; 
    }
    
    public int setPreDayValue(int d){
        if (d == 0)
            return 6 - d;
        else
            return d - 1; 
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    com.toedter.calendar.JDateChooser Jdate;
    private javax.swing.JButton findDate;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel nextday;
    public javax.swing.JLabel preday;
    public javax.swing.JLabel today;
    // End of variables declaration//GEN-END:variables
}
