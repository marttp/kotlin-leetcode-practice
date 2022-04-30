package lc.blind75

import lc.common.ListNode

class LinkedListCycle_141 {

    fun hasCycle(head: ListNode?): Boolean {
        var fast = head
        var slow = head
        while (fast?.next != null) {
            fast = fast.next!!.next
            slow = slow!!.next
            if (fast == slow) {
                break
            }
        }
        return fast?.next != null
    }
}