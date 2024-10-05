package com.senac.api.useCases.EmailQueue.repository;

import com.senac.api.model.EmailQueue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailQueueRepository extends JpaRepository<EmailQueue, Long> {
}
