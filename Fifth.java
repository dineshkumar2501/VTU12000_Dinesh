class Fifth{
    static int LinearSearch(int arr[],int key,int n){
        for(int i=0;i<=n;i++)
        {
            if(arr[i]==key)
            return 1;
         }
         return -1;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int key=5;
        int n=arr.length;
        int result=LinearSearch(arr,key,n);
	if(result==1)
	System.out.println("Key is found in the array");
	else
	System.out.println("Not Found");
     }
}