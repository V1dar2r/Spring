package project.board.Post;

public record PostCreateRequest (String title, String content, String password){
    public static PostCreateRequest from (Post post){
        return new PostCreateRequest(post.getTitle(),post.getContent(), post.getPassword());
    }
}
