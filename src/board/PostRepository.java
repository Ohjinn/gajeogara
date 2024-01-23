package board;

import java.util.List;

public interface PostRepository {
    boolean createPost(Post post);

    Post readPost(int id);

    List<Post> readAllPost();

    boolean updatePost(int id, Post post);

    boolean deletePost(int id);
}
