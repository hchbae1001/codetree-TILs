dp = [0,1,2,3]
n = int(input())
if n < 4:
    print(dp[n]%10007)
    exit()
for _ in range(n):
    dp.append(dp[-2]+dp[-1])
print(dp[n]%10007)