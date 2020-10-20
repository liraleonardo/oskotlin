package br.com.oskotlin.repository

import br.com.oskotlin.models.Client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientRepository : JpaRepository<Client, Long> {
//    @Query("select c from Client c")
//    override fun findAll(): List<Client>

}
