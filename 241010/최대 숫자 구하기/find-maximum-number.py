from sortedcontainers import SortedSet

s = SortedSet()
nlen, mlen = map(int,input().split())
for i in range(mlen):
    s.add(i+1)
lst = list(map(int,input().split()))
for i in lst:
    s.remove(i)
    print(s[-1])