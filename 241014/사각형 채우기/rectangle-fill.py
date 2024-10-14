dp = [0,1,2,3]
n = int(input())
for i in range(3,n+4):
    dp.append(dp[i-2]+dp[i-1])
print(dp[n]%10007)