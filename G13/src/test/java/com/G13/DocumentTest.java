package com.G13;

import com.G13.domain.Document;
import com.G13.repo.DocumentRepository;
import com.G13.service.DocumentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class DocumentTest {
    @Mock
    DocumentRepository documentRepository;
    @InjectMocks
    DocumentService documentService;
    @BeforeEach
    void addData(){
        Document document = new Document();
        document.setId(1);
        document.setLink("/doc");
        document.setCreatedBy("hoan@gmail.com");
        document.setFileName("giay_phep_lai_xe");
        when(documentRepository.findFirst1ByCreatedByAndFileNameOrderByCreatedDateDesc(document.getCreatedBy(),
                document.getFileName())).thenReturn(document);
        when(documentRepository.findDocumentById(1)).thenReturn(document);


    }

    //test save document
    @Test
    void testSaveDocumentSuccess(){
        Document document = new Document();
        document.setId(1);
        document.setLink("/doc");
        document.setCreatedBy("hoan@gmail.com");
        document.setFileName("giay_phep_lai_xe");
        when(documentRepository.saveAndFlush(document)).thenReturn(document);
        Document ActualDocSave = documentService.SaveDocument(document);

        assertThat(ActualDocSave.getId()).isEqualTo(1);

    }
    @Test
    void testSaveDocumentWithoutLink(){
        Document document = new Document();
        document.setCreatedBy("hoan@gmail.com");
        document.setFileName("giay_phep_lai_xe");
        Document ActualDocSave = documentService.SaveDocument(document);
        assertThat(ActualDocSave).isEqualTo(null);

    }



    //test get doc by id
    @Test
    void testGetDocByIdFound(){
        int ExpectId = 1;
        Document AcutalDoc = documentService.GetDocById(ExpectId);
        assertThat(AcutalDoc.getId()).isEqualTo(ExpectId);
    }
    @Test
    void testGetDocByIdNotFound(){
        int ExpectId = 2;
        Document AcutalDoc = documentService.GetDocById(ExpectId);
        assertThat(AcutalDoc).isEqualTo(null);
    }


    //test get documetn by createby and file name
    @Test
    void testGetDocumentByCreateByAndFileNameFound(){
        String createByExpect = "hoan@gmail.com";
        String filenameExpect = "giay_phep_lai_xe";
        Document AcutalDoc = documentService.GetDocumentByCreateByAndFileName(createByExpect,filenameExpect);
        assertThat(AcutalDoc.getCreatedBy()).isEqualTo(createByExpect);
        assertThat(AcutalDoc.getFileName()).isEqualTo(filenameExpect);
    }
    @Test
    void testGetDocumentByCreateByAndFileNameWithfilenameNotFound(){
        String createByExpect = "hoan@gmail.com";
        String filenameExpect = "giay_phep";
        Document AcutalDoc = documentService.GetDocumentByCreateByAndFileName(createByExpect,filenameExpect);
        assertThat(AcutalDoc).isEqualTo(null);
    }
    @Test
    void testGetDocumentByCreateByAndFileNameWithCreateByNotFound(){
        String createByExpect = "hoan@gmail.com1";
        String filenameExpect = "giay_phep_lai_xe";
        Document AcutalDoc = documentService.GetDocumentByCreateByAndFileName(createByExpect,filenameExpect);
        assertThat(AcutalDoc).isEqualTo(null);
    }
}
