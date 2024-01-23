package board;

public class PostServiceImpl implements PostService{

    InMemoryPostRepository postRepository;

    public PostServiceImpl() {
        postRepository = new InMemoryPostRepository();
    }

    @Override
    public boolean writePost(String subject, String contents, String writer) {
        Post post = new Post(subject, contents, writer);
        postRepository.createPost(post);
        return true;
    }

    @Override
    public boolean searchPost(int id) {
        Post post = postRepository.readPost(id);
        System.out.println(post);

        return true;
    }

    @Override
    public boolean searchAllPost() {
        postRepository.readAllPost().stream().forEach(System.out::println);

        return true;
    }

    @Override
    public boolean updatePost(int id, String subject, String contents, String writer) {
        Post post = new Post(subject, contents, writer);
        postRepository.updatePost(id, post);
        return true;
    }

    @Override
    public boolean deletePost(int id) {
        postRepository.deletePost(id);
        return true;
    }
}
