class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = defaultdict(list)

        for word in strs:
            map[''.join(sorted(word))].append(word)

        return list(map.values())