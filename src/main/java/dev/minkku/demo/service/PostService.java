package dev.minkku.demo.service;

import java.util.List;
import java.util.UUID;
import java.time.LocalDateTime;
import org.springframework.stereotype.Service;
import dev.minkku.demo.model.Post;
import dev.minkku.demo.repository.PostRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository PostRepository;

    public List<Post> postList() {
        return List.of(
            new Post(UUID.randomUUID(), "title1", "contents2", "", LocalDateTime.now()),
            new Post(UUID.randomUUID(), "title2", "contents2", "", LocalDateTime.now()),
            new Post(UUID.randomUUID(), "title3", "contents2", "", LocalDateTime.now())
        );
    }
}
