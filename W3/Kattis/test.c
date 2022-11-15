#include <stdio.h>
#include <stdlib.h>

#define MAX 1000
#define MAXP (2 * MAX + 1)

unsigned primes[MAXP];
unsigned isprime[MAXP];

unsigned factpow(unsigned n, unsigned p)
{
    unsigned d = 0;

    do
    {
        n /= p;
        d += n;
    } while (n);

    return d;
}

unsigned long long ndivs(unsigned n, unsigned k)
{
    unsigned i, ad;
    unsigned long long nd = 1, max = -1;

    max >>= 1;

    for (i = 0; primes[i] <= n; i++)
    {
        ad = factpow(n, primes[i]) - factpow(k, primes[i]) - factpow(n - k, primes[i]);

        if (max / (ad + 1) < nd)
            abort();
        nd *= (ad + 1);
    }

    return nd;
}

int main(void)
{
    unsigned n, k, i, j;

    isprime[1] = 1;

    n = 0;
    for (i = 2; i < MAXP; i++)
        if (!isprime[i])
        {
            primes[n++] = i;
            for (j = 2 * i; j < MAXP; j += i)
                isprime[j] = 1;
        }

    while (1)
    {
        if (scanf("%u%u", &n, &k) != 2)
            return 0;

        printf("%llu\n", ndivs(n, k));
    }
}
1