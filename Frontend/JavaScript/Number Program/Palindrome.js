function isPalindrome(num)
{
    let rev = 0;
    let n = num;
    while(num != 0)
    {
        rev = rev * 10 + Math.trunc(num%10)
       num = Math.trunc(num /= 10);
    }
     
    if(rev === n){
        console.log(`Palindrome number`)
    }
    else{
        console.log("not a palindrome number")
    }

}
isPalindrome(121);