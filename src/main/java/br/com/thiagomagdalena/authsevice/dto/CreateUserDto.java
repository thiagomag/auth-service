package br.com.thiagomagdalena.authsevice.dto;

import br.com.thiagomagdalena.authsevice.enums.RoleName;

import java.util.List;

public record CreateUserDto(

        String email,
        String password,
        List<RoleName> roles

) {
}
