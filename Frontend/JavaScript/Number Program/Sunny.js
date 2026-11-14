
function isSunny(num)
{
    let n = num + 1;
   
     for(let i = 1; i<n; i++)
     {
        if( (i*i )== n)
        {
            console.log("Sunny Number");
            return;
        }
     }
   console.log("Not a Sunny Number"); 
}

isSunny(8);
