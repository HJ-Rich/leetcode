from collections import deque

class Solution:
    def isPalindrome(self, s: str) -> bool:
        # 알파벳 또는 숫자일 경우 담을 배열 선언
        strs = deque()
        # 문자열 s를 한 문자씩 순회
        for char in s:
            # isalnum() 은 알파벳 또는 숫자일 때 True
            if char.isalnum():
                # 소문자화 해서 배열에 추가
                strs.append(char.lower())

        # 팰린드롬 여부 판별
        # 길이가 2보다 작으면 while 탈출
        while len(strs) > 1:
            # 배열 앞, 뒤에서 하나씩 꺼내서 다르면 False 얼리 리턴
            # pop() 은 기본값이 -1. 맨 뒤 요소가 반환되고 삭제됨. pop(0)은 맨 앞.
            if strs.popleft() != strs.pop():
                return False

        return True
