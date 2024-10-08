package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibTest {

    @Test
    public void testZeroReturn() {
        assertEquals(0, Fib.fib(0));
        System.out.println("Кол-во повторений функции = " + Fib.getCount());
        Fib.clearCount();
    }

    @Test
    public void testOfTheFirst() {
        int[] mas = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229};
        System.out.println("#################################");
        System.out.println("n" + "," + "count" + "," + "fib");
        for (int index = 0; index < 30; ++index) {
            assertEquals(mas[index], Fib.fib(index));

            System.out.println(index + "," + Fib.getCount() + "," + mas[index]);
            Fib.clearCount();
        }
        System.out.println("#################################");
    }

    @Test
    public void testOneReturn() {
        assertEquals(1, Fib.fib(1));
        System.out.println("Кол-во повторений функции = " + Fib.getCount());
        Fib.clearCount();
    }

    @Test
    public void testResult19() {
        assertEquals(4181, Fib.fib(19));
        System.out.println("Кол-во повторений функции = " + Fib.getCount());
        Fib.clearCount();
    }

    @Test
    public void testResult3() {
        assertEquals(5, Fib.fib(5));
        System.out.println("Кол-во повторений функции = " + Fib.getCount());
        Fib.clearCount();
    }

    @Test
    public void testResult() {
        assertEquals(514229, Fib.fib(29));
        System.out.println("Кол-во повторений функции = " + Fib.getCount());
        Fib.clearCount();
    }
}