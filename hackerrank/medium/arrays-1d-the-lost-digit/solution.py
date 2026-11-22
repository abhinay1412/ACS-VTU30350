n = int(input())
arr = list(map(int, input().split()))
present = [False] * (n + 1)
for x in arr:
    present[x] = True
for i in range(1, n + 1):
    if not present[i]:
        print(i)
