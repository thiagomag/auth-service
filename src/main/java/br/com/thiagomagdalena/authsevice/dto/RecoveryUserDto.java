package br.com.thiagomagdalena.authsevice.dto;

import br.com.thiagomagdalena.authsevice.entity.Role;

import java.util.List;

public record RecoveryUserDto(

        Long id,
        String email,
        List<Role> roles

) {
}
