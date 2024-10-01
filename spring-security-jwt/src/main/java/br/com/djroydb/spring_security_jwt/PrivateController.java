package br.com.djroydb.spring_security_jwt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("private")
public class PrivateController {

    @GetMapping()
    public String getMessage() {
        return new String("Hallo from private API controller");
    }

}
