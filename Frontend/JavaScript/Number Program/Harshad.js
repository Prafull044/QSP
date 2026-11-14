
function isHarshad(num)
{
    let n = num;
    let sum = 0;

    while (num != 0)
    {
        sum += num % 10;
        num = Math.trunc(num / 10);
    }

    if (n > 0 && n % sum === 0)
    {
        console.log("Harshad Number");
    }
    else
    {
        console.log("Not a Harshad Number");
    }
}

isHarshad(18);
