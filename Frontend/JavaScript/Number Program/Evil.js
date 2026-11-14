
function isEvil(num)
{
    let count = 0;

    while (num != 0)
    {
        let rem = num % 2;

        if (rem === 1)
        {
            count++;
        }

        num = Math.trunc(num / 2);
    }

    if (count % 2 === 0)
    {
        console.log("Evil Number");
    }
    else
    {
        console.log("Not an Evil Number");
    }
}

isEvil(9);
