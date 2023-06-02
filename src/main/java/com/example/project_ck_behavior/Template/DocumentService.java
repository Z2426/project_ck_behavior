package com.example.project_ck_behavior.Template;

import org.springframework.stereotype.Service;

@Service
public class DocumentService {
    public void createAndPublishDocument() {
        DocumentTemplate documentTemplate = new PDFDocumentTemplate();
        documentTemplate.createDocument();
        documentTemplate.exportDocument();
        System.out.println("Tài liệu đã được tạo và xuất bản thành công");
    }
}