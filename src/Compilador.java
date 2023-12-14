
import com.formdev.flatlaf.FlatIntelliJLaf;
import compilerTools.CodeBlock;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import compilerTools.Directory;
import compilerTools.ErrorLSSL;
import compilerTools.Functions;
import compilerTools.Grammar;
import compilerTools.Production;
import compilerTools.TextColor;
import compilerTools.Token;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author yisus
 */
public class Compilador extends javax.swing.JFrame {

    private String title;
    private Directory directorio;
    private ArrayList<Token> tokens;
    private ArrayList<ErrorLSSL> errors;
    private ArrayList<ErrorTK> te;
    
    private ArrayList<TextColor> textsColor;
    private Timer timerKeyReleased;
    private ArrayList<Production> identProd;
    private HashMap<String, String> identificadores;
     private HashMap<String, ArrayList<Integer>> identificadores1;//Definimos un hashmap que almacena nuestros identificadores
    private boolean codeHasBeenCompiled = false;
    int sum = 1;//Definimos nuestra variable sum como 1 que nos servira para la tabla de simbolos
    int sum2=2;
    /**
     * Creates new form Compilador
     */
    
    public Compilador() {
        initComponents();
        init();
        jScrollPane1.setRowHeaderView(new TextLineNumber(jtpCode));
    }
    
    private void init() {
        title = "Syntatic";
        setLocationRelativeTo(null);
        setTitle(title);
        directorio = new Directory(this, jtpCode, title,".comp");
        addWindowListener(new WindowAdapter() {// Cuando presiona la "X" de la esquina superior derecha
            @Override
            public void windowClosing(WindowEvent e) {
                directorio.Exit();
                System.exit(0);
            }
        });
        Functions.setLineNumberOnJTextComponent(jtpCode);//Esta funcion permite que se muestre la linea de codigo eb nuestro JTextPane
        timerKeyReleased = new Timer((int) (1000 * 0.5), (ActionEvent e) -> { //Se inicializa el timer para colorear el codigo
            timerKeyReleased.stop(); //Se detiene la ejecucion del timer
            colorAnalysis(); //Llama el metodo para analizar el color
        });
        Functions.insertAsteriskInName(this, jtpCode, () -> { //Coloca un asterisco en el nombre de nuestra ventana siempre que se edite codigo
            timerKeyReleased.restart(); //el timer se reinicia
        });
        tokens = new ArrayList<>();
        errors = new ArrayList<>();
        te = new ArrayList<>();
        textsColor = new ArrayList<>();
        identProd = new ArrayList<>();
        identificadores = new HashMap<>();
        identificadores1 = new HashMap<>();
        Functions.setAutocompleterJTextComponent(new String[]{}, jtpCode, () -> {
            timerKeyReleased.restart();
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        buttonsFilePanel = new javax.swing.JPanel();
        btnAbrir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnGuardarC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpCode = new javax.swing.JTextPane();
        panelButtonCompilerExecute = new javax.swing.JPanel();
        btnCompilar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Consola = new javax.swing.JTextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTokens = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblTS = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        producciones = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        buttonsFilePanel.setBackground(new java.awt.Color(255, 255, 255));

        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnGuardarC.setText("Guardar como");
        btnGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsFilePanelLayout = new javax.swing.GroupLayout(buttonsFilePanel);
        buttonsFilePanel.setLayout(buttonsFilePanelLayout);
        buttonsFilePanelLayout.setHorizontalGroup(
            buttonsFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsFilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbrir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarC)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        buttonsFilePanelLayout.setVerticalGroup(
            buttonsFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsFilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrir)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnGuardarC))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jtpCode);

        panelButtonCompilerExecute.setBackground(new java.awt.Color(255, 255, 255));

