package project.board.Controller;

import org.springframework.web.bind.annotation.*;
import project.board.Post.Post;
import project.board.Post.PostCreateRequest;
import project.board.Post.PostRecord;
import project.board.Post.PostResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PostController {
    private final Map<Long, Post> store = new HashMap<>();
    private Long nextId = 1L;

    @PostMapping("/posts")
    public PostResponse create(@RequestBody PostCreateRequest request){
        Long id = nextId++;
        Post result = new Post(id,request.title(),request.content(),request.password());
        store.put(id,result);
        return PostResponse.from(result);
    }
    @GetMapping("/posts")
    public List<PostResponse> findAll(){
        return store.values().stream().map(PostResponse::from).toList();
    }

    @GetMapping("/posts/{id}")
    public PostResponse findOne(@PathVariable Long id){
        Post post = store.get(id);
        return PostResponse.from(post);
    }


}
