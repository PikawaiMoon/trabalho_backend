/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prova_backend;
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.Timer;
import java.awt.event.ActionEvent;


/**
 *
 * @author pedagogico
 */
public class NewJFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(NewJFrame.class.getName());

    /**
     * Creates new form ProvaBackEnd
     */
    public NewJFrame() {
        initComponents();
        
        addKeyListener(new KeyListener(){
         @Override
         public void keyPressed(KeyEvent e){
             Color corOriginal = btnQ.getBackground();
             
             if(e.getKeyCode() == KeyEvent.VK_Q){
                 System.out.println("Você apertou Q!");
                 btnQ.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "q";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnQ.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
               }else if(e.getKeyCode() == KeyEvent.VK_W){
                 System.out.println("Você apertou W!");
                 btnW.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "w";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnW.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_E){
                 System.out.println("Você apertou E!");
                 btnE.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "e";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnE.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_R){
                 System.out.println("Você apertou R!");
                 btnR.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "r";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnR.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_T){
                 System.out.println("Você apertou T!");
                 btnT.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "t";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnT.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_Y){
                 System.out.println("Você apertou Y!");
                 btnY.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "y";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnY.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_U){
                 System.out.println("Você apertou U!");
                 btnU.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "u";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnU.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_I){
                 System.out.println("Você apertou I!");
                 btnI.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "i";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnI.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_O){
                 System.out.println("Você apertou O!");
                 btnO.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "o";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnO.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_P){
                 System.out.println("Você apertou P!");
                 btnP.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "p";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnP.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_OPEN_BRACKET){
                 System.out.println("Você apertou OPEN BRACKET!");
                 btnAbreColch.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "[";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnAbreColch.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_CLOSE_BRACKET){
                 System.out.println("Você apertou CLOSE BRACKET!");
                 btnFechaColch.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "]";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnFechaColch.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_BACK_SLASH){
                 System.out.println("Você apertou BACK SLASH!");
                 btnBarra.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "/";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnBarra.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_A){
                 System.out.println("Você apertou A!");
                 btnA.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "a";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnA.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_S){
                 System.out.println("Você apertou S!");
                 btnS.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "s";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnS.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_D){
                 System.out.println("Você apertou D!");
                 btnD.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "d";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnD.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_F){
                 System.out.println("Você apertou F!");
                 btnF.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "f";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnF.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_G){
                 System.out.println("Você apertou G!");
                 btnG.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "g";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnG.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_H){
                 System.out.println("Você apertou H!");
                 btnH.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "h";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnH.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_J){
                 System.out.println("Você apertou J!");
                 btnJ.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "j";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnJ.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_K){
                 System.out.println("Você apertou K!");
                 btnK.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "k";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnK.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_L){
                 System.out.println("Você apertou L!");
                 btnL.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "l";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnL.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_SEMICOLON){
                 System.out.println("Você apertou SEMICOLON!");
                 btnDoisPontos.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += ":";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnDoisPontos.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_MINUS){
                 System.out.println("Você apertou MINUS!");
                 btnHifen.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "-";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnHifen.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_Z){
                 System.out.println("Você apertou Z!");
                 btnZ.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "z";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnZ.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_X){
                 System.out.println("Você apertou X!");
                 btnX.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "x";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnX.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_C){
                 System.out.println("Você apertou C!");
                 btnC.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "c";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnC.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_V){
                 System.out.println("Você apertou V!");
                 btnV.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "v";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnV.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_B){
                 System.out.println("Você apertou B!");
                 btnB.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "b";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnB.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_N){
                 System.out.println("Você apertou N!");
                 btnN.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "n";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnN.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_M){
                 System.out.println("Você apertou M!");
                 btnM.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "m";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnM.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_COMMA){
                 System.out.println("Você apertou COMMA!");
                 btnVirgula.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += ",";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnVirgula.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_PERIOD){
                 System.out.println("Você apertou PERIOD!");
                 btnPonto.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += ".";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnPonto.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_SLASH){
                 System.out.println("Você apertou SLASH!");
                 btnInterrog.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "?";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnInterrog.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_1){
                 System.out.println("Você apertou 1!");
                 btnN1.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "1";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnN1.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_2){
                 System.out.println("Você apertou 2!");
                 btnN2.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "2";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnN2.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_3){
                 System.out.println("Você apertou 3!");
                 btnN3.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "3";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnN3.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_4){
                 System.out.println("Você apertou 4!");
                 btnN4.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "4";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnN4.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_5){
                 System.out.println("Você apertou Z!");
                 btnN5.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "5";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnN5.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_6){
                 System.out.println("Você apertou Z!");
                 btnN1.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "6";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnN6.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_7){
                 System.out.println("Você apertou 7!");
                 btnN7.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "7";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnN7.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_8){
                 System.out.println("Você apertou 8!");
                 btnN8.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "8";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnN8.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_9){
                 System.out.println("Você apertou 9!");
                 btnN9.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "9";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnN9.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_0){
                 System.out.println("Você apertou 0!");
                 btnN0.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "0";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnN0.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_SPACE){
                 System.out.println("Você apertou Espaço!");
                 btnEspaço.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += " ";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnEspaço.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_DEAD_ACUTE){
                 System.out.println("Você apertou Acento Agudo!");
                 btnAcentoAgudo.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "'";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnAcentoAgudo.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_EQUALS){
                 System.out.println("Você apertou Igual!");
                 btnIgual.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "=";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnIgual.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }else if(e.getKeyCode() == KeyEvent.VK_BACK_QUOTE){
                 System.out.println("Você apertou Til!");
                 btnTio.setBackground(new java.awt.Color(255, 0, 0));
                 String txt = txtArea.getText();
                 txt += "~";
                 txtArea.setText(txt);
                 Timer timer = new Timer(1000, (ActionEvent evt) -> {
                     btnTio.setBackground(corOriginal);
                 });
                 timer.setRepeats(false);
                 timer.start();
             }
         }
         
         @Override
         public void keyReleased(KeyEvent e){
             
         }
         
         @Override
         public void keyTyped(KeyEvent e){
             
         }
        });
        setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnTio = new javax.swing.JButton();
        btnN3 = new javax.swing.JButton();
        btnN2 = new javax.swing.JButton();
        btnN1 = new javax.swing.JButton();
        btnN7 = new javax.swing.JButton();
        btnN6 = new javax.swing.JButton();
        btnN5 = new javax.swing.JButton();
        btnN4 = new javax.swing.JButton();
        btnN8 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnHifen = new javax.swing.JButton();
        btnN0 = new javax.swing.JButton();
        btnN9 = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnTab = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnBarra = new javax.swing.JButton();
        btnFechaColch = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnAbreColch = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        btnAcentoAgudo = new javax.swing.JButton();
        btnCaps = new javax.swing.JButton();
        btnDoisPontos = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnFlechaBaixo = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnVirgula = new javax.swing.JButton();
        btnFlechaCima = new javax.swing.JButton();
        btnFlechaEsquerda = new javax.swing.JButton();
        btnShift = new javax.swing.JButton();
        btnInterrog = new javax.swing.JButton();
        btnEspaço = new javax.swing.JButton();
        btnFlechaDireita = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        btnTio.setText("~");

        btnN3.setText("3");

        btnN2.setText("2");

        btnN1.setText("1");

        btnN7.setText("7");

        btnN6.setText("6");

        btnN5.setText("5");

        btnN4.setText("4");

        btnN8.setText("8");

        btnIgual.setText("=");

        btnHifen.setText("-");

        btnN0.setText("0");

        btnN9.setText("9");

        btnApagar.setText("backspace");
        btnApagar.addActionListener(this::btnApagarActionPerformed);

        btnR.setText("r");

        btnP.setText("p");

        btnE.setText("e");

        btnTab.setText("Tab");
        btnTab.addActionListener(this::btnTabActionPerformed);

        btnW.setText("w");

        btnI.setText("i");

        btnU.setText("u");

        btnY.setText("y");

        btnT.setText("t");

        btnO.setText("o");

        btnBarra.setText("/");
        btnBarra.addActionListener(this::btnBarraActionPerformed);

        btnFechaColch.setText("]");

        btnQ.setText("q");

        btnAbreColch.setText("[");
        btnAbreColch.addActionListener(this::btnAbreColchActionPerformed);

        btnD.setText("d");

        btnL.setText("l");

        btnS.setText("s");

        btnA.setText("a");

        btnJ.setText("j");

        btnH.setText("h");

        btnG.setText("g");

        btnF.setText("f");

        btnK.setText("k");

        btnEnter.setText("ENTER");

        btnAcentoAgudo.setText("´");

        btnCaps.setText("Caps");

        btnDoisPontos.setText(":");

        btnC.setText("c");

        btnPonto.setText(".");

        btnX.setText("x");

        btnFlechaBaixo.setText("v");
        btnFlechaBaixo.addActionListener(this::btnFlechaBaixoActionPerformed);

        btnZ.setText("z");

        btnM.setText("m");

        btnN.setText("n");

        btnB.setText("b");

        btnV.setText("v");

        btnVirgula.setText(",");

        btnFlechaCima.setText("^");

        btnFlechaEsquerda.setText("<");

        btnShift.setText("Shift");

        btnInterrog.setText("?");

        btnFlechaDireita.setText(">");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnShift, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnZ, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnV, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnM, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnInterrog, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(57, 57, 57)
                            .addComponent(btnFlechaCima, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnTio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnN1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnN2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnN3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnN4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnN5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnN6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnN7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnN8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnN9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnN0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHifen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCaps, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTab, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnQ, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnW, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnT, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnY, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnU, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnI, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnO, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAbreColch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFechaColch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnEspaço, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(57, 57, 57)
                                                .addComponent(btnFlechaEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnS, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnG, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnH, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnJ, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnK, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnDoisPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnAcentoAgudo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnFlechaBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnFlechaDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN0, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHifen, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQ, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnW, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnY, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnU, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnI, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnP, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbreColch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechaColch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTab, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCaps, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnS, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnG, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnH, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJ, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnK, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnL, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoisPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAcentoAgudo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShift, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZ, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnV, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnM, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInterrog, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFlechaCima, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFlechaEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFlechaBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEspaço, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFlechaDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnTabActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void btnAbreColchActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void btnBarraActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btnFlechaBaixoActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new NewJFrame().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnAbreColch;
    private javax.swing.JButton btnAcentoAgudo;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnBarra;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCaps;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnDoisPontos;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnEspaço;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnFechaColch;
    private javax.swing.JButton btnFlechaBaixo;
    private javax.swing.JButton btnFlechaCima;
    private javax.swing.JButton btnFlechaDireita;
    private javax.swing.JButton btnFlechaEsquerda;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnHifen;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnInterrog;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnN0;
    private javax.swing.JButton btnN1;
    private javax.swing.JButton btnN2;
    private javax.swing.JButton btnN3;
    private javax.swing.JButton btnN4;
    private javax.swing.JButton btnN5;
    private javax.swing.JButton btnN6;
    private javax.swing.JButton btnN7;
    private javax.swing.JButton btnN8;
    private javax.swing.JButton btnN9;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnShift;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnTab;
    private javax.swing.JButton btnTio;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnVirgula;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration                   
}
