package dev.minkku.demo.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.minkku.demo.model.Post;
import dev.minkku.demo.service.PostService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor    // final로 지정된 필드에 대해서 생성사 주입을 자동으로 도와줌
public class PostController {
    private final PostService postService;

    @GetMapping("/list")
    private List<Post> postList() {
         return postService.postList();
    }

    @GetMapping("/{postId}")
    private Post postDetail(@PathVariable String postId) {
        return new Post(UUID.randomUUID(), "title1", "contents2", "", LocalDateTime.now());
    }
}
