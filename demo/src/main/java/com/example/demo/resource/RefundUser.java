// Controlador dos usuários
package com.example.demo.resource;

import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class RefundUser {

    @GetMapping
    public String listar(){
        return "Hello World!";
    }

    /** @PostMapping(value = "salvar")
    @ResponseBody
    public ResponseEntity<User> salvar (@RequestBody User user){/* recebe os dados p/ salvar

        Usuario usuario = userRepository.save(usuario);

        return new ReponseEntity<User>(usuario, HttpStatus.CREATED)
    } **/
}
