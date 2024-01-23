package board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InMemoryPostRepository implements PostRepository {
    Map<Integer, Post> memory = new HashMap<>();
    int idx;

    @Override
    public boolean createPost(Post post) {
        post.setId(idx);
        memory.put(idx++, post);
        return false;
    }

    @Override
    public Post readPost(int id) {

        return memory.get(id);
    }

    @Override
    public List<Post> readAllPost() {

        return memory.values().stream().map(v -> (Post)v).collect(Collectors.toList());
    }

    @Override
    public boolean updatePost(int id, Post post) {
        post.setId(id);
        memory.replace(id, post);
        return true;
    }

    @Override
    public boolean deletePost(int id) {
        memory.remove(id);
        return true;
    }
}
