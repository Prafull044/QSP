
function isArmstrong(num)
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

    if (n === 0)
    {
        count = 1;
    }

    temp = num;

    while (temp != 0)
    {
        let rem = temp % 10;
        sum += rem ** count;

        temp = Math.trunc(temp / 10);
    }

    if (sum === n)
    {
        console.log("Armstrong Number");
    }
    else
    {
        console.log("Not an Armstrong Number");
    }
}

isArmstrong(153);
