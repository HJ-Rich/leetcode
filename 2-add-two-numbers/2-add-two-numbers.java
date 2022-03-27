import java.math.BigDecimal;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return toListNode(toBigDecimal(toIntegers(l1)).add(toBigDecimal(toIntegers(l2))));
    }
    
    private List<Integer> toIntegers(ListNode listNode) {
        List<Integer> integers = new ArrayList<>();
        int i = 0;
        while (true) {
            integers.add(i, listNode.val);
            if (Objects.isNull(listNode.next)) {
                break;
            }
            listNode = listNode.next;
        }
        return integers;
    }

    private BigDecimal toBigDecimal(List<Integer> integers) {
        return new BigDecimal(integers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining()));
    }

    private ListNode toListNode(BigDecimal number) {
        if (number.compareTo(BigDecimal.TEN) < 0) {
            return new ListNode(number.intValue());
        }

        List<Long> collect = Arrays.stream(new StringBuilder(String.valueOf(number)).reverse().toString().split(""))
                .map(Long::parseLong)
                .collect(Collectors.toList());

        ListNode listNode = new ListNode();
        boolean isFirst = true;
        Iterator<Long> iterator = collect.iterator();
        while (iterator.hasNext()) {
            if (isFirst) {
                listNode.val = Math.toIntExact(iterator.next());
                isFirst = false;
            }

            getTargetNode(listNode).next = new ListNode(Math.toIntExact(iterator.next()));
        }

        return listNode;
    }

    private ListNode getTargetNode(ListNode listNode) {
        while (true) {
            if (listNode.next == null) {
                return listNode;
            }

            listNode = listNode.next;
        }
    }
}