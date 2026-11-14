
function isPerfectSquare(num)
{
    for(let i = 1; i< num ; i++)
    { 
      if (i * i === num)
      {
          console.log("Perfect Square");
          return;
      }
    }
   console.log("Not Perfect Square");
}


isPerfectSquare(144);

