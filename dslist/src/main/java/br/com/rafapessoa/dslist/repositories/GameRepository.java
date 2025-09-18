package br.com.rafapessoa.dslist.repositories;

import br.com.rafapessoa.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
