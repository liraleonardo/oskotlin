package br.com.oskotlin.resource


import br.com.oskotlin.models.Client
import br.com.oskotlin.repository.ClientRepository
import br.com.oskotlin.service.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@RestController
@RequestMapping("/client")
class ClientResource {

    @Autowired
    val repository: ClientRepository? = null

    @Autowired
    val clientService: ClientService? = null

    @GetMapping
    fun findAll():List<Client>{
        return repository!!.findAll()
    }

    @GetMapping("/{id}")
    fun findOne(@PathVariable id: Long):ResponseEntity<Client>{
        return clientService!!.findOne(id)
    }

    @PostMapping
    fun save(@Valid @RequestBody client: Client):Client{
        return repository!!.save(client)
    }

    @PutMapping("/{id}")
    fun update(@Valid @PathVariable id:Long, @Valid @RequestBody client: Client): ResponseEntity<Client> {
        return clientService!!.update(id, client)
    }




}
