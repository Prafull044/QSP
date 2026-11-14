 

 function isPerfect(num)
 {
    let sum = 0;
    for (let i = 1; i< num; i++) {
      if(Math.trunc(num % i) == 0)
      {
        sum += i;
      }
    }

    if(sum ===  num)
    {
        console.log('Perfect No')
    }else{
        console.log("Not a perfect Number")
    }
 }

 isPerfect(10);