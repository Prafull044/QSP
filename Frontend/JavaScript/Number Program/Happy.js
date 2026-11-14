
function isHappy(num)
{
    let n = num;

    while (n != 1 && n != 4)
    {
        let sum = 0;

        while (n != 0)
        {
            let rem = n % 10;
            sum += rem * rem;
            n = Math.trunc(n / 10);
        }

        n = sum;
    }

    if (n === 1)
    {
        console.log("Happy Number");
    }
    else
    {
        console.log("Not a Happy Number");
    }
}

isHappy(19);
