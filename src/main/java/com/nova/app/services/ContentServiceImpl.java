package com.nova.app.services;

import com.nova.app.models.Content;
import com.nova.app.repos.ContentRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class ContentServiceImpl implements ContentService {
    private final ContentRepo contentRepo;

    @Override
    public void saveContent(Content content) {
        contentRepo.save(content);
    }

    @Override
    public List<Content> getAllContent() {
        return contentRepo.findAll();
    }
}
