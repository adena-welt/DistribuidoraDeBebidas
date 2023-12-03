package ifsuldeminas.bcc.PrimeiroProjeto.Model.Repository;

import ifsuldeminas.bcc.PrimeiroProjeto.Model.Entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
}
