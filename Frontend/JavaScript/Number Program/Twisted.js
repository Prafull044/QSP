
function isPrime(num)
{
    if (num <= 1)
    {
        return false;
    }

    for (let i = 2; i * i <= num; i++)
    {
        if (num % i === 0)
        {
            return false;
        }
    }

    return true;
}

function isTwistedPrime(num)
{
    let n = num;
    let rev = 0;

    if (!isPrime(num))
    {
        console.log("Not a Twisted Prime");
        return;
    }

    while (num != 0)
    {
        rev = rev * 10 + num % 10;
        num = Math.trunc(num / 10);
    }

    if (isPrime(rev))
    {
        console.log("Twisted Prime Number");
    }
    else
    {
        console.log("Not a Twisted Prime");
    }
}

isTwistedPrime(13);
