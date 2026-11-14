
function isPronic(num)
{
    let flag = false;

    for (let i = 0; i * (i + 1) <= num; i++)
    {
        if (i * (i + 1) === num)
        {
            flag = true;
            break;
        }
    }

    if (flag)
    {
        console.log("Pronic Number");
    }
    else
    {
        console.log("Not a Pronic Number");
    }
}

isPronic(12);
