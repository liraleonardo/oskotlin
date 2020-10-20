package br.com.oskotlin.models


import lombok.Data
import org.hibernate.validator.constraints.br.CPF
import javax.persistence.*
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull


@Table(schema = "oskotlin", name = "client")
@Entity
@Data
class Client{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private var id:Long?=null

        @NotNull
        @NotBlank(message = "Nome nao pode ficar vazio")
        var name:String?=null

        var phoneNumber: String?=null

        @NotNull
        @NotBlank
        @Email(message="Email invalido")
        var email: String?=null

        @NotNull
        @NotBlank
        var cpf: String?=null
}
