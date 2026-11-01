package ao.kafi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {

    @GetMapping("/api/ola")
    public String ola() {
        return "A API da Kafi Business está a funcionar!";
    }

    @GetMapping("/api/estado")
    public String status() {
        return "A API está a funcionar!";
    }

    @GetMapping("/api/versao")
    public String version() {
        return "API version 1.0!";
    }
}