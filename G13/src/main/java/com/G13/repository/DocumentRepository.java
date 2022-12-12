package com.G13.repository;

import com.G13.domain.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Integer> {
    Document findFirst1ByCreatedByAndFileNameOrderByCreatedDateDesc(String CreatedBy, String FileName);
    Document findDocumentById(int Id);
}