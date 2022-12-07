package com.G13.service;

import com.G13.domain.Document;
import com.G13.repo.DocumentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class DocumentService {
    private final DocumentRepository documentRepository;
    public Document GetDocumentByCreateByAndFileName(String CreatedBy, String FileName){
        return documentRepository.findFirst1ByCreatedByAndFileNameOrderByCreatedDateDesc(CreatedBy,FileName);
    }
    public Document GetDocById(int id){
        return documentRepository.findDocumentById(id);
    }
    public Document SaveDocument(Document document){
        if(document.getLink()==null||document.getLink().equals("")){
            return null;
        }
        return documentRepository.saveAndFlush(document);
    }

}
