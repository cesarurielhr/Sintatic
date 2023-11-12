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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "ErrorTK{" + "tipo=" + tipo + ", descripcion=" + descripcion + ", linea=" + linea + ", column=" + column + '}';
    }
    
    
}
