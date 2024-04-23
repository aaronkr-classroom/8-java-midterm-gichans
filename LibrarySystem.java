public class LibrarySystem {
	private Book[] booklist;
	private static int bookCount = 0;
	private static final int NUM_BOOK = 10;

	public LibrarySystem() {
	    this.booklist = new Book[NUM_BOOK]; // 생성자
	}
	public void addBook(Book book) {
	        if (bookCount < booklist.length) {
	            booklist[bookCount++] = book;
	            System.out.println("'" + book.getTitle() + "' 라이브러리에 추가되었습니다.");
	        } else {
	            System.out.println("라이브러리가 꽉 찼습니다.");
	        }
	}
	
	public void removeBook(String title) {
		for ( int i = 0; i < bookCount; i++ ) {
			if ( booklist[i].getTitle().equals(title)) {
				for ( int j = i; j < bookCount - 1; j++ ) {
					booklist[j] = booklist[j+1];
				}
				booklist[--bookCount] = null;
				System.out.println("라이브러리에서 '" + title + "' 삭제했습니다.");
        
				return;
			}
		}
		System.out.println("# 오류: '" + title + "' 못 찾았습니다!");
	}
	
	public void borrowBook(String title) {
	    for (int i = 0; i < bookCount; i++) {
	        if (booklist[i].getTitle().equals(title)) {
	            if (booklist[i].isAvailable()) {
	                booklist[i].setAvailable(false);
	                System.out.println("'" + title + "' 책을 대출하였습니다.");
	            } else {
	                System.out.println("'" + title + "' 책은 이미 대출 중입니다.");
	            }
	            return;
	        }
	    }
	    System.out.println("'" + title + "' 책을 찾을 수 없습니다.");
	}

	public void returnBook(String title) {
	    for (int i = 0; i < bookCount; i++) {
	        if (booklist[i].getTitle().equals(title)) {
	            if (!booklist[i].isAvailable()) {
	                booklist[i].setAvailable(true);
	                System.out.println("'" + title + "' 책을 반납하였습니다.");
	            } else {
	                System.out.println("'" + title + "' 책은 이미 라이브러리에 있습니다.");
	            }
	            return;
	        }
	    }
	    System.out.println("'" + title + "' 책을 찾을 수 없습니다.");
	}
	public void displayAllBooks() {
		for (int i = 0; i < bookCount; i++) {
	        Book book = booklist[i];
	        String availability = book.isAvailable() ? "Available" : "Out";
	        System.out.println(book.getIsbn() + " | " + book.getTitle() + " | " + book.getAuthor() + " | " + book.getYear() + " | " + book.isAvailable());
	    }
	}
}
		// 책 목록 출력 (책이름, 저자, 출판년도, 대출가능여부 출력)

        /* 
        Expected output:
        "ISBN1234 | JSP 웹 프로그래밍 | 송미영 | 2018 | Available"
        "ISBN1235 | 안드로이드 프로그래밍 | 우재남 | 2022 | Out"
        ...
        */
    
        // 도움을 위해 Cart.java의 printBookList()를 참조하세요
