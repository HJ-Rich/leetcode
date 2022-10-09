import re
from typing import List


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        word_map = {}
        i = 0
        answer = [[]]

        for word in strs:
            sorted_word = ''.join(sorted(list(filter(None, re.split('', word)))))
            if sorted_word not in word_map:
                word_map[sorted_word] = i
                i += 1
            if len(answer) < i:
                answer.append([])
            answer[word_map[sorted_word]].append(word)

        return answer