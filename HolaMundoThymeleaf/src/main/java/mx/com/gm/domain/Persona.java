package mx.com.gm.domain;

import lombok.Data;
//ojo muy util
@Data //para no hacerlo manualmente los getters and setters y lo genera automaticamente 
public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    
}
