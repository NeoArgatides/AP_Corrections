public class U6_MCQ
{
    //Question 9
    public class Toy
    {
        private int yearFirstSold;
        public int getYearFirstSold()
        {
            return yearFirstSold;
        }
        /* There may be instance variables, constructors, and other methods not shown. */
        
        public void otherClass()
        {
            /*
            for (Toy k : toyArray)
            {
                System.out.println(k.getYearFirstSold());
            }
            */
           
            //Replace above for-loop with this
            for (int k = 0; k < toyArray.length; k++)
            {
                System.out.println(toyArray[k].getYearFirstSold());
            }
        }
    }
    
    //Question 12
    public void Q12()
    {   
        int[] numArr = {1, 3, 5, 7, 9};
        
        //reverses order
        for (int k = 0; k < numArr.length / 2; k++)
        {
            int temp = numArr[k];
            numArr[k] = numArr[numArr.length - k - 1];
            numArr[numArr.length - k - 1] = temp;
        }
    }
    
    //Question 13
    public void Q13()
    {
        //initialize maximum with values[0] so it works
        int maximum = values[0];
        for (int k = 1; k < values.length; k++)
        {
            if (values[k] > maximum)
            {
                maximum = values[k];
            }
        }
        System.out.println(maximum);
    }
}
