
function isUgly(num)
{
    if (num <= 0)
    {
        console.log("Not an Ugly Number");
        return;
    }

    while (num % 2 === 0)
    {
        num = num / 2;
    }

    while (num % 3 === 0)
    {
        num = num / 3;
    }

    while (num % 5 === 0)
    {
        num = num / 5;
    }

    if (num === 1)
    {
        console.log("Ugly Number");
    }
    else
    {
        console.log("Not an Ugly Number");
    }
}

isUgly(30);
