package mx.com.gm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@RestController //clase de controlador sin esto no reconoce la clase spring
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio() {
        log.info("Ejectuado rest aaaaaaa");
        log.info("Mas detalles del controlador");
        return "Hola mundo con Omar 2";
    }
}
