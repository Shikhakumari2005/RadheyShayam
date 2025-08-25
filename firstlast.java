public class firstlast {
    public static int Firstocc(int arr[] ,int t){
        int n=arr.length;
        int l=0;
        int h=n-1;
        int res=0;
        while(l<=h){
            int mid=l+ (h-l)/2;
            if(arr[mid]==t){
                res=mid;
                h=mid-1;
            }else if(arr[mid]<t){
                l=mid+1;
            }else{
                h=mid-1;
            }

        }
        return res;

    }


//last occurence
    public static int lastocc(int arr[] ,int t){
        int n=arr.length;
        int l=0;
        int h=n-1;
        int res2=0;
        while(l<=h){
            int mid=l+ (h-l)/2;
            if(arr[mid]==t){
                res2=mid;
                l=mid+1;
            }else if(arr[mid]<t){
                l=mid+1;
            }else{
                h=mid-1;
            }

        }
        return res2;

    }
    public static void main(String arg[]){
        int arr[]={2,3,5,6,7,8,8,8,8,9};
        int t=8;
        int first=Firstocc(arr, t);
        int last=lastocc(arr, t);
        System.out.println(first);
        System.out.println(last);
    }  
}
