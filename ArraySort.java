public class ArraySort {

    public static void main(String[] args)
    {
        int arr[] = {10,9,8,7,6,5,4,3,2,1};

        System.out.println("The original array is");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }

        System.out.println();
        System.out.println("The sorted array is");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}