public class Program1 {
    public static void main(String[] args)
    {

    int n1 = 10;
    int n2 = 1000;
    int n3 = 700;
    int n4 = 50;

int firstlarge = (n1 > n2) ? n1: n2;

int secondLarge = (n3 > firstlarge) ? n3: firstlarge;

int res = (n4 > secondLarge) ? n4 : secondLarge;

System.out.println(res);



int res2 = n1 > (n2 > ((n3 > n4)? n3: n4)? n2: (n3 > n4)? n3: n4)? n1: (n2 > ((n3 > n4) ? n3: n4)? n2 : (n3 > n4) ? n3 : n4); 
System.out.println(res2);


int res3 = (n1 > n2)? ((n1 > ((n3 > n4)?n3: n4))? n1: ((n3 > n4)? n3: n4)): ((n2 > ((n3 > n4)? n3: n4))? n2: ((n3 > n4)? n3 : n4)); 
System.out.println(res3);

}
}
