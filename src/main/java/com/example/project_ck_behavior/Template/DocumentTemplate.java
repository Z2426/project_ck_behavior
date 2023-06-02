package com.example.project_ck_behavior.Template;

public abstract class DocumentTemplate {
    public void createDocument() {
        System.out.println("Tạo tài liệu");
    }

    public abstract void exportDocument();
}