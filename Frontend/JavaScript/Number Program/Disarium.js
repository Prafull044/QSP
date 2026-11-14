
function isDisarium(num)
{
    let n = num;
    let temp = num;
    let count = 0;
    let sum = 0;

    while (temp != 0)
    {
        count++;
        temp = Math.trunc(temp / 10);
    }

    while (num != 0)
    {
        let rem = num % 10;
        let power = 1;

        for (let i = 1; i <= count; i++)
        {
            power *= rem;
        }

        sum += power;
        count--;

        num = Math.trunc(num / 10);
    }

    if (sum === n)
    {
        console.log("Disarium Number");
    }
    else
    {
        console.log("Not a Disarium Number");
    }
}

isDisarium(135);
