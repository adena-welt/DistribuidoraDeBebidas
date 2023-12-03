package ifsuldeminas.bcc.PrimeiroProjeto.Model.Repository;

import ifsuldeminas.bcc.PrimeiroProjeto.Model.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}