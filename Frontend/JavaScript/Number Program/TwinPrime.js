
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

function isTwinPrime(num1, num2)
{
    if (isPrime(num1) && isPrime(num2) &&
        ((num1 - num2) === -2   || (num1 - num2) === 2))
    {
        console.log("Twin Prime Numbers");
    }
    else
    {
        console.log("Not Twin Prime Numbers");
    }
}

isTwinPrime(11, 13);
