**Problem 1**
1. 10000000000n^2 vs n^3

   n^3 is greater because we 3>2 and we don't really care about coefficients.
2. (n^2)*log(n) vs n(log(n))^10

	we can use the log rule that allows us to move exponents to the front so n(log(n))^10 becomes 10n*log(logn). it is obvious that (n^2)*log(n) is asymptotically greater than nlog(logn) because polynomials grow faster than log.
4. n^logn vs 2^sqrt(n)

	we can use the log rule on the second equation. taking the log of 2^sqrt(n), we can bring the sqrt(n) out to the front as a coefficient which results in sqrt(n)*log2. log2 is a constant so it is obvious that n^logn is asymptotically greater than sqrt(n).
5. 2^n vs 2^(2n)

	these are asymptotically the same because when we ignore the coefficient for 2n, the order of growths for both are the same.
<br>

**Problem 2**

isPrime(n): 
  for(i = 2, i*i <= n; i++) {
    if(n % i == 0) {
      return false
    }
  return true

<br>
best case: O(1) when n is <= 3, the loop automatically terminates because it always check for 2^2<=n which is false when n<=3. 
<br>
worst case: O(sqrt(n)) worst case is when n is a square of something big.
<br>
avg case: O(sqrt(n)) the functions squares i everytime so i think the avg conmplexity is sqrt(n)
