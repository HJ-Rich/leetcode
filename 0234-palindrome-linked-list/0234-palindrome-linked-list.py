# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:        
        q = deque()
        while True:
            q.append(head.val)
            if head.next is None:
                break
            head = head.next

        while len(q) > 1:
            if q.popleft() != q.pop():
                return False

        return True
        