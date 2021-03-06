package javaapplication14;

import java.awt.FileDialog;
import java.io.File;
import javax.swing.JFileChooser;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Collections;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.StringTokenizer;


/**
 *
 * @author mutsu
 */



public class Visual extends javax.swing.JFrame {
    
    String rutaa = "";
    
       public boolean esLetra(char simbolo) {
        if ((simbolo > 96 && simbolo < 123) || (simbolo > 64 && simbolo < 91)) {
            return true;
        }
        return false;
    }

    public boolean esDigito(char simbolo) {
        if ((simbolo > 47 && simbolo < 58)) {
            return true;
        }
        return false;
    }
    
    public boolean esPunto(char simbolo) {
        if (simbolo > 45) {
            return true;
        }
        return false;
    }
    
    void llamarArchivo(){
        
        JFileChooser busqueda = new JFileChooser();
        busqueda.showOpenDialog(busqueda);
        
        File archivo = busqueda.getSelectedFile();
        
        if(archivo != null){
            rutaa=archivo.getAbsolutePath();
            ruta.setText(rutaa);
        }   
         
        try{
            String dato;
            String mostrarDato= " ";

            FileReader fr = new FileReader(archivo);
            BufferedReader bf = new BufferedReader(fr);
            
                while((dato = bf.readLine())!=null) {  
                    mostrarDato= mostrarDato +  dato + "\n" ;    
                }
                    mostrar.setText(mostrarDato);
                    bf.close();
           
        }catch(IOException e){
            System.out.println(e.getMessage());
        }   
    }
     
     void guardarArchivo(){
         try{
            FileWriter fw = new FileWriter(rutaa);
            fw.write(mostrar.getText());
            fw.close();
            JOptionPane.showMessageDialog(null, "Guardado con exito");
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
     }
     
     void guardarComoArchivos(){
         
         FileDialog fileDialog = new FileDialog(Visual.this, "Guardar archivo", FileDialog.SAVE);
                fileDialog.setVisible(true);
                fileDialog.setLocationRelativeTo(null);

                if (fileDialog.getFile() != null) {
                    rutaa = fileDialog.getDirectory() + fileDialog.getFile() + ".txt";
                    setTitle(rutaa);
                }
                try {
                    FileWriter fileWriter = new FileWriter(rutaa);
                    fileWriter.write(mostrar.getText());
                    setTitle(fileDialog.getFile() + ".txt");
                    fileWriter.close();
                    JOptionPane.showMessageDialog(null, "Guardado con exito");
                } catch (IOException e) {
                    System.out.println("No");
                }
     }
     
     
     
    
     

    /**
     * Creates new form Visual
     */
    
    public Visual() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ruta = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        guardarComo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrar = new javax.swing.JTextArea();
        buscar = new javax.swing.JButton();
        mostrarp = new javax.swing.JButton();
        lbl_palabras = new javax.swing.JLabel();
        lbl_a = new javax.swing.JLabel();
        lbl_e = new javax.swing.JLabel();
        lbl_i = new javax.swing.JLabel();
        lbl_u = new javax.swing.JLabel();
        lbl_o = new javax.swing.JLabel();
        lbl_ultima = new javax.swing.JLabel();
        lbl_longitud = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_pletra = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_uletra = new javax.swing.JLabel();
        txt_murcielago = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaActionPerformed(evt);
            }
        });

        guardar.setText("Guardar Archivo");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        guardarComo.setText("Guardar Como");
        guardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarComoActionPerformed(evt);
            }
        });

        mostrar.setColumns(20);
        mostrar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        mostrar.setRows(5);
        jScrollPane1.setViewportView(mostrar);

        buscar.setText("Buscar Archivo");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        mostrarp.setText("Procesar");
        mostrarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarpActionPerformed(evt);
            }
        });

        lbl_palabras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl_a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl_e.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl_i.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl_u.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl_o.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl_ultima.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl_longitud.setBackground(new java.awt.Color(0, 0, 0));
        lbl_longitud.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setText("Repeticiones de E e");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setText("Repeticiones de U u");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setText("Repeticiones de I i");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setText("Repeticiones de O o");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setText("Repeticiones de A a");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setText("Longitud de texto");

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setText("Total de palabras");

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel8.setText("Ultima palabra");

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel9.setText("primera letra");

        lbl_pletra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel10.setText("ultima letra");

        lbl_uletra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setText("Murcielago");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mostrarp)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_palabras, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_ultima, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_pletra, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_uletra, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(178, 178, 178)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_i, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_e, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_o, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_a, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_u, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(txt_murcielago, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(guardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                .addComponent(guardarComo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(656, 656, 656)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardarComo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_murcielago)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(lbl_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mostrarp)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_a, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_e, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_i, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_o, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_u, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(lbl_palabras, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(lbl_ultima, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_pletra, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lbl_uletra, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaActionPerformed
       llamarArchivo(); 
    }//GEN-LAST:event_rutaActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        guardarArchivo();
    }//GEN-LAST:event_guardarActionPerformed

    private void guardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarComoActionPerformed
        guardarComoArchivos();
    }//GEN-LAST:event_guardarComoActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        llamarArchivo();
    }//GEN-LAST:event_buscarActionPerformed

    private void mostrarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarpActionPerformed
        String palabrass=mostrar.getText();
        StringTokenizer st=new StringTokenizer(palabrass);
        lbl_palabras.setText(""+st.countTokens());
        while(st.hasMoreElements()){
        lbl_ultima.setText(st.nextToken());
        }
        lbl_longitud.setText(String.valueOf(palabrass.length()));
        int ule= Integer.valueOf(lbl_longitud.getText());
        lbl_pletra.setText(String.valueOf(palabrass.charAt(0)));
        lbl_uletra.setText(String.valueOf(ule));
        
      
         int contA=contarvocal(mostrar.getText(),'A');
         int conta=contarvocal(mostrar.getText(),'a');
         int contaA=contA+conta;
         lbl_a.setText(String.valueOf(contaA));
         
         int contE=contarvocal(mostrar.getText(),'E');
         int conte=contarvocal(mostrar.getText(),'e');
         int conteE=contE+conte;
         lbl_e.setText(String.valueOf(conteE));
         
         int contI=contarvocal(mostrar.getText(),'I');
         int conti=contarvocal(mostrar.getText(),'i');
         int contiI=contI+conti;
         lbl_i.setText(String.valueOf(contiI));
         
         int contO=contarvocal(mostrar.getText(),'O');
         int conto=contarvocal(mostrar.getText(),'o');
         int contoO=contO+conto;
         lbl_o.setText(String.valueOf(contoO));
         
         int contU=contarvocal(mostrar.getText(),'U');
         int contu=contarvocal(mostrar.getText(),'u');
         int contuU=contU+contu;
         lbl_u.setText(String.valueOf(contuU));
         
         
         
    }//GEN-LAST:event_mostrarpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
       
        
    }//GEN-LAST:event_jButton1ActionPerformed
