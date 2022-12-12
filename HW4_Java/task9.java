/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
*/
import java.util.Deque;
import java.util.LinkedList;
public class task9 {

    public static void main(String[] args) {
        Deque<Object> dq = new LinkedList<>();

        dq.push("one");
        dq.push("two");
        dq.push("three");
        dq.push("four");
        dq.push("five");
        dq.push("six");
        dq.push("seven");
        dq.push("eight");

        System.out.printf("Текущая очередь: %s\n", dq);

        enqueue(dq); //помещает элемент в конец очереди,
        System.out.printf("Очередь после перемещения первого элемента в конец очереди: %s \n", dq);

        dequeue(dq);// возвращает первый элемент из очереди и удаляет его
        System.out.printf("Очередь после удаления первого элемента: %s \n", dq);

        first(dq); //возвращает первый элемент из очереди, не удаляя.
        System.out.printf("Очередь после возвращения первого элемента, не удаляя: %s \n", dq);
    }

// first() - возвращает первый элемент из очереди, не удаляя.
        public static void first(Deque<Object> DQ){
            System.out.printf("first. Первый элемент очереди: %s \n",DQ.getFirst());
            return;
        }

//    enqueue() - помещает элемент в конец очереди,
        private static void enqueue(Deque<Object> DQ){
            DQ.addLast(DQ.pollFirst());
            return;
        }

//    dequeue() - возвращает первый элемент из очереди и удаляет его,
        private static void dequeue(Deque<Object> DQ){
            System.out.printf("dequeue. Удаляем первый элемент очереди: %s \n", DQ.removeFirst());
        }

    }

