package project.board.Controller;

import org.springframework.web.bind.annotation.*;
import project.board.Post.Post;
import project.board.Post.PostCreateRequest;
import project.board.Post.PostResponse;
import project.board.Repository.PostRepository;

import java.util.*;

@RestController
public class PostController {
    private final PostRepository postRepository;

    public PostController(PostRepository postRepository){
        this.postRepository = postRepository;
    }

    @PostMapping("/posts")
    public PostResponse create(@RequestBody PostCreateRequest request){
        Post post =new Post(request.title(),request.content(),request.password());
        return PostResponse.from(postRepository.save(post));
    }

    @GetMapping("/posts")
    public List<PostResponse> findAll(){
        return postRepository.findAll().stream().map(PostResponse::from).toList();
    }

    @GetMapping("/posts/{id}")
    public PostResponse findOne(@PathVariable Long id){
        Optional<Post> post = postRepository.findById(id);
        Post result = post.orElseThrow(() -> new NullPointerException("사용자를 찾을 수 없습니다."));
        return PostResponse.from(result);
    }


}
