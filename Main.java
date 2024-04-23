public class Main {
    public static void main(String[] args) {
        // 새 LibrarySystem 객체 만들기
        LibrarySystem ls = new LibrarySystem();

        // 새 Book 만들기
        Book book1 = new LibraryBook("ISBN1234", "JSP 웹 프로그래밍", "송미영", 2018);
        Book book2 = new LibraryBook("ISBN1235", "안드로이드 프로그래밍", "우재남", 2022);
        Book book3 = new LibraryBook("ISBN1236", "스크래치 프로그래밍", "고광일", 2019);
        Book book4 = new LibraryBook("ISBN1237", "JAVA 마스터", "송미영", 2023);

        // LibrarySystem에 Book을 추가하세요
        ls.addBook(book1);
        ls.addBook(book2);
        ls.addBook(book3);
        ls.addBook(book4);

        // 모든 Book 출력
        System.out.println("---- 모든 책 목록 ----");
        ls.displayAllBooks();
        System.out.println();

        // Book 삭제
        System.out.println("---- '스크래치 프로그래밍' 삭제 ----");
        ls.removeBook("스크래치 프로그래밍");
        System.out.println();

        // Book 빌림
        System.out.println("---- 책 빌리기 ----");
        ls.borrowBook("JAVA 마스터");
        ls.borrowBook("안드로이드 프로그래밍");
        System.out.println();

        // 모든 Book 출력
        System.out.println("---- 모든 책 목록 ----");
        ls.displayAllBooks();
        System.out.println();

        // Book 반납
        System.out.println("---- 책 반납하기 ----");
        ls.returnBook("안드로이드 프로그래밍");
        System.out.println();

        // 모든 Book 출력
        System.out.println("---- 모든 책 목록 ----");
        ls.displayAllBooks();
    }
}