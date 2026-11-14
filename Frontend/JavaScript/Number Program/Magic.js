
function isMagic(num)
{
    while (num > 9)
    {
        let sum = 0;

        while (num != 0)
        {
            sum += num % 10;
            num = Math.trunc(num / 10);
        }

        num = sum;
    }

    if (num === 1)
    {
        console.log("Magic Number");
    }
    else
    {
        console.log("Not a Magic Number");
    }
}

isMagic(145);
