package br.com.oskotlin.service

import br.com.oskotlin.models.Client
import br.com.oskotlin.repository.ClientRepository
import org.springframework.beans.BeanUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.util.*

@Service
class ClientService{

    @Autowired
    val repository: ClientRepository? = null

    fun findOne(id: Long):ResponseEntity<Client> {

        if(!repository!!.existsById(id)){
            return ResponseEntity.notFound().build<Client>()
        }

        val clientExistent: Optional<Client> = repository!!.findById(id)
        val client:Client = clientExistent.get()

        return ResponseEntity.ok(client)
    }

    fun update(id: Long, client: Client):ResponseEntity<Client> {

        if(!repository!!.existsById(id)){
            return ResponseEntity.notFound().build<Client>()
        }

        val clientExistent: Optional<Client> = repository!!.findById(id)
        val clientUpdated:Client = clientExistent.get()
        BeanUtils.copyProperties(client, clientUpdated, "id")
        repository!!.save(clientUpdated)
        return ResponseEntity.ok(clientUpdated)
    }



}
