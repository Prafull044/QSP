
function isDuck(num)
{
    while (num != 0)
    {
        if (num % 10 === 0)
        {
            console.log("Duck Number");
            return;
        }

        num = Math.trunc(num / 10);
    }

    console.log("Not a Duck Number");
}

isDuck(1023);
