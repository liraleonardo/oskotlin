package br.com.oskotlin.resource


import br.com.oskotlin.models.Client
import br.com.oskotlin.repository.ClientRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import javax.validation.ConstraintViolation
import javax.validation.Valid


@RestController
@RequestMapping("/client")
class ClientResource {

    @Autowired
    val repository: ClientRepository? = null


    @GetMapping
    fun findall():List<Client>{
        return repository!!.findAll()
    }

    @PostMapping
    fun save(@Valid @RequestBody client: Client):Client{
        return repository!!.save(client)
    }

}