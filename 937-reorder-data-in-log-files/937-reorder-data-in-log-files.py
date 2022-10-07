class Solution:
    def reorderLogFiles(self,  logs: List[str]) -> List[str]:
        digits, letters = [], []
        for log in logs:
            if log.split()[1].isdigit():
                digits.append(log)
            else:
                letters.append(log)
        print(digits)
        print(letters)

        letters.sort(key=lambda x: (x.split()[1:], x.split()[0]))
        return letters + digits
    