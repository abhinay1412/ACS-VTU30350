# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())
a = list(map(int, input().split()))
print(1 if len(set(a)) == n and max(a) - min(a) == n - 1 else 0)
