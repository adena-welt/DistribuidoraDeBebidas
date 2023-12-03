package ifsuldeminas.bcc.PrimeiroProjeto.Model.Repository;

import ifsuldeminas.bcc.PrimeiroProjeto.Model.Entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}