        btnCompilar.setText("Compilar");
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });

        jButton1.setText("Analizador Lexico");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonCompilerExecuteLayout = new javax.swing.GroupLayout(panelButtonCompilerExecute);
        panelButtonCompilerExecute.setLayout(panelButtonCompilerExecuteLayout);
        panelButtonCompilerExecuteLayout.setHorizontalGroup(
            panelButtonCompilerExecuteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonCompilerExecuteLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCompilar)
                .addGap(36, 36, 36))
        );
        panelButtonCompilerExecuteLayout.setVerticalGroup(
            panelButtonCompilerExecuteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonCompilerExecuteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelButtonCompilerExecuteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCompilar)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Consola.setEditable(false);
        Consola.setBackground(new java.awt.Color(255, 255, 255));
        Consola.setColumns(20);
        Consola.setRows(5);
        jScrollPane2.setViewportView(Consola);

        tblTokens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Componente léxico", "Lexema", "[Línea, Columna]"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTokens.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tblTokens);

        jTabbedPane1.addTab("Tabla Lexia", jScrollPane3);

        tblTS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Posicion", "Lexema", "Referencias"
            }
        ));
        jScrollPane4.setViewportView(tblTS);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tabla de Simbolos", jPanel1);

        producciones.setColumns(20);
        producciones.setRows(5);
        jScrollPane5.setViewportView(producciones);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jTabbedPane1.addTab("Sintactico", jPanel2);

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addComponent(buttonsFilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelButtonCompilerExecute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPane1)))
                .addGap(12, 12, 12))
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonsFilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelButtonCompilerExecute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );

        getContentPane().add(rootPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        directorio.New();
        clearFields();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        if (directorio.Open()) {
            colorAnalysis();
            clearFields();
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (directorio.Save()) {
            clearFields();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCActionPerformed
        if (directorio.SaveAs()) {
            clearFields();
        }
    }//GEN-LAST:event_btnGuardarCActionPerformed

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
        if (getTitle().contains("*") || getTitle().equals(title)) {
            if (directorio.Save()) {
                compile();
            }
        } else {
            compile();
        }
        
        sum = 1;//Se vuelve a colocar la variable sum igual a 1
    }//GEN-LAST:event_btnCompilarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clearFields(); //Se llama al metodo clearfields
        lexicalAnalysis();
        fillTableTokens(); //Se llama al metodo filltabletokens
       fillTableSimbols(); //Se llama al metodo filltablesimbols
        printConsole(); //Se llama al metodo printConsole
         //syntacticAnalysis();
        codeHasBeenCompiled = true; //la variable codehasbeencompiled se coloca en false
        sum = 1; //Se vuelve a colocar la variable sum igual a 1 
    }//GEN-LAST:event_jButton1ActionPerformed

  
    private void lexicalAnalysis() {
        // Extraer tokens
        Lexer lexer;
        try {
            File codigo = new File("code.encrypter");
            FileOutputStream output = new FileOutputStream(codigo);
            byte[] bytesText = jtpCode.getText().getBytes();
            output.write(bytesText);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(new FileInputStream(codigo), "UTF8"));
            lexer = new Lexer(entrada);
            
            while (true) {
                Token token = lexer.yylex();
                if (token == null) {
                    te = lexer.getTablaError();
                    System.out.println("Termino");
                    break;
                }
                tokens.add(token);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no pudo ser encontrado... " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo... " + ex.getMessage());
        }
    }
       
    private void syntacticAnalysis() {
       Grammar gramatica = new Grammar(tokens, errors);
        /* Mostrar gramáticas */
        /*Eliminacion de Errores*/
        gramatica.delete(new String[]{"ERROR","ERROR_ID","ERROR_NUM"},1);
        /*Agrupacion de valores*/
        gramatica.group("VALOR","(NÚMERO)",true);
        
        /*-----------------------------------------------------------------------*/
        /*DECLARACION DE LOS TERMINALES*/
        gramatica.group("TERMINALES","TERMINAL INDENTIFICADOR PUNTO_Y_COMA",true);
        /*Errores*/
        gramatica.group("ERRORTERMINALES","TERMINAL PUNTO_Y_COMA",true,2,
                "ERROR SINTACTICO {}: FALTA EL 'INDENTIFICADOR' EN LA SENTENCIA [#, %]");
        gramatica.group("ERRORTERMINALES","TERMINAL INDENTIFICADOR ",true,3,
                "ERROR SINTACTICO {}: FALTA EL ';' EN LA SENTENCIA [#, %]");
        /*-------------------------------------------------------------------------*/
        /*DECLARACION DE LOS NOTERMINALES*/
        gramatica.group("NOTERMINALES","NOTERMINAL INDENTIFICADOR PUNTO_Y_COMA",true);
        /*ERRORES*/
        gramatica.group("ERRORNOTERMINALES","NOTERMINAL INDENTIFICADOR PUNTO_Y_COMA",true,2,
                "ERROR SINTACTICO {}: FALTA EL 'INDENTIFICADOR' EN LA SENTENCIA [#, %]");
        gramatica.group("ERRORNOTERMINALES","NOTERMINAL INDENTIFICADOR ",true,3,
                "ERROR SINTACTICO {}: FALTA ';' EN LA SENTENCIA [#, %]");
        
        /*-------------------------------------------------------------------------*/
        /*iNDETIFICADORES NO DECLARADOS*/
        //gramatica.group("NODECLARADO","INDENTIFICADOR ",true,4,"INDETIFICAROR NO DECLARADO EN LA SENTENCIA [#, %]");
        gramatica.delete("INDENTIFICADOR PUNTO_Y_COMA",5,"INDETIFICAROR NO DECLARADO EN LA SENTENCIA [#, %]");
        //gramatica.group("DECLARACIONVACIA","PUNTO_Y_COMA",true,6,"DECLARACIÓN VACÍA ';' EN LA SENTENCIA [#, %]");
        /*----------------------------------------------------------------*/
         
        /* Eliminacion Tipos de Datos y operadores de asignacion */
        gramatica.delete("TERMINAL", 7, 
                "ERROR SINTACTICO {}: El TERMINAL no se encuentra en una declaración [#, %]");
        gramatica.delete("NOTERMINAL", 7, 
                "ERROR SINTACTICO {}: El NO TERMINAL no se encuentra en una declaración [#, %]");
        /*--------------------------------------------------------------------------*/
        /*CONUNTO*/
        gramatica.group("PARAMETROS", "Corchete_Apertura (VALOR (COMA VALOR)+) Corchete_Clausura",true);
        gramatica.group("PARAMETROS", " (VALOR (COMA VALOR)+) Corchete_Clausura",true,7,
                "ERROR SINTACTICO {}: NO HAY CORCHETE DE APERTURA '[' EN LA SENTENCIA [#, %]");
        gramatica.group("PARAMETROS", "Corchete_Apertura (VALOR (COMA VALOR)+)",true,7,
                "ERROR SINTACTICO {}: NO HAY CORCHETE DE CIERRE ']' EN LA SENTENCIA [#, %]");
        gramatica.group("CONJUNTOS", "CONJUNTO INDENTIFICADOR Igual PARAMETROS PUNTO_Y_COMA",true);
        gramatica.group("CONJUNTOS", "CONJUNTO INDENTIFICADOR Igual PARAMETROS",true,3,
                "ERROR SINTACTICO {}: FALTA EL ';' EN LA SENTENCIA [#, %]");
        gramatica.group("CONJUNTOS", "CONJUNTO Igual PARAMETROS",true,2,
                "ERROR SINTACTICO {}: FALTA EL 'IDENTIFICADOR' EN LA SENTENCIA [#, %]");
        
        
        /*--------------------------------------------------------------------------*/
        /*gramatica Estructura Gramar*/
         gramatica.loopForFunExecUntilChangeNotDetected(() -> {  
        gramatica.group("SENTENCIAS", 
                "INDENTIFICADOR Produccion (INDENTIFICADOR | (INDENTIFICADOR OP_LOG_OR INDENTIFICADOR) | (Corchete_Apertura (INDENTIFICADOR)+ Corchete_Clausura)"
                        + "|(INDENTIFICADOR Parentesis_Apertura CADENA_TEXTO Parentesis_Clausura) | (INDENTIFICADOR Parentesis_Apertura (CADENA_TEXTO OP_LOG_OR CADENA_TEXTO)* Parentesis_Clausura) "
                        + "|(INDENTIFICADOR Parentesis_Apertura (CADENA_TEXTO OP_LOG_OR CADENA_TEXTO)+ Parentesis_Clausura INDENTIFICADOR)"
                        + "| (INDENTIFICADOR Parentesis_Apertura Parentesis_Apertura (CADENA_TEXTO OP_LOG_OR CADENA_TEXTO)+ Parentesis_Clausura INDENTIFICADOR Parentesis_Clausura))PUNTO_Y_COMA",true);
        });
        gramatica.loopForFunExecUntilChangeNotDetected(() -> {
        gramatica.group("ESTRUCTURA_GRAMAR", 
                "PALABRA_RESERVADA INDENTIFICADOR Llave_Apertura (SENTENCIAS)+ Llave_Clausura",true);
         });
        /*--------------------------------------------------------------------------*/
         /*IMPRIMIR*/
          gramatica.group("MENSAJE_IMPRIMIR", "PRINT Parentesis_Apertura INDENTIFICADOR Parentesis_Clausura PUNTO_Y_COMA" );
        
        gramatica.show();
        producciones.append(gramatica+"");
        
        /*ESTRUCTURA DEL PROGRAMA*/
        gramatica.loopForFunExecUntilChangeNotDetected(() -> {
          gramatica.group("ESTRUCTURA_PROGRAMA", 
                "PALABRA_RESERVADA PALABRA_RESERVADA INDENTIFICADOR Llave_Apertura ((TERMINALES |NOTERMINALES)+ (ESTRUCTURA_GRAMAR)+)? Llave_Clausura",true);  
         });
    }

   
    private void colorAnalysis() {
        /* Limpiar el arreglo de colores */
        textsColor.clear();
        /* Extraer rangos de colores */
        LexerColor lexerColor;
        try {
            File codigo = new File("color.encrypter");
            FileOutputStream output = new FileOutputStream(codigo);
            byte[] bytesText = jtpCode.getText().getBytes();
            output.write(bytesText);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(new FileInputStream(codigo), "UTF8"));
            lexerColor = new LexerColor(entrada);
            while (true) {
                TextColor textColor = lexerColor.yylex();
                if (textColor == null) {
                    break;
                }
                textsColor.add(textColor);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no pudo ser encontrado... " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo... " + ex.getMessage());
        }
        Functions.colorTextPane(textsColor, jtpCode, new Color(40, 40, 40));
    }

    private void printConsole() {
         int sizeErrores = errors.size(); //se guarda en esta variable la cantidad de errores
        if (sizeErrores > 0) { //se crea un if donde la cantidad de errores es cero se ejecuta
            Functions.sortErrorsByLineAndColumn(errors); //se ejecuta la funcion y ordena los errores por num de linea y columna
            String cadErrores = " \n"; //se guardan todos nuestros errores en esta variable
            for (ErrorLSSL error : errors) { //se crea un for donde se recorren todos los errores
                String cadError = String.valueOf(error); //convertimos el valor a cadena y lo almacenamos en la variable
                cadErrores += cadError + "\n"; //vamos acumulando los errores
            }
            Consola.setText("Compilacion Conculida\nSe encontraron los siguientes errores: " + cadErrores + "\n"); //se imprime en la salida los errores y los errores encontrados
        } else {
            Consola.setText("Compilación Concluida"); //se imprime en la salida que se compilo todo sin errores
        }
        Consola.setCaretPosition(0); //se posiciona el texto de salida
        
       /* int sizelex = te.size();
        if ( sizelex > 0) {
           Functions.sortErrorsByLineAndColumn(errors);
            String strErrors = "\n";
            
               for (ErrorTK elemento : te) {
                   String strError = String.valueOf(elemento);
                strErrors += strError + "\n";
            System.out.println("- " + elemento);
        }
            Consola.setText("Compilación terminada...\n" + strErrors + "\nLa compilación terminó con errores...");
        } else {
            Consola.setText("Compilación terminada...\n");    
        }
        Consola.setCaretPosition(0);*/
    }

    private void clearFields() {
        Functions.clearDataInTable(tblTokens);
        Functions.clearDataInTable(tblTS); //se limpia la tabla de simbolos
        Consola.setText("");
        tokens.clear();
        errors.clear();
        identProd.clear();
        identificadores.clear();
        identificadores1.clear();
        codeHasBeenCompiled = false;
        producciones.setText("");
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatIntelliJLaf());
            } catch (UnsupportedLookAndFeelException ex) {
                System.out.println("LookAndFeel no soportado: " + ex);
            }
            new Compilador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Consola;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCompilar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarC;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JPanel buttonsFilePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane jtpCode;
    private javax.swing.JPanel panelButtonCompilerExecute;
    private javax.swing.JTextArea producciones;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JTable tblTS;
    private javax.swing.JTable tblTokens;
    // End of variables declaration//GEN-END:variables

     private void compile() {
        clearFields();
        lexicalAnalysis();
        fillTableTokens();
        fillTableSimbols();
        syntacticAnalysis();
        printConsole();
        codeHasBeenCompiled = true;
    }
    
    
    
    private void fillTableTokens() {
        tokens.forEach(token -> {
            Object[] data = new Object[]{
                token.getLexicalComp(), token.getLexeme(), "[" + token.getLine() + ", " + token.getColumn() + "]"};
            Functions.addRowDataInTable(tblTokens, data);
        });
    }
    private void fillTableSimbols() {
        tokens.forEach(token -> {
            Object[] data = new Object[]{
                sum, token.getLexeme(),"" //ajustamos nuestras columnas, 1er pos. es el componente lexico, la 2da el lexema y la 3er la linea y columna
            };

            if (token.getLexicalComp() == "INDENTIFICADOR") {

                if(identificadores1.get(token.getLexeme())==null){
                    identificadores1.put(token.getLexeme(), new ArrayList<>());
                    identificadores1.get(token.getLexeme()).add(token.getLine());
                }else{
                          identificadores1.get(token.getLexeme()).add(token.getLine());
                }
                String s = data[1].toString(); //aqui obtienes el lexema de la nueva fila a introducir 
                boolean exist = false;
                for (int i = 0; i < tblTS.getRowCount(); i++) { //se crea un for para todas las filas de la tabla de simbolos
                    s = tblTS.getValueAt(i, 1).toString();//el lexema de la fila i-esima
                    data[2]=identificadores1.get(token.getLexeme()).toString();

                    if (token.getLexeme().equals(s)) { //se crea un if donde si el lexema obtenido es igual a s
                        exist = true; //se retorna que existe
                        data[2] = identificadores1.get(token.getLexeme()).toString(); //se agregan todas las referencias a la columna 3
                        break; //se detiene el proceso
                    }

                }
                if (!exist) { //se crea otro if donde es el caso contrario

                    data[2] = identificadores1.get(token.getLexeme()).toString(); //se agregan todas las referencias a la columna 3
                    Functions.addRowDataInTable(tblTS, data);
                    sum++;//la variable sub aumenta en 1
                }

            }

        });
        System.out.print(identificadores1.toString());
    }



}
     
