 
 function isPrime(num)
 {
   if(num <= 1){
      console.log(`Not Prime Number ${num}`)
      return;
   }else{
   for(let i = 2; i< num; i++)
   {
        if(num % i == 0)
        {
           console.log(`Not Prime Number ${num}`);
           return;
        }
   }
       }
    console.log(`Prime Number ${num}`);
 }  

 isPrime(11);


 





