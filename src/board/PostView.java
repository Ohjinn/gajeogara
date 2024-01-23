package board;

import java.util.Scanner;

import static java.lang.System.exit;

public class PostView {
    static Scanner scanner = new Scanner(System.in);
    static PostService service = new PostServiceImpl();
    public static void main(String[] args) {
        while(true){
            System.out.println("1: 게시글 작성, 2: 게시글 조회, 3: 모든 게시글 보기, 4: 게시글 수정, 5: 게시글 삭제, 6: 종료");
            System.out.print("옵션을 선택하세요: ");
            int num = scanner.nextInt();

            scanner.nextLine();
            switch (num){
                case 1:
                    write();
                    break;
                case 2:
                    read();
                    break;
                case 3:
                    readAll();
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    delete();
                    break;
                case 6:
                    exit(1);
                    break;
                default:
                    System.out.println("잘못 입력했습니다.");
                    break;
            }
        }
    }

    private static void write(){
        String subject;
        String contents;
        String writer;

        System.out.print("제목: ");
        subject = scanner.nextLine();
        System.out.print("내용: ");
        contents = scanner.nextLine();
        System.out.print("작성자: ");
        writer = scanner.nextLine();

        service.writePost(subject, contents, writer);
    }

    private static void read(){
        int id;

        System.out.println("게시글 번호: ");
        id = scanner.nextInt();

        service.searchPost(id);
    }

    private static void readAll(){
        service.searchAllPost();
    }

    private static void update(){
        int id;
        String subject;
        String contents;
        String writer;

        System.out.print("게시글 번호: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("제목: ");
        subject = scanner.nextLine();
        System.out.print("내용: ");
        contents = scanner.nextLine();
        System.out.print("작성자: ");
        writer = scanner.nextLine();

        service.updatePost(id, subject, contents, writer);
    }

    private static void delete(){

        int id;

        System.out.println("게시글 번호: ");
        id = scanner.nextInt();

        service.deletePost(id);
    }
}
