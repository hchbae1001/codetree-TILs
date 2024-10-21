n = int(input())

dp = [0,2,7]
for _ in range(n-2):
    dp.append(dp[-2] + dp[-1])
if n < 2:
    print(dp[n])
    exit()
print(dp[n])