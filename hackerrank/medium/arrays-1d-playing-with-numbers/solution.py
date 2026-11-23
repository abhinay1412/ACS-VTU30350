# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())
a = list(map(int, input().split()))
d = int(input()) % n
print(*(a[d:] + a[:d]))
