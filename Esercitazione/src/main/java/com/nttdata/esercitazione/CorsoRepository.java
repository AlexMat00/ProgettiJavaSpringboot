package com.nttdata.esercitazione;

import com.nttdata.esercitazione.domain.Corso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorsoRepository extends JpaRepository<Corso, Long> {
}