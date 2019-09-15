package com.regis;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeExample {

	public static void main(String[] args) {
		
		Deque<String> deque = new LinkedList<String>();
		
		// Podemos adicionar elementos à fila de várias maneiras
		deque.add("Element 1 (Tail)"); // Add to tail
		deque.addFirst("Element 2 (Head)");
		deque.addLast("Element 3 (Tail)");
		deque.push("Element 4 (Head)"); // Add to head
		deque.offer("Element 5 (Tail)");
		deque.offerFirst("Element 6 (Haed)");
		deque.offerLast("Element 7 (Tail)");
		
		System.out.println(deque + "\n");
		
		
		// Iterar através dos elementos da fila
		System.out.println("Standard Iterator");
		Iterator iterator = deque.iterator();
		while (iterator.hasNext()) {
			System.out.println("\t" + iterator.next());
		}
		
		
		// Iterar em ordem reversa
		System.out.println("Reverse Iterator");
		Iterator reverse = deque.descendingIterator();
		while (reverse.hasNext()) {
			System.out.println("\t" + reverse.next());
		}
		
		
		// Peek devolve a cabeça, sem excluí-la da fila
		System.out.println("Peek " + deque.peek());
		System.out.println("After peek: " + deque);
		
		
		// Pop devolve a cabeça, e exclui ela da fila
		System.out.println("Pop " + deque.pop());
		System.out.println("After pop: " + deque);
		
		
		// Podemos verificar se existe um elemento específico na fila
		System.out.println("Contains element 3: " + deque.contains("Element 3 (Tail)"));
		
		
		// Podemos remover o primeiro / último elemento
		deque.removeFirst();
		deque.removeLast();
		System.out.println("Deque after removing first and last: " + deque);

	}

}