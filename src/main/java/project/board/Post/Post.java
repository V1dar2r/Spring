package project.board.Post;

public class Post {
    private Long id;
    private String title;
    private String Content;

    public Post(Long id, String title, String content) {
        this.title = title;
        this.id = id;
        this.Content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
