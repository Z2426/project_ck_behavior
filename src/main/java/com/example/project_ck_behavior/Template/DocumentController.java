package com.example.project_ck_behavior.Template;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentController {
    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping("/documents")
    public ResponseEntity<String> createAndPublishDocument() {
        documentService.createAndPublishDocument();
        return ResponseEntity.ok("Document created and published successfully");
    }
}
