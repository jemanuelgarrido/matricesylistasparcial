package org.example;

import java.util.Scanner;

public class Listas {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // Algoritmo de ordenamiento de selección
        ListNode current = head;
        while (current != null) {
            ListNode min = current;
            ListNode temp = current.next;
            while (temp != null) {
                if (temp.val < min.val)
                    min = temp;
                temp = temp.next;
            }
            int t = current.val;
            current.val = min.val;
            min.val = t;
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Listas listas = new Listas();
        Scanner scanner = new Scanner(System.in);

        // Ingresar los elementos de la primera lista
        System.out.println("Ingrese los elementos de la primera lista separados por espacios:");
        String[] input1 = scanner.nextLine().split(" ");
        ListNode head1 = null;
        ListNode current1 = null;
        for (String str : input1) {
            int val = Integer.parseInt(str);
            if (head1 == null) {
                head1 = new ListNode(val);
                current1 = head1;
            } else {
                current1.next = new ListNode(val);
                current1 = current1.next;
            }
        }

        // Ordenar la primera lista
        ListNode sorted1 = listas.sortList(head1);
        // Imprimir la lista ordenada
        printList(sorted1);

        // Ingresar los elementos de la segunda lista
        System.out.println("Ingrese los elementos de la segunda lista separados por espacios:");
        String[] input2 = scanner.nextLine().split(" ");
        ListNode head2 = null;
        ListNode current2 = null;
        for (String str : input2) {
            int val = Integer.parseInt(str);
            if (head2 == null) {
                head2 = new ListNode(val);
                current2 = head2;
            } else {
                current2.next = new ListNode(val);
                current2 = current2.next;
            }
        }

        // Ordenar la segunda lista
        ListNode sorted2 = listas.sortList(head2);
        // Imprimir la lista ordenada
        printList(sorted2);

        // Ingresar los elementos de la tercera lista
        System.out.println("Ingrese los elementos de la tercera lista separados por espacios:");
        String[] input3 = scanner.nextLine().split(" ");
        ListNode head3 = null;
        ListNode current3 = null;
        for (String str : input3) {
            int val = Integer.parseInt(str);
            if (head3 == null) {
                head3 = new ListNode(val);
                current3 = head3;
            } else {
                current3.next = new ListNode(val);
                current3 = current3.next;
            }
        }

        // Ordenar la tercera lista
        ListNode sorted3 = listas.sortList(head3);
        // Imprimir la lista ordenada
        printList(sorted3);

        scanner.close();
    }

    // Método para imprimir la lista
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

