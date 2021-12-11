package br.com.sprint3.sprint3.repositories;

import java.util.List;
import java.util.Optional;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sprint3.sprint3.estado.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer>{

	List<Estado> findByNome(@NotNull @NotEmpty @Length(max = 50) String nome);

	Optional<Estado> findById(@Range(min = 1) int id);	
}
