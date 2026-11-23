# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())
a = sorted(map(int, input().split()))
print(a[-1] + a[-2] if n >= 2 else 0)
