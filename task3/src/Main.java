public class Main {
        static void pushZerosToEnd( int nums[], int n, int vol)
        {
            int count = 0 ;
            for ( int i = 0 ; i < n; i++)
                if (nums[i] != vol )
                    nums[count++] = nums[i];
            while (count < n)
                nums[count++] = vol;
        }
        public static void main (String[] args)
        {
            int nums[] = { 1 , 9 , 8 , 4 , 3 , 3 , 2 , 7 , 3 , 6 , 0 , 9 };
            int vol = 3;
            int n = nums.length;
            System.out.println("Изначальный массив: ");
            for ( int i= 0 ; i<n; i++)
                System.out.print(nums[i]+ " " );
            pushZerosToEnd(nums, n, vol);
            System.out.println("\nИзменённый массив: ");
            for ( int i= 0 ; i<n; i++)
                System.out.print(nums[i]+ " " );
        }
}
