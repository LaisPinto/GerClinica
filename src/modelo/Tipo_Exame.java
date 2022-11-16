package modelo;

/**
 *
 * @author laisp
 */
public class Tipo_Exame {
    private int id_tipo_exame;
    private String exame;

    public Tipo_Exame(){
        
    }
    
    public Tipo_Exame(int id_tipo_exame) {
        this.id_tipo_exame = id_tipo_exame;
    }

    public int getId_tipo_exame() {
        return id_tipo_exame;
    }

    public void setId_tipo_exame(int id_tipo_exame) {
        this.id_tipo_exame = id_tipo_exame;
    }

    public String getExame() {
        return exame;
    }

    public void setExame(String exame) {
        this.exame = exame;
    }
    
    
}
