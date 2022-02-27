package pl.sdacademy.unit.test.basic.exercises.tdd.task4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BasketTest {
    /*
    test cases:
    * dodajemy np 3 książki do koszyka, pobieramy wszystkie i sprawdzamy czy metoda rzeczywiście zwróci 3 książki
    * dodajemy np 3 książki do koszyka, po czym czyścimy koszyk i sprawdzamy czy koszyk jest pusty
    * dodajemy np 3 książki do koszyka, po czym weryfikujemy czy total maount jest poprawny
    * tworzymy koszyk 2 elementowy, po czym próbujemy dodać 3 element i sprawdzamy czy w koszyku na pewno są tylko dwa elementy
     */
    private static Book book1;
    private static Book book2;
    private static Book book3;

    @BeforeAll
    static void init() {
        book1 = new Book("abc", new Author("aaa", "bbb"), 50);
        book2 = new Book("cba", new Author("ccc", "ddd"), 75);
        book3 = new Book("qwerty", new Author("eee", "fff"), 100);
    }

    @Test
    void shouldReturnAllAddedBooksFromBasket() {
        //given
        Book[] expectedResult = {book1, book2, book3};
        Basket basket = new Basket(3);
        basket.addBook(book1);
        basket.addBook(book2);
        basket.addBook(book3);
        //when
        Book[] result = basket.getAllBooks();
        //then
        assertArrayEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);

    }

    @Test
    void shouldRemoveAllAddedBooksFromBasket() {
        //given
        Book[] expectedResult = {null, null, null};
        Basket basket = new Basket(3);
        basket.addBook(book1);
        basket.addBook(book2);
        basket.addBook(book3);
        //when
        basket.cleanBasket();
        Book[] result = basket.getAllBooks();
        //then
        assertArrayEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnTotalAmount() {
        //given
        float expectedResult = 225;
        Basket basket = new Basket(3);
        basket.addBook(book1);
        basket.addBook(book2);
        basket.addBook(book3);
        //when
        float result = basket.getTotalAmount();
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldNotAddNewBookWhenBasketIsFull() {
        //given
        Book[] expectedResult = {book1, book2};
        Basket basket = new Basket(2);
        basket.addBook(book1);
        basket.addBook(book2);
        //when
        basket.addBook(book3);
        Book[] result = basket.getAllBooks();
        //then
        assertArrayEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }
}