package com.nova.app.services;

import com.nova.app.models.Content;

import java.util.List;

public interface ContentService {
    void saveContent(Content content);

    List<Content> getAllContent();
}
