input()
a = list(map(int, input().split()))
s = sorted(set(a))
print(a.count(s[-2]) if len(s) > 1 else 0)
