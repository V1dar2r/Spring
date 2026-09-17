package project.board.Controller;

import org.springframework.web.bind.annotation.*;
import project.board.Post.Post;
import project.board.Post.PostCreateRequest;
import project.board.Post.PostRecord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PostController {
    private final Map<Long, Post> store = new HashMap<>();
    private Long nextId = 1L;

    @PostMapping("/posts")
    public Post create(@RequestBody PostCreateRequest request){
        Long id = nextId++;
        Post result = new Post(id,request.getTitle(),request.getContent());
        store.put(id,result);
        return result;
    }
    @GetMapping("/posts")
    public List<Post> findAll(){
        return new ArrayList<>(store.values());
    }

    @GetMapping("/posts/{id}")
    public Post findOne(@PathVariable Long id){
        return store.get(id);
    }


}
