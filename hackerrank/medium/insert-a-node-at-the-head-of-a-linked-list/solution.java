

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(
        SinglyLinkedListNode head, int data) {

    SinglyLinkedListNode newNode =
        new SinglyLinkedListNode(data);

    if (head == null) {
        return newNode;
    }

    SinglyLinkedListNode curr = head;

    while (curr.next != null) {
        curr = curr.next;
    }

    curr.next = newNode;

    return head;
}

