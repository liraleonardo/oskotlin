package br.com.oskotlin.models


import lombok.Data
import javax.persistence.*
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank


@Table(schema = "oskotlin", name = "client")
@Entity
@Data
class Client  {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private var id:Long?=null

        @NotBlank(message = "Nome nao pode ficar vazio")
        var name:String?=null

        var phoneNumber: String?=null

        @Email(message="Email invalido")
        var email: String?=null


}
