package br.com.gustavo.gestao_vagas.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class CandidateEntity {

    private UUID uuid;
    private String name;

    @Email(message = "O campo (email) deve conter um endereço de email válido.")
    private String email;

    @NotBlank(message = "O campo (username) não pode estar em branco.")
    @Pattern(regexp = "^\\S+", message = "O campo (username) deve conter apenas letras e números, sem espaços em branco.")
    private String username;

    @Length(min = 5, max = 100)
    private String password;
    private String description;
    private String Curriculum;
}
