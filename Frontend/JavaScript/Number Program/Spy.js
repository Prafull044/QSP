
function isSpy(num)
{
    let sum = 0;
    let product = 1;

    while (num != 0)
    {
        let rem = num % 10;

        sum += rem;
        product *= rem;

        num = Math.trunc(num / 10);
    }

    if (sum === product)
    {
        console.log("Spy Number");
    }
    else
    {
        console.log("Not a Spy Number");
    }
}

isSpy(1124);
