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
    private final PostRepository postRepository;

    public List<Post> postList() {
        return postRepository.findAll();
    }
}
