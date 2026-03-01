class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        // Step 1: Create dummy node
        ListNode dummy = new ListNode(-1);
        
        // Step 2: Current pointer to build new list
        ListNode current = dummy;
        
        // Step 3: Traverse both lists
        while (list1 != null && list2 != null) {
            
            if (list1.val <= list2.val) {
                current.next = list1;      // attach list1 node
                list1 = list1.next;        // move list1
            } else {
                current.next = list2;      // attach list2 node
                list2 = list2.next;        // move list2
            }
            
            current = current.next;       // move merged pointer
        }
        
        // Step 4: Attach remaining nodes
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
        
        // Step 5: Return merged list
        return dummy.next;
    }
}
