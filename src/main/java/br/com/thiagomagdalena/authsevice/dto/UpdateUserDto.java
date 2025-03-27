package br.com.thiagomagdalena.authsevice.dto;

public record UpdateUserDto(

        Long userId,
        String email,
        String password,
        Boolean passwordChangeAuthorized,
        Boolean emailChangeAuthorized

) {
}
