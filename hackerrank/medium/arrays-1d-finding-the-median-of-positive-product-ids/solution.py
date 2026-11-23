# Enter your code here. Read input from STDIN. Print output to STDOUT
input()
p = [x for x in map(int, input().split()) if x > 0]
print(p[len(p) // 2] if p else -1)
