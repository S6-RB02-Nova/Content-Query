package com.nova.app.repos;

import com.nova.app.models.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepo extends JpaRepository<Content, Long> {
}
