package mx.com.gm;


import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller //clase de controlador sin esto no reconoce la clase spring
@Slf4j
public class ControladorInicio {
    @Value("${index.saludo}")
    private String saludo;
    
    @GetMapping("/")//indicamos el path para ejecutar el metodo del controlador
    public String inicio(Model model) {
        var mensaje = "hoola con thymleaf";
        
        var persona = new Persona();
        persona.setNombre("Omar");
        persona.setApellido("Mendez");
        persona.setEmail("mp19034@ues.edu.sv");
        persona.setTelefono("7502-3795");
        
        var persona2 = new Persona();
        persona2.setNombre("Valentinna");
        persona2.setApellido("Mendez");
        persona2.setEmail("ompaz7558@gmail.com");
        persona2.setTelefono("7502-3795");
        
        var personas = new ArrayList();
        
       // var personas = Arrays.asList(persona, persona2);
       
        log.info("Ejectuado Spring MVC aaaaaaa");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
       // model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        return "index";
    }
}
