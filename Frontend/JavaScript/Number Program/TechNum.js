
function isTech(num)
{
    let n = num;
    let count = 0;

    while (num != 0)
    {
        count++;
        num = Math.trunc(num / 10);
    }

    if (count % 2 != 0)
    {
        console.log("Not a Tech Number");
        return;
    }

    let divisor = 1;

    for (let i = 1; i <= count / 2; i++)
    {
        divisor *= 10;
    }

    let first = Math.trunc(n / divisor);
    let second = n % divisor;

    let sum = first + second;

    if (sum * sum === n)
    {
        console.log("Tech Number");
    }
    else
    {
        console.log("Not a Tech Number");
    }
}

isTech(2025);
