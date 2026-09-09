

    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
            SinglyLinkedListNode newNo = new SinglyLinkedListNode(data);
            newNo.next = llist;
            return newNo;

    }

