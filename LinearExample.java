class LinearExample{
static int LinearSearch(int arr[],int n,int key){//function definition
for(int i=0;i<=n;i++){
if(arr[i]==key){
return 1;
}
}
return -1;
}
public static void main(String args[]){
int arr[]={2,3,4,7,8,9};
int n=arr.length;
int key=8;
int result=LinearSearch(arr,n,key);//function call
if(result==1)
System.out.println("Key is found");
else
System.out.println("Key is not found");
}
}