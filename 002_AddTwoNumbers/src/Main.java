import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int num1 = scanner.nextInt();

        System.out.print("Enter number 2 : ");
        int num2 = scanner.nextInt();

        ListNode ln1 = create_linkedList(num1);
        ListNode ln2 = create_linkedList(num2);

        print_linkedlist(ln1);
        print_linkedlist(ln2);

        ListNode sum_ln = add_ListNode(ln1, ln2);

        print_linkedlist(sum_ln);

    }

    public static ListNode add_ListNode(ListNode head1, ListNode head2) {

        ListNode sum_head = new ListNode();
        ListNode current = sum_head;

        int carry = 0;

        while(head1 != null || head2 != null || carry !=0) {

            int x = (head1 != null) ? head1.val : 0;
            int y = (head2 != null) ? head2.val : 0;

            int sum = x + y + carry;

            carry = sum/10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if (head1 != null) head1 = head1.next;
            if (head2 != null) head2 = head2.next;

        }

        return sum_head.next;

    }

    public static ListNode create_linkedList(int data) {

        ListNode head = new ListNode(data%10);
        data = data/10;

        ListNode current = head;

        while (data > 0) {

            current.next = new ListNode(data%10);
            data = data/10;
            current = current.next;

        }

        return head;

    }

    public static void print_linkedlist(ListNode head) {

        System.out.println("Linked List Elements :  ");

        while(head != null) {

            System.out.println(head.val + "   ");

            head = head.next;

        }

    }

}