import java.io.File;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.text.JTextComponent;

public class Directorio {
    JFileChooser selecFile;
    private File file;
    private final String[] options;
    private final String title;
    private final String extension;
    private final JFrame jFrame;
    private final JTextComponent jTextComponent;
    private List<String> allowedExtensions;


    public Directorio(File file, String[] options, String title, String extension, JFrame jFrame, JTextComponent jTextComponent) {
        this.file = file;
        this.options = options;
        this.title = title;
        this.extension = extension;
        this.jFrame = jFrame;
        this.jTextComponent = jTextComponent;
    }

   
}

