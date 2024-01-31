/*
Prime number is always a well-known in math and computer science.
To make sure I am familiar with the property and application of it, this document is going to record some practical utility of prime number in algorithm design.
  */

/**
 * This function is going to determine if the input is a prime number or not
 * @param number integer input to determine
 * @return return 0 if it is NOT a prime
 * @return return 1 if it is a prime
 */
int isPrime(int number) {
    if (number <= 1) return 0; // Numbers less than 2 are not prime
    if (number <= 3) return 1; // 2 and 3 are prime numbers

    if (number % 2 == 0 || number % 3 == 0) return 0; // Divisible by 2 or 3 is not prime

    // Check for divisors starting from 5 (because 2,3,4 are excluded already ahead )
    // till the square root of the number
    // Instead of testing if the numbers is a prime, we use form 6k +/- 1 to find if it is not a prime
    // Because all primes(greater than 3) are of the form 6k +/- 1 for all integer k != 2 || 3
    for (int i = 5; i * i <= number; i += 6) {
        if (number % i == 0 || number % (i + 2) == 0) return 0;
    }

    return 1; // If not divisible by any of the above, it's prime
}
