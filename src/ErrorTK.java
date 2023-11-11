public class ErrorTK {
    String tipo ;
    String descripcion;
    int linea;
    int column;

    public ErrorTK(String tipo, String descripcion, int linea, int column) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.linea = linea;
        this.column = column;
    }

    @Override
    public String toString() {
        return "ErrorTK{" + "tipo=" + tipo + ", descripcion=" + descripcion + ", linea=" + linea + ", column=" + column + '}';
    }
    
    
}