public static int contarvocal(String mostrar, char caracter){
int posicion=0;
int conta=0;
posicion=mostrar.indexOf(caracter);
while(posicion!=-1){
conta++;
posicion=mostrar.indexOf(caracter,posicion+1);

}     return conta;
}

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Visual().setVisible(true);
        });
    }
    
   public void mur(){
   
   String palabrasss=mostrar.getText();
 
   //Pueden utilizar BufferedReader o Sacanner! Recomienfo Buffered Reader
Scanner sc = new Scanner(mostrar.getText());

String frase = sc.nextLine();
 

//Sentencia for aninidada de if en la cual comprobaremos la cadena de texto enviada!
for(int i=0; i<frase.length(); i++)
{

//Con estos if comprobamos las letras que se ingresan
if(frase.charAt(i)=='M' || frase.charAt(i)=='m')
{

txt_murcielago.setText("0");
}
else if(frase.charAt(i)=='U' || frase.charAt(i)=='u')
{
txt_murcielago.setText("1");
}
else if(frase.charAt(i)=='R' || frase.charAt(i)=='r')
{
txt_murcielago.setText("2");
}
else if(frase.charAt(i)=='C' || frase.charAt(i)=='c')
{
txt_murcielago.setText("3");
}
else if(frase.charAt(i)=='I' || frase.charAt(i)=='i')
{
txt_murcielago.setText("4");
}
else if(frase.charAt(i)=='E' || frase.charAt(i)=='e')
{
txt_murcielago.setText("5");
}
else if(frase.charAt(i)=='L' || frase.charAt(i)=='l')
{
txt_murcielago.setText("6");
}
else if(frase.charAt(i)=='A' || frase.charAt(i)=='a')
{
txt_murcielago.setText("7");
}
else if(frase.charAt(i)=='G' || frase.charAt(i)=='g')
{
txt_murcielago.setText("8");
}
else if(frase.charAt(i)=='O' || frase.charAt(i)=='o')
{
txt_murcielago.setText("9");
}
else
{
txt_murcielago.setText(String.valueOf(frase.charAt(i)));
}


}
 

}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton guardar;
    private javax.swing.JButton guardarComo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_a;
    private javax.swing.JLabel lbl_e;
    private javax.swing.JLabel lbl_i;
    private javax.swing.JLabel lbl_longitud;
    private javax.swing.JLabel lbl_o;
    private javax.swing.JLabel lbl_palabras;
    private javax.swing.JLabel lbl_pletra;
    private javax.swing.JLabel lbl_u;
    private javax.swing.JLabel lbl_uletra;
    private javax.swing.JLabel lbl_ultima;
    private javax.swing.JTextArea mostrar;
    private javax.swing.JButton mostrarp;
    private javax.swing.JTextField ruta;
    private javax.swing.JTextField txt_murcielago;
    // End of variables declaration//GEN-END:variables

    private void setTitle(File archivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Switch(String variable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
