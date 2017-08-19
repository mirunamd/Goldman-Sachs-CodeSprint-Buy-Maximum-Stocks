# Goldman-Sachs-CodeSprint-Buy-Maximum-Stocks

In a stock market, there is a product with its infinite stocks. The stock prices are given for n days, where arr[i] denotes the price of the stock on ith the day. There is a rule that a customer can buy at most i stock on the ith day. If the customer has an amount of k dollars initially, find out the maximum number of stocks they can buy?

For example, for 3 days the price of a stock is given as 7, 10, 4. You can buy 1 stock worth 7$ on day 1, 2 stocks worth 10$ each on day 2 and 3 stocks worth 4$ each on day 3. If k = 100$, you can buy all the stocks (total 6) for 39$.

**Input format**

The first line contains an integer n denoting the number of days.

The next line contains n space-separated integers where ith integer denotes the price of the stock on the ith day. 

Next line contains a positive integer k integer which is the initial amount with the customer.

**Constraints**

- 1 <= n <= 10^5
- 1 <= arr[i] <= 100
- 1 <= k <= 10^12

**Output Format**

Print the maximum number of stock that a customer can buy.

**Sample Input**

> 3

> 10 7 19

> 45

**Sample Output**

> 4

**Explanation**

The customer can purchase 1 stock on day 1, 2 stock on day 2 and 1 stock on day 3 for 10, 7 x 2 = 14 and 19 respectively. Hence, total amount is 10 + 14 + 19 = 43 and number of stocks purchased is 4.

https://www.hackerrank.com/contests/gs-codesprint/challenges/buy-maximum-stocks
