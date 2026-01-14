package ch19_collections.testitem;
/*
    2번 메뉴를 재고 입고 로 변경 하고, 3번 메뉴를 재고 출고로 변경하여
    입고 선택시 입고 량을 입력 받아서 기존 재고에 + 시키고,
    출고 선택시 출고 량을 입력 받아서 기존 재고에서 - 하겠습니다.
    하지만 출고량이 기존 재고분보다 초과일 경우 재고가 충분하지 않습니다, 라는
    출력문을 안내하고 다시 메뉴 선택으로 돌아갈 수 있도록 수정하시오.
    BookMap3 만들어서 전체 작성 하시면 되겠습니다.
 */
import java.util.*;

public class BookMap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> bookInventory = new HashMap<>();
        bookInventory.put("Java프로그래밍 입문",2);
        boolean endOfProgram = false;
        String bookTitle;
        while (!endOfProgram) {
            System.out.println("--- 도서 재고 관리 프로그램 ---");
            System.out.println("1. 도서추가\n2. 재고 입고\n3. 재고 출고\n4. 재고 목록\n5. 종료");
            System.out.print("메뉴를 선택하세요 >>> ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 :
                    System.out.println("새 도서명을 입력하세요 >>> ");
                    bookTitle = scanner.nextLine();

                    if (bookInventory.containsKey(bookTitle)) {
                        System.out.println("이미 재고에 있는 도서입니다.");
                    } else {
                        System.out.println("재고 수량을 입력하세요 >>> ");
                        int stock = scanner.nextInt();
                        scanner.nextLine();
                        bookInventory.put(bookTitle, stock);
                        System.out.println(bookTitle + " 도서가 " + stock + " 권 추가되었습니다.");
                    }
                    break;
                case 2 :    // 입고
                    System.out.print("수량을 추가할 도서명을 입력하세요 >>> ");
                    bookTitle = scanner.nextLine();
                    if (bookInventory.containsKey(bookTitle)) {
                        System.out.print("입고 수량을 입력하세요 >>> ");
                        int temp = scanner.nextInt();
                        int stock = bookInventory.get(bookTitle) + temp;
                        System.out.println(bookTitle + " 도서가 " + temp + " 권 추가하여 " + stock + " 권이 있습니다.");
                        bookInventory.put(bookTitle, stock);
                    } else {
                        System.out.println("해당 도서가 재고에 없습니다.");
                    }
                    break;
                case 3 :    // 출고
                    System.out.print("출고 할 도서명을 입력하세요 >>> ");
                    bookTitle = scanner.nextLine();
                    if (bookInventory.containsKey(bookTitle)) {
                        System.out.print("출고 수량을 입력하세요 >>> ");
                        int temp = scanner.nextInt();
                        int stock = bookInventory.get(bookTitle);
                        if (temp > stock) {
                            System.out.println("출고 수량이 부족합니다.");
                            break;
                        } else stock = bookInventory.get(bookTitle) - temp;
                        System.out.println(bookTitle + " 도서가 " + stock + " 권 으로 변경되었습니다.");
                        bookInventory.put(bookTitle, stock);
                    } else {
                        System.out.println("해당 도서가 재고에 없습니다.");
                    }
                    break;
                case 4 :
                    Set<String> booktitleSet = bookInventory.keySet();
                    List<String>  bookTitles = new ArrayList<>();
                    bookTitles.addAll(booktitleSet);
                    for ( String book : bookTitles) {
                        System.out.println("도서명 " + book + ", 현재 재고 : " + bookInventory.get(book));
                    }
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    endOfProgram = true;
                    break;
                default :
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
