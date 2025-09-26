def substring(s):
    max_len = 0
    start = 0
    seen = {}
    for end in range(len(s)):
        if s[end] in seen and seen[s[end]] >= start:
            start = seen[s[end]] + 1
        seen[s[end]] = end
        max_len = max(max_len, end - start + 1)
    return max_len
s = "dabbcabcd"
print(substring(s))