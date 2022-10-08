import re
from collections import defaultdict
from typing import List


class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        counter = defaultdict()  # 딕셔너리 선언
        split = re.split('[! ?.,;\']', paragraph)  # multiple delimiter

        for word in split:  # 잘라둔 문자열 순회
            if word == '': # 빈 문자열 건너뛰기
                continue
            word = word.lower()  # 소문자로 바꾸고
            if word not in banned:  # 제외 단어가 아니라면
                if word not in counter:  # 키 없으면 0으로 세팅해주고
                    counter[word] = 0
                counter[word] += 1  # 값 1 증가

        answer = ""
        count = 0
        for k, v in counter.items():  # 딕셔너리 순회하며
            if (v > count):  # 카운트가 가장 높은 단어 찾아 반환
                count = v
                answer = k
        return answer