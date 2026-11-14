
function isStrong(num)
{
    let n = num;
    let sum = 0;

    while (num != 0)
    {
        let rem = num % 10;
        let fact = 1;

        for (let i = 1; i <= rem; i++)
        {
            fact *= i;
        }

        sum += fact;
        num = Math.trunc(num / 10);
    }

    if (sum === n)
    {
        console.log("Strong Number");
    }
    else
    {
        console.log("Not a Strong Number");
    }
}

isStrong(145);